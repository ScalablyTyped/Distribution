package typings.reactDashLeaflet

import typings.leaflet.leafletMod.Popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Popup[E /* <: Popup */] extends js.Object {
  var popup: E
}

object Anon_Popup {
  @scala.inline
  def apply[E /* <: Popup */](popup: E): Anon_Popup[E] = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Popup[E]]
  }
}

