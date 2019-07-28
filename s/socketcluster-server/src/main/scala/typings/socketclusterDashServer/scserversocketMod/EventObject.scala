package typings.socketclusterDashServer.scserversocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventObject extends js.Object {
  var cid: js.UndefOr[Double] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var event: String
}

object EventObject {
  @scala.inline
  def apply(event: String, cid: Int | Double = null, data: js.Any = null): EventObject = {
    val __obj = js.Dynamic.literal(event = event)
    if (cid != null) __obj.updateDynamic("cid")(cid.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[EventObject]
  }
}

