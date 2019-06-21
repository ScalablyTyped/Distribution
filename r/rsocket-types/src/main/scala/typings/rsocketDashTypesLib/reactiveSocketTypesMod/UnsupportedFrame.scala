package typings
package rsocketDashTypesLib.reactiveSocketTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedFrame extends Frame {
  var flags: scala.Double
  var streamId: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0`
  var `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x3f` | rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x0c` | rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x00`
}

object UnsupportedFrame {
  @scala.inline
  def apply(
    flags: scala.Double,
    streamId: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0`,
    `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x3f` | rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x0c` | rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x00`
  ): UnsupportedFrame = {
    val __obj = js.Dynamic.literal(flags = flags, streamId = streamId)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedFrame]
  }
}

