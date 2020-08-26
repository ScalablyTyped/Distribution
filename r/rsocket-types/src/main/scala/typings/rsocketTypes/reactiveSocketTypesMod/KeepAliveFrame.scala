package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesNumbers.`0`
import typings.rsocketTypes.rsocketTypesNumbers.`0x03`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeepAliveFrame extends Frame {
  var data: js.UndefOr[Encodable] = js.native
  var flags: Double = js.native
  var lastReceivedPosition: Double = js.native
  var length: js.UndefOr[Double] = js.native
  var streamId: `0` = js.native
  var `type`: `0x03` = js.native
}

object KeepAliveFrame {
  @scala.inline
  def apply(flags: Double, lastReceivedPosition: Double, streamId: `0`, `type`: `0x03`): KeepAliveFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], lastReceivedPosition = lastReceivedPosition.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepAliveFrame]
  }
  @scala.inline
  implicit class KeepAliveFrameOps[Self <: KeepAliveFrame] (val x: Self) extends AnyVal {
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
    def setLastReceivedPosition(value: Double): Self = this.set("lastReceivedPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamId(value: `0`): Self = this.set("streamId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `0x03`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: Encodable): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
  }
  
}

