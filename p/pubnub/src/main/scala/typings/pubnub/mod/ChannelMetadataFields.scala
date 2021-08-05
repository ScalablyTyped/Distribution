package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Channel Metadata
trait ChannelMetadataFields extends StObject {
  
  var description: String
  
  var name: String
}
object ChannelMetadataFields {
  
  inline def apply(description: String, name: String): ChannelMetadataFields = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelMetadataFields]
  }
  
  extension [Self <: ChannelMetadataFields](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
