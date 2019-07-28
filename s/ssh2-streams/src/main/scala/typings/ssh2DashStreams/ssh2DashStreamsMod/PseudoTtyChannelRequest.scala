package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.`pty-req`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PseudoTtyChannelRequest extends ChannelRequest {
  var cols: Double
  var height: Double
  var modes: js.Any
  var recipient: Double
  var request: `pty-req`
  var rows: Double
  var term: String
  var wantReply: Boolean
  var width: Double
}

object PseudoTtyChannelRequest {
  @scala.inline
  def apply(
    cols: Double,
    height: Double,
    modes: js.Any,
    recipient: Double,
    request: `pty-req`,
    rows: Double,
    term: String,
    wantReply: Boolean,
    width: Double
  ): PseudoTtyChannelRequest = {
    val __obj = js.Dynamic.literal(cols = cols, height = height, modes = modes, recipient = recipient, request = request, rows = rows, term = term, wantReply = wantReply, width = width)
  
    __obj.asInstanceOf[PseudoTtyChannelRequest]
  }
}

