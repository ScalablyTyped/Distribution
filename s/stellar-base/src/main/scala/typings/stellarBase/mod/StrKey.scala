package typings.stellarBase.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StrKey {
  
  @JSImport("stellar-base", "StrKey.decodeEd25519PublicKey")
  @js.native
  def decodeEd25519PublicKey(data: String): Buffer = js.native
  
  @JSImport("stellar-base", "StrKey.decodeEd25519SecretSeed")
  @js.native
  def decodeEd25519SecretSeed(data: String): Buffer = js.native
  
  @JSImport("stellar-base", "StrKey.decodePreAuthTx")
  @js.native
  def decodePreAuthTx(data: String): Buffer = js.native
  
  @JSImport("stellar-base", "StrKey.decodeSha256Hash")
  @js.native
  def decodeSha256Hash(data: String): Buffer = js.native
  
  @JSImport("stellar-base", "StrKey.encodeEd25519PublicKey")
  @js.native
  def encodeEd25519PublicKey(data: Buffer): String = js.native
  
  @JSImport("stellar-base", "StrKey.encodeEd25519SecretSeed")
  @js.native
  def encodeEd25519SecretSeed(data: Buffer): String = js.native
  
  @JSImport("stellar-base", "StrKey.encodePreAuthTx")
  @js.native
  def encodePreAuthTx(data: Buffer): String = js.native
  
  @JSImport("stellar-base", "StrKey.encodeSha256Hash")
  @js.native
  def encodeSha256Hash(data: Buffer): String = js.native
  
  @JSImport("stellar-base", "StrKey.isValidEd25519PublicKey")
  @js.native
  def isValidEd25519PublicKey(Key: String): Boolean = js.native
  
  @JSImport("stellar-base", "StrKey.isValidEd25519SecretSeed")
  @js.native
  def isValidEd25519SecretSeed(seed: String): Boolean = js.native
}
