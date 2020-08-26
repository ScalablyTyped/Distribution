package typings.reactNativeVideoPlayer.anon

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlButton extends js.Object {
  var controlButton: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var controlIcon: js.UndefOr[StyleProp[TextStyle]] = js.native
  var controls: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var playArrow: js.UndefOr[StyleProp[TextStyle]] = js.native
  var playButton: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var playControl: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var playIcon: js.UndefOr[StyleProp[TextStyle]] = js.native
  var seekBar: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var seekBarBackground: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var seekBarFullWidth: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var seekBarKnob: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var seekBarKnobSeeking: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var seekBarProgress: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var thumbnail: js.UndefOr[StyleProp[ImageStyle]] = js.native
  var video: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var videoWrapper: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var wrapper: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object ControlButton {
  @scala.inline
  def apply(): ControlButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlButton]
  }
  @scala.inline
  implicit class ControlButtonOps[Self <: ControlButton] (val x: Self) extends AnyVal {
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
    def setControlButton(value: StyleProp[ViewStyle]): Self = this.set("controlButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlButton: Self = this.set("controlButton", js.undefined)
    @scala.inline
    def setControlButtonNull: Self = this.set("controlButton", null)
    @scala.inline
    def setControlIcon(value: StyleProp[TextStyle]): Self = this.set("controlIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlIcon: Self = this.set("controlIcon", js.undefined)
    @scala.inline
    def setControlIconNull: Self = this.set("controlIcon", null)
    @scala.inline
    def setControls(value: StyleProp[ViewStyle]): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def setControlsNull: Self = this.set("controls", null)
    @scala.inline
    def setPlayArrow(value: StyleProp[TextStyle]): Self = this.set("playArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayArrow: Self = this.set("playArrow", js.undefined)
    @scala.inline
    def setPlayArrowNull: Self = this.set("playArrow", null)
    @scala.inline
    def setPlayButton(value: StyleProp[ViewStyle]): Self = this.set("playButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayButton: Self = this.set("playButton", js.undefined)
    @scala.inline
    def setPlayButtonNull: Self = this.set("playButton", null)
    @scala.inline
    def setPlayControl(value: StyleProp[ViewStyle]): Self = this.set("playControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayControl: Self = this.set("playControl", js.undefined)
    @scala.inline
    def setPlayControlNull: Self = this.set("playControl", null)
    @scala.inline
    def setPlayIcon(value: StyleProp[TextStyle]): Self = this.set("playIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayIcon: Self = this.set("playIcon", js.undefined)
    @scala.inline
    def setPlayIconNull: Self = this.set("playIcon", null)
    @scala.inline
    def setSeekBar(value: StyleProp[ViewStyle]): Self = this.set("seekBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeekBar: Self = this.set("seekBar", js.undefined)
    @scala.inline
    def setSeekBarNull: Self = this.set("seekBar", null)
    @scala.inline
    def setSeekBarBackground(value: StyleProp[ViewStyle]): Self = this.set("seekBarBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeekBarBackground: Self = this.set("seekBarBackground", js.undefined)
    @scala.inline
    def setSeekBarBackgroundNull: Self = this.set("seekBarBackground", null)
    @scala.inline
    def setSeekBarFullWidth(value: StyleProp[ViewStyle]): Self = this.set("seekBarFullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeekBarFullWidth: Self = this.set("seekBarFullWidth", js.undefined)
    @scala.inline
    def setSeekBarFullWidthNull: Self = this.set("seekBarFullWidth", null)
    @scala.inline
    def setSeekBarKnob(value: StyleProp[ViewStyle]): Self = this.set("seekBarKnob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeekBarKnob: Self = this.set("seekBarKnob", js.undefined)
    @scala.inline
    def setSeekBarKnobNull: Self = this.set("seekBarKnob", null)
    @scala.inline
    def setSeekBarKnobSeeking(value: StyleProp[ViewStyle]): Self = this.set("seekBarKnobSeeking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeekBarKnobSeeking: Self = this.set("seekBarKnobSeeking", js.undefined)
    @scala.inline
    def setSeekBarKnobSeekingNull: Self = this.set("seekBarKnobSeeking", null)
    @scala.inline
    def setSeekBarProgress(value: StyleProp[ViewStyle]): Self = this.set("seekBarProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeekBarProgress: Self = this.set("seekBarProgress", js.undefined)
    @scala.inline
    def setSeekBarProgressNull: Self = this.set("seekBarProgress", null)
    @scala.inline
    def setThumbnail(value: StyleProp[ImageStyle]): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
    @scala.inline
    def setThumbnailNull: Self = this.set("thumbnail", null)
    @scala.inline
    def setVideo(value: StyleProp[ViewStyle]): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    @scala.inline
    def setVideoNull: Self = this.set("video", null)
    @scala.inline
    def setVideoWrapper(value: StyleProp[ViewStyle]): Self = this.set("videoWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoWrapper: Self = this.set("videoWrapper", js.undefined)
    @scala.inline
    def setVideoWrapperNull: Self = this.set("videoWrapper", null)
    @scala.inline
    def setWrapper(value: StyleProp[ViewStyle]): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
    @scala.inline
    def setWrapperNull: Self = this.set("wrapper", null)
  }
  
}

