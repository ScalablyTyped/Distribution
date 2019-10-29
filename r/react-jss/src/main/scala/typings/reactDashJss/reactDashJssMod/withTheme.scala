package typings.reactDashJss.reactDashJssMod

import typings.react.reactMod.ComponentType
import typings.reactDashJss.reactDashJssStrings.theme
import typings.std.Exclude
import typings.std.Pick
import typings.theming.Anon_Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss", "withTheme")
@js.native
object withTheme extends js.Object {
  def apply[P](component: ComponentType[P with Anon_Theme]): ComponentType[Pick[P, Exclude[String, theme]]] = js.native
}

