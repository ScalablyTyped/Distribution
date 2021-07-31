package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DhKeyGenParams
  extends StObject
     with Algorithm {
  
  var generator: Uint8Array
  
  var prime: Uint8Array
}
object DhKeyGenParams {
  
  @scala.inline
  def apply(generator: Uint8Array, name: java.lang.String, prime: Uint8Array): DhKeyGenParams = {
    val __obj = js.Dynamic.literal(generator = generator.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prime = prime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DhKeyGenParams]
  }
  
  @scala.inline
  implicit class DhKeyGenParamsMutableBuilder[Self <: DhKeyGenParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenerator(value: Uint8Array): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrime(value: Uint8Array): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
  }
}
