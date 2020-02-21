package typings.reactNativeVideoPlayer

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonControlButton extends js.Object {
  var controlButton: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var controlIcon: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var controls: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var playArrow: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var playButton: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var playControl: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var playIcon: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var seekBar: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var seekBarBackground: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var seekBarFullWidth: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var seekBarKnob: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var seekBarKnobSeeking: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var seekBarProgress: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var thumbnail: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  var video: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var videoWrapper: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var wrapper: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object AnonControlButton {
  @scala.inline
  def apply(
    controlButton: StyleProp[ViewStyle] = null,
    controlIcon: StyleProp[TextStyle] = null,
    controls: StyleProp[ViewStyle] = null,
    playArrow: StyleProp[TextStyle] = null,
    playButton: StyleProp[ViewStyle] = null,
    playControl: StyleProp[ViewStyle] = null,
    playIcon: StyleProp[TextStyle] = null,
    seekBar: StyleProp[ViewStyle] = null,
    seekBarBackground: StyleProp[ViewStyle] = null,
    seekBarFullWidth: StyleProp[ViewStyle] = null,
    seekBarKnob: StyleProp[ViewStyle] = null,
    seekBarKnobSeeking: StyleProp[ViewStyle] = null,
    seekBarProgress: StyleProp[ViewStyle] = null,
    thumbnail: StyleProp[ImageStyle] = null,
    video: StyleProp[ViewStyle] = null,
    videoWrapper: StyleProp[ViewStyle] = null,
    wrapper: StyleProp[ViewStyle] = null
  ): AnonControlButton = {
    val __obj = js.Dynamic.literal()
    if (controlButton != null) __obj.updateDynamic("controlButton")(controlButton.asInstanceOf[js.Any])
    if (controlIcon != null) __obj.updateDynamic("controlIcon")(controlIcon.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (playArrow != null) __obj.updateDynamic("playArrow")(playArrow.asInstanceOf[js.Any])
    if (playButton != null) __obj.updateDynamic("playButton")(playButton.asInstanceOf[js.Any])
    if (playControl != null) __obj.updateDynamic("playControl")(playControl.asInstanceOf[js.Any])
    if (playIcon != null) __obj.updateDynamic("playIcon")(playIcon.asInstanceOf[js.Any])
    if (seekBar != null) __obj.updateDynamic("seekBar")(seekBar.asInstanceOf[js.Any])
    if (seekBarBackground != null) __obj.updateDynamic("seekBarBackground")(seekBarBackground.asInstanceOf[js.Any])
    if (seekBarFullWidth != null) __obj.updateDynamic("seekBarFullWidth")(seekBarFullWidth.asInstanceOf[js.Any])
    if (seekBarKnob != null) __obj.updateDynamic("seekBarKnob")(seekBarKnob.asInstanceOf[js.Any])
    if (seekBarKnobSeeking != null) __obj.updateDynamic("seekBarKnobSeeking")(seekBarKnobSeeking.asInstanceOf[js.Any])
    if (seekBarProgress != null) __obj.updateDynamic("seekBarProgress")(seekBarProgress.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    if (videoWrapper != null) __obj.updateDynamic("videoWrapper")(videoWrapper.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonControlButton]
  }
}

