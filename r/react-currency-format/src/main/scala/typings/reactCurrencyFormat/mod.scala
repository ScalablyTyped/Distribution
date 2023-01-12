package typings.reactCurrencyFormat

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.HTMLAttributes
import typings.react.mod.InputHTMLAttributes
import typings.reactCurrencyFormat.reactCurrencyFormatStrings.input
import typings.reactCurrencyFormat.reactCurrencyFormatStrings.text
import typings.std.HTMLInputElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-currency-format", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[Props, js.Object, Any]
  
  type CurrencyFormat = Component[Props, js.Object, Any]
  
  // The component accepts all the props which can be given to a input or span based on displayType selected.
  trait DisplayTypeInput
    extends StObject
       with InputHTMLAttributes[HTMLInputElement] {
    
    var customInput: js.UndefOr[ComponentType[Any]] = js.undefined
    
    var displayType: js.UndefOr[input] = js.undefined
  }
  object DisplayTypeInput {
    
    inline def apply(): DisplayTypeInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayTypeInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DisplayTypeInput] (val x: Self) extends AnyVal {
      
      inline def setCustomInput(value: ComponentType[Any]): Self = StObject.set(x, "customInput", value.asInstanceOf[js.Any])
      
      inline def setCustomInputUndefined: Self = StObject.set(x, "customInput", js.undefined)
      
      inline def setDisplayType(value: input): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
      
      inline def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
    }
  }
  
  trait DisplayTypeText
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    var customInput: js.UndefOr[scala.Nothing] = js.undefined
    
    var displayType: js.UndefOr[text] = js.undefined
  }
  object DisplayTypeText {
    
    inline def apply(): DisplayTypeText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayTypeText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DisplayTypeText] (val x: Self) extends AnyVal {
      
      inline def setDisplayType(value: text): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
      
      inline def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
    }
  }
  
  /**
    * Available input type attributes which the component supports.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.reactCurrencyFormat.reactCurrencyFormatStrings.text
    - typings.reactCurrencyFormat.reactCurrencyFormatStrings.tel
  */
  trait InputType extends StObject
  object InputType {
    
    inline def tel: typings.reactCurrencyFormat.reactCurrencyFormatStrings.tel = "tel".asInstanceOf[typings.reactCurrencyFormat.reactCurrencyFormatStrings.tel]
    
    inline def text: typings.reactCurrencyFormat.reactCurrencyFormatStrings.text = "text".asInstanceOf[typings.reactCurrencyFormat.reactCurrencyFormatStrings.text]
  }
  
  /**
    * Props accepted by the component and any other prop of the customInput.
    */
  type Props = StrictProps & StringDictionary[Any]
  
  /**
    * Props accepted by the component.
    * @see {@link https://github.com/mohitgupta8888/react-currency-format#props}
    */
  /* Rewritten from type alias, can be one of: 
    - typings.reactCurrencyFormat.anon.DisplayTypeTextPartialtho
    - typings.reactCurrencyFormat.anon.DisplayTypeInputPartialth
  */
  trait StrictProps extends StObject
  object StrictProps {
    
    inline def DisplayTypeInputPartialth(): typings.reactCurrencyFormat.anon.DisplayTypeInputPartialth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactCurrencyFormat.anon.DisplayTypeInputPartialth]
    }
    
    inline def DisplayTypeTextPartialtho(): typings.reactCurrencyFormat.anon.DisplayTypeTextPartialtho = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactCurrencyFormat.anon.DisplayTypeTextPartialtho]
    }
  }
  
  /**
    * A value object containing the formatted value, the original value and the float value.
    * @see {@link https://github.com/mohitgupta8888/react-currency-format#values-object}
    */
  trait Values extends StObject {
    
    var floatValue: Double
    
    var formattedValue: String
    
    var value: String
  }
  object Values {
    
    inline def apply(floatValue: Double, formattedValue: String, value: String): Values = {
      val __obj = js.Dynamic.literal(floatValue = floatValue.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Values]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Values] (val x: Self) extends AnyVal {
      
      inline def setFloatValue(value: Double): Self = StObject.set(x, "floatValue", value.asInstanceOf[js.Any])
      
      inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
