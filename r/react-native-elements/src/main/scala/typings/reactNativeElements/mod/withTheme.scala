package typings.reactNativeElements.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-elements", "withTheme")
@js.native
object withTheme extends js.Object {
  def apply[P, T](component: ComponentType[P with ThemeProps[T]]): ComponentClass[Omit[P, String], ComponentState] = js.native
}

