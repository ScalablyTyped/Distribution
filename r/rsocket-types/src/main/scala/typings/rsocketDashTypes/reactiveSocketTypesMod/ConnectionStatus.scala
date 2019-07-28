package typings.rsocketDashTypes.reactiveSocketTypesMod

import typings.rsocketDashTypes.rsocketDashTypesStrings.CLOSED
import typings.rsocketDashTypes.rsocketDashTypesStrings.CONNECTED
import typings.rsocketDashTypes.rsocketDashTypesStrings.CONNECTING
import typings.rsocketDashTypes.rsocketDashTypesStrings.ERROR
import typings.rsocketDashTypes.rsocketDashTypesStrings.NOT_CONNECTED
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionStatus extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var kind: js.UndefOr[CLOSED | CONNECTED | CONNECTING | ERROR | NOT_CONNECTED] = js.undefined
}

object ConnectionStatus {
  @scala.inline
  def apply(error: Error = null, kind: NOT_CONNECTED = null): ConnectionStatus = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ConnectionStatus]
  }
}

