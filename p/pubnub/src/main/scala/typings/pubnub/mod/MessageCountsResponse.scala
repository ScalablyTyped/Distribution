package typings.pubnub.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageCountsResponse extends StObject {
  
  var channels: StringDictionary[Double]
}
object MessageCountsResponse {
  
  inline def apply(channels: StringDictionary[Double]): MessageCountsResponse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageCountsResponse]
  }
  
  extension [Self <: MessageCountsResponse](x: Self) {
    
    inline def setChannels(value: StringDictionary[Double]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
  }
}
