package typings.reactDashJss.reactDashJssMod

import typings.jss.jssMod.GenerateClassName
import typings.jss.jssMod.JSS
import typings.react.reactMod.ComponentType
import typings.reactDashJss.libInjectSheetMod.InjectOptions
import typings.reactDashJss.libInjectSheetMod.PropInjector
import typings.reactDashJss.libInjectSheetMod.StyleCreator
import typings.reactDashJss.libInjectSheetMod.StyledComponentProps
import typings.reactDashJss.libInjectSheetMod.Styles
import typings.reactDashJss.libInjectSheetMod.WithSheet
import typings.reactDashJss.reactDashJssStrings.theme
import typings.std.Exclude
import typings.std.Pick
import typings.theming.Anon_Theme
import typings.theming.themingMod.Theming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val jss: JSS = js.native
  def createGenerateClassName(): GenerateClassName[_] = js.native
  def createTheming[C /* <: String */](): Theming[C] = js.native
  def createTheming[C /* <: String */](customChannel: C): Theming[C] = js.native
  def default[C /* <: String */, T /* <: js.Object */, Props](stylesOrCreator: StyleCreator[C, T, Props]): PropInjector[WithSheet[C, T, Props], StyledComponentProps[C]] = js.native
  def default[C /* <: String */, T /* <: js.Object */, Props](stylesOrCreator: StyleCreator[C, T, Props], options: InjectOptions): PropInjector[WithSheet[C, T, Props], StyledComponentProps[C]] = js.native
  def default[C /* <: String */, T /* <: js.Object */, Props](stylesOrCreator: Styles[C, Props]): PropInjector[WithSheet[C, T, Props], StyledComponentProps[C]] = js.native
  def default[C /* <: String */, T /* <: js.Object */, Props](stylesOrCreator: Styles[C, Props], options: InjectOptions): PropInjector[WithSheet[C, T, Props], StyledComponentProps[C]] = js.native
  def withTheme[P](component: ComponentType[P with Anon_Theme]): ComponentType[Pick[P, Exclude[String, theme]]] = js.native
}

