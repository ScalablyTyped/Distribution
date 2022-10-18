package typings.pubnub.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pubnub.anon.Occupancy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HereNowResponse extends StObject {
  
  var channels: StringDictionary[Occupancy]
  
  var totalChannels: Double
  
  var totalOccupancy: Double
}
object HereNowResponse {
  
  inline def apply(channels: StringDictionary[Occupancy], totalChannels: Double, totalOccupancy: Double): HereNowResponse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], totalChannels = totalChannels.asInstanceOf[js.Any], totalOccupancy = totalOccupancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[HereNowResponse]
  }
  
  extension [Self <: HereNowResponse](x: Self) {
    
    inline def setChannels(value: StringDictionary[Occupancy]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setTotalChannels(value: Double): Self = StObject.set(x, "totalChannels", value.asInstanceOf[js.Any])
    
    inline def setTotalOccupancy(value: Double): Self = StObject.set(x, "totalOccupancy", value.asInstanceOf[js.Any])
  }
}
