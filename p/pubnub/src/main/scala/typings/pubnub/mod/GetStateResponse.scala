package typings.pubnub.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStateResponse extends StObject {
  
  var channels: StringDictionary[js.Any]
}
object GetStateResponse {
  
  inline def apply(channels: StringDictionary[js.Any]): GetStateResponse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStateResponse]
  }
  
  extension [Self <: GetStateResponse](x: Self) {
    
    inline def setChannels(value: StringDictionary[js.Any]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
  }
}
