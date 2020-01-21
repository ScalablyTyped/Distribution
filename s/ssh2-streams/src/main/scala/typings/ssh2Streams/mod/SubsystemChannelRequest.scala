package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.subsystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubsystemChannelRequest extends ChannelRequest {
  var recipient: Double
  var request: subsystem
  var subsystem: String
  var wantReply: Boolean
}

object SubsystemChannelRequest {
  @scala.inline
  def apply(recipient: Double, request: subsystem, subsystem: String, wantReply: Boolean): SubsystemChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], subsystem = subsystem.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubsystemChannelRequest]
  }
}

