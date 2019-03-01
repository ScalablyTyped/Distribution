package typings
package reactDashMailchimpDashSubscribeLib.reactDashMailchimpDashSubscribeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseArgs extends js.Object {
  var message: java.lang.String
  var status: reactDashMailchimpDashSubscribeLib.reactDashMailchimpDashSubscribeLibStrings.success | reactDashMailchimpDashSubscribeLib.reactDashMailchimpDashSubscribeLibStrings.error
}

object ResponseArgs {
  @scala.inline
  def apply(
    message: java.lang.String,
    status: reactDashMailchimpDashSubscribeLib.reactDashMailchimpDashSubscribeLibStrings.success | reactDashMailchimpDashSubscribeLib.reactDashMailchimpDashSubscribeLibStrings.error
  ): ResponseArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseArgs]
  }
}

