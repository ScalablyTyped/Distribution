package typings.sicEcies.mod

import org.scalablytyped.runtime.TopLevel
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AESCBC extends js.Object {
  def apply(): AESCBC = js.native
  def decrypt(encbuf: Buffer, passwordstr: String): Buffer = js.native
  def decryptCipherkey(encbuf: Buffer, cipherkeybuf: Buffer): Buffer = js.native
  def encrypt(messagebuf: Buffer, passwordstr: String): Buffer = js.native
  def encryptCipherkey(messagebuf: Buffer, cipherkeybuf: Buffer, ivbuf: Buffer): Buffer = js.native
}

@JSImport("sic-ecies", "AESCBC")
@js.native
object AESCBC extends TopLevel[AESCBC]

