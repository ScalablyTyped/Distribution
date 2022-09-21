package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintLine extends StObject {
  
  var errorCharStart: Double
  
  var errorLength: js.UndefOr[Double] = js.undefined
  
  var lineIndex: Double
  
  var lineNumber: Double
  
  var text: js.UndefOr[String] = js.undefined
}
object PrintLine {
  
  inline def apply(errorCharStart: Double, lineIndex: Double, lineNumber: Double): PrintLine = {
    val __obj = js.Dynamic.literal(errorCharStart = errorCharStart.asInstanceOf[js.Any], lineIndex = lineIndex.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintLine]
  }
  
  extension [Self <: PrintLine](x: Self) {
    
    inline def setErrorCharStart(value: Double): Self = StObject.set(x, "errorCharStart", value.asInstanceOf[js.Any])
    
    inline def setErrorLength(value: Double): Self = StObject.set(x, "errorLength", value.asInstanceOf[js.Any])
    
    inline def setErrorLengthUndefined: Self = StObject.set(x, "errorLength", js.undefined)
    
    inline def setLineIndex(value: Double): Self = StObject.set(x, "lineIndex", value.asInstanceOf[js.Any])
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
