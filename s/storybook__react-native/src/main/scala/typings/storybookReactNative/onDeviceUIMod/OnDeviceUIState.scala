package typings.storybookReactNative.onDeviceUIMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDeviceUIState extends js.Object {
  var previewHeight: Double = js.native
  var previewWidth: Double = js.native
  var slideBetweenAnimation: Boolean = js.native
  var tabOpen: Double = js.native
}

object OnDeviceUIState {
  @scala.inline
  def apply(previewHeight: Double, previewWidth: Double, slideBetweenAnimation: Boolean, tabOpen: Double): OnDeviceUIState = {
    val __obj = js.Dynamic.literal(previewHeight = previewHeight.asInstanceOf[js.Any], previewWidth = previewWidth.asInstanceOf[js.Any], slideBetweenAnimation = slideBetweenAnimation.asInstanceOf[js.Any], tabOpen = tabOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDeviceUIState]
  }
  @scala.inline
  implicit class OnDeviceUIStateOps[Self <: OnDeviceUIState] (val x: Self) extends AnyVal {
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
    def setPreviewHeight(value: Double): Self = this.set("previewHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviewWidth(value: Double): Self = this.set("previewWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlideBetweenAnimation(value: Boolean): Self = this.set("slideBetweenAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabOpen(value: Double): Self = this.set("tabOpen", value.asInstanceOf[js.Any])
  }
  
}

