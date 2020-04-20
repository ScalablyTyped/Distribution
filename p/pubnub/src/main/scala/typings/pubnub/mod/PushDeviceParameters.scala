package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushDeviceParameters extends js.Object {
  var device: String
  var pushGateway: String
}

object PushDeviceParameters {
  @scala.inline
  def apply(device: String, pushGateway: String): PushDeviceParameters = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], pushGateway = pushGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushDeviceParameters]
  }
}

