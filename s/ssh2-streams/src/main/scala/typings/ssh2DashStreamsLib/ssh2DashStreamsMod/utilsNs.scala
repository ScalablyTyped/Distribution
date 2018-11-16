package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssh2-streams", "utils")
@js.native
object utilsNs extends js.Object {
  def decryptKey(privKeyInfo: ssh2DashStreamsLib.ssh2DashStreamsMod.ParsedKey, passphrase: java.lang.String): scala.Unit = js.native
  def genPublicKey(privKeyInfo: ssh2DashStreamsLib.ssh2DashStreamsMod.ParsedKey): ssh2DashStreamsLib.ssh2DashStreamsMod.ParsedKey = js.native
  def parseKey(keyData: java.lang.String): ssh2DashStreamsLib.ssh2DashStreamsMod.ParsedKey | nodeLib.Error = js.native
  def parseKey(keyData: nodeLib.Buffer): ssh2DashStreamsLib.ssh2DashStreamsMod.ParsedKey | nodeLib.Error = js.native
}

