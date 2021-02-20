package typings.rascal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Encryption extends StObject {
  
  var algorithm: String = js.native
  
  var ivLength: Double = js.native
  
  var key: String = js.native
}
object Encryption {
  
  @scala.inline
  def apply(algorithm: String, ivLength: Double, key: String): Encryption = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], ivLength = ivLength.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encryption]
  }
  
  @scala.inline
  implicit class EncryptionMutableBuilder[Self <: Encryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvLength(value: Double): Self = StObject.set(x, "ivLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
