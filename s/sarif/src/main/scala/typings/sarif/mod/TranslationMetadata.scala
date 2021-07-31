package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslationMetadata extends StObject {
  
  /**
    * The absolute URI from which the translation metadata can be downloaded.
    */
  var downloadUri: js.UndefOr[String] = js.undefined
  
  /**
    * A comprehensive description of the translation metadata.
    */
  var fullDescription: js.UndefOr[MultiformatMessageString] = js.undefined
  
  /**
    * The full name associated with the translation metadata.
    */
  var fullName: js.UndefOr[String] = js.undefined
  
  /**
    * The absolute URI from which information related to the translation metadata can be downloaded.
    */
  var informationUri: js.UndefOr[String] = js.undefined
  
  /**
    * The name associated with the translation metadata.
    */
  var name: String
  
  /**
    * Key/value pairs that provide additional information about the translation metadata.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * A brief description of the translation metadata.
    */
  var shortDescription: js.UndefOr[MultiformatMessageString] = js.undefined
}
object TranslationMetadata {
  
  @scala.inline
  def apply(name: String): TranslationMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationMetadata]
  }
  
  @scala.inline
  implicit class TranslationMetadataMutableBuilder[Self <: TranslationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownloadUri(value: String): Self = StObject.set(x, "downloadUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUriUndefined: Self = StObject.set(x, "downloadUri", js.undefined)
    
    @scala.inline
    def setFullDescription(value: MultiformatMessageString): Self = StObject.set(x, "fullDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullDescriptionUndefined: Self = StObject.set(x, "fullDescription", js.undefined)
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    @scala.inline
    def setInformationUri(value: String): Self = StObject.set(x, "informationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInformationUriUndefined: Self = StObject.set(x, "informationUri", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setShortDescription(value: MultiformatMessageString): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescriptionUndefined: Self = StObject.set(x, "shortDescription", js.undefined)
  }
}
