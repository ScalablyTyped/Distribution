package typings.reactBootstrapTypeahead.mod

import typings.react.mod.InputHTMLAttributes
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.text
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseTypeaheadInputProps
  extends StObject
     with InputHTMLAttributes[HTMLInputElement] {
  
  @JSName("type")
  var type_BaseTypeaheadInputProps: text
}
object BaseTypeaheadInputProps {
  
  inline def apply(): BaseTypeaheadInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("text")
    __obj.asInstanceOf[BaseTypeaheadInputProps]
  }
  
  extension [Self <: BaseTypeaheadInputProps](x: Self) {
    
    inline def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
