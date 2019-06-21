package typings
package rsocketDashTypesLib.reactiveSocketTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestNFrame extends Frame {
  var flags: scala.Double
  var requestN: scala.Double
  var streamId: scala.Double
  var `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x08`
}

object RequestNFrame {
  @scala.inline
  def apply(
    flags: scala.Double,
    requestN: scala.Double,
    streamId: scala.Double,
    `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x08`
  ): RequestNFrame = {
    val __obj = js.Dynamic.literal(flags = flags, requestN = requestN, streamId = streamId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RequestNFrame]
  }
}

