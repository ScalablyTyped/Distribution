package typings.sccBrokerClient.clientPoolMod

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
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], poolIndex = poolIndex.asInstanceOf[js.Any], targetURI = targetURI.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubscribeFailData]
  }
}

