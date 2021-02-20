package typings.secp256k1

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Recid extends StObject {
    
    var recid: Double = js.native
    
    var signature: Uint8Array = js.native
  }
  object Recid {
    
    @scala.inline
    def apply(recid: Double, signature: Uint8Array): Recid = {
      val __obj = js.Dynamic.literal(recid = recid.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[Recid]
    }
    
    @scala.inline
    implicit class RecidMutableBuilder[Self <: Recid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecid(value: Double): Self = StObject.set(x, "recid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: Uint8Array): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
}
