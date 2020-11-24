package typings.railsUjs.domMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@rails/ujs/utils/dom", "matches")
@js.native
object matches extends js.Object {
  
  def apply(element: Element, selector: String): Boolean = js.native
  def apply(element: Element, selector: SelectorObject): Boolean = js.native
}
