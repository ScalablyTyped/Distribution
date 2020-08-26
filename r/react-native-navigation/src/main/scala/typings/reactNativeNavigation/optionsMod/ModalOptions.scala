package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalOptions extends js.Object {
  /**
    * Control wether this modal should be dismiss using swipe gesture when the modalPresentationStyle = 'pageSheet'
    * #### (iOS specific)
    */
  var swipeToDismiss: js.UndefOr[Boolean] = js.native
}

object ModalOptions {
  @scala.inline
  def apply(): ModalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalOptions]
  }
  @scala.inline
  implicit class ModalOptionsOps[Self <: ModalOptions] (val x: Self) extends AnyVal {
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
    def setSwipeToDismiss(value: Boolean): Self = this.set("swipeToDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeToDismiss: Self = this.set("swipeToDismiss", js.undefined)
  }
  
}

