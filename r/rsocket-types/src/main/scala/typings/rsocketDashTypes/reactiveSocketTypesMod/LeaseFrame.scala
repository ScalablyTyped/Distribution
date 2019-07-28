package typings.rsocketDashTypes.reactiveSocketTypesMod

import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0`
import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0x02`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaseFrame extends Frame {
  var flags: Double
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
    metadata: Encodable = null
  ): LeaseFrame = {
    val __obj = js.Dynamic.literal(flags = flags, requestCount = requestCount, streamId = streamId, ttl = ttl)
    __obj.updateDynamic("type")(`type`)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaseFrame]
  }
}

