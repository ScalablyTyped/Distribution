package typings.sicDashEcies.sicDashEciesMod

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

