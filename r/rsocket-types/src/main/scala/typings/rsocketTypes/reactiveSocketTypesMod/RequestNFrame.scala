package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesNumbers.`0x08`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestNFrame extends Frame {
  var flags: Double = js.native
  var length: js.UndefOr[Double] = js.native
  var requestN: Double = js.native
  var streamId: Double = js.native
  var `type`: `0x08` = js.native
}

object RequestNFrame {
  @scala.inline
  def apply(flags: Double, requestN: Double, streamId: Double, `type`: `0x08`): RequestNFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], requestN = requestN.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestNFrame]
  }
  @scala.inline
  implicit class RequestNFrameOps[Self <: RequestNFrame] (val x: Self) extends AnyVal {
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
    def setRequestN(value: Double): Self = this.set("requestN", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamId(value: Double): Self = this.set("streamId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `0x08`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
  }
  
}

