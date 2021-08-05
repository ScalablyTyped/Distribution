package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallSiteType extends StObject {
  
  var columnNumber: Double
  
  var fileName: String | Null
  
  var lineNumber: Double
}
object CallSiteType {
  
  inline def apply(columnNumber: Double, lineNumber: Double): CallSiteType = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], fileName = null)
    __obj.asInstanceOf[CallSiteType]
  }
  
  extension [Self <: CallSiteType](x: Self) {
    
    inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameNull: Self = StObject.set(x, "fileName", null)
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
  }
}
