package typings.pubnub.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStateResponse extends StObject {
  
  var channels: StringDictionary[js.Any] = js.native
}
object GetStateResponse {
  
  @scala.inline
  def apply(channels: StringDictionary[js.Any]): GetStateResponse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStateResponse]
  }
  
  @scala.inline
  implicit class GetStateResponseMutableBuilder[Self <: GetStateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: StringDictionary[js.Any]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
  }
}
