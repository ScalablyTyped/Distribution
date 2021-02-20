package typings.pubnub.mod

import typings.pubnub.anon.CustomFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetChannelMetadataParameters[Custom /* <: ObjectCustom */] extends StObject {
  
  var channel: String = js.native
  
  var data: ChannelMetadata[Custom] = js.native
  
  var include: js.UndefOr[CustomFields] = js.native
}
object SetChannelMetadataParameters {
  
  @scala.inline
  def apply[Custom /* <: ObjectCustom */](channel: String, data: ChannelMetadata[Custom]): SetChannelMetadataParameters[Custom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetChannelMetadataParameters[Custom]]
  }
  
  @scala.inline
  implicit class SetChannelMetadataParametersMutableBuilder[Self <: SetChannelMetadataParameters[_], Custom /* <: ObjectCustom */] (val x: Self with SetChannelMetadataParameters[Custom]) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: ChannelMetadata[Custom]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude(value: CustomFields): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
  }
}
