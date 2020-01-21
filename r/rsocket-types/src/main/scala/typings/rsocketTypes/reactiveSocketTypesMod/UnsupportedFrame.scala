package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesNumbers.`0`
import typings.rsocketTypes.rsocketTypesNumbers.`0x00`
import typings.rsocketTypes.rsocketTypesNumbers.`0x0c`
import typings.rsocketTypes.rsocketTypesNumbers.`0x3f`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedFrame extends Frame {
  var flags: Double
  var length: js.UndefOr[Double] = js.undefined
  var streamId: `0`
  var `type`: `0x3f` | `0x0c` | `0x00`
}

object UnsupportedFrame {
  @scala.inline
  def apply(flags: Double, streamId: `0`, `type`: `0x3f` | `0x0c` | `0x00`, length: Int | Double = null): UnsupportedFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedFrame]
  }
}

