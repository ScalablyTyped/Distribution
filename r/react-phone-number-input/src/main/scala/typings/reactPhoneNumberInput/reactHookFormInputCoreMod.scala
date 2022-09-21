package typings.reactPhoneNumberInput

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.global.JSX.Element
import typings.reactPhoneNumberInput.anon.Metadata
import typings.reactPhoneNumberInput.mod.DefaultInputComponentProps
import typings.reactPhoneNumberInput.reactHookFormMod.DefaultFormValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactHookFormInputCoreMod extends Shortcut {
  
  // Could also export the component that would accept custom "generics",
  // but seems like it would also introduce some inconvenience when using `typeof PhoneInput`
  // for defining the type of the `props`.
  // https://github.com/catamphetamine/react-phone-number-input/issues/414#issuecomment-1220679025
  // type PhoneInputComponentType = <InputComponentProps = DefaultInputComponentProps, FormValues = DefaultFormValues>(props: Props<InputComponentProps, FormValues>) => JSX.Element;
  @JSImport("react-phone-number-input/react-hook-form-input-core", JSImport.Default)
  @js.native
  val default: PhoneInputComponentType[DefaultInputComponentProps, DefaultFormValues] = js.native
  
  type PhoneInputComponentType[InputComponentProps, FormValues] = js.Function1[/* props */ Props[InputComponentProps, FormValues], Element]
  
  type Props[InputComponentProps, FormValues] = (typings.reactPhoneNumberInput.reactHookFormInputMod.Props[InputComponentProps, FormValues]) & Metadata
  
  type _To = PhoneInputComponentType[DefaultInputComponentProps, DefaultFormValues]
  
  /* This means you don't have to write `default`, but can instead just say `reactHookFormInputCoreMod.foo` */
  override def _to: PhoneInputComponentType[DefaultInputComponentProps, DefaultFormValues] = default
}
