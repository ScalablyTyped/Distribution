package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignedEntryTimestamp extends StObject {
  
  var signedEntryTimestamp: String
}
object SignedEntryTimestamp {
  
  inline def apply(signedEntryTimestamp: String): SignedEntryTimestamp = {
    val __obj = js.Dynamic.literal(signedEntryTimestamp = signedEntryTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedEntryTimestamp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignedEntryTimestamp] (val x: Self) extends AnyVal {
    
    inline def setSignedEntryTimestamp(value: String): Self = StObject.set(x, "signedEntryTimestamp", value.asInstanceOf[js.Any])
  }
}
