package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`pty-req`
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
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PseudoTtyChannelRequest]
  }
}

