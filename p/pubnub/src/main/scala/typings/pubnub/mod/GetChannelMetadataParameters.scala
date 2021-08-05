package typings.pubnub.mod

import typings.pubnub.anon.CustomFieldsBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelMetadataParameters extends StObject {
  
  var channel: String
  
  var include: js.UndefOr[CustomFieldsBoolean] = js.undefined
}
object GetChannelMetadataParameters {
  
  inline def apply(channel: String): GetChannelMetadataParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelMetadataParameters]
  }
  
  extension [Self <: GetChannelMetadataParameters](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setInclude(value: CustomFieldsBoolean): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
  }
}
