package typings.pubnub.mod

import typings.pubnub.anon.CustomFieldsBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetChannelMetadataParameters extends StObject {
  
  var channel: String = js.native
  
  var include: js.UndefOr[CustomFieldsBoolean] = js.native
}
object GetChannelMetadataParameters {
  
  @scala.inline
  def apply(channel: String): GetChannelMetadataParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelMetadataParameters]
  }
  
  @scala.inline
  implicit class GetChannelMetadataParametersMutableBuilder[Self <: GetChannelMetadataParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude(value: CustomFieldsBoolean): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
  }
}
