package typings.secp256k1.secp256k1Mod

import typings.node.Buffer
import typings.secp256k1.Anon_Recovery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def ecdh(publicKey: Buffer, privateKey: Buffer): Buffer = js.native
  def ecdhUnsafe(publicKey: Buffer, privateKey: Buffer): Buffer = js.native
  def ecdhUnsafe(publicKey: Buffer, privateKey: Buffer, compressed: Boolean): Buffer = js.native
  def privateKeyExport(privateKey: Buffer): Buffer = js.native
  def privateKeyExport(privateKey: Buffer, compressed: Boolean): Buffer = js.native
  def privateKeyImport(privateKey: Buffer): Buffer = js.native
  def privateKeyModInverse(privateKey: Buffer): Buffer = js.native
  def privateKeyNegate(privateKey: Buffer): Buffer = js.native
  def privateKeyTweakAdd(privateKey: Buffer, tweak: Buffer): Buffer = js.native
  def privateKeyTweakMul(privateKey: Buffer, tweak: Buffer): Buffer = js.native
  def privateKeyVerify(privateKey: Buffer): Boolean = js.native
  def publicKeyCombine(publicKeys: js.Array[Buffer]): Buffer = js.native
  def publicKeyCombine(publicKeys: js.Array[Buffer], compressed: Boolean): Buffer = js.native
  def publicKeyConvert(publicKey: Buffer): Buffer = js.native
  def publicKeyConvert(publicKey: Buffer, compressed: Boolean): Buffer = js.native
  def publicKeyCreate(privateKey: Buffer): Buffer = js.native
  def publicKeyCreate(privateKey: Buffer, compressed: Boolean): Buffer = js.native
  def publicKeyTweakAdd(publicKey: Buffer, tweak: Buffer): Buffer = js.native
  def publicKeyTweakAdd(publicKey: Buffer, tweak: Buffer, compressed: Boolean): Buffer = js.native
  def publicKeyTweakMul(publicKey: Buffer, tweak: Buffer): Buffer = js.native
  def publicKeyTweakMul(publicKey: Buffer, tweak: Buffer, compressed: Boolean): Buffer = js.native
  def publicKeyVerify(publicKey: Buffer): Boolean = js.native
  def recover(message: Buffer, signature: Buffer, recovery: Double): Buffer = js.native
  def recover(message: Buffer, signature: Buffer, recovery: Double, compressed: Boolean): Buffer = js.native
  def sign(message: Buffer, privateKey: Buffer): Anon_Recovery = js.native
  def sign(message: Buffer, privateKey: Buffer, options: SignOptions): Anon_Recovery = js.native
  def signatureExport(signature: Buffer): Buffer = js.native
  def signatureImport(signature: Buffer): Buffer = js.native
  def signatureImportLax(signature: Buffer): Buffer = js.native
  def signatureNormalize(signature: Buffer): Buffer = js.native
  def verify(message: Buffer, signature: Buffer, publicKey: Buffer): Boolean = js.native
}

