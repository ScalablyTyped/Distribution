package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelMax extends js.Object {
  var channelMax: Double
  var connection_timeout: Double
  var heartbeat: Double
}

object ChannelMax {
  @scala.inline
  def apply(channelMax: Double, connection_timeout: Double, heartbeat: Double): ChannelMax = {
    val __obj = js.Dynamic.literal(channelMax = channelMax.asInstanceOf[js.Any], connection_timeout = connection_timeout.asInstanceOf[js.Any], heartbeat = heartbeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelMax]
  }
}

