package typings.rascal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encryption extends StObject {
  
  var algorithm: String
  
  var ivLength: Double
  
  var key: String
}
object Encryption {
  
  inline def apply(algorithm: String, ivLength: Double, key: String): Encryption = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], ivLength = ivLength.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encryption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Encryption] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setIvLength(value: Double): Self = StObject.set(x, "ivLength", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
