package typings.royalslider.RoyalSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoyalSliderFullscreenOptions extends js.Object {
  /**
    * Fullscreen button at top right. (default: true)
    */
  var buttonFS: js.UndefOr[Boolean] = js.native
  /**
    * Fullscreen functions enabled. (default: false)
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Force keyboard arrows nav in fullscreen. (default: true)
    */
  var keyboardNav: js.UndefOr[Boolean] = js.native
  /**
    * Native browser fullscreen. (default: false)
    */
  var nativeFS: js.UndefOr[Boolean] = js.native
}

object RoyalSliderFullscreenOptions {
  @scala.inline
  def apply(): RoyalSliderFullscreenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoyalSliderFullscreenOptions]
  }
  @scala.inline
  implicit class RoyalSliderFullscreenOptionsOps[Self <: RoyalSliderFullscreenOptions] (val x: Self) extends AnyVal {
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
    def setButtonFS(value: Boolean): Self = this.set("buttonFS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonFS: Self = this.set("buttonFS", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setKeyboardNav(value: Boolean): Self = this.set("keyboardNav", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardNav: Self = this.set("keyboardNav", js.undefined)
    @scala.inline
    def setNativeFS(value: Boolean): Self = this.set("nativeFS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeFS: Self = this.set("nativeFS", js.undefined)
  }
  
}

