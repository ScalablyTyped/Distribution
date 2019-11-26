package typings.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Msg extends js.Object {
  var msg: String
  var overrideEvent: js.UndefOr[Boolean] = js.undefined
}

object Anon_Msg {
  @scala.inline
  def apply(msg: String, overrideEvent: js.UndefOr[Boolean] = js.undefined): Anon_Msg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideEvent)) __obj.updateDynamic("overrideEvent")(overrideEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Msg]
  }
}

