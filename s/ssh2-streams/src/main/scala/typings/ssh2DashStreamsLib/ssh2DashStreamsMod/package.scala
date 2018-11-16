package typings
package ssh2DashStreamsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ssh2DashStreamsMod {
  type AuthMethodData = java.lang.String | PublicKeyAuthMethodData | HostbasedAuthMethodData
  type ChannelOpenInfo = X11ChannelInfo | ForwardedTcpipChannelInfo | openssh_ForwardedStreamLocalChannelInfo | openssh_AuthAgentChannelInfo | DirectTcpipChannelInfo | openssh_DirectStreamLocalChannelInfo | SessionChannelInfo
  type ChannelRequest = ExitStatusChannelRequest | ExitSignalChannelRequest | PseudoTtyChannelRequest | WindowChangeChannelRequest | X11ChannelRequest | EnvChannelRequest | ShellChannelRequest | ExecChannelRequest | SubsystemChannelRequest | SignalChannelRequest | FlowControlChannelRequest
  type GlobalRequest = TcpipForwardGlobalRequest | openssh_StreamLocalForwardGlobalRequest | nodeLib.Buffer
}
