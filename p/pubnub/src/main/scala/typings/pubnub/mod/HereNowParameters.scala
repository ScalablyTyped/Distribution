package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// hereNow
@js.native
trait HereNowParameters extends StObject {
  
  var channelGroups: js.UndefOr[js.Array[String]] = js.native
  
  var channels: js.UndefOr[js.Array[String]] = js.native
  
  var includeState: js.UndefOr[Boolean] = js.native
  
  var includeUUIDs: js.UndefOr[Boolean] = js.native
}
object HereNowParameters {
  
  @scala.inline
  def apply(): HereNowParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HereNowParameters]
  }
  
  @scala.inline
  implicit class HereNowParametersMutableBuilder[Self <: HereNowParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelGroups(value: js.Array[String]): Self = StObject.set(x, "channelGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelGroupsUndefined: Self = StObject.set(x, "channelGroups", js.undefined)
    
    @scala.inline
    def setChannelGroupsVarargs(value: String*): Self = StObject.set(x, "channelGroups", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    @scala.inline
    def setIncludeState(value: Boolean): Self = StObject.set(x, "includeState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeStateUndefined: Self = StObject.set(x, "includeState", js.undefined)
    
    @scala.inline
    def setIncludeUUIDs(value: Boolean): Self = StObject.set(x, "includeUUIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUUIDsUndefined: Self = StObject.set(x, "includeUUIDs", js.undefined)
  }
}
