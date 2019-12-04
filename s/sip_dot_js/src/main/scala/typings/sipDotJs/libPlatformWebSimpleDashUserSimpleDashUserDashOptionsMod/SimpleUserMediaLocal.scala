package typings.sipDotJs.libPlatformWebSimpleDashUserSimpleDashUserDashOptionsMod

import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleUserMediaLocal extends js.Object {
  /** The local video media stream is attached to this element. */
  var video: js.UndefOr[HTMLVideoElement] = js.undefined
}

object SimpleUserMediaLocal {
  @scala.inline
  def apply(video: HTMLVideoElement = null): SimpleUserMediaLocal = {
    val __obj = js.Dynamic.literal()
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleUserMediaLocal]
  }
}

