package typings.speakeasy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DigestOptions
  extends StObject
     with SharedOptions {
  
  var counter: Double
  
  /**
    * @deprecated use secret
    */
  var key: js.UndefOr[String] = js.undefined
  
  var secret: String
}
object DigestOptions {
  
  inline def apply(counter: Double, secret: String): DigestOptions = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[DigestOptions]
  }
  
  extension [Self <: DigestOptions](x: Self) {
    
    inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
  }
}
