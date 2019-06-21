package typings
package rsocketDashTypesLib.reactiveSocketTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaseFrame extends Frame {
  var flags: scala.Double
  var metadata: js.UndefOr[Encodable] = js.undefined
  var requestCount: scala.Double
  var streamId: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0`
  var ttl: scala.Double
  var `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x02`
}

object LeaseFrame {
  @scala.inline
  def apply(
    flags: scala.Double,
    requestCount: scala.Double,
    streamId: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0`,
    ttl: scala.Double,
    `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x02`,
    metadata: Encodable = null
  ): LeaseFrame = {
    val __obj = js.Dynamic.literal(flags = flags, requestCount = requestCount, streamId = streamId, ttl = ttl)
    __obj.updateDynamic("type")(`type`)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaseFrame]
  }
}

