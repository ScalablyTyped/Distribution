package typings.stellarBase.mod

import typings.node.Buffer
import typings.stellarBase.anon.PublicKey
import typings.stellarBase.anon.Type
import typings.stellarBase.xdrMod.default.DecoratedSignature
import typings.stellarBase.xdrMod.xdr.AccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "Keypair")
@js.native
class Keypair protected () extends js.Object {
  def this(keys: PublicKey) = this()
  def this(keys: Type) = this()
  
  def canSign(): Boolean = js.native
  
  def publicKey(): String = js.native
  
  def rawPublicKey(): Buffer = js.native
  
  def rawSecretKey(): Buffer = js.native
  
  def secret(): String = js.native
  
  def sign(data: Buffer): Buffer = js.native
  
  def signDecorated(data: Buffer): DecoratedSignature = js.native
  
  def signatureHint(): Buffer = js.native
  
  val `type`: KeypairType = js.native
  
  def verify(data: Buffer, signature: Buffer): Boolean = js.native
  
  def xdrAccountId(): AccountId = js.native
}
/* static members */
@JSImport("stellar-base", "Keypair")
@js.native
object Keypair extends js.Object {
  
  def fromPublicKey(publicKey: String): Keypair = js.native
  
  def fromRawEd25519Seed(secretSeed: Buffer): Keypair = js.native
  
  def fromSecret(secretKey: String): Keypair = js.native
  
  def master(networkPassphrase: String): Keypair = js.native
  
  def random(): Keypair = js.native
}
