package typings.qrcode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode[TModeId /* <: ModeId */] extends StObject {
  
  var bit: Double
  
  var ccBits: js.Array[Double]
  
  var id: TModeId
}
object Mode {
  
  inline def apply[TModeId /* <: ModeId */](bit: Double, ccBits: js.Array[Double], id: TModeId): Mode[TModeId] = {
    val __obj = js.Dynamic.literal(bit = bit.asInstanceOf[js.Any], ccBits = ccBits.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode[TModeId]]
  }
  
  extension [Self <: Mode[?], TModeId /* <: ModeId */](x: Self & Mode[TModeId]) {
    
    inline def setBit(value: Double): Self = StObject.set(x, "bit", value.asInstanceOf[js.Any])
    
    inline def setCcBits(value: js.Array[Double]): Self = StObject.set(x, "ccBits", value.asInstanceOf[js.Any])
    
    inline def setCcBitsVarargs(value: Double*): Self = StObject.set(x, "ccBits", js.Array(value*))
    
    inline def setId(value: TModeId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
