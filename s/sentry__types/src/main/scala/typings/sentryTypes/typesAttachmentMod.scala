package typings.sentryTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAttachmentMod {
  
  trait Attachment extends StObject {
    
    var attachmentType: js.UndefOr[String] = js.undefined
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var data: String | js.typedarray.Uint8Array
    
    var filename: String
  }
  object Attachment {
    
    inline def apply(data: String | js.typedarray.Uint8Array, filename: String): Attachment = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attachment]
    }
    
    extension [Self <: Attachment](x: Self) {
      
      inline def setAttachmentType(value: String): Self = StObject.set(x, "attachmentType", value.asInstanceOf[js.Any])
      
      inline def setAttachmentTypeUndefined: Self = StObject.set(x, "attachmentType", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setData(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
}
