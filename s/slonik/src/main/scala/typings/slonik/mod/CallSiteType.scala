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
  
  @scala.inline
  def apply(columnNumber: Double, lineNumber: Double): CallSiteType = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], fileName = null)
    __obj.asInstanceOf[CallSiteType]
  }
  
  @scala.inline
  implicit class CallSiteTypeMutableBuilder[Self <: CallSiteType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameNull: Self = StObject.set(x, "fileName", null)
    
    @scala.inline
    def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
  }
}
