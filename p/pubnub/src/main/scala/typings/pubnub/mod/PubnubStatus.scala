package typings.pubnub.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PubnubStatus extends StObject {
  
  var category: js.UndefOr[String] = js.undefined
  
  var error: Boolean
  
  var errorData: js.UndefOr[Error] = js.undefined
  
  // see Pubnub.Categories
  var operation: String
  
  // see Pubnub.Operations
  var statusCode: Double
}
object PubnubStatus {
  
  @scala.inline
  def apply(error: Boolean, operation: String, statusCode: Double): PubnubStatus = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PubnubStatus]
  }
  
  @scala.inline
  implicit class PubnubStatusMutableBuilder[Self <: PubnubStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorData(value: Error): Self = StObject.set(x, "errorData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDataUndefined: Self = StObject.set(x, "errorData", js.undefined)
    
    @scala.inline
    def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
