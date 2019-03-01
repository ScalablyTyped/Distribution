package typings
package reactDashMailchimpDashSubscribeLib.reactDashMailchimpDashSubscribeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PendingArgs extends js.Object {
  var message: scala.Null
  var status: reactDashMailchimpDashSubscribeLib.reactDashMailchimpDashSubscribeLibStrings.sending | scala.Null
}

object PendingArgs {
  @scala.inline
  def apply(
    message: scala.Null,
    status: reactDashMailchimpDashSubscribeLib.reactDashMailchimpDashSubscribeLibStrings.sending = null
  ): PendingArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[PendingArgs]
  }
}

