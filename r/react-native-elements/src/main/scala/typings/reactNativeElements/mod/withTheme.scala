package typings.reactNativeElements.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactNativeElements.reactNativeElementsStrings.replaceTheme
import typings.reactNativeElements.reactNativeElementsStrings.theme
import typings.reactNativeElements.reactNativeElementsStrings.updateTheme
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-elements", "withTheme")
@js.native
object withTheme extends js.Object {
  
  def apply[P, T](component: ComponentType[P with ThemeProps[T]]): ComponentClass[
    Omit[
      P, 
      /* keyof react-native-elements.react-native-elements.ThemeProps<T> */ theme | updateTheme | replaceTheme
    ], 
    ComponentState
  ] = js.native
  def apply[P, T](component: ComponentType[P with ThemeProps[T]], themeKey: String): ComponentClass[
    Omit[
      P, 
      /* keyof react-native-elements.react-native-elements.ThemeProps<T> */ theme | updateTheme | replaceTheme
    ], 
    ComponentState
  ] = js.native
}
