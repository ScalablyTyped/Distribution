package typings.pubnub.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pubnub.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HereNowResponse extends StObject {
  
  var channels: StringDictionary[Name] = js.native
  
  var totalChannels: Double = js.native
  
  var totalOccupancy: Double = js.native
}
object HereNowResponse {
  
  @scala.inline
  def apply(channels: StringDictionary[Name], totalChannels: Double, totalOccupancy: Double): HereNowResponse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], totalChannels = totalChannels.asInstanceOf[js.Any], totalOccupancy = totalOccupancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[HereNowResponse]
  }
  
  @scala.inline
  implicit class HereNowResponseMutableBuilder[Self <: HereNowResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: StringDictionary[Name]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalChannels(value: Double): Self = StObject.set(x, "totalChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalOccupancy(value: Double): Self = StObject.set(x, "totalOccupancy", value.asInstanceOf[js.Any])
  }
}
