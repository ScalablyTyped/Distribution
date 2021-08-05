package typings.reactDynamicNumber

import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.InputHTMLAttributes
import typings.reactDynamicNumber.reactDynamicNumberStrings.Comma
import typings.reactDynamicNumber.reactDynamicNumberStrings.Dot
import typings.reactDynamicNumber.reactDynamicNumberStrings.Space
import typings.reactDynamicNumber.reactDynamicNumberStrings._empty
import typings.reactDynamicNumber.reactDynamicNumberStrings.onChange
import typings.reactDynamicNumber.reactDynamicNumberStrings.placeholder
import typings.reactDynamicNumber.reactDynamicNumberStrings.ref
import typings.reactDynamicNumber.reactDynamicNumberStrings.value
import typings.std.HTMLInputElement
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dynamic-number", JSImport.Default)
  @js.native
  class default ()
    extends Component[DynamicNumberProps, js.Object, js.Any]
  
  type BaseInputProps = Partial[
    Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      ref | value | onChange | placeholder
    ]
  ]
  
  type DynamicNumber = Component[DynamicNumberProps, js.Object, js.Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof react-dynamic-number.react-dynamic-number.Omit<react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>, 'ref' | 'value' | 'onChange' | 'placeholder'> ]:? react-dynamic-number.react-dynamic-number.Omit<react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>, 'ref' | 'value' | 'onChange' | 'placeholder'>[P]} */ trait DynamicNumberProps extends StObject {
    
    var fraction: js.UndefOr[Double] = js.undefined
    
    var integer: js.UndefOr[Double] = js.undefined
    
    var negative: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function3[
          /* event */ ChangeEvent[HTMLInputElement], 
          /* modelValue */ Double, 
          /* viewValue */ String, 
          Unit
        ]
      ] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var positive: js.UndefOr[Boolean] = js.undefined
    
    var separator: js.UndefOr[Dot | Comma] = js.undefined
    
    var thousand: js.UndefOr[Boolean | Space] = js.undefined
    
    var value: js.UndefOr[Double | _empty] = js.undefined
  }
  object DynamicNumberProps {
    
    inline def apply(): DynamicNumberProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamicNumberProps]
    }
    
    extension [Self <: DynamicNumberProps](x: Self) {
      
      inline def setFraction(value: Double): Self = StObject.set(x, "fraction", value.asInstanceOf[js.Any])
      
      inline def setFractionUndefined: Self = StObject.set(x, "fraction", js.undefined)
      
      inline def setInteger(value: Double): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
      
      inline def setIntegerUndefined: Self = StObject.set(x, "integer", js.undefined)
      
      inline def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
      
      inline def setOnChange(
        value: (/* event */ ChangeEvent[HTMLInputElement], /* modelValue */ Double, /* viewValue */ String) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      inline def setSeparator(value: Dot | Comma): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setThousand(value: Boolean | Space): Self = StObject.set(x, "thousand", value.asInstanceOf[js.Any])
      
      inline def setThousandUndefined: Self = StObject.set(x, "thousand", js.undefined)
      
      inline def setValue(value: Double | _empty): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
}
