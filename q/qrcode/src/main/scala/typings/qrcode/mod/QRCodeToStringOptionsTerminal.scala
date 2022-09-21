package typings.qrcode.mod

import typings.qrcode.qrcodeStrings.terminal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QRCodeToStringOptionsTerminal
  extends StObject
     with QRCodeRenderersOptions
     with QRCodeToStringOptions {
  
  /**
    * Outputs smaller QR code.
    * @default false
    */
  var small: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output format.
    * @default 'utf8'
    */
  var `type`: terminal
}
object QRCodeToStringOptionsTerminal {
  
  inline def apply(): QRCodeToStringOptionsTerminal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("terminal")
    __obj.asInstanceOf[QRCodeToStringOptionsTerminal]
  }
  
  extension [Self <: QRCodeToStringOptionsTerminal](x: Self) {
    
    inline def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    inline def setType(value: terminal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
