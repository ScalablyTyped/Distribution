package typings.qunitDom

import typings.qunitDom.assertionsMod.AssertionResult
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testAssertionsMod {
  
  @JSImport("qunit-dom/dist/helpers/test-assertions", JSImport.Default)
  @js.native
  class default () extends TestAssertions
  
  @js.native
  trait TestAssertions extends StObject {
    
    def dom(): typings.qunitDom.assertionsMod.default = js.native
    def dom(target: String): typings.qunitDom.assertionsMod.default = js.native
    def dom(target: String, rootElement: Element): typings.qunitDom.assertionsMod.default = js.native
    def dom(target: Null, rootElement: Element): typings.qunitDom.assertionsMod.default = js.native
    def dom(target: Element): typings.qunitDom.assertionsMod.default = js.native
    def dom(target: Element, rootElement: Element): typings.qunitDom.assertionsMod.default = js.native
    
    def pushResult(result: AssertionResult): Unit = js.native
    
    var results: js.Array[AssertionResult] = js.native
  }
}
