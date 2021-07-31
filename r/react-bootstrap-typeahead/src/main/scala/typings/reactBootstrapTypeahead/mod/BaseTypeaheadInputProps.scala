package typings.reactBootstrapTypeahead.mod

import typings.react.mod.InputHTMLAttributes
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.input
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseTypeaheadInputProps
  extends StObject
     with InputHTMLAttributes[input] {
  
  @JSName("type")
  var type_BaseTypeaheadInputProps: text
}
object BaseTypeaheadInputProps {
  
  @scala.inline
  def apply(): BaseTypeaheadInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("text")
    __obj.asInstanceOf[BaseTypeaheadInputProps]
  }
  
  @scala.inline
  implicit class BaseTypeaheadInputPropsMutableBuilder[Self <: BaseTypeaheadInputProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
