package typings.reactDashTooltip.reactDashTooltipMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-tooltip", JSImport.Namespace)
@js.native
class ^ () extends ReactTooltip

@JSImport("react-tooltip", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Hide the tooltip manually, the target is optional, if no target passed in, all existing tooltips will be hidden
    */
  def hide(): Unit = js.native
  def hide(target: Element): Unit = js.native
  /**
    * Rebinding all tooltips
    */
  def rebuild(): Unit = js.native
  /**
    * Show specific tooltip manually
    */
  def show(target: Element): Unit = js.native
}

