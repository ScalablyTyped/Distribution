package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryParameters extends StObject {
  
  var channel: String = js.native
  
  var count: Double = js.native
  
  // timetoken
  var end: js.UndefOr[String | Double] = js.native
  
  // timetoken
  var includeMeta: js.UndefOr[Boolean] = js.native
  
  var includeTimetoken: js.UndefOr[Boolean] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var start: js.UndefOr[String | Double] = js.native
  
  var stringifiedTimeToken: js.UndefOr[Boolean] = js.native
}
object HistoryParameters {
  
  @scala.inline
  def apply(channel: String, count: Double): HistoryParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryParameters]
  }
  
  @scala.inline
  implicit class HistoryParametersMutableBuilder[Self <: HistoryParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: String | Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setIncludeMeta(value: Boolean): Self = StObject.set(x, "includeMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeMetaUndefined: Self = StObject.set(x, "includeMeta", js.undefined)
    
    @scala.inline
    def setIncludeTimetoken(value: Boolean): Self = StObject.set(x, "includeTimetoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTimetokenUndefined: Self = StObject.set(x, "includeTimetoken", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setStart(value: String | Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStringifiedTimeToken(value: Boolean): Self = StObject.set(x, "stringifiedTimeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringifiedTimeTokenUndefined: Self = StObject.set(x, "stringifiedTimeToken", js.undefined)
  }
}
