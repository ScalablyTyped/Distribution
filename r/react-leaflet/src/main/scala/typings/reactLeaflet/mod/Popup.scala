package typings.reactLeaflet.mod

import typings.leaflet.mod.Popup_
import typings.reactLeaflet.AnonPopup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "Popup")
@js.native
class Popup[P /* <: PopupProps */, E /* <: Popup_ */] () extends DivOverlay[P, E] {
  def onPopupClose(arg: AnonPopup[E]): Unit = js.native
  def onPopupOpen(arg: AnonPopup[E]): Unit = js.native
}

