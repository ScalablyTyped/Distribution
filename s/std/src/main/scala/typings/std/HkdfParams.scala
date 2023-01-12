package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HkdfParams
  extends StObject
     with Algorithm {
  
  /* standard dom */
  var hash: HashAlgorithmIdentifier
  
  /* standard dom */
  var info: BufferSource
  
  /* standard dom */
  var salt: BufferSource
}
object HkdfParams {
  
  inline def apply(hash: HashAlgorithmIdentifier, info: BufferSource, name: java.lang.String, salt: BufferSource): HkdfParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[HkdfParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HkdfParams] (val x: Self) extends AnyVal {
    
    inline def setHash(value: HashAlgorithmIdentifier): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: BufferSource): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setSalt(value: BufferSource): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
  }
}
