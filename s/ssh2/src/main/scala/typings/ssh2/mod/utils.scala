package typings.ssh2.mod

import typings.node.Buffer
import typings.ssh2Streams.mod.ParsedKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssh2", "utils")
@js.native
object utils extends js.Object {
  def parseKey(keyData: String): ParsedKey | js.Array[js.Object] = js.native
  def parseKey(keyData: String, passphrase: String): ParsedKey | js.Array[js.Object] = js.native
  def parseKey(keyData: Buffer): ParsedKey | js.Array[js.Object] = js.native
  def parseKey(keyData: Buffer, passphrase: String): ParsedKey | js.Array[js.Object] = js.native
}

