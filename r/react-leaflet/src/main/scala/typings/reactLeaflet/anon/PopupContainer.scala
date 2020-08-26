package typings.reactLeaflet.anon

import typings.leaflet.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupContainer[E /* <: Path */] extends js.Object {
  var popupContainer: E = js.native
}

object PopupContainer {
  @scala.inline
  def apply[/* <: typings.leaflet.mod.Path */ E](popupContainer: E): PopupContainer[E] = {
    val __obj = js.Dynamic.literal(popupContainer = popupContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupContainer[E]]
  }
  @scala.inline
  implicit class PopupContainerOps[Self <: PopupContainer[_], /* <: typings.leaflet.mod.Path */ E] (val x: Self with PopupContainer[E]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPopupContainer(value: E): Self = this.set("popupContainer", value.asInstanceOf[js.Any])
  }
  
}

