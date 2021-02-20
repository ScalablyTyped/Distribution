package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Channel Metadata
@js.native
trait ChannelMetadataFields extends StObject {
  
  var description: String = js.native
  
  var name: String = js.native
}
object ChannelMetadataFields {
  
  @scala.inline
  def apply(description: String, name: String): ChannelMetadataFields = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelMetadataFields]
  }
  
  @scala.inline
  implicit class ChannelMetadataFieldsMutableBuilder[Self <: ChannelMetadataFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
