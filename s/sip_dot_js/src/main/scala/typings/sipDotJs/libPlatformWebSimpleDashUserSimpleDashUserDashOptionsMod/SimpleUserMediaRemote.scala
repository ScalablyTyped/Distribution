package typings.sipDotJs.libPlatformWebSimpleDashUserSimpleDashUserDashOptionsMod

import typings.std.HTMLAudioElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleUserMediaRemote extends js.Object {
  /** The remote audio media stream is attached to this element. */
  var audio: js.UndefOr[HTMLAudioElement] = js.undefined
  /** The remote video media stream is attached to this element. */
  var video: js.UndefOr[HTMLVideoElement] = js.undefined
}

object SimpleUserMediaRemote {
  @scala.inline
  def apply(audio: HTMLAudioElement = null, video: HTMLVideoElement = null): SimpleUserMediaRemote = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleUserMediaRemote]
  }
}

