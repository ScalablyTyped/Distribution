package typings
package rsocketDashTypesLib.reactiveSocketTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeepAliveFrame extends Frame {
  var data: js.UndefOr[Encodable] = js.undefined
  var flags: scala.Double
  var lastReceivedPosition: scala.Double
  var streamId: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0`
  var `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x03`
}

object KeepAliveFrame {
  @scala.inline
  def apply(
    flags: scala.Double,
    lastReceivedPosition: scala.Double,
    streamId: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0`,
    `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x03`,
    data: Encodable = null
  ): KeepAliveFrame = {
    val __obj = js.Dynamic.literal(flags = flags, lastReceivedPosition = lastReceivedPosition, streamId = streamId)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepAliveFrame]
  }
}

