package typings
package reactDashNativeDashVideoLib.reactDashNativeDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProperties
  extends reactDashNativeLib.reactDashNativeMod.ViewProps {
  var allowsExternalPlayback: js.UndefOr[scala.Boolean] = js.undefined
  var controls: js.UndefOr[scala.Boolean] = js.undefined
  var currentTime: js.UndefOr[scala.Double] = js.undefined
  var disableFocus: js.UndefOr[scala.Boolean] = js.undefined
  var fullscreen: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreSilentSwitch: js.UndefOr[
    reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.ignore | reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.obey
  ] = js.undefined
  var muted: js.UndefOr[scala.Boolean] = js.undefined
  var onAudioBecomingNoisy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onAudioFocusChanged: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onBuffer: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ LoadError, scala.Unit]] = js.undefined
  var onFullscreenPlayerDidDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onFullscreenPlayerDidPresent: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onFullscreenPlayerWillDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onFullscreenPlayerWillPresent: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* data */ OnLoadData, scala.Unit]] = js.undefined
  var onLoadStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPlaybackRateChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPlaybackResume: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPlaybackStalled: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onProgress: js.UndefOr[
    js.Function1[/* data */ reactDashNativeDashVideoLib.Anon_SeekableDuration, scala.Unit]
  ] = js.undefined
  var onReadyForDisplay: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSeek: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onTimedMetadata: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoBuffer: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoError: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoFullscreenPlayerDidDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoFullscreenPlayerDidPresent: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoFullscreenPlayerWillDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoFullscreenPlayerWillPresent: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoLoad: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoLoadStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoProgress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoSeek: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var paused: js.UndefOr[scala.Boolean] = js.undefined
  var playInBackground: js.UndefOr[scala.Boolean] = js.undefined
  var playWhenInactive: js.UndefOr[scala.Boolean] = js.undefined
  var poster: js.UndefOr[java.lang.String] = js.undefined
  var progressUpdateInterval: js.UndefOr[scala.Double] = js.undefined
  var rate: js.UndefOr[scala.Double] = js.undefined
  var repeat: js.UndefOr[scala.Boolean] = js.undefined
  var resizeMode: js.UndefOr[java.lang.String] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  /* Required by react-native */
  var scaleX: js.UndefOr[scala.Double] = js.undefined
  var scaleY: js.UndefOr[scala.Double] = js.undefined
  var seek: js.UndefOr[scala.Double] = js.undefined
  var selectedTextTrack: js.UndefOr[reactDashNativeDashVideoLib.Anon_TypeSystem] = js.undefined
  /* Wrapper component */
  // Opaque type returned by require('./video.mp4')
  var source: reactDashNativeDashVideoLib.Anon_Uri | scala.Double
  /* Native only */
  var src: js.UndefOr[js.Any] = js.undefined
  var textTracks: js.UndefOr[js.Array[reactDashNativeDashVideoLib.Anon_Type]] = js.undefined
  var translateX: js.UndefOr[scala.Double] = js.undefined
  var translateY: js.UndefOr[scala.Double] = js.undefined
  var useTextureView: js.UndefOr[scala.Boolean] = js.undefined
  var volume: js.UndefOr[scala.Double] = js.undefined
}

