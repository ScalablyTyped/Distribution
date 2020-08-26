package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesNumbers.`0`
import typings.rsocketTypes.rsocketTypesNumbers.`0x00`
import typings.rsocketTypes.rsocketTypesNumbers.`0x0c`
import typings.rsocketTypes.rsocketTypesNumbers.`0x3f`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsupportedFrame extends Frame {
  var flags: Double = js.native
  var length: js.UndefOr[Double] = js.native
  var streamId: `0` = js.native
  var `type`: `0x3f` | `0x0c` | `0x00` = js.native
}

object UnsupportedFrame {
  @scala.inline
  def apply(flags: Double, streamId: `0`, `type`: `0x3f` | `0x0c` | `0x00`): UnsupportedFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedFrame]
  }
  @scala.inline
  implicit class UnsupportedFrameOps[Self <: UnsupportedFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamId(value: `0`): Self = this.set("streamId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `0x3f` | `0x0c` | `0x00`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
  }
  
}

