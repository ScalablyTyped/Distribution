package typings.qrcode.mod

import typings.qrcode.qrcodeStrings.terminal
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QRCodeToStringOptionsOther
  extends StObject
     with QRCodeRenderersOptions
     with QRCodeToStringOptions {
  
  /**
    * Output format.
    * @default 'utf8'
    */
  var `type`: js.UndefOr[Exclude[QRCodeStringType, terminal]] = js.undefined
}
object QRCodeToStringOptionsOther {
  
  inline def apply(): QRCodeToStringOptionsOther = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeToStringOptionsOther]
  }
  
  extension [Self <: QRCodeToStringOptionsOther](x: Self) {
    
    inline def setType(value: Exclude[QRCodeStringType, terminal]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
