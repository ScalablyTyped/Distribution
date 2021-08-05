package typings.reactBootstrapTypeahead.mod

import typings.react.mod.CSSProperties
import typings.react.mod.LegacyRef
import typings.reactBootstrapTypeahead.anon.PickCSSPropertiesboxSizin
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<react.react.InputHTMLAttributes<'input'>, 'className' | 'style'> */
trait AutosizeInputProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var inputClassName: js.UndefOr[String] = js.undefined
  
  var inputRef: js.UndefOr[LegacyRef[HTMLInputElement]] = js.undefined
  
  var inputStyle: js.UndefOr[PickCSSPropertiesboxSizin] = js.undefined
  
  var style: CSSProperties
}
object AutosizeInputProps {
  
  inline def apply(style: CSSProperties): AutosizeInputProps = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosizeInputProps]
  }
  
  extension [Self <: AutosizeInputProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
    
    inline def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
    
    inline def setInputRef(value: LegacyRef[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
    
    inline def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
    
    inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
    
    inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
    
    inline def setInputStyle(value: PickCSSPropertiesboxSizin): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
    
    inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
