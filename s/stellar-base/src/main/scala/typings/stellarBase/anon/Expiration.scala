package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.Curve25519Public
import typings.stellarBase.xdrMod.xdr.Uint64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expiration extends StObject {
  
  var expiration: Uint64 = js.native
  
  var pubkey: Curve25519Public = js.native
  
  var sig: Buffer = js.native
}
object Expiration {
  
  @scala.inline
  def apply(expiration: Uint64, pubkey: Curve25519Public, sig: Buffer): Expiration = {
    val __obj = js.Dynamic.literal(expiration = expiration.asInstanceOf[js.Any], pubkey = pubkey.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expiration]
  }
  
  @scala.inline
  implicit class ExpirationMutableBuilder[Self <: Expiration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiration(value: Uint64): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubkey(value: Curve25519Public): Self = StObject.set(x, "pubkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSig(value: Buffer): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
  }
}
