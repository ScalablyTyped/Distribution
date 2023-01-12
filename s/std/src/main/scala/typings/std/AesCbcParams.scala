package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AesCbcParams
  extends StObject
     with Algorithm {
  
  /* standard dom */
  var iv: BufferSource
}
object AesCbcParams {
  
  inline def apply(iv: BufferSource, name: java.lang.String): AesCbcParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesCbcParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AesCbcParams] (val x: Self) extends AnyVal {
    
    inline def setIv(value: BufferSource): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
  }
}
