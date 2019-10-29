package typings.qunitDashDom.qunitDashDomMod

import typings.qunitDashDom.distAssertionsMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object _Global_ extends js.Object {
  @js.native
  trait Assert extends js.Object {
    def dom(): default = js.native
    def dom(target: String): default = js.native
    def dom(target: String, rootElement: Element): default = js.native
    def dom(target: Null, rootElement: Element): default = js.native
    def dom(target: Element): default = js.native
    def dom(target: Element, rootElement: Element): default = js.native
  }
  
}

