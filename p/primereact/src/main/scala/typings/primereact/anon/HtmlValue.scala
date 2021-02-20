package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlValue extends StObject {
  
  var delta: js.Any = js.native
  
  var htmlValue: String | Null = js.native
  
  var source: String = js.native
  
  var textValue: String = js.native
}
object HtmlValue {
  
  @scala.inline
  def apply(delta: js.Any, source: String, textValue: String): HtmlValue = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], textValue = textValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlValue]
  }
  
  @scala.inline
  implicit class HtmlValueMutableBuilder[Self <: HtmlValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelta(value: js.Any): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlValue(value: String): Self = StObject.set(x, "htmlValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlValueNull: Self = StObject.set(x, "htmlValue", null)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextValue(value: String): Self = StObject.set(x, "textValue", value.asInstanceOf[js.Any])
  }
}
