package typings.qrcode.mod

import typings.qrcode.qrcodeStrings.kanji_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QRCodeKanjiSegment
  extends StObject
     with QRCodeSegment {
  
  var data: String
  
  var mode: kanji_
}
object QRCodeKanjiSegment {
  
  inline def apply(data: String): QRCodeKanjiSegment = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = "kanji")
    __obj.asInstanceOf[QRCodeKanjiSegment]
  }
  
  extension [Self <: QRCodeKanjiSegment](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMode(value: kanji_): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
