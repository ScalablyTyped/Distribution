package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AesKeyGenParams
  extends StObject
     with Algorithm {
  
  /* standard dom */
  var length: Double
}
object AesKeyGenParams {
  
  inline def apply(length: Double, name: java.lang.String): AesKeyGenParams = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesKeyGenParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AesKeyGenParams] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
