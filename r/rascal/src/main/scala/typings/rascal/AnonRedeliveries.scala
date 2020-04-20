package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRedeliveries extends js.Object {
  var publications: AnonConfirm
  var redeliveries: AnonCounters
  var subscriptions: AnonDeferCloseChannel
  var vhosts: AnonConnection
}

object AnonRedeliveries {
  @scala.inline
  def apply(
    publications: AnonConfirm,
    redeliveries: AnonCounters,
    subscriptions: AnonDeferCloseChannel,
    vhosts: AnonConnection
  ): AnonRedeliveries = {
    val __obj = js.Dynamic.literal(publications = publications.asInstanceOf[js.Any], redeliveries = redeliveries.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], vhosts = vhosts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRedeliveries]
  }
}

