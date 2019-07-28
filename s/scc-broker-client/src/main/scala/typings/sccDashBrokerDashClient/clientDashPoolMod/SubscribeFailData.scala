package typings.sccDashBrokerDashClient.clientDashPoolMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeFailData extends SubscribeData {
  var error: Error
}

object SubscribeFailData {
  @scala.inline
  def apply(channel: String, error: Error, poolIndex: Double, targetURI: String): SubscribeFailData = {
    val __obj = js.Dynamic.literal(channel = channel, error = error, poolIndex = poolIndex, targetURI = targetURI)
  
    __obj.asInstanceOf[SubscribeFailData]
  }
}

