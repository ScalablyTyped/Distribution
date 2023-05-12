package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignedTimestamp extends StObject {
  
  var signedTimestamp: String
}
object SignedTimestamp {
  
  inline def apply(signedTimestamp: String): SignedTimestamp = {
    val __obj = js.Dynamic.literal(signedTimestamp = signedTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedTimestamp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignedTimestamp] (val x: Self) extends AnyVal {
    
    inline def setSignedTimestamp(value: String): Self = StObject.set(x, "signedTimestamp", value.asInstanceOf[js.Any])
  }
}
