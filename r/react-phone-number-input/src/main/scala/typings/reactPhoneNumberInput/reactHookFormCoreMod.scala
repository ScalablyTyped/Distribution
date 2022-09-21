package typings.reactPhoneNumberInput

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.global.JSX.Element
import typings.reactPhoneNumberInput.anon.Labels
import typings.reactPhoneNumberInput.mod.DefaultInputComponentProps
import typings.reactPhoneNumberInput.reactHookFormMod.DefaultFormValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactHookFormCoreMod extends Shortcut {
  
  // Could also export the component that would accept custom "generics",
  // but seems like it would also introduce some inconvenience when using `typeof PhoneInputWithCountrySelect`
  // for defining the type of the `props`.
  // https://github.com/catamphetamine/react-phone-number-input/issues/414#issuecomment-1220679025
  // type PhoneInputWithCountrySelectComponentType = <InputComponentProps = DefaultInputComponentProps, FormValues = DefaultFormValues>(props: Props<InputComponentProps, FormValues>) => JSX.Element;
  @JSImport("react-phone-number-input/react-hook-form-core", JSImport.Default)
  @js.native
  val default: PhoneInputWithCountrySelectComponentType[DefaultInputComponentProps, DefaultFormValues] = js.native
  
  type PhoneInputWithCountrySelectComponentType[InputComponentProps, FormValues] = js.Function1[/* props */ Props[InputComponentProps, FormValues], Element]
  
  type Props[InputComponentProps, FormValues] = (typings.reactPhoneNumberInput.reactHookFormMod.Props[InputComponentProps, FormValues]) & Labels
  
  type _To = PhoneInputWithCountrySelectComponentType[DefaultInputComponentProps, DefaultFormValues]
  
  /* This means you don't have to write `default`, but can instead just say `reactHookFormCoreMod.foo` */
  override def _to: PhoneInputWithCountrySelectComponentType[DefaultInputComponentProps, DefaultFormValues] = default
}
