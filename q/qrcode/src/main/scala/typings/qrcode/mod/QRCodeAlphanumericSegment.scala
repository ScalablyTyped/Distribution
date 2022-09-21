package typings.qrcode.mod

import typings.qrcode.qrcodeStrings.alphanumeric_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QRCodeAlphanumericSegment
  extends StObject
     with QRCodeSegment {
  
  var data: String
  
  var mode: alphanumeric_
}
object QRCodeAlphanumericSegment {
  
  inline def apply(data: String): QRCodeAlphanumericSegment = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = "alphanumeric")
    __obj.asInstanceOf[QRCodeAlphanumericSegment]
  }
  
  extension [Self <: QRCodeAlphanumericSegment](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMode(value: alphanumeric_): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
