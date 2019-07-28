package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.`window-change`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowChangeChannelRequest extends ChannelRequest {
  var cols: Double
  var height: Double
  var recipient: Double
  var request: `window-change`
  var rows: Double
  var width: Double
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
    val __obj = js.Dynamic.literal(cols = cols, height = height, recipient = recipient, request = request, rows = rows, width = width)
  
    __obj.asInstanceOf[WindowChangeChannelRequest]
  }
}

