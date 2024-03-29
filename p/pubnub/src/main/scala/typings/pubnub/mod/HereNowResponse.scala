package typings.pubnub.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pubnub.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HereNowResponse extends StObject {
  
  var channels: StringDictionary[Name]
  
  var totalChannels: Double
  
  var totalOccupancy: Double
}
object HereNowResponse {
  
  inline def apply(channels: StringDictionary[Name], totalChannels: Double, totalOccupancy: Double): HereNowResponse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], totalChannels = totalChannels.asInstanceOf[js.Any], totalOccupancy = totalOccupancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[HereNowResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HereNowResponse] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: StringDictionary[Name]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setTotalChannels(value: Double): Self = StObject.set(x, "totalChannels", value.asInstanceOf[js.Any])
    
    inline def setTotalOccupancy(value: Double): Self = StObject.set(x, "totalOccupancy", value.asInstanceOf[js.Any])
  }
}
