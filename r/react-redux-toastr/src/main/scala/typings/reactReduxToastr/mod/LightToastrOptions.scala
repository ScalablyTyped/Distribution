package typings.reactReduxToastr.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LightToastrOptions extends js.Object {
  var attention: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var component: js.UndefOr[Element] = js.native
  var icon: js.UndefOr[iconType | Element] = js.native
  var onCloseButtonClick: js.UndefOr[js.Function0[Unit]] = js.native
  var onHideComplete: js.UndefOr[js.Function0[Unit]] = js.native
  var onShowComplete: js.UndefOr[js.Function0[Unit]] = js.native
  var progressBar: js.UndefOr[Boolean] = js.native
  var removeOnHover: js.UndefOr[Boolean] = js.native
  var showCloseButton: js.UndefOr[Boolean] = js.native
  var status: js.UndefOr[iconType] = js.native
  var timeOut: js.UndefOr[Double] = js.native
  var transitionIn: js.UndefOr[transitionInType] = js.native
  var transitionOut: js.UndefOr[transitionOutType] = js.native
}

object LightToastrOptions {
  @scala.inline
  def apply(): LightToastrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LightToastrOptions]
  }
  @scala.inline
  implicit class LightToastrOptionsOps[Self <: LightToastrOptions] (val x: Self) extends AnyVal {
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
    def setAttention(value: Boolean): Self = this.set("attention", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttention: Self = this.set("attention", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComponent(value: Element): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setIcon(value: iconType | Element): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setOnCloseButtonClick(value: () => Unit): Self = this.set("onCloseButtonClick", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCloseButtonClick: Self = this.set("onCloseButtonClick", js.undefined)
    @scala.inline
    def setOnHideComplete(value: () => Unit): Self = this.set("onHideComplete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnHideComplete: Self = this.set("onHideComplete", js.undefined)
    @scala.inline
    def setOnShowComplete(value: () => Unit): Self = this.set("onShowComplete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnShowComplete: Self = this.set("onShowComplete", js.undefined)
    @scala.inline
    def setProgressBar(value: Boolean): Self = this.set("progressBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressBar: Self = this.set("progressBar", js.undefined)
    @scala.inline
    def setRemoveOnHover(value: Boolean): Self = this.set("removeOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveOnHover: Self = this.set("removeOnHover", js.undefined)
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
    @scala.inline
    def setStatus(value: iconType): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTimeOut(value: Double): Self = this.set("timeOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeOut: Self = this.set("timeOut", js.undefined)
    @scala.inline
    def setTransitionIn(value: transitionInType): Self = this.set("transitionIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionIn: Self = this.set("transitionIn", js.undefined)
    @scala.inline
    def setTransitionOut(value: transitionOutType): Self = this.set("transitionOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionOut: Self = this.set("transitionOut", js.undefined)
  }
  
}

