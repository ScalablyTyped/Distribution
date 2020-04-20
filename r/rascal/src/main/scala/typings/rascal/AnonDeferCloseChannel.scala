package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeferCloseChannel extends js.Object {
  var deferCloseChannel: Double
  var prefetch: Double
  var redeliveries: AnonCounter
  var retry: AnonFactor
  var vhost: String
}

object AnonDeferCloseChannel {
  @scala.inline
  def apply(
    deferCloseChannel: Double,
    prefetch: Double,
    redeliveries: AnonCounter,
    retry: AnonFactor,
    vhost: String
  ): AnonDeferCloseChannel = {
    val __obj = js.Dynamic.literal(deferCloseChannel = deferCloseChannel.asInstanceOf[js.Any], prefetch = prefetch.asInstanceOf[js.Any], redeliveries = redeliveries.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], vhost = vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeferCloseChannel]
  }
}

