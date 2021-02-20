package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignalResponse extends StObject {
  
  var timetoken: Double = js.native
}
object SignalResponse {
  
  @scala.inline
  def apply(timetoken: Double): SignalResponse = {
    val __obj = js.Dynamic.literal(timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalResponse]
  }
  
  @scala.inline
  implicit class SignalResponseMutableBuilder[Self <: SignalResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimetoken(value: Double): Self = StObject.set(x, "timetoken", value.asInstanceOf[js.Any])
  }
}
