package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.HmacSha256Mac
import typings.stellarBase.xdrMod.xdr.StellarMessage
import typings.stellarBase.xdrMod.xdr.Uint64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mac extends StObject {
  
  var mac: HmacSha256Mac = js.native
  
  var message: StellarMessage = js.native
  
  var sequence: Uint64 = js.native
}
object Mac {
  
  @scala.inline
  def apply(mac: HmacSha256Mac, message: StellarMessage, sequence: Uint64): Mac = {
    val __obj = js.Dynamic.literal(mac = mac.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mac]
  }
  
  @scala.inline
  implicit class MacMutableBuilder[Self <: Mac] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMac(value: HmacSha256Mac): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: StellarMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequence(value: Uint64): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
  }
}
