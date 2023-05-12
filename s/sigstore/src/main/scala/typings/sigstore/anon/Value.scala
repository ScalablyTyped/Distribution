package typings.sigstore.anon

import typings.sigstore.sigstoreStrings.sha256
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  /**
    * The hashing function used to compute the hash value
    */
  var algorithm: sha256
  
  /**
    * The hash value of the payload
    */
  var value: String
}
object Value {
  
  inline def apply(value: String): Value = {
    val __obj = js.Dynamic.literal(algorithm = "sha256", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: sha256): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
