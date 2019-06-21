package typings
package rsocketDashTypesLib.reactiveSocketTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestStreamFrame extends Frame {
  var data: Encodable
  var flags: scala.Double
  var metadata: Encodable
  var requestN: scala.Double
  var streamId: scala.Double
  var `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x06`
}

object RequestStreamFrame {
  @scala.inline
  def apply(
    data: Encodable,
    flags: scala.Double,
    metadata: Encodable,
    requestN: scala.Double,
    streamId: scala.Double,
    `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x06`
  ): RequestStreamFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], flags = flags, metadata = metadata.asInstanceOf[js.Any], requestN = requestN, streamId = streamId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RequestStreamFrame]
  }
}

