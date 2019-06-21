package typings
package rsocketDashTypesLib.reactiveSocketTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelFrame extends Frame {
  var flags: scala.Double
  var streamId: scala.Double
  var `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x09`
}

object CancelFrame {
  @scala.inline
  def apply(
    flags: scala.Double,
    streamId: scala.Double,
    `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x09`
  ): CancelFrame = {
    val __obj = js.Dynamic.literal(flags = flags, streamId = streamId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CancelFrame]
  }
}

