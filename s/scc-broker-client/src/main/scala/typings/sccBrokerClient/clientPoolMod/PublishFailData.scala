package typings.sccBrokerClient.clientPoolMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishFailData extends js.Object {
  var channel: String
  var error: Error
  var poolIndex: Double
  var targetURI: String
}

object PublishFailData {
  @scala.inline
  def apply(channel: String, error: Error, poolIndex: Double, targetURI: String): PublishFailData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], poolIndex = poolIndex.asInstanceOf[js.Any], targetURI = targetURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishFailData]
  }
}

