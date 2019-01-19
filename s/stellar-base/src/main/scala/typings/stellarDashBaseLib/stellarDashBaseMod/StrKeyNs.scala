package typings
package stellarDashBaseLib.stellarDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "StrKey")
@js.native
object StrKeyNs extends js.Object {
  def decodeEd25519PublicKey(data: java.lang.String): nodeLib.Buffer = js.native
  def decodeEd25519SecretSeed(data: java.lang.String): nodeLib.Buffer = js.native
  def decodePreAuthTx(data: java.lang.String): nodeLib.Buffer = js.native
  def decodeSha256Hash(data: java.lang.String): nodeLib.Buffer = js.native
  def encodeEd25519PublicKey(data: nodeLib.Buffer): java.lang.String = js.native
  def encodeEd25519SecretSeed(data: nodeLib.Buffer): java.lang.String = js.native
  def encodePreAuthTx(data: nodeLib.Buffer): java.lang.String = js.native
  def encodeSha256Hash(data: nodeLib.Buffer): java.lang.String = js.native
  def isValidEd25519PublicKey(Key: java.lang.String): scala.Boolean = js.native
  def isValidEd25519SecretSeed(seed: java.lang.String): scala.Boolean = js.native
}

