package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sig extends StObject {
  
  var keyid: String
  
  var sig: String
}
object Sig {
  
  inline def apply(keyid: String, sig: String): Sig = {
    val __obj = js.Dynamic.literal(keyid = keyid.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sig] (val x: Self) extends AnyVal {
    
    inline def setKeyid(value: String): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
    
    inline def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
  }
}
