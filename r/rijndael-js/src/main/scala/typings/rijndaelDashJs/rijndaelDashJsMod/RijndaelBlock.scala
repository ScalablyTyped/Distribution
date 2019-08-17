package typings.rijndaelDashJs.rijndaelDashJsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RijndaelBlock extends js.Object {
  def decrypt(_ciphertext: Buffer, blockSize: String, _iv: String): Buffer = js.native
  def decrypt(_ciphertext: Buffer, blockSize: String, _iv: Buffer): Buffer = js.native
  def encrypt(_plaintext: String, blockSize: String, _iv: String): Buffer = js.native
  def encrypt(_plaintext: String, blockSize: String, _iv: Buffer): Buffer = js.native
  def encrypt(_plaintext: Buffer, blockSize: String, _iv: String): Buffer = js.native
  def encrypt(_plaintext: Buffer, blockSize: String, _iv: Buffer): Buffer = js.native
}

