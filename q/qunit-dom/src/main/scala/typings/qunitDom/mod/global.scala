package typings.qunitDom.mod

import typings.qunitDom.assertionsMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  trait Assert extends js.Object {
    
    def dom(): default = js.native
    def dom(target: js.UndefOr[scala.Nothing], rootElement: Element): default = js.native
    def dom(target: String): default = js.native
    def dom(target: String, rootElement: Element): default = js.native
    def dom(target: Null, rootElement: Element): default = js.native
    def dom(target: Element): default = js.native
    def dom(target: Element, rootElement: Element): default = js.native
  }
}
