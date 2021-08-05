package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclECCPublicKeyData extends StObject {
  
  var x: BitArray_
  
  var y: BitArray_
}
object SjclECCPublicKeyData {
  
  inline def apply(x: BitArray_, y: BitArray_): SjclECCPublicKeyData = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclECCPublicKeyData]
  }
  
  extension [Self <: SjclECCPublicKeyData](x: Self) {
    
    inline def setX(value: BitArray_): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value :_*))
    
    inline def setY(value: BitArray_): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value :_*))
  }
}
