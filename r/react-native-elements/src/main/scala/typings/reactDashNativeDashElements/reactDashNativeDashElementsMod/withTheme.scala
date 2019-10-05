package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-elements", "withTheme")
@js.native
object withTheme extends js.Object {
  def apply[P, T](component: ComponentType[P with ThemeProps[T]]): ComponentClass[P, ComponentState] = js.native
}

