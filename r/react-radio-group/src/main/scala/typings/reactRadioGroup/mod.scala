package typings.reactRadioGroup

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.HTMLProps
import typings.react.mod.InputHTMLAttributes
import typings.reactRadioGroup.anon.Value
import typings.reactRadioGroup.reactRadioGroupStrings.`aria-checked`
import typings.reactRadioGroup.reactRadioGroupStrings.`type`
import typings.reactRadioGroup.reactRadioGroupStrings.name
import typings.reactRadioGroup.reactRadioGroupStrings.onChange
import typings.reactRadioGroup.reactRadioGroupStrings.role
import typings.reactRadioGroup.reactRadioGroupStrings.value
import typings.std.HTMLInputElement
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Radio extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-radio-group", "Radio")
    @js.native
    class ^ protected ()
      extends Component[RadioProps, ComponentState, js.Any] {
      def this(props: RadioProps) = this()
      def this(props: RadioProps, context: js.Any) = this()
    }
    
    @JSImport("react-radio-group", "Radio")
    @js.native
    val ^ : ComponentClass[RadioProps, ComponentState] = js.native
    
    type RadioProps = (Omit[
        InputHTMLAttributes[HTMLInputElement], 
        value | name | role | `type` | `aria-checked`
      ]) with Value
    
    type _To = ComponentClass[RadioProps, ComponentState]
    
    /* This means you don't have to write `^`, but can instead just say `Radio.foo` */
    override def _to: ComponentClass[RadioProps, ComponentState] = ^
  }
  
  object RadioGroup extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-radio-group", "RadioGroup")
    @js.native
    class ^ protected ()
      extends Component[RadioGroupProps, ComponentState, js.Any] {
      def this(props: RadioGroupProps) = this()
      def this(props: RadioGroupProps, context: js.Any) = this()
    }
    
    @JSImport("react-radio-group", "RadioGroup")
    @js.native
    val ^ : ComponentClass[RadioGroupProps, ComponentState] = js.native
    
    type RadioGroupProps = (Omit[HTMLProps[_], onChange]) with typings.reactRadioGroup.anon.Component
    
    type _To = ComponentClass[RadioGroupProps, ComponentState]
    
    /* This means you don't have to write `^`, but can instead just say `RadioGroup.foo` */
    override def _to: ComponentClass[RadioGroupProps, ComponentState] = ^
  }
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
}
