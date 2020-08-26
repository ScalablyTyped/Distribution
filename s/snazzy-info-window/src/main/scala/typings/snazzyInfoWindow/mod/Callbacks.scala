package typings.snazzyInfoWindow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callbacks extends js.Object {
  /**
    * Called after the info window has closed.
    * This occurs at the end of the OverlayView onRemove() implementation.
    * At this point the info window should be removed from the DOM.
    */
  var afterClose: js.UndefOr[js.Function0[Boolean | Unit]] = js.native
  /**
    * Called when the info window has opened.
    * This occurs at the end of the OverlayView draw() implementation.
    * At this point the info window is added to the DOM and should be visible.
    */
  var afterOpen: js.UndefOr[js.Function0[Boolean | Unit]] = js.native
  /**
    * Called before the info window attempts to close.
    * Return false to cancel the close.
    */
  var beforeClose: js.UndefOr[js.Function0[Boolean | Unit]] = js.native
  /**
    * Called before the info window attempts to open.
    * Return false to cancel the open.
    */
  var beforeOpen: js.UndefOr[js.Function0[Boolean | Unit]] = js.native
  /**
    * Called when the info window is closing.
    * This occurs at the beginning of the OverlayView onRemove() implementation.
    * At this point the info window is still in the DOM.
    */
  var close: js.UndefOr[js.Function0[Boolean | Unit]] = js.native
  /**
    * Called when the info window is opening.
    * This occurs at the end of the OverlayView onAdd() implementation.
    * At this point the info window is added to the DOM but is not drawn yet.
    */
  var open: js.UndefOr[js.Function0[Boolean | Unit]] = js.native
}

object Callbacks {
  @scala.inline
  def apply(): Callbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callbacks]
  }
  @scala.inline
  implicit class CallbacksOps[Self <: Callbacks] (val x: Self) extends AnyVal {
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
    def setAfterClose(value: () => Boolean | Unit): Self = this.set("afterClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterClose: Self = this.set("afterClose", js.undefined)
    @scala.inline
    def setAfterOpen(value: () => Boolean | Unit): Self = this.set("afterOpen", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterOpen: Self = this.set("afterOpen", js.undefined)
    @scala.inline
    def setBeforeClose(value: () => Boolean | Unit): Self = this.set("beforeClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeClose: Self = this.set("beforeClose", js.undefined)
    @scala.inline
    def setBeforeOpen(value: () => Boolean | Unit): Self = this.set("beforeOpen", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeOpen: Self = this.set("beforeOpen", js.undefined)
    @scala.inline
    def setClose(value: () => Boolean | Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setOpen(value: () => Boolean | Unit): Self = this.set("open", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
  }
  
}

