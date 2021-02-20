package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// fetch time
@js.native
trait FetchTimeResponse extends StObject {
  
  var timetoken: Double = js.native
}
object FetchTimeResponse {
  
  @scala.inline
  def apply(timetoken: Double): FetchTimeResponse = {
    val __obj = js.Dynamic.literal(timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchTimeResponse]
  }
  
  @scala.inline
  implicit class FetchTimeResponseMutableBuilder[Self <: FetchTimeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimetoken(value: Double): Self = StObject.set(x, "timetoken", value.asInstanceOf[js.Any])
  }
}
