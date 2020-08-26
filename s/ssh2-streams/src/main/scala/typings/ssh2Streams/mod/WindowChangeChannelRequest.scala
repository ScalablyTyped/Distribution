package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`window-change`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowChangeChannelRequest extends ChannelRequest {
  var cols: Double = js.native
  var height: Double = js.native
  var recipient: Double = js.native
  var request: `window-change` = js.native
  var rows: Double = js.native
  var width: Double = js.native
}

object WindowChangeChannelRequest {
  @scala.inline
  def apply(
    cols: Double,
    height: Double,
    recipient: Double,
    request: `window-change`,
    rows: Double,
    width: Double
  ): WindowChangeChannelRequest = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowChangeChannelRequest]
  }
  @scala.inline
  implicit class WindowChangeChannelRequestOps[Self <: WindowChangeChannelRequest] (val x: Self) extends AnyVal {
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
    def setRecipient(value: Double): Self = this.set("recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: `window-change`): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

