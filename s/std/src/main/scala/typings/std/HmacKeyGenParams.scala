package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HmacKeyGenParams
  extends StObject
     with Algorithm {
  
  /* standard dom */
  var hash: HashAlgorithmIdentifier
  
  /* standard dom */
  var length: js.UndefOr[Double] = js.undefined
}
object HmacKeyGenParams {
  
  inline def apply(hash: HashAlgorithmIdentifier, name: java.lang.String): HmacKeyGenParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HmacKeyGenParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HmacKeyGenParams] (val x: Self) extends AnyVal {
    
    inline def setHash(value: HashAlgorithmIdentifier): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
  }
}
