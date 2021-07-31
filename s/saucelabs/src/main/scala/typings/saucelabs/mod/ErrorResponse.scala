package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorResponse
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var message: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
}
object ErrorResponse {
  
  @scala.inline
  def apply(): ErrorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorResponse]
  }
  
  @scala.inline
  implicit class ErrorResponseMutableBuilder[Self <: ErrorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
