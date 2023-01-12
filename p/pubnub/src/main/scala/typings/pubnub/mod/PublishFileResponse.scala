package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishFileResponse extends StObject {
  
  var timetoken: String
}
object PublishFileResponse {
  
  inline def apply(timetoken: String): PublishFileResponse = {
    val __obj = js.Dynamic.literal(timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishFileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishFileResponse] (val x: Self) extends AnyVal {
    
    inline def setTimetoken(value: String): Self = StObject.set(x, "timetoken", value.asInstanceOf[js.Any])
  }
}
