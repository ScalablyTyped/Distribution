package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result extends StObject {
  
  var service: String
  
  var storage: String
}
object Result {
  
  @scala.inline
  def apply(service: String, storage: String): Result = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorage(value: String): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
  }
}
