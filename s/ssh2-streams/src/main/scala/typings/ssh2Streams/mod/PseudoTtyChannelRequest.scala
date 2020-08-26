package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`pty-req`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PseudoTtyChannelRequest extends ChannelRequest {
  var cols: Double = js.native
  var height: Double = js.native
  var modes: js.Any = js.native
  var recipient: Double = js.native
  var request: `pty-req` = js.native
  var rows: Double = js.native
  var term: String = js.native
  var wantReply: Boolean = js.native
  var width: Double = js.native
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
  @scala.inline
  implicit class PseudoTtyChannelRequestOps[Self <: PseudoTtyChannelRequest] (val x: Self) extends AnyVal {
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
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setModes(value: js.Any): Self = this.set("modes", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipient(value: Double): Self = this.set("recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: `pty-req`): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setTerm(value: String): Self = this.set("term", value.asInstanceOf[js.Any])
    @scala.inline
    def setWantReply(value: Boolean): Self = this.set("wantReply", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

