package typings.reactLeaflet.anon

import typings.leaflet.mod.Popup_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Popup[E /* <: Popup_ */] extends js.Object {
  var popup: E
}

object Popup {
  @scala.inline
  def apply[/* <: typings.leaflet.mod.Popup_ */ E](popup: E): Popup[E] = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Popup[E]]
  }
}

