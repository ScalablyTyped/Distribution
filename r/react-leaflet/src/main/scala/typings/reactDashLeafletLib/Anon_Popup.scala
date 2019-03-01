package typings
package reactDashLeafletLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Popup[E /* <: leafletLib.leafletMod.Popup */] extends js.Object {
  var popup: E
}

object Anon_Popup {
  @scala.inline
  def apply[E /* <: leafletLib.leafletMod.Popup */](popup: E): Anon_Popup[E] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Popup[E]]
  }
}

