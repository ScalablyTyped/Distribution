package typings.sipJs.simpleUserOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleUserMediaConstraints extends js.Object {
  /** If true, offer and answer to send and receive audio. */
  var audio: Boolean
  /** If true, offer and answer to send and receive video. */
  var video: Boolean
}

object SimpleUserMediaConstraints {
  @scala.inline
  def apply(audio: Boolean, video: Boolean): SimpleUserMediaConstraints = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleUserMediaConstraints]
  }
}

