package typings.reactPhoneNumberInput

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.global.JSX.Element
import typings.reactPhoneNumberInput.anon.OnChangeText
import typings.reactPhoneNumberInput.anon.`0`
import typings.reactPhoneNumberInput.inputMod.PropsWithoutSmartCaret
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.onChangeText
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.value
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeInputMod extends Shortcut {
  
  @JSImport("react-phone-number-input/react-native-input", JSImport.Default)
  @js.native
  val default: PhoneInputComponentType[DefaultInputComponentProps] = js.native
  
  // In an HTML DOM environment, there's
  // `React.InputHTMLAttributes<HTMLInputElement>` type available.
  // In a React Native environment, there seems to be no such equivalent.
  // Hence, using a `[anyProperty: string]: any` workaround
  // for supporting any "other" properties that get passed through
  // to the input component.
  type DefaultInputComponentProps = StringDictionary[Any]
  
  type PhoneInputComponentType[InputComponentProps] = js.Function1[/* props */ Props[InputComponentProps], Element]
  
  type Props[InputComponentProps] = PropsWithoutSmartCaret[UnderlyingInputComponentProps[InputComponentProps]] & `0`
  
  // The default React.Native input component accepts properties:
  // * `value: string`
  // * `onChangeText(value: string): void`
  // * Any other React.Native-specific input component properties
  type UnderlyingInputComponentProps[OriginalUnderlyingInputComponentProps] = (Omit[OriginalUnderlyingInputComponentProps, value | onChangeText]) & OnChangeText
  
  type _To = PhoneInputComponentType[DefaultInputComponentProps]
  
  /* This means you don't have to write `default`, but can instead just say `reactNativeInputMod.foo` */
  override def _to: PhoneInputComponentType[DefaultInputComponentProps] = default
}
