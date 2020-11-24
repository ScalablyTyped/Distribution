package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranslationMetadata extends js.Object {
  
  /**
    * The absolute URI from which the translation metadata can be downloaded.
    */
  var downloadUri: js.UndefOr[String] = js.native
  
  /**
    * A comprehensive description of the translation metadata.
    */
  var fullDescription: js.UndefOr[MultiformatMessageString] = js.native
  
  /**
    * The full name associated with the translation metadata.
    */
  var fullName: js.UndefOr[String] = js.native
  
  /**
    * The absolute URI from which information related to the translation metadata can be downloaded.
    */
  var informationUri: js.UndefOr[String] = js.native
  
  /**
    * The name associated with the translation metadata.
    */
  var name: String = js.native
  
  /**
    * Key/value pairs that provide additional information about the translation metadata.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * A brief description of the translation metadata.
    */
  var shortDescription: js.UndefOr[MultiformatMessageString] = js.native
}
object TranslationMetadata {
  
  @scala.inline
  def apply(name: String): TranslationMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationMetadata]
  }
  
  @scala.inline
  implicit class TranslationMetadataOps[Self <: TranslationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUri(value: String): Self = this.set("downloadUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadUri: Self = this.set("downloadUri", js.undefined)
    
    @scala.inline
    def setFullDescription(value: MultiformatMessageString): Self = this.set("fullDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullDescription: Self = this.set("fullDescription", js.undefined)
    
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullName: Self = this.set("fullName", js.undefined)
    
    @scala.inline
    def setInformationUri(value: String): Self = this.set("informationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInformationUri: Self = this.set("informationUri", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setShortDescription(value: MultiformatMessageString): Self = this.set("shortDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortDescription: Self = this.set("shortDescription", js.undefined)
  }
}
