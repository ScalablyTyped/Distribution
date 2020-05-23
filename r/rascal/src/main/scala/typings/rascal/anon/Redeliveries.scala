package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redeliveries extends js.Object {
  var publications: Confirm
  var redeliveries: Counters
  var subscriptions: DeferCloseChannel
  var vhosts: Connection
}

object Redeliveries {
  @scala.inline
  def apply(
    publications: Confirm,
    redeliveries: Counters,
    subscriptions: DeferCloseChannel,
    vhosts: Connection
  ): Redeliveries = {
    val __obj = js.Dynamic.literal(publications = publications.asInstanceOf[js.Any], redeliveries = redeliveries.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], vhosts = vhosts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redeliveries]
  }
}

