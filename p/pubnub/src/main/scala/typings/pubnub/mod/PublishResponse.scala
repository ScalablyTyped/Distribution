package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishResponse extends StObject {
  
  var timetoken: Double = js.native
}
object PublishResponse {
  
  @scala.inline
  def apply(timetoken: Double): PublishResponse = {
    val __obj = js.Dynamic.literal(timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishResponse]
  }
  
  @scala.inline
  implicit class PublishResponseMutableBuilder[Self <: PublishResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimetoken(value: Double): Self = StObject.set(x, "timetoken", value.asInstanceOf[js.Any])
  }
}
