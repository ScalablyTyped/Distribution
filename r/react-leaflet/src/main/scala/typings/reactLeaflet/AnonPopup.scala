package typings.reactLeaflet

import typings.leaflet.mod.Popup_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPopup[E /* <: Popup_ */] extends js.Object {
  var popup: E
}

object AnonPopup {
  @scala.inline
  def apply[E /* <: Popup_ */](popup: E): AnonPopup[E] = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPopup[E]]
  }
}

