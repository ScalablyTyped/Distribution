package typings.rsocketDashTypes.reactiveSocketTypesMod

import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0x05`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestFnfFrame extends Frame {
  var data: js.UndefOr[Encodable] = js.undefined
  var flags: Double
  var length: js.UndefOr[Double] = js.undefined
  var metadata: js.UndefOr[Encodable] = js.undefined
  var streamId: Double
  var `type`: `0x05`
}

object RequestFnfFrame {
  @scala.inline
  def apply(
    flags: Double,
    streamId: Double,
    `type`: `0x05`,
    data: Encodable = null,
    length: Int | Double = null,
    metadata: Encodable = null
  ): RequestFnfFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestFnfFrame]
  }
}

