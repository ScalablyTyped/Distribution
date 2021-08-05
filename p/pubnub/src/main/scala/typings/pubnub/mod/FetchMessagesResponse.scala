package typings.pubnub.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pubnub.anon.Actions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchMessagesResponse extends StObject {
  
  var channels: StringDictionary[js.Array[Actions]]
}
object FetchMessagesResponse {
  
  inline def apply(channels: StringDictionary[js.Array[Actions]]): FetchMessagesResponse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchMessagesResponse]
  }
  
  extension [Self <: FetchMessagesResponse](x: Self) {
    
    inline def setChannels(value: StringDictionary[js.Array[Actions]]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
  }
}
