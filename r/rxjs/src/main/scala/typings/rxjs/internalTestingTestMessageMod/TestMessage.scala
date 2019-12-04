package typings.rxjs.internalTestingTestMessageMod

import typings.rxjs.internalNotificationMod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestMessage extends js.Object {
  var frame: Double
  var isGhost: js.UndefOr[Boolean] = js.undefined
  var notification: Notification[_]
}

object TestMessage {
  @scala.inline
  def apply(frame: Double, notification: Notification[_], isGhost: js.UndefOr[Boolean] = js.undefined): TestMessage = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
    if (!js.isUndefined(isGhost)) __obj.updateDynamic("isGhost")(isGhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestMessage]
  }
}

