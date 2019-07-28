package typings.reactDashMailchimpDashSubscribe.reactDashMailchimpDashSubscribeMod

import typings.reactDashMailchimpDashSubscribe.reactDashMailchimpDashSubscribeStrings.sending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PendingArgs extends js.Object {
  var message: Null
  var status: sending | Null
}

object PendingArgs {
  @scala.inline
  def apply(message: Null, status: sending = null): PendingArgs = {
    val __obj = js.Dynamic.literal(message = message)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[PendingArgs]
  }
}

