package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HookSource extends StObject {
  
  var columnNumber: Double | Null
  
  var fileName: String | Null
  
  var functionName: String | Null
  
  var lineNumber: Double | Null
}
object HookSource {
  
  inline def apply(): HookSource = {
    val __obj = js.Dynamic.literal(columnNumber = null, fileName = null, functionName = null, lineNumber = null)
    __obj.asInstanceOf[HookSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HookSource] (val x: Self) extends AnyVal {
    
    inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    inline def setColumnNumberNull: Self = StObject.set(x, "columnNumber", null)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameNull: Self = StObject.set(x, "fileName", null)
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameNull: Self = StObject.set(x, "functionName", null)
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumberNull: Self = StObject.set(x, "lineNumber", null)
  }
}
