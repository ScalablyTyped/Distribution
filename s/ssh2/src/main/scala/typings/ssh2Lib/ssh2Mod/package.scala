package typings
package ssh2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ssh2Mod {
  type AuthContext = KeyboardAuthContext | PublicKeyAuthContext | HostbasedAuthContext | PasswordAuthContext | NoneAuthContext
  type SFTP_OPEN_MODE = ssh2DashStreamsLib.ssh2DashStreamsMod.SFTPStreamNs.OPEN_MODE
  type SFTP_STATUS_CODE = ssh2DashStreamsLib.ssh2DashStreamsMod.SFTPStreamNs.STATUS_CODE
}
