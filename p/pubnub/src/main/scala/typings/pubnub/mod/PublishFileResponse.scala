package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishFileResponse extends StObject {
  
  var timetoken: Double = js.native
}
object PublishFileResponse {
  
  @scala.inline
  def apply(timetoken: Double): PublishFileResponse = {
    val __obj = js.Dynamic.literal(timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishFileResponse]
  }
  
  @scala.inline
  implicit class PublishFileResponseMutableBuilder[Self <: PublishFileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimetoken(value: Double): Self = StObject.set(x, "timetoken", value.asInstanceOf[js.Any])
  }
}
