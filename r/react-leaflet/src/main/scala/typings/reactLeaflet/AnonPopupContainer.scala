package typings.reactLeaflet

import typings.leaflet.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPopupContainer[E /* <: Path */] extends js.Object {
  var popupContainer: E
}

object AnonPopupContainer {
  @scala.inline
  def apply[E /* <: Path */](popupContainer: E): AnonPopupContainer[E] = {
    val __obj = js.Dynamic.literal(popupContainer = popupContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPopupContainer[E]]
  }
}

