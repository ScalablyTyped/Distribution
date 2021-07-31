package typings.reactNativeMail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attachment extends StObject {
    
    var attachment: js.UndefOr[Name] = js.undefined
    
    var bccRecipients: js.UndefOr[js.Array[String]] = js.undefined
    
    var body: String
    
    var ccRecipients: js.UndefOr[js.Array[String]] = js.undefined
    
    var isHTML: Boolean
    
    var recipients: js.UndefOr[js.Array[String]] = js.undefined
    
    var subject: String
  }
  object Attachment {
    
    @scala.inline
    def apply(body: String, isHTML: Boolean, subject: String): Attachment = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isHTML = isHTML.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attachment]
    }
    
    @scala.inline
    implicit class AttachmentMutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachment(value: Name): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
      
      @scala.inline
      def setBccRecipients(value: js.Array[String]): Self = StObject.set(x, "bccRecipients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBccRecipientsUndefined: Self = StObject.set(x, "bccRecipients", js.undefined)
      
      @scala.inline
      def setBccRecipientsVarargs(value: String*): Self = StObject.set(x, "bccRecipients", js.Array(value :_*))
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcRecipients(value: js.Array[String]): Self = StObject.set(x, "ccRecipients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcRecipientsUndefined: Self = StObject.set(x, "ccRecipients", js.undefined)
      
      @scala.inline
      def setCcRecipientsVarargs(value: String*): Self = StObject.set(x, "ccRecipients", js.Array(value :_*))
      
      @scala.inline
      def setIsHTML(value: Boolean): Self = StObject.set(x, "isHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipients(value: js.Array[String]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
      
      @scala.inline
      def setRecipientsVarargs(value: String*): Self = StObject.set(x, "recipients", js.Array(value :_*))
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    /**
      * Optional: Custom filename for attachment
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The absolute path of the file from which to read data.
      */
    var path: String
    
    /**
      * Mime Type: jpg, png, doc, ppt, html, pdf, csv
      */
    var `type`: String
  }
  object Name {
    
    @scala.inline
    def apply(path: String, `type`: String): Name = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
