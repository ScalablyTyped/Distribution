package typings.qrcode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QRCode extends StObject {
  
  /**
    * Error Correction Level
    */
  var errorCorrectionLevel: ErrorCorrectionLevel
  
  /**
    * Calculated Mask pattern
    */
  var maskPattern: js.UndefOr[QRCodeMaskPattern] = js.undefined
  
  /**
    * BitMatrix class with modules data
    */
  var modules: BitMatrix
  
  /**
    * Generated segments
    */
  var segments: js.Array[GeneratedQRCodeSegment]
  
  /**
    * Calculated QR Code version
    */
  var version: Double
}
object QRCode {
  
  inline def apply(
    errorCorrectionLevel: ErrorCorrectionLevel,
    modules: BitMatrix,
    segments: js.Array[GeneratedQRCodeSegment],
    version: Double
  ): QRCode = {
    val __obj = js.Dynamic.literal(errorCorrectionLevel = errorCorrectionLevel.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCode]
  }
  
  extension [Self <: QRCode](x: Self) {
    
    inline def setErrorCorrectionLevel(value: ErrorCorrectionLevel): Self = StObject.set(x, "errorCorrectionLevel", value.asInstanceOf[js.Any])
    
    inline def setMaskPattern(value: QRCodeMaskPattern): Self = StObject.set(x, "maskPattern", value.asInstanceOf[js.Any])
    
    inline def setMaskPatternUndefined: Self = StObject.set(x, "maskPattern", js.undefined)
    
    inline def setModules(value: BitMatrix): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setSegments(value: js.Array[GeneratedQRCodeSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsVarargs(value: GeneratedQRCodeSegment*): Self = StObject.set(x, "segments", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
