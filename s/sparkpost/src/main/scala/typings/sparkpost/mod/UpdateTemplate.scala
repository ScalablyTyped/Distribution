package typings.sparkpost.mod

import typings.sparkpost.anon.Emailrfc822
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTemplate extends StObject {
  
  /** Content that will be used to construct a message  yes  For a full description, see the Content Attributes. Maximum length - 20 MBs */
  var content: js.UndefOr[CreateTemplateContent | Emailrfc822] = js.undefined
  
  /** Detailed description of the template  no  Maximum length - 1024 bytes */
  var description: js.UndefOr[String] = js.undefined
  
  /** Editable display name  At a minimum, id or name is required upon creation.  The name does not have to be unique. Maximum length - 1024 bytes */
  var name: js.UndefOr[String] = js.undefined
  
  /** JSON object in which template options are defined  no  For a full description, see the Options Attributes. */
  var options: js.UndefOr[CreateTemplateOptions] = js.undefined
  
  /** Whether the template is published or is a draft version  no - defaults to false  A template cannot be changed from published to draft. */
  var published: js.UndefOr[Boolean] = js.undefined
}
object UpdateTemplate {
  
  @scala.inline
  def apply(): UpdateTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTemplate]
  }
  
  @scala.inline
  implicit class UpdateTemplateMutableBuilder[Self <: UpdateTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: CreateTemplateContent | Emailrfc822): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptions(value: CreateTemplateOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPublished(value: Boolean): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
  }
}
