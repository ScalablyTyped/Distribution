package typings.qrcode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QRCodeOptions extends StObject {
  
  /**
    * Error correction level.
    * @default 'M'
    */
  var errorCorrectionLevel: js.UndefOr[QRCodeErrorCorrectionLevel] = js.undefined
  
  /**
    * Mask pattern used to mask the symbol.
    *
    * If not specified the more suitable value will be calculated.
    */
  var maskPattern: js.UndefOr[QRCodeMaskPattern] = js.undefined
  
  /**
    * Helper function used internally to convert a kanji to its Shift JIS value.
    * Provide this function if you need support for Kanji mode.
    */
  var toSJISFunc: js.UndefOr[QRCodeToSJISFunc] = js.undefined
  
  /**
    * QR Code version. If not specified the more suitable value will be calculated.
    */
  var version: js.UndefOr[Double] = js.undefined
}
object QRCodeOptions {
  
  inline def apply(): QRCodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QRCodeOptions] (val x: Self) extends AnyVal {
    
    inline def setErrorCorrectionLevel(value: QRCodeErrorCorrectionLevel): Self = StObject.set(x, "errorCorrectionLevel", value.asInstanceOf[js.Any])
    
    inline def setErrorCorrectionLevelUndefined: Self = StObject.set(x, "errorCorrectionLevel", js.undefined)
    
    inline def setMaskPattern(value: QRCodeMaskPattern): Self = StObject.set(x, "maskPattern", value.asInstanceOf[js.Any])
    
    inline def setMaskPatternUndefined: Self = StObject.set(x, "maskPattern", js.undefined)
    
    inline def setToSJISFunc(value: /* codePoint */ String => Double): Self = StObject.set(x, "toSJISFunc", js.Any.fromFunction1(value))
    
    inline def setToSJISFuncUndefined: Self = StObject.set(x, "toSJISFunc", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
