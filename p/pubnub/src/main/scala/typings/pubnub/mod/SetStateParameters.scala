package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// setState
@js.native
trait SetStateParameters extends StObject {
  
  var channelGroups: js.UndefOr[js.Array[String]] = js.native
  
  var channels: js.UndefOr[js.Array[String]] = js.native
  
  var state: js.UndefOr[js.Any] = js.native
}
object SetStateParameters {
  
  @scala.inline
  def apply(): SetStateParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetStateParameters]
  }
  
  @scala.inline
  implicit class SetStateParametersMutableBuilder[Self <: SetStateParameters] (val x: Self) extends AnyVal {
    
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
    def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
