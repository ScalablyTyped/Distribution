package typings.rsocketDashTypes.reactiveSocketTypesMod

import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0x04`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestResponseFrame extends Frame {
  var data: js.UndefOr[Encodable] = js.undefined
  var flags: Double
  var metadata: js.UndefOr[Encodable] = js.undefined
  var streamId: Double
  var `type`: `0x04`
}

object RequestResponseFrame {
  @scala.inline
  def apply(
    flags: Double,
    streamId: Double,
    `type`: `0x04`,
    data: Encodable = null,
    metadata: Encodable = null
  ): RequestResponseFrame = {
    val __obj = js.Dynamic.literal(flags = flags, streamId = streamId)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestResponseFrame]
  }
}

