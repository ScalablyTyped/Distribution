package typings.rtpParser.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedRTPPacket extends js.Object {
  var csrc: js.Array[Double] = js.native
  var csrcCount: Double = js.native
  var extension: Double = js.native
  var marker: Double = js.native
  var padding: Double = js.native
  var payload: Buffer = js.native
  var payloadType: Double = js.native
  var sequenceNumber: Double = js.native
  var ssrc: Double = js.native
  var timestamp: Double = js.native
  var version: Double = js.native
}

object ParsedRTPPacket {
  @scala.inline
  def apply(
    csrc: js.Array[Double],
    csrcCount: Double,
    extension: Double,
    marker: Double,
    padding: Double,
    payload: Buffer,
    payloadType: Double,
    sequenceNumber: Double,
    ssrc: Double,
    timestamp: Double,
    version: Double
  ): ParsedRTPPacket = {
    val __obj = js.Dynamic.literal(csrc = csrc.asInstanceOf[js.Any], csrcCount = csrcCount.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any], ssrc = ssrc.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedRTPPacket]
  }
  @scala.inline
  implicit class ParsedRTPPacketOps[Self <: ParsedRTPPacket] (val x: Self) extends AnyVal {
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
    def setCsrcVarargs(value: Double*): Self = this.set("csrc", js.Array(value :_*))
    @scala.inline
    def setCsrc(value: js.Array[Double]): Self = this.set("csrc", value.asInstanceOf[js.Any])
    @scala.inline
    def setCsrcCount(value: Double): Self = this.set("csrcCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtension(value: Double): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarker(value: Double): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: Buffer): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayloadType(value: Double): Self = this.set("payloadType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequenceNumber(value: Double): Self = this.set("sequenceNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setSsrc(value: Double): Self = this.set("ssrc", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

