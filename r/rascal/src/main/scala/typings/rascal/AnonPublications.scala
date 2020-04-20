package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPublications extends js.Object {
  var publications: AnonConfirm
  var redeliveries: AnonCounters
  var subscriptions: AnonDeferCloseChannel
  var vhosts: AnonBindings
}

object AnonPublications {
  @scala.inline
  def apply(
    publications: AnonConfirm,
    redeliveries: AnonCounters,
    subscriptions: AnonDeferCloseChannel,
    vhosts: AnonBindings
  ): AnonPublications = {
    val __obj = js.Dynamic.literal(publications = publications.asInstanceOf[js.Any], redeliveries = redeliveries.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], vhosts = vhosts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPublications]
  }
}

