package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.anon.ErrorCharStart
import typings.stencilCore.stencilCoreStrings.debug
import typings.stencilCore.stencilCoreStrings.error
import typings.stencilCore.stencilCoreStrings.info
import typings.stencilCore.stencilCoreStrings.log
import typings.stencilCore.stencilCoreStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diagnostic extends StObject {
  
  var absFilePath: js.UndefOr[String] = js.undefined
  
  var code: js.UndefOr[String] = js.undefined
  
  var columnNumber: js.UndefOr[Double] = js.undefined
  
  var debugText: js.UndefOr[String] = js.undefined
  
  var header: js.UndefOr[String] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var level: error | warn | info | log | debug
  
  var lineNumber: js.UndefOr[Double] = js.undefined
  
  var lines: js.UndefOr[js.Array[ErrorCharStart]] = js.undefined
  
  var messageText: String
  
  var relFilePath: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object Diagnostic {
  
  inline def apply(level: error | warn | info | log | debug, messageText: String, `type`: String): Diagnostic = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagnostic]
  }
  
  extension [Self <: Diagnostic](x: Self) {
    
    inline def setAbsFilePath(value: String): Self = StObject.set(x, "absFilePath", value.asInstanceOf[js.Any])
    
    inline def setAbsFilePathUndefined: Self = StObject.set(x, "absFilePath", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    inline def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
    
    inline def setDebugText(value: String): Self = StObject.set(x, "debugText", value.asInstanceOf[js.Any])
    
    inline def setDebugTextUndefined: Self = StObject.set(x, "debugText", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLevel(value: error | warn | info | log | debug): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    
    inline def setLines(value: js.Array[ErrorCharStart]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    inline def setLinesVarargs(value: ErrorCharStart*): Self = StObject.set(x, "lines", js.Array(value*))
    
    inline def setMessageText(value: String): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
    
    inline def setRelFilePath(value: String): Self = StObject.set(x, "relFilePath", value.asInstanceOf[js.Any])
    
    inline def setRelFilePathUndefined: Self = StObject.set(x, "relFilePath", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
