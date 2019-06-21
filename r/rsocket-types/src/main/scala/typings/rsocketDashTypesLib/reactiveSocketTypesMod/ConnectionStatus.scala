package typings
package rsocketDashTypesLib.reactiveSocketTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionStatus extends js.Object {
  var error: js.UndefOr[stdLib.Error] = js.undefined
  var kind: js.UndefOr[
    rsocketDashTypesLib.rsocketDashTypesLibStrings.CLOSED | rsocketDashTypesLib.rsocketDashTypesLibStrings.CONNECTED | rsocketDashTypesLib.rsocketDashTypesLibStrings.CONNECTING | rsocketDashTypesLib.rsocketDashTypesLibStrings.ERROR | rsocketDashTypesLib.rsocketDashTypesLibStrings.NOT_CONNECTED
  ] = js.undefined
}

object ConnectionStatus {
  @scala.inline
  def apply(
    error: stdLib.Error = null,
    kind: rsocketDashTypesLib.rsocketDashTypesLibStrings.NOT_CONNECTED = null
  ): ConnectionStatus = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ConnectionStatus]
  }
}

