package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`exit-signal`
import typings.ssh2Streams.ssh2StreamsStrings.`exit-status`
import typings.ssh2Streams.ssh2StreamsStrings.`pty-req`
import typings.ssh2Streams.ssh2StreamsStrings.`window-change`
import typings.ssh2Streams.ssh2StreamsStrings.`x11-req`
import typings.ssh2Streams.ssh2StreamsStrings.`xon-xoff`
import typings.ssh2Streams.ssh2StreamsStrings.env
import typings.ssh2Streams.ssh2StreamsStrings.exec
import typings.ssh2Streams.ssh2StreamsStrings.shell
import typings.ssh2Streams.ssh2StreamsStrings.signal
import typings.ssh2Streams.ssh2StreamsStrings.subsystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ssh2Streams.mod.ExitStatusChannelRequest
  - typings.ssh2Streams.mod.ExitSignalChannelRequest
  - typings.ssh2Streams.mod.PseudoTtyChannelRequest
  - typings.ssh2Streams.mod.WindowChangeChannelRequest
  - typings.ssh2Streams.mod.X11ChannelRequest
  - typings.ssh2Streams.mod.EnvChannelRequest
  - typings.ssh2Streams.mod.ShellChannelRequest
  - typings.ssh2Streams.mod.ExecChannelRequest
  - typings.ssh2Streams.mod.SubsystemChannelRequest
  - typings.ssh2Streams.mod.SignalChannelRequest
  - typings.ssh2Streams.mod.FlowControlChannelRequest
*/
trait ChannelRequest extends StObject
object ChannelRequest {
  
  @scala.inline
  def EnvChannelRequest(key: String, recipient: Double, request: env, `val`: String, wantReply: Boolean): typings.ssh2Streams.mod.EnvChannelRequest = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ssh2Streams.mod.EnvChannelRequest]
  }
  
  @scala.inline
  def ExecChannelRequest(command: String, recipient: Double, request: exec, wantReply: Boolean): typings.ssh2Streams.mod.ExecChannelRequest = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ssh2Streams.mod.ExecChannelRequest]
  }
  
  @scala.inline
  def ExitSignalChannelRequest(coredump: Boolean, description: String, recipient: Double, request: `exit-signal`, signal: String): typings.ssh2Streams.mod.ExitSignalChannelRequest = {
    val __obj = js.Dynamic.literal(coredump = coredump.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ssh2Streams.mod.ExitSignalChannelRequest]
  }
  
  @scala.inline
  def ExitStatusChannelRequest(code: Double, recipient: Double, request: `exit-status`): typings.ssh2Streams.mod.ExitStatusChannelRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ssh2Streams.mod.ExitStatusChannelRequest]
  }
  
  @scala.inline
  def FlowControlChannelRequest(clientControl: Boolean, recipient: Double, request: `xon-xoff`): typings.ssh2Streams.mod.FlowControlChannelRequest = {
    val __obj = js.Dynamic.literal(clientControl = clientControl.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ssh2Streams.mod.FlowControlChannelRequest]
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
  ): typings.ssh2Streams.mod.PseudoTtyChannelRequest = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ssh2Streams.mod.PseudoTtyChannelRequest]
  }
  
  @scala.inline
  def ShellChannelRequest(recipient: Double, request: shell, wantReply: Boolean): typings.ssh2Streams.mod.ShellChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ssh2Streams.mod.ShellChannelRequest]
  }
  
  @scala.inline
  def SignalChannelRequest(recipient: Double, request: signal, signal: String): typings.ssh2Streams.mod.SignalChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ssh2Streams.mod.SignalChannelRequest]
  }
  
  @scala.inline
  def SubsystemChannelRequest(recipient: Double, request: subsystem, subsystem: String, wantReply: Boolean): typings.ssh2Streams.mod.SubsystemChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], subsystem = subsystem.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ssh2Streams.mod.SubsystemChannelRequest]
  }
  
  @scala.inline
  def WindowChangeChannelRequest(
    cols: Double,
    height: Double,
    recipient: Double,
    request: `window-change`,
    rows: Double,
    width: Double
  ): typings.ssh2Streams.mod.WindowChangeChannelRequest = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ssh2Streams.mod.WindowChangeChannelRequest]
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
  ): typings.ssh2Streams.mod.X11ChannelRequest = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ssh2Streams.mod.X11ChannelRequest]
  }
}
