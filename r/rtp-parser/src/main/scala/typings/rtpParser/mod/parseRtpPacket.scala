package typings.rtpParser.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rtp-parser", "parseRtpPacket")
@js.native
object parseRtpPacket extends js.Object {
  def apply(buf: Buffer): ParsedRTPPacket = js.native
}

