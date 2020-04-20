package typings.sicEcies.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blockcipher extends js.Object {
  def decrypt(encbuf: Buffer, cipherkeybuf: Buffer): Buffer
  def encrypt(xorbuf: Buffer, cipherkeybuf: Buffer): Buffer
}

object Blockcipher {
  @scala.inline
  def apply(decrypt: (Buffer, Buffer) => Buffer, encrypt: (Buffer, Buffer) => Buffer): Blockcipher = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction2(decrypt), encrypt = js.Any.fromFunction2(encrypt))
    __obj.asInstanceOf[Blockcipher]
  }
}

