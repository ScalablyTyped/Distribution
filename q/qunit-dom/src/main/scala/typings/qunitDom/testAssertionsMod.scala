package typings.qunitDom

import typings.qunitDom.assertionsMod.AssertionResult
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qunit-dom/dist/helpers/test-assertions", JSImport.Namespace)
@js.native
object testAssertionsMod extends js.Object {
  @js.native
  trait TestAssertions extends js.Object {
    var results: js.Array[AssertionResult] = js.native
    def dom(): typings.qunitDom.assertionsMod.default = js.native
    def dom(target: String): typings.qunitDom.assertionsMod.default = js.native
    def dom(target: String, rootElement: Element): typings.qunitDom.assertionsMod.default = js.native
    def dom(target: Null, rootElement: Element): typings.qunitDom.assertionsMod.default = js.native
    def dom(target: Element): typings.qunitDom.assertionsMod.default = js.native
    def dom(target: Element, rootElement: Element): typings.qunitDom.assertionsMod.default = js.native
    def pushResult(result: AssertionResult): Unit = js.native
  }
  
  @js.native
  class default () extends TestAssertions
  
}

