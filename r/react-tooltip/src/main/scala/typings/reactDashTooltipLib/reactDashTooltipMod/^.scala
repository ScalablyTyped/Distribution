package typings
package reactDashTooltipLib.reactDashTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-tooltip", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Hide the tooltip manually, the target is optional, if no target passed in, all existing tooltips will be hidden
    */
  def hide(): scala.Unit = js.native
  def hide(target: reactLib.Element): scala.Unit = js.native
  /**
    * Rebinding all tooltips
    */
  def rebuild(): scala.Unit = js.native
  /**
    * Show specific tooltip manually
    */
  def show(target: reactLib.Element): scala.Unit = js.native
}

