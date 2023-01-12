package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Region extends StObject {
  
  /**
    * The length of the region in bytes.
    */
  var byteLength: js.UndefOr[Double] = js.undefined
  
  /**
    * The zero-based offset from the beginning of the artifact of the first byte in the region.
    */
  var byteOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * The length of the region in characters.
    */
  var charLength: js.UndefOr[Double] = js.undefined
  
  /**
    * The zero-based offset from the beginning of the artifact of the first character in the region.
    */
  var charOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * The column number of the character following the end of the region.
    */
  var endColumn: js.UndefOr[Double] = js.undefined
  
  /**
    * The line number of the last character in the region.
    */
  var endLine: js.UndefOr[Double] = js.undefined
  
  /**
    * A message relevant to the region.
    */
  var message: js.UndefOr[Message] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the region.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * The portion of the artifact contents within the specified region.
    */
  var snippet: js.UndefOr[ArtifactContent] = js.undefined
  
  /**
    * Specifies the source language, if any, of the portion of the artifact specified by the region object.
    */
  var sourceLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * The column number of the first character in the region.
    */
  var startColumn: js.UndefOr[Double] = js.undefined
  
  /**
    * The line number of the first character in the region.
    */
  var startLine: js.UndefOr[Double] = js.undefined
}
object Region {
  
  inline def apply(): Region = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
    
    inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    
    inline def setByteLengthUndefined: Self = StObject.set(x, "byteLength", js.undefined)
    
    inline def setByteOffset(value: Double): Self = StObject.set(x, "byteOffset", value.asInstanceOf[js.Any])
    
    inline def setByteOffsetUndefined: Self = StObject.set(x, "byteOffset", js.undefined)
    
    inline def setCharLength(value: Double): Self = StObject.set(x, "charLength", value.asInstanceOf[js.Any])
    
    inline def setCharLengthUndefined: Self = StObject.set(x, "charLength", js.undefined)
    
    inline def setCharOffset(value: Double): Self = StObject.set(x, "charOffset", value.asInstanceOf[js.Any])
    
    inline def setCharOffsetUndefined: Self = StObject.set(x, "charOffset", js.undefined)
    
    inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setSnippet(value: ArtifactContent): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setSourceLanguage(value: String): Self = StObject.set(x, "sourceLanguage", value.asInstanceOf[js.Any])
    
    inline def setSourceLanguageUndefined: Self = StObject.set(x, "sourceLanguage", js.undefined)
    
    inline def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    inline def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
    
    inline def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
    
    inline def setStartLineUndefined: Self = StObject.set(x, "startLine", js.undefined)
  }
}
