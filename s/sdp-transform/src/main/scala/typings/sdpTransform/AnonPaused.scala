package typings.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPaused extends js.Object {
  var paused: Boolean
  var scid: Double | String
}

object AnonPaused {
  @scala.inline
  def apply(paused: Boolean, scid: Double | String): AnonPaused = {
    val __obj = js.Dynamic.literal(paused = paused.asInstanceOf[js.Any], scid = scid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPaused]
  }
}

