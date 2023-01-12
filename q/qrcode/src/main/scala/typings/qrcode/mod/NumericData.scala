package typings.qrcode.mod

import typings.qrcode.qrcodeStrings.Numeric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericData
  extends StObject
     with DataSegment
     with GeneratedQRCodeSegment {
  
  var data: String
  
  var mode: Mode[Numeric]
}
object NumericData {
  
  inline def apply(data: String, getBitsLength: () => Double, getLength: () => Double, mode: Mode[Numeric]): NumericData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getBitsLength = js.Any.fromFunction0(getBitsLength), getLength = js.Any.fromFunction0(getLength), mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumericData] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMode(value: Mode[Numeric]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
