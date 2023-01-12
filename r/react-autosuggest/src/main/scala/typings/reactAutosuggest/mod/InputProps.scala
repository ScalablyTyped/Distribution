package typings.reactAutosuggest.mod

import typings.react.mod.FocusEvent
import typings.react.mod.FormEvent
import typings.react.mod.Ref
import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof react.react.InputHTMLAttributes<std.HTMLElement> ]: P} & {[ P in 'onChange' | 'onBlur' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.InputHTMLAttributes<std.HTMLElement>] ]: react.react.InputHTMLAttributes<std.HTMLElement>[P]} */ trait InputProps[TSuggestion] extends StObject {
  
  var onBlur: js.UndefOr[
    js.Function2[
      /* event */ FocusEvent[HTMLElement, Element], 
      /* params */ js.UndefOr[BlurEvent[TSuggestion]], 
      Unit
    ]
  ] = js.undefined
  
  def onChange(event: FormEvent[HTMLElement], params: ChangeEvent): Unit
  
  var ref: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
  
  var value: String
}
object InputProps {
  
  inline def apply[TSuggestion](onChange: (FormEvent[HTMLElement], ChangeEvent) => Unit, value: String): InputProps[TSuggestion] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProps[TSuggestion]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputProps[?], TSuggestion] (val x: Self & InputProps[TSuggestion]) extends AnyVal {
    
    inline def setOnBlur(
      value: (/* event */ FocusEvent[HTMLElement, Element], /* params */ js.UndefOr[BlurEvent[TSuggestion]]) => Unit
    ): Self = StObject.set(x, "onBlur", js.Any.fromFunction2(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: (FormEvent[HTMLElement], ChangeEvent) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    inline def setRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
