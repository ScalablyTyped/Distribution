package typings.reactNativeMail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attachments extends StObject {
    
    var attachments: js.UndefOr[js.Array[MimeType]] = js.undefined
    
    var bccRecipients: js.UndefOr[js.Array[String]] = js.undefined
    
    var body: js.UndefOr[String] = js.undefined
    
    var ccRecipients: js.UndefOr[js.Array[String]] = js.undefined
    
    var customChooserTitle: js.UndefOr[String] = js.undefined
    
    var isHTML: js.UndefOr[Boolean] = js.undefined
    
    var recipients: js.UndefOr[js.Array[String]] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
  }
  object Attachments {
    
    inline def apply(): Attachments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attachments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Attachments] (val x: Self) extends AnyVal {
      
      inline def setAttachments(value: js.Array[MimeType]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      inline def setAttachmentsVarargs(value: MimeType*): Self = StObject.set(x, "attachments", js.Array(value*))
      
      inline def setBccRecipients(value: js.Array[String]): Self = StObject.set(x, "bccRecipients", value.asInstanceOf[js.Any])
      
      inline def setBccRecipientsUndefined: Self = StObject.set(x, "bccRecipients", js.undefined)
      
      inline def setBccRecipientsVarargs(value: String*): Self = StObject.set(x, "bccRecipients", js.Array(value*))
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCcRecipients(value: js.Array[String]): Self = StObject.set(x, "ccRecipients", value.asInstanceOf[js.Any])
      
      inline def setCcRecipientsUndefined: Self = StObject.set(x, "ccRecipients", js.undefined)
      
      inline def setCcRecipientsVarargs(value: String*): Self = StObject.set(x, "ccRecipients", js.Array(value*))
      
      inline def setCustomChooserTitle(value: String): Self = StObject.set(x, "customChooserTitle", value.asInstanceOf[js.Any])
      
      inline def setCustomChooserTitleUndefined: Self = StObject.set(x, "customChooserTitle", js.undefined)
      
      inline def setIsHTML(value: Boolean): Self = StObject.set(x, "isHTML", value.asInstanceOf[js.Any])
      
      inline def setIsHTMLUndefined: Self = StObject.set(x, "isHTML", js.undefined)
      
      inline def setRecipients(value: js.Array[String]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
      
      inline def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
      
      inline def setRecipientsVarargs(value: String*): Self = StObject.set(x, "recipients", js.Array(value*))
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
  
  trait MimeType extends StObject {
    
    // Specify either 'type' or 'mimeType'
    var mimeType: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    // Specify either 'path' or 'uri'
    var uri: js.UndefOr[String] = js.undefined
  }
  object MimeType {
    
    inline def apply(): MimeType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MimeType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MimeType] (val x: Self) extends AnyVal {
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
