package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HmacKeyAlgorithm
  extends StObject
     with KeyAlgorithm {
  
  /* standard dom */
  var hash: KeyAlgorithm
  
  /* standard dom */
  var length: Double
}
object HmacKeyAlgorithm {
  
  inline def apply(hash: KeyAlgorithm, length: Double, name: java.lang.String): HmacKeyAlgorithm = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HmacKeyAlgorithm]
  }
  
  extension [Self <: HmacKeyAlgorithm](x: Self) {
    
    inline def setHash(value: KeyAlgorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
