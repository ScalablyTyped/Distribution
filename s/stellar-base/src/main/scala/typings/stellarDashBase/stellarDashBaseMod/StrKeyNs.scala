package typings.stellarDashBase.stellarDashBaseMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "StrKey")
@js.native
object StrKeyNs extends js.Object {
  def decodeEd25519PublicKey(data: String): Buffer = js.native
  def decodeEd25519SecretSeed(data: String): Buffer = js.native
  def decodePreAuthTx(data: String): Buffer = js.native
  def decodeSha256Hash(data: String): Buffer = js.native
  def encodeEd25519PublicKey(data: Buffer): String = js.native
  def encodeEd25519SecretSeed(data: Buffer): String = js.native
  def encodePreAuthTx(data: Buffer): String = js.native
  def encodeSha256Hash(data: Buffer): String = js.native
  def isValidEd25519PublicKey(Key: String): Boolean = js.native
  def isValidEd25519SecretSeed(seed: String): Boolean = js.native
}

