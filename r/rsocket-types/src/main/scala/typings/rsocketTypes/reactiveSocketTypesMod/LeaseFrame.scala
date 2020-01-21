package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesNumbers.`0`
import typings.rsocketTypes.rsocketTypesNumbers.`0x02`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaseFrame extends Frame {
  var flags: Double
  var length: js.UndefOr[Double] = js.undefined
  var metadata: js.UndefOr[Encodable] = js.undefined
  var requestCount: Double
  var streamId: `0`
  var ttl: Double
  var `type`: `0x02`
}

object LeaseFrame {
  @scala.inline
  def apply(
    flags: Double,
    requestCount: Double,
    streamId: `0`,
    ttl: Double,
    `type`: `0x02`,
    length: Int | Double = null,
    metadata: Encodable = null
  ): LeaseFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], requestCount = requestCount.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaseFrame]
  }
}

