package typings.pubnub.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageCountsResponse extends StObject {
  
  var channels: StringDictionary[Double] = js.native
}
object MessageCountsResponse {
  
  @scala.inline
  def apply(channels: StringDictionary[Double]): MessageCountsResponse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageCountsResponse]
  }
  
  @scala.inline
  implicit class MessageCountsResponseMutableBuilder[Self <: MessageCountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: StringDictionary[Double]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
  }
}
