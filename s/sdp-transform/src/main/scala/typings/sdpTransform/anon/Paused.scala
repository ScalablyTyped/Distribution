package typings.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paused extends js.Object {
  var paused: Boolean
  var scid: Double | String
}

object Paused {
  @scala.inline
  def apply(paused: Boolean, scid: Double | String): Paused = {
    val __obj = js.Dynamic.literal(paused = paused.asInstanceOf[js.Any], scid = scid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paused]
  }
}

