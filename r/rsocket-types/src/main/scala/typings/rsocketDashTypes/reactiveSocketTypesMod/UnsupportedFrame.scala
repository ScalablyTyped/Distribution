package typings.rsocketDashTypes.reactiveSocketTypesMod

import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0`
import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0x00`
import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0x0c`
import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0x3f`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedFrame extends Frame {
  var flags: Double
  var streamId: `0`
  var `type`: `0x3f` | `0x0c` | `0x00`
}

object UnsupportedFrame {
  @scala.inline
  def apply(flags: Double, streamId: `0`, `type`: `0x3f` | `0x0c` | `0x00`): UnsupportedFrame = {
    val __obj = js.Dynamic.literal(flags = flags, streamId = streamId)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedFrame]
  }
}

