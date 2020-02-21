package typings.reactNativeVideoPlayer.mod

import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeVideoPlayer.AnonControlButton
import typings.reactNativeVideoPlayer.AnonUri
import typings.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.contain
import typings.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.cover
import typings.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.none
import typings.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.stretch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoPlayerProps extends js.Object {
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var controlsTimeout: js.UndefOr[Double] = js.undefined
  var customStyles: js.UndefOr[AnonControlButton] = js.undefined
  var defaultMuted: js.UndefOr[Boolean] = js.undefined
  var disableControlsAutoHide: js.UndefOr[Boolean] = js.undefined
  var disableFullscreen: js.UndefOr[Boolean] = js.undefined
  var disableSeek: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var endThumbnail: js.UndefOr[ImageSourcePropType] = js.undefined
  var endWithThumbnail: js.UndefOr[Boolean] = js.undefined
  var fullScreenOnLongPress: js.UndefOr[Boolean] = js.undefined
  var hideControlsOnStart: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var muted: js.UndefOr[Boolean] = js.undefined
  var onEnd: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  var onHideControls: js.UndefOr[js.Function0[_]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  var onMutePress: js.UndefOr[js.Function0[_]] = js.undefined
  var onPlayPress: js.UndefOr[js.Function0[_]] = js.undefined
  var onProgress: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  var onShowControls: js.UndefOr[js.Function0[_]] = js.undefined
  var onStart: js.UndefOr[js.Function0[_]] = js.undefined
  var pauseOnPress: js.UndefOr[Boolean] = js.undefined
  var paused: js.UndefOr[Boolean] = js.undefined
  var resizeMode: js.UndefOr[stretch | contain | cover | none] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var thumbnail: js.UndefOr[ImageSourcePropType] = js.undefined
  var video: js.UndefOr[AnonUri | Double] = js.undefined
  var videoHeight: js.UndefOr[Double] = js.undefined
  var videoWidth: js.UndefOr[Double] = js.undefined
}

object VideoPlayerProps {
  @scala.inline
  def apply(
    autoplay: js.UndefOr[Boolean] = js.undefined,
    controlsTimeout: Int | Double = null,
    customStyles: AnonControlButton = null,
    defaultMuted: js.UndefOr[Boolean] = js.undefined,
    disableControlsAutoHide: js.UndefOr[Boolean] = js.undefined,
    disableFullscreen: js.UndefOr[Boolean] = js.undefined,
    disableSeek: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    endThumbnail: ImageSourcePropType = null,
    endWithThumbnail: js.UndefOr[Boolean] = js.undefined,
    fullScreenOnLongPress: js.UndefOr[Boolean] = js.undefined,
    hideControlsOnStart: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    onEnd: /* event */ js.Any => _ = null,
    onHideControls: () => _ = null,
    onLoad: /* event */ js.Any => _ = null,
    onMutePress: () => _ = null,
    onPlayPress: () => _ = null,
    onProgress: /* event */ js.Any => _ = null,
    onShowControls: () => _ = null,
    onStart: () => _ = null,
    pauseOnPress: js.UndefOr[Boolean] = js.undefined,
    paused: js.UndefOr[Boolean] = js.undefined,
    resizeMode: stretch | contain | cover | none = null,
    style: StyleProp[ViewStyle] = null,
    thumbnail: ImageSourcePropType = null,
    video: AnonUri | Double = null,
    videoHeight: Int | Double = null,
    videoWidth: Int | Double = null
  ): VideoPlayerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (controlsTimeout != null) __obj.updateDynamic("controlsTimeout")(controlsTimeout.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultMuted)) __obj.updateDynamic("defaultMuted")(defaultMuted.asInstanceOf[js.Any])
    if (!js.isUndefined(disableControlsAutoHide)) __obj.updateDynamic("disableControlsAutoHide")(disableControlsAutoHide.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFullscreen)) __obj.updateDynamic("disableFullscreen")(disableFullscreen.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSeek)) __obj.updateDynamic("disableSeek")(disableSeek.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (endThumbnail != null) __obj.updateDynamic("endThumbnail")(endThumbnail.asInstanceOf[js.Any])
    if (!js.isUndefined(endWithThumbnail)) __obj.updateDynamic("endWithThumbnail")(endWithThumbnail.asInstanceOf[js.Any])
    if (!js.isUndefined(fullScreenOnLongPress)) __obj.updateDynamic("fullScreenOnLongPress")(fullScreenOnLongPress.asInstanceOf[js.Any])
    if (!js.isUndefined(hideControlsOnStart)) __obj.updateDynamic("hideControlsOnStart")(hideControlsOnStart.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1(onEnd))
    if (onHideControls != null) __obj.updateDynamic("onHideControls")(js.Any.fromFunction0(onHideControls))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onMutePress != null) __obj.updateDynamic("onMutePress")(js.Any.fromFunction0(onMutePress))
    if (onPlayPress != null) __obj.updateDynamic("onPlayPress")(js.Any.fromFunction0(onPlayPress))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onShowControls != null) __obj.updateDynamic("onShowControls")(js.Any.fromFunction0(onShowControls))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction0(onStart))
    if (!js.isUndefined(pauseOnPress)) __obj.updateDynamic("pauseOnPress")(pauseOnPress.asInstanceOf[js.Any])
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.asInstanceOf[js.Any])
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    if (videoHeight != null) __obj.updateDynamic("videoHeight")(videoHeight.asInstanceOf[js.Any])
    if (videoWidth != null) __obj.updateDynamic("videoWidth")(videoWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerProps]
  }
}

