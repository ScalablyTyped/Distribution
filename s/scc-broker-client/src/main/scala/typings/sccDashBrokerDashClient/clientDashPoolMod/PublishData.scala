package typings.sccDashBrokerDashClient.clientDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishData extends js.Object {
  var channel: String
  var data: js.Any
  var poolIndex: Double
  var targetURI: String
}

object PublishData {
  @scala.inline
  def apply(channel: String, data: js.Any, poolIndex: Double, targetURI: String): PublishData = {
    val __obj = js.Dynamic.literal(channel = channel, data = data, poolIndex = poolIndex, targetURI = targetURI)
  
    __obj.asInstanceOf[PublishData]
  }
}

