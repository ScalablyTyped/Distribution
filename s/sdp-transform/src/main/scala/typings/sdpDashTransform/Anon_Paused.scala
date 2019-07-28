package typings.sdpDashTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Paused extends js.Object {
  var paused: Boolean
  var scid: Double | String
}

object Anon_Paused {
  @scala.inline
  def apply(paused: Boolean, scid: Double | String): Anon_Paused = {
    val __obj = js.Dynamic.literal(paused = paused, scid = scid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Paused]
  }
}

