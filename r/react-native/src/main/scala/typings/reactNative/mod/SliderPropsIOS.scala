package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderPropsIOS extends ViewProps {
  /**
    * Assigns a maximum track image. Only static images are supported.
    * The leftmost pixel of the image will be stretched to fill the track.
    */
  var maximumTrackImage: js.UndefOr[ImageURISource] = js.native
  /**
    * Assigns a minimum track image. Only static images are supported.
    * The rightmost pixel of the image will be stretched to fill the track.
    */
  var minimumTrackImage: js.UndefOr[ImageURISource] = js.native
  /**
    * Sets an image for the thumb. Only static images are supported.
    */
  var thumbImage: js.UndefOr[ImageURISource] = js.native
  /**
    * Assigns a single image for the track. Only static images
    * are supported. The center pixel of the image will be stretched
    * to fill the track.
    */
  var trackImage: js.UndefOr[ImageURISource] = js.native
}

object SliderPropsIOS {
  @scala.inline
  def apply(): SliderPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderPropsIOS]
  }
  @scala.inline
  implicit class SliderPropsIOSOps[Self <: SliderPropsIOS] (val x: Self) extends AnyVal {
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
    def setMaximumTrackImage(value: ImageURISource): Self = this.set("maximumTrackImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumTrackImage: Self = this.set("maximumTrackImage", js.undefined)
    @scala.inline
    def setMinimumTrackImage(value: ImageURISource): Self = this.set("minimumTrackImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumTrackImage: Self = this.set("minimumTrackImage", js.undefined)
    @scala.inline
    def setThumbImage(value: ImageURISource): Self = this.set("thumbImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbImage: Self = this.set("thumbImage", js.undefined)
    @scala.inline
    def setTrackImage(value: ImageURISource): Self = this.set("trackImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackImage: Self = this.set("trackImage", js.undefined)
  }
  
}

