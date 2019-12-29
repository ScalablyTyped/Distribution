package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.`exit-signal`
import typings.ssh2DashStreams.ssh2DashStreamsStrings.`exit-status`
import typings.ssh2DashStreams.ssh2DashStreamsStrings.`pty-req`
import typings.ssh2DashStreams.ssh2DashStreamsStrings.`window-change`
import typings.ssh2DashStreams.ssh2DashStreamsStrings.`x11-req`
import typings.ssh2DashStreams.ssh2DashStreamsStrings.`xon-xoff`
import typings.ssh2DashStreams.ssh2DashStreamsStrings.env
import typings.ssh2DashStreams.ssh2DashStreamsStrings.exec
import typings.ssh2DashStreams.ssh2DashStreamsStrings.shell
import typings.ssh2DashStreams.ssh2DashStreamsStrings.signal
import typings.ssh2DashStreams.ssh2DashStreamsStrings.subsystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ssh2DashStreams.ssh2DashStreamsMod.ExitStatusChannelRequest
  - typings.ssh2DashStreams.ssh2DashStreamsMod.ExitSignalChannelRequest
  - typings.ssh2DashStreams.ssh2DashStreamsMod.PseudoTtyChannelRequest
  - typings.ssh2DashStreams.ssh2DashStreamsMod.WindowChangeChannelRequest
  - typings.ssh2DashStreams.ssh2DashStreamsMod.X11ChannelRequest
  - typings.ssh2DashStreams.ssh2DashStreamsMod.EnvChannelRequest
  - typings.ssh2DashStreams.ssh2DashStreamsMod.ShellChannelRequest
  - typings.ssh2DashStreams.ssh2DashStreamsMod.ExecChannelRequest
  - typings.ssh2DashStreams.ssh2DashStreamsMod.SubsystemChannelRequest
  - typings.ssh2DashStreams.ssh2DashStreamsMod.SignalChannelRequest
  - typings.ssh2DashStreams.ssh2DashStreamsMod.FlowControlChannelRequest
*/
trait ChannelRequest extends js.Object

object ChannelRequest {
  @scala.inline
  def ExecChannelRequest(command: String, recipient: Double, request: exec, wantReply: Boolean): ChannelRequest = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelRequest]
  }
  @scala.inline
  def ExitSignalChannelRequest(coredump: Boolean, description: String, recipient: Double, request: `exit-signal`, signal: String): ChannelRequest = {
    val __obj = js.Dynamic.literal(coredump = coredump.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelRequest]
  }
  @scala.inline
  def EnvChannelRequest(key: String, recipient: Double, request: env, `val`: String, wantReply: Boolean): ChannelRequest = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelRequest]
  }
  @scala.inline
  def X11ChannelRequest(
    cookie: String,
    protocol: String,
    recipient: Double,
    request: `x11-req`,
    screen: Double,
    single: Boolean,
    wantReply: Boolean
  ): ChannelRequest = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelRequest]
  }
  @scala.inline
  def SubsystemChannelRequest(recipient: Double, request: subsystem, subsystem: String, wantReply: Boolean): ChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], subsystem = subsystem.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelRequest]
  }
  @scala.inline
  def SignalChannelRequest(recipient: Double, request: signal, signal: String): ChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelRequest]
  }
  @scala.inline
  def ShellChannelRequest(recipient: Double, request: shell, wantReply: Boolean): ChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelRequest]
  }
  @scala.inline
  def ExitStatusChannelRequest(code: Double, recipient: Double, request: `exit-status`): ChannelRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelRequest]
  }
  @scala.inline
  def FlowControlChannelRequest(clientControl: Boolean, recipient: Double, request: `xon-xoff`): ChannelRequest = {
    val __obj = js.Dynamic.literal(clientControl = clientControl.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelRequest]
  }
  @scala.inline
  def PseudoTtyChannelRequest(
    cols: Double,
    height: Double,
    modes: js.Any,
    recipient: Double,
    request: `pty-req`,
    rows: Double,
    term: String,
    wantReply: Boolean,
    width: Double
  ): ChannelRequest = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelRequest]
  }
  @scala.inline
  def WindowChangeChannelRequest(
    cols: Double,
    height: Double,
    recipient: Double,
    request: `window-change`,
    rows: Double,
    width: Double
  ): ChannelRequest = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelRequest]
  }
}

