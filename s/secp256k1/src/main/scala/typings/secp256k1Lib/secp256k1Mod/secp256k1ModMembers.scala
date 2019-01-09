package typings
package secp256k1Lib.secp256k1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", JSImport.Namespace)
@js.native
object secp256k1ModMembers extends js.Object {
  def ecdh(publicKey: nodeLib.Buffer, privateKey: nodeLib.Buffer): nodeLib.Buffer = js.native
  def ecdhUnsafe(publicKey: nodeLib.Buffer, privateKey: nodeLib.Buffer): nodeLib.Buffer = js.native
  def ecdhUnsafe(publicKey: nodeLib.Buffer, privateKey: nodeLib.Buffer, compressed: scala.Boolean): nodeLib.Buffer = js.native
  def privateKeyExport(privateKey: nodeLib.Buffer): nodeLib.Buffer = js.native
  def privateKeyExport(privateKey: nodeLib.Buffer, compressed: scala.Boolean): nodeLib.Buffer = js.native
  def privateKeyImport(privateKey: nodeLib.Buffer): nodeLib.Buffer = js.native
  def privateKeyModInverse(privateKey: nodeLib.Buffer): nodeLib.Buffer = js.native
  def privateKeyNegate(privateKey: nodeLib.Buffer): nodeLib.Buffer = js.native
  def privateKeyTweakAdd(privateKey: nodeLib.Buffer, tweak: nodeLib.Buffer): nodeLib.Buffer = js.native
  def privateKeyTweakMul(privateKey: nodeLib.Buffer, tweak: nodeLib.Buffer): nodeLib.Buffer = js.native
  def privateKeyVerify(privateKey: nodeLib.Buffer): scala.Boolean = js.native
  def publicKeyCombine(publicKeys: js.Array[nodeLib.Buffer]): nodeLib.Buffer = js.native
  def publicKeyCombine(publicKeys: js.Array[nodeLib.Buffer], compressed: scala.Boolean): nodeLib.Buffer = js.native
  def publicKeyConvert(publicKey: nodeLib.Buffer): nodeLib.Buffer = js.native
  def publicKeyConvert(publicKey: nodeLib.Buffer, compressed: scala.Boolean): nodeLib.Buffer = js.native
  def publicKeyCreate(privateKey: nodeLib.Buffer): nodeLib.Buffer = js.native
  def publicKeyCreate(privateKey: nodeLib.Buffer, compressed: scala.Boolean): nodeLib.Buffer = js.native
  def publicKeyTweakAdd(publicKey: nodeLib.Buffer, tweak: nodeLib.Buffer): nodeLib.Buffer = js.native
  def publicKeyTweakAdd(publicKey: nodeLib.Buffer, tweak: nodeLib.Buffer, compressed: scala.Boolean): nodeLib.Buffer = js.native
  def publicKeyTweakMul(publicKey: nodeLib.Buffer, tweak: nodeLib.Buffer): nodeLib.Buffer = js.native
  def publicKeyTweakMul(publicKey: nodeLib.Buffer, tweak: nodeLib.Buffer, compressed: scala.Boolean): nodeLib.Buffer = js.native
  def publicKeyVerify(publicKey: nodeLib.Buffer): scala.Boolean = js.native
  def recover(message: nodeLib.Buffer, signature: nodeLib.Buffer, recovery: scala.Double): nodeLib.Buffer = js.native
  def recover(
    message: nodeLib.Buffer,
    signature: nodeLib.Buffer,
    recovery: scala.Double,
    compressed: scala.Boolean
  ): nodeLib.Buffer = js.native
  def sign(message: nodeLib.Buffer, privateKey: nodeLib.Buffer): secp256k1Lib.Anon_Recovery = js.native
  def sign(message: nodeLib.Buffer, privateKey: nodeLib.Buffer, options: SignOptions): secp256k1Lib.Anon_Recovery = js.native
  def signatureExport(signature: nodeLib.Buffer): nodeLib.Buffer = js.native
  def signatureImport(signature: nodeLib.Buffer): nodeLib.Buffer = js.native
  def signatureImportLax(signature: nodeLib.Buffer): nodeLib.Buffer = js.native
  def signatureNormalize(signature: nodeLib.Buffer): nodeLib.Buffer = js.native
  def verify(message: nodeLib.Buffer, signature: nodeLib.Buffer, publicKey: nodeLib.Buffer): scala.Boolean = js.native
}

