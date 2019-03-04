package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PseudoTtyChannelRequest extends ChannelRequest {
  var cols: scala.Double
  var height: scala.Double
  var modes: js.Any
  var recipient: scala.Double
  var request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`pty-req`
  var rows: scala.Double
  var term: java.lang.String
  var wantReply: scala.Boolean
  var width: scala.Double
}

object PseudoTtyChannelRequest {
  @scala.inline
  def apply(
    cols: scala.Double,
    height: scala.Double,
    modes: js.Any,
    recipient: scala.Double,
    request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`pty-req`,
    rows: scala.Double,
    term: java.lang.String,
    wantReply: scala.Boolean,
    width: scala.Double
  ): PseudoTtyChannelRequest = {
    val __obj = js.Dynamic.literal(cols = cols, height = height, modes = modes, recipient = recipient, request = request, rows = rows, term = term, wantReply = wantReply, width = width)
  
    __obj.asInstanceOf[PseudoTtyChannelRequest]
  }
}

