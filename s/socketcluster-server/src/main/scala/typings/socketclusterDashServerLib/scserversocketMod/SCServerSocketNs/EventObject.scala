package typings
package socketclusterDashServerLib.scserversocketMod.SCServerSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventObject extends js.Object {
  var cid: js.UndefOr[scala.Double] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var event: java.lang.String
}

object EventObject {
  @scala.inline
  def apply(event: java.lang.String, cid: scala.Int | scala.Double = null, data: js.Any = null): EventObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    if (cid != null) __obj.updateDynamic("cid")(cid.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[EventObject]
  }
}

