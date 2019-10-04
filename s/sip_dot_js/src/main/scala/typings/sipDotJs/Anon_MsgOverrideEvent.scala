package typings.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MsgOverrideEvent extends js.Object {
  var msg: String
  var overrideEvent: js.UndefOr[Boolean] = js.undefined
}

object Anon_MsgOverrideEvent {
  @scala.inline
  def apply(msg: String, overrideEvent: js.UndefOr[Boolean] = js.undefined): Anon_MsgOverrideEvent = {
    val __obj = js.Dynamic.literal(msg = msg)
    if (!js.isUndefined(overrideEvent)) __obj.updateDynamic("overrideEvent")(overrideEvent)
    __obj.asInstanceOf[Anon_MsgOverrideEvent]
  }
}

