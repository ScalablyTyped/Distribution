package typings.reactAutosuggest.mod

import typings.react.mod.FocusEvent
import typings.react.mod.FormEvent
import typings.react.mod.Ref
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof react.react.InputHTMLAttributes<any> ]: P} & {[ P in 'onChange' | 'onBlur' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.InputHTMLAttributes<any>] ]: react.react.InputHTMLAttributes<any>[P]} */ @js.native
trait InputProps[TSuggestion] extends js.Object {
  
  var onBlur: js.UndefOr[
    js.Function2[/* event */ FocusEvent[_], /* params */ js.UndefOr[BlurEvent[TSuggestion]], Unit]
  ] = js.native
  
  def onChange(event: FormEvent[_], params: ChangeEvent): Unit = js.native
  
  var ref: js.UndefOr[Ref[HTMLInputElement]] = js.native
  
  var value: String = js.native
}
object InputProps {
  
  @scala.inline
  def apply[TSuggestion](onChange: (FormEvent[_], ChangeEvent) => Unit, value: String): InputProps[TSuggestion] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProps[TSuggestion]]
  }
  
  @scala.inline
  implicit class InputPropsOps[Self <: InputProps[_], TSuggestion] (val x: Self with InputProps[TSuggestion]) extends AnyVal {
    
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
    def setOnChange(value: (FormEvent[_], ChangeEvent) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlur(value: (/* event */ FocusEvent[_], /* params */ js.UndefOr[BlurEvent[TSuggestion]]) => Unit): Self = this.set("onBlur", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: Ref[HTMLInputElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
}
