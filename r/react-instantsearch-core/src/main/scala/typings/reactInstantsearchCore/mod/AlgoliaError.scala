package typings.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlgoliaError extends js.Object {
  
  var debugData: js.Array[_] = js.native
  
  var message: String = js.native
  
  var name: String = js.native
  
  var stack: String = js.native
  
  var statusCode: Double = js.native
}
object AlgoliaError {
  
  @scala.inline
  def apply(debugData: js.Array[_], message: String, name: String, stack: String, statusCode: Double): AlgoliaError = {
    val __obj = js.Dynamic.literal(debugData = debugData.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgoliaError]
  }
  
  @scala.inline
  implicit class AlgoliaErrorOps[Self <: AlgoliaError] (val x: Self) extends AnyVal {
    
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
    def setDebugDataVarargs(value: js.Any*): Self = this.set("debugData", js.Array(value :_*))
    
    @scala.inline
    def setDebugData(value: js.Array[_]): Self = this.set("debugData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
}
