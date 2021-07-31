package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiformatMessageString extends StObject {
  
  /**
    * A Markdown message string or format string.
    */
  var markdown: js.UndefOr[String] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the message.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * A plain text message string or format string.
    */
  var text: String
}
object MultiformatMessageString {
  
  @scala.inline
  def apply(text: String): MultiformatMessageString = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiformatMessageString]
  }
  
  @scala.inline
  implicit class MultiformatMessageStringMutableBuilder[Self <: MultiformatMessageString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarkdown(value: String): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkdownUndefined: Self = StObject.set(x, "markdown", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
