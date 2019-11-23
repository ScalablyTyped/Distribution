package typings.rsocketDashTypes.reactiveSocketTypesMod

import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0x07`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestChannelFrame extends Frame {
  var data: js.UndefOr[Encodable] = js.undefined
  var flags: Double
  var length: js.UndefOr[Double] = js.undefined
  var metadata: js.UndefOr[Encodable] = js.undefined
  var requestN: Double
  var streamId: Double
  var `type`: `0x07`
}

object RequestChannelFrame {
  @scala.inline
  def apply(
    flags: Double,
    requestN: Double,
    streamId: Double,
    `type`: `0x07`,
    data: Encodable = null,
    length: Int | Double = null,
    metadata: Encodable = null
  ): RequestChannelFrame = {
    val __obj = js.Dynamic.literal(flags = flags, requestN = requestN, streamId = streamId)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestChannelFrame]
  }
}

