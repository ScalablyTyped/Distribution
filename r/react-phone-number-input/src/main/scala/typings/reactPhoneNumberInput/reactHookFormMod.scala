package typings.reactPhoneNumberInput

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.reactPhoneNumberInput.mod.DefaultInputComponentProps
import typings.reactPhoneNumberInput.mod.FeatureProps
import typings.reactPhoneNumberInput.mod.State
import typings.reactPhoneNumberInput.mod.Value
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactHookFormMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-phone-number-input/react-hook-form", JSImport.Default)
  @js.native
  open class default protected () extends Component[
          Props[DefaultInputComponentProps, DefaultFormValues], 
          State[Props[DefaultInputComponentProps, DefaultFormValues]], 
          Any
        ] {
    def this(props: Props[DefaultInputComponentProps, DefaultFormValues]) = this()
    def this(props: Props[DefaultInputComponentProps, DefaultFormValues], context: Any) = this()
  }
  // Could also export the component that would accept custom "generics", if the component was a function,
  // but seems like it would also introduce some inconvenience when using `typeof PhoneInputWithCountrySelect`
  // for defining the type of the `props`.
  // https://github.com/catamphetamine/react-phone-number-input/issues/414#issuecomment-1220679025
  // type PhoneInputWithCountrySelectType = <InputComponentProps = DefaultInputComponentProps, FormValues = DefaultFormValues>(props: Props<InputComponentProps, FormValues>) => JSX.Element;
  @JSImport("react-phone-number-input/react-hook-form", JSImport.Default)
  @js.native
  val default: PhoneInputWithCountrySelectType[DefaultInputComponentProps, DefaultFormValues] = js.native
  
  type DefaultFormValues = Record[String, Any]
  
  type PhoneInputWithCountrySelectType[InputComponentProps, FormValues] = ComponentClass[
    Props[InputComponentProps, FormValues], 
    State[Props[InputComponentProps, FormValues]]
  ]
  
  type Props[InputComponentProps, FormValues] = FeatureProps[InputComponentProps] & ReactHookFormComponentProps[FormValues]
  
  trait ReactHookFormComponentProps[FormValues] extends StObject {
    
    var control: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Control<FormValues> */ Any
    
    var defaultValue: js.UndefOr[Value] = js.undefined
    
    var name: String
    
    var rules: js.UndefOr[js.Object] = js.undefined
    
    // A quote from `react-hook-form`:
    // Without `shouldUnregister: true`, an input value would be retained when input is removed.
    // Setting `shouldUnregister: true` makes the form behave more closer to native.
    var shouldUnregister: js.UndefOr[Boolean] = js.undefined
  }
  object ReactHookFormComponentProps {
    
    inline def apply[FormValues](
      control: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Control<FormValues> */ Any,
      name: String
    ): ReactHookFormComponentProps[FormValues] = {
      val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactHookFormComponentProps[FormValues]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactHookFormComponentProps[?], FormValues] (val x: Self & ReactHookFormComponentProps[FormValues]) extends AnyVal {
      
      inline def setControl(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Control<FormValues> */ Any
      ): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      inline def setDefaultValue(value: Value): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRules(value: js.Object): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setShouldUnregister(value: Boolean): Self = StObject.set(x, "shouldUnregister", value.asInstanceOf[js.Any])
      
      inline def setShouldUnregisterUndefined: Self = StObject.set(x, "shouldUnregister", js.undefined)
    }
  }
  
  type _To = PhoneInputWithCountrySelectType[DefaultInputComponentProps, DefaultFormValues]
  
  /* This means you don't have to write `default`, but can instead just say `reactHookFormMod.foo` */
  override def _to: PhoneInputWithCountrySelectType[DefaultInputComponentProps, DefaultFormValues] = default
}
