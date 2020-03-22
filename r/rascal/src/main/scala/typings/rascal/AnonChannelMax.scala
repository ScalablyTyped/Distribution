package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChannelMax extends js.Object {
  var channelMax: Double
  var connection_timeout: Double
  var heartbeat: Double
}

object AnonChannelMax {
  @scala.inline
  def apply(channelMax: Double, connection_timeout: Double, heartbeat: Double): AnonChannelMax = {
    val __obj = js.Dynamic.literal(channelMax = channelMax.asInstanceOf[js.Any], connection_timeout = connection_timeout.asInstanceOf[js.Any], heartbeat = heartbeat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChannelMax]
  }
}

