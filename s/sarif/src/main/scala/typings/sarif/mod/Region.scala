package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Region extends StObject {
  
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
  implicit class RegionMutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteLengthUndefined: Self = StObject.set(x, "byteLength", js.undefined)
    
    @scala.inline
    def setByteOffset(value: Double): Self = StObject.set(x, "byteOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteOffsetUndefined: Self = StObject.set(x, "byteOffset", js.undefined)
    
    @scala.inline
    def setCharLength(value: Double): Self = StObject.set(x, "charLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharLengthUndefined: Self = StObject.set(x, "charLength", js.undefined)
    
    @scala.inline
    def setCharOffset(value: Double): Self = StObject.set(x, "charOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharOffsetUndefined: Self = StObject.set(x, "charOffset", js.undefined)
    
    @scala.inline
    def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    @scala.inline
    def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setSnippet(value: ArtifactContent): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    @scala.inline
    def setSourceLanguage(value: String): Self = StObject.set(x, "sourceLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLanguageUndefined: Self = StObject.set(x, "sourceLanguage", js.undefined)
    
    @scala.inline
    def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
    
    @scala.inline
    def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLineUndefined: Self = StObject.set(x, "startLine", js.undefined)
  }
}
