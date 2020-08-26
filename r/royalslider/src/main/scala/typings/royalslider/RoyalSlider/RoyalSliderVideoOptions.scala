package typings.royalslider.RoyalSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoyalSliderVideoOptions extends js.Object {
  /**
    * Auto hide arrows when video is playing  (default: true)
    */
  var autoHideArrows: js.UndefOr[Boolean] = js.native
  /**
    * Auto hide animated blocks when video is playing. (default: false)
    */
  var autoHideBlocks: js.UndefOr[Boolean] = js.native
  /**
    * Auto hide navigation when video is playing. (default: false)
    */
  var autoHideControlNav: js.UndefOr[Boolean] = js.native
  /**
    * Vimeo embed code. %id% is replaced by video id. (default: '<iframe src="http://player.vimeo.com/video/%id%?byline=0&amp;portrait=0&amp;autoplay=1" frameborder="no" webkitAllowFullScreen mozallowfullscreen allowFullScreen></iframe>')
    */
  var vimeoCode: js.UndefOr[String] = js.native
  /**
    * Youtube embed code. %id% is replaced by video id. (default: '<iframe src="http://www.youtube.com/embed/%id%?rel=1&autoplay=1&showinfo=0" frameborder="no"></iframe>')
    */
  var youTubeCode: js.UndefOr[String] = js.native
}

object RoyalSliderVideoOptions {
  @scala.inline
  def apply(): RoyalSliderVideoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoyalSliderVideoOptions]
  }
  @scala.inline
  implicit class RoyalSliderVideoOptionsOps[Self <: RoyalSliderVideoOptions] (val x: Self) extends AnyVal {
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
    def setAutoHideArrows(value: Boolean): Self = this.set("autoHideArrows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHideArrows: Self = this.set("autoHideArrows", js.undefined)
    @scala.inline
    def setAutoHideBlocks(value: Boolean): Self = this.set("autoHideBlocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHideBlocks: Self = this.set("autoHideBlocks", js.undefined)
    @scala.inline
    def setAutoHideControlNav(value: Boolean): Self = this.set("autoHideControlNav", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHideControlNav: Self = this.set("autoHideControlNav", js.undefined)
    @scala.inline
    def setVimeoCode(value: String): Self = this.set("vimeoCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVimeoCode: Self = this.set("vimeoCode", js.undefined)
    @scala.inline
    def setYouTubeCode(value: String): Self = this.set("youTubeCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYouTubeCode: Self = this.set("youTubeCode", js.undefined)
  }
  
}

