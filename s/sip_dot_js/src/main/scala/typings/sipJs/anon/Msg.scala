package typings.sipJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Msg extends js.Object {
  var msg: String
  var overrideEvent: js.UndefOr[Boolean] = js.undefined
}

object Msg {
  @scala.inline
  def apply(msg: String, overrideEvent: js.UndefOr[Boolean] = js.undefined): Msg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideEvent)) __obj.updateDynamic("overrideEvent")(overrideEvent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msg]
  }
}

