package typings.sccDashBrokerDashClient.clientDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeData extends js.Object {
  var channel: String
  var poolIndex: Double
  var targetURI: String
}

object SubscribeData {
  @scala.inline
  def apply(channel: String, poolIndex: Double, targetURI: String): SubscribeData = {
    val __obj = js.Dynamic.literal(channel = channel, poolIndex = poolIndex, targetURI = targetURI)
  
    __obj.asInstanceOf[SubscribeData]
  }
}

