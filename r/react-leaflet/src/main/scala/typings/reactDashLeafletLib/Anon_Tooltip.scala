package typings
package reactDashLeafletLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Tooltip[E /* <: leafletLib.leafletMod.Tooltip */] extends js.Object {
  var tooltip: E
}

object Anon_Tooltip {
  @scala.inline
  def apply[E /* <: leafletLib.leafletMod.Tooltip */](tooltip: E): Anon_Tooltip[E] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Tooltip[E]]
  }
}

