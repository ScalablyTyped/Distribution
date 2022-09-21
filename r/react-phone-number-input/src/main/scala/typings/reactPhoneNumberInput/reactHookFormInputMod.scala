package typings.reactPhoneNumberInput

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.global.JSX.Element
import typings.reactPhoneNumberInput.inputMod.FeatureProps
import typings.reactPhoneNumberInput.mod.DefaultInputComponentProps
import typings.reactPhoneNumberInput.reactHookFormMod.DefaultFormValues
import typings.reactPhoneNumberInput.reactHookFormMod.ReactHookFormComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactHookFormInputMod extends Shortcut {
  
  // Could also export the component that would accept custom "generics",
  // but seems like it would also introduce some inconvenience when using `typeof PhoneInput`
  // for defining the type of the `props`.
  // https://github.com/catamphetamine/react-phone-number-input/issues/414#issuecomment-1220679025
  // type PhoneInputType = <InputComponentProps = DefaultInputComponentProps, FormValues = DefaultFormValues>(props: Props<InputComponentProps, FormValues>) => JSX.Element;
  @JSImport("react-phone-number-input/react-hook-form-input", JSImport.Default)
  @js.native
  val default: PhoneInputType[DefaultInputComponentProps, DefaultFormValues] = js.native
  
  type PhoneInputType[InputComponentProps, FormValues] = js.Function1[/* props */ Props[InputComponentProps, FormValues], Element]
  
  type Props[InputComponentProps, FormValues] = FeatureProps[InputComponentProps] & ReactHookFormComponentProps[FormValues] & js.Object
  
  type _To = PhoneInputType[DefaultInputComponentProps, DefaultFormValues]
  
  /* This means you don't have to write `default`, but can instead just say `reactHookFormInputMod.foo` */
  override def _to: PhoneInputType[DefaultInputComponentProps, DefaultFormValues] = default
}
