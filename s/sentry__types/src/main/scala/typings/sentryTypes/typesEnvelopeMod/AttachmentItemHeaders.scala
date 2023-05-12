package typings.sentryTypes.typesEnvelopeMod

import typings.sentryTypes.sentryTypesStrings.attachment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentItemHeaders extends StObject {
  
  var attachment_type: js.UndefOr[String] = js.undefined
  
  var content_type: js.UndefOr[String] = js.undefined
  
  var filename: String
  
  var length: Double
  
  var `type`: attachment
}
object AttachmentItemHeaders {
  
  inline def apply(filename: String, length: Double): AttachmentItemHeaders = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("attachment")
    __obj.asInstanceOf[AttachmentItemHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachmentItemHeaders] (val x: Self) extends AnyVal {
    
    inline def setAttachment_type(value: String): Self = StObject.set(x, "attachment_type", value.asInstanceOf[js.Any])
    
    inline def setAttachment_typeUndefined: Self = StObject.set(x, "attachment_type", js.undefined)
    
    inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setType(value: attachment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
