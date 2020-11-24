package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Region extends js.Object {
  
  /**
    * The length of the region in bytes.
    */
  var byteLength: js.UndefOr[Double] = js.native
  
  /**
    * The zero-based offset from the beginning of the artifact of the first byte in the region.
    */
  var byteOffset: js.UndefOr[Double] = js.native
  
  /**
    * The length of the region in characters.
    */
  var charLength: js.UndefOr[Double] = js.native
  
  /**
    * The zero-based offset from the beginning of the artifact of the first character in the region.
    */
  var charOffset: js.UndefOr[Double] = js.native
  
  /**
    * The column number of the character following the end of the region.
    */
  var endColumn: js.UndefOr[Double] = js.native
  
  /**
    * The line number of the last character in the region.
    */
  var endLine: js.UndefOr[Double] = js.native
  
  /**
    * A message relevant to the region.
    */
  var message: js.UndefOr[Message] = js.native
  
  /**
    * Key/value pairs that provide additional information about the region.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * The portion of the artifact contents within the specified region.
    */
  var snippet: js.UndefOr[ArtifactContent] = js.native
  
  /**
    * Specifies the source language, if any, of the portion of the artifact specified by the region object.
    */
  var sourceLanguage: js.UndefOr[String] = js.native
  
  /**
    * The column number of the first character in the region.
    */
  var startColumn: js.UndefOr[Double] = js.native
  
  /**
    * The line number of the first character in the region.
    */
  var startLine: js.UndefOr[Double] = js.native
}
object Region {
  
  @scala.inline
  def apply(): Region = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit class RegionOps[Self <: Region] (val x: Self) extends AnyVal {
    
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
    def setByteLength(value: Double): Self = this.set("byteLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByteLength: Self = this.set("byteLength", js.undefined)
    
    @scala.inline
    def setByteOffset(value: Double): Self = this.set("byteOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByteOffset: Self = this.set("byteOffset", js.undefined)
    
    @scala.inline
    def setCharLength(value: Double): Self = this.set("charLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharLength: Self = this.set("charLength", js.undefined)
    
    @scala.inline
    def setCharOffset(value: Double): Self = this.set("charOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharOffset: Self = this.set("charOffset", js.undefined)
    
    @scala.inline
    def setEndColumn(value: Double): Self = this.set("endColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndColumn: Self = this.set("endColumn", js.undefined)
    
    @scala.inline
    def setEndLine(value: Double): Self = this.set("endLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndLine: Self = this.set("endLine", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setSnippet(value: ArtifactContent): Self = this.set("snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
    
    @scala.inline
    def setSourceLanguage(value: String): Self = this.set("sourceLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceLanguage: Self = this.set("sourceLanguage", js.undefined)
    
    @scala.inline
    def setStartColumn(value: Double): Self = this.set("startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartColumn: Self = this.set("startColumn", js.undefined)
    
    @scala.inline
    def setStartLine(value: Double): Self = this.set("startLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartLine: Self = this.set("startLine", js.undefined)
  }
}
