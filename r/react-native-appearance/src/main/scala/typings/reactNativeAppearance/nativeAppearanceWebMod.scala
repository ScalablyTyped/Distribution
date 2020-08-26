package typings.reactNativeAppearance

import typings.react.mod.global.JSX.Element
import typings.reactNativeAppearance.appearanceTypesMod.AppearancePreferences
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-appearance/lib/typescript/NativeAppearance.web", JSImport.Namespace)
@js.native
object nativeAppearanceWebMod extends js.Object {
  def NativeAppearanceProvider(props: js.Any): Element = js.native
  @js.native
  object NativeAppearance extends js.Object {
    val initialPreferences: AppearancePreferences = js.native
    val name: String = js.native
  }
  
}

