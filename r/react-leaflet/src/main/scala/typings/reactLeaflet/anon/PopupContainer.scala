package typings.reactLeaflet.anon

import typings.leaflet.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupContainer[E /* <: Path */] extends js.Object {
  var popupContainer: E
}

object PopupContainer {
  @scala.inline
  def apply[E](popupContainer: E): PopupContainer[E] = {
    val __obj = js.Dynamic.literal(popupContainer = popupContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupContainer[E]]
  }
}

