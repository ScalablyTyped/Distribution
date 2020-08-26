package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationOptions extends js.Object {
  /**
    * Configure what animates when modal is dismissed
    */
  var dismissModal: js.UndefOr[ViewAnimationOptions] = js.native
  /**
    * Configure what animates when a screen is popped
    */
  var pop: js.UndefOr[StackAnimationOptions] = js.native
  /**
    * Configure what animates when a screen is pushed
    */
  var push: js.UndefOr[StackAnimationOptions] = js.native
  /**
    * Configure the setRoot animation
    */
  var setRoot: js.UndefOr[ViewAnimationOptions] = js.native
  /**
    * Configure the setStackRoot animation
    */
  var setStackRoot: js.UndefOr[ViewAnimationOptions] = js.native
  /**
    * Configure what animates when modal is shown
    */
  var showModal: js.UndefOr[ViewAnimationOptions] = js.native
}

object AnimationOptions {
  @scala.inline
  def apply(): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOptions]
  }
  @scala.inline
  implicit class AnimationOptionsOps[Self <: AnimationOptions] (val x: Self) extends AnyVal {
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
    def setDismissModal(value: ViewAnimationOptions): Self = this.set("dismissModal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDismissModal: Self = this.set("dismissModal", js.undefined)
    @scala.inline
    def setPop(value: StackAnimationOptions): Self = this.set("pop", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePop: Self = this.set("pop", js.undefined)
    @scala.inline
    def setPush(value: StackAnimationOptions): Self = this.set("push", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    @scala.inline
    def setSetRoot(value: ViewAnimationOptions): Self = this.set("setRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetRoot: Self = this.set("setRoot", js.undefined)
    @scala.inline
    def setSetStackRoot(value: ViewAnimationOptions): Self = this.set("setStackRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetStackRoot: Self = this.set("setStackRoot", js.undefined)
    @scala.inline
    def setShowModal(value: ViewAnimationOptions): Self = this.set("showModal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowModal: Self = this.set("showModal", js.undefined)
  }
  
}

