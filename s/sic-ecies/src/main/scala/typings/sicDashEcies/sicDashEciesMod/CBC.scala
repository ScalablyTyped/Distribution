package typings.sicDashEcies.sicDashEciesMod

import org.scalablytyped.runtime.TopLevel
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CBC extends js.Object {
  def apply(blockcipher: Blockcipher, cipherkeybuf: Buffer, ivbuf: Buffer): CBC = js.native
  def blockbufs2buf(blockbufs: js.Array[Buffer]): Buffer = js.native
  def buf2blockbufs(buf: Buffer, blocksize: Double): js.Array[Buffer] = js.native
  def decrypt(encbuf: Buffer, ivbuf: Buffer, blockcipher: Blockcipher, cipherkeybuf: Buffer): Buffer = js.native
  def decryptblock(encbuf: Buffer, ivbuf: Buffer, blockcipher: Blockcipher, cipherkeybuf: Buffer): Buffer = js.native
  def decryptblocks(encbufs: js.Array[Buffer], ivbuf: Buffer, blockcipher: Blockcipher, cipherkeybuf: Buffer): js.Array[Buffer] = js.native
  def encrypt(messagebuf: Buffer, ivbuf: Buffer, blockcipher: Blockcipher, cipherkeybuf: Buffer): Buffer = js.native
  def encryptblock(blockbuf: Buffer, ivbuf: Buffer, blockcipher: Blockcipher, cipherkeybuf: Buffer): Buffer = js.native
  def encryptblocks(blockbufs: js.Array[Buffer], ivbuf: Buffer, blockcipher: Blockcipher, cipherkeybuf: Buffer): js.Array[Buffer] = js.native
  def pkcs7pad(buf: Buffer, blocksize: Double): Buffer = js.native
  def pkcs7unpad(paddedbuf: Buffer): Buffer = js.native
  def xorbufs(buf1: Buffer, buf2: Buffer): Buffer = js.native
}

@JSImport("sic-ecies", "CBC")
@js.native
object CBC extends TopLevel[CBC]

