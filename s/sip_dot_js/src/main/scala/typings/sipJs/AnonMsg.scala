package typings.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMsg extends js.Object {
  var msg: String
  var overrideEvent: js.UndefOr[Boolean] = js.undefined
}

object AnonMsg {
  @scala.inline
  def apply(msg: String, overrideEvent: js.UndefOr[Boolean] = js.undefined): AnonMsg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideEvent)) __obj.updateDynamic("overrideEvent")(overrideEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMsg]
  }
}

