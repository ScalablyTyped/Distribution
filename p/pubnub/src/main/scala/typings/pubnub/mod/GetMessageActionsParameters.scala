package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMessageActionsParameters extends StObject {
  
  var channel: String
  
  var end: js.UndefOr[String] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var start: js.UndefOr[String] = js.undefined
}
object GetMessageActionsParameters {
  
  @scala.inline
  def apply(channel: String): GetMessageActionsParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMessageActionsParameters]
  }
  
  @scala.inline
  implicit class GetMessageActionsParametersMutableBuilder[Self <: GetMessageActionsParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
