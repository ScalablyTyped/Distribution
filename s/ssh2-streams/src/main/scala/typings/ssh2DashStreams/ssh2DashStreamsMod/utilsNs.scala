package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssh2-streams", "utils")
@js.native
object utilsNs extends js.Object {
  def parseKey(keyData: String): ParsedKey | js.Array[js.Object] = js.native
  def parseKey(keyData: String, passphrase: String): ParsedKey | js.Array[js.Object] = js.native
  def parseKey(keyData: Buffer): ParsedKey | js.Array[js.Object] = js.native
  def parseKey(keyData: Buffer, passphrase: String): ParsedKey | js.Array[js.Object] = js.native
}

