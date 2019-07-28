package typings.rsocketDashTypes.reactiveSocketTypesMod

import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0`
import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0x03`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeepAliveFrame extends Frame {
  var data: js.UndefOr[Encodable] = js.undefined
  var flags: Double
  var lastReceivedPosition: Double
  var streamId: `0`
  var `type`: `0x03`
}

object KeepAliveFrame {
  @scala.inline
  def apply(flags: Double, lastReceivedPosition: Double, streamId: `0`, `type`: `0x03`, data: Encodable = null): KeepAliveFrame = {
    val __obj = js.Dynamic.literal(flags = flags, lastReceivedPosition = lastReceivedPosition, streamId = streamId)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepAliveFrame]
  }
}

