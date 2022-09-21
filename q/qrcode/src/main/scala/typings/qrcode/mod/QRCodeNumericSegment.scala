package typings.qrcode.mod

import typings.qrcode.qrcodeStrings.numeric_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QRCodeNumericSegment
  extends StObject
     with QRCodeSegment {
  
  var data: String | Double
  
  var mode: numeric_
}
object QRCodeNumericSegment {
  
  inline def apply(data: String | Double): QRCodeNumericSegment = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = "numeric")
    __obj.asInstanceOf[QRCodeNumericSegment]
  }
  
  extension [Self <: QRCodeNumericSegment](x: Self) {
    
    inline def setData(value: String | Double): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMode(value: numeric_): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
