package typings.rtpParser.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedRTPPacket extends js.Object {
  var csrc: js.Array[Double]
  var csrcCount: Double
  var extension: Double
  var marker: Double
  var padding: Double
  var payload: Buffer
  var payloadType: Double
  var sequenceNumber: Double
  var ssrc: Double
  var timestamp: Double
  var version: Double
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
}

