package typings
package rsocketDashTypesLib.reactiveSocketTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestChannelFrame extends Frame {
  var data: js.UndefOr[Encodable] = js.undefined
  var flags: scala.Double
  var metadata: js.UndefOr[Encodable] = js.undefined
  var requestN: scala.Double
  var streamId: scala.Double
  var `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x07`
}

object RequestChannelFrame {
  @scala.inline
  def apply(
    flags: scala.Double,
    requestN: scala.Double,
    streamId: scala.Double,
    `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x07`,
    data: Encodable = null,
    metadata: Encodable = null
  ): RequestChannelFrame = {
    val __obj = js.Dynamic.literal(flags = flags, requestN = requestN, streamId = streamId)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestChannelFrame]
  }
}

