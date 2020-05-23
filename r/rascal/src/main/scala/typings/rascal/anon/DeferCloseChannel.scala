package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeferCloseChannel extends js.Object {
  var deferCloseChannel: Double
  var prefetch: Double
  var redeliveries: Counter
  var retry: Factor
  var vhost: String
}

object DeferCloseChannel {
  @scala.inline
  def apply(deferCloseChannel: Double, prefetch: Double, redeliveries: Counter, retry: Factor, vhost: String): DeferCloseChannel = {
    val __obj = js.Dynamic.literal(deferCloseChannel = deferCloseChannel.asInstanceOf[js.Any], prefetch = prefetch.asInstanceOf[js.Any], redeliveries = redeliveries.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], vhost = vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeferCloseChannel]
  }
}

