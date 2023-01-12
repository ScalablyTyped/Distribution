package typings.signalfx.mod

import typings.signalfx.anon.JobId
import typings.signalfx.signalfxStrings.metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataMessage
  extends StObject
     with StreamMessage {
  
  var channel: String
  
  var properties: JobId
  
  var tsId: String
  
  var `type`: metadata
}
object MetadataMessage {
  
  inline def apply(channel: String, properties: JobId, tsId: String): MetadataMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tsId = tsId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("metadata")
    __obj.asInstanceOf[MetadataMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetadataMessage] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: JobId): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setTsId(value: String): Self = StObject.set(x, "tsId", value.asInstanceOf[js.Any])
    
    inline def setType(value: metadata): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
