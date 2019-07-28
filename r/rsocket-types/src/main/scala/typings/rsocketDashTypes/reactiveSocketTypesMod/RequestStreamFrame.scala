package typings.rsocketDashTypes.reactiveSocketTypesMod

import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0x06`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestStreamFrame extends Frame {
  var data: Encodable
  var flags: Double
  var metadata: Encodable
  var requestN: Double
  var streamId: Double
  var `type`: `0x06`
}

object RequestStreamFrame {
  @scala.inline
  def apply(
    data: Encodable,
    flags: Double,
    metadata: Encodable,
    requestN: Double,
    streamId: Double,
    `type`: `0x06`
  ): RequestStreamFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], flags = flags, metadata = metadata.asInstanceOf[js.Any], requestN = requestN, streamId = streamId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RequestStreamFrame]
  }
}

