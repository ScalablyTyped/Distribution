package typings.reactMailchimpSubscribe.mod

import typings.reactMailchimpSubscribe.reactMailchimpSubscribeStrings.sending
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
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingArgs]
  }
}

