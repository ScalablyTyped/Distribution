package typings.sshDashKeyDashDecrypt

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.sshDashKeyDashDecrypt.sshDashKeyDashDecryptStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssh-key-decrypt", JSImport.Namespace)
@js.native
object sshDashKeyDashDecryptMod extends js.Object {
  def apply(data: String | Buffer, passphrase: String): Buffer = js.native
  def apply(data: String | Buffer, passphrase: String, outEnc: BufferEncoding): String = js.native
  def apply(data: String | Buffer, passphrase: String, outEnc: buffer): Buffer = js.native
}

