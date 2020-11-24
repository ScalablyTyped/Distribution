package typings.ssh2Streams.mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssh2-streams", "utils")
@js.native
object utils extends js.Object {
  
  def parseKey(keyData: String): ParsedKey | js.Array[ParsedKey] | Error | Null = js.native
  def parseKey(keyData: String, passphrase: String): ParsedKey | js.Array[ParsedKey] | Error | Null = js.native
  def parseKey(keyData: Buffer): ParsedKey | js.Array[ParsedKey] | Error | Null = js.native
  def parseKey(keyData: Buffer, passphrase: String): ParsedKey | js.Array[ParsedKey] | Error | Null = js.native
}
