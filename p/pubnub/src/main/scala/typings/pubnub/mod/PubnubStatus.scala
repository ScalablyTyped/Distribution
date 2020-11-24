package typings.pubnub.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PubnubStatus extends js.Object {
  
  var category: js.UndefOr[String] = js.native
  
  var error: Boolean = js.native
  
  var errorData: js.UndefOr[Error] = js.native
  
   // see Pubnub.Categories
  var operation: String = js.native
  
   // see Pubnub.Operations
  var statusCode: Double = js.native
}
object PubnubStatus {
  
  @scala.inline
  def apply(error: Boolean, operation: String, statusCode: Double): PubnubStatus = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PubnubStatus]
  }
  
  @scala.inline
  implicit class PubnubStatusOps[Self <: PubnubStatus] (val x: Self) extends AnyVal {
    
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
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setErrorData(value: Error): Self = this.set("errorData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorData: Self = this.set("errorData", js.undefined)
  }
}
