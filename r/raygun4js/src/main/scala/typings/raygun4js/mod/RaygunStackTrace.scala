package typings.raygun4js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaygunStackTrace extends js.Object {
  
  var ClassName: String = js.native
  
  var ColumnNumber: Double = js.native
  
  var FileName: String = js.native
  
  var LineNumber: Double = js.native
  
  var MethodName: String = js.native
}
object RaygunStackTrace {
  
  @scala.inline
  def apply(ClassName: String, ColumnNumber: Double, FileName: String, LineNumber: Double, MethodName: String): RaygunStackTrace = {
    val __obj = js.Dynamic.literal(ClassName = ClassName.asInstanceOf[js.Any], ColumnNumber = ColumnNumber.asInstanceOf[js.Any], FileName = FileName.asInstanceOf[js.Any], LineNumber = LineNumber.asInstanceOf[js.Any], MethodName = MethodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaygunStackTrace]
  }
  
  @scala.inline
  implicit class RaygunStackTraceOps[Self <: RaygunStackTrace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassName(value: String): Self = this.set("ClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNumber(value: Double): Self = this.set("ColumnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = this.set("FileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("LineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodName(value: String): Self = this.set("MethodName", value.asInstanceOf[js.Any])
  }
}
