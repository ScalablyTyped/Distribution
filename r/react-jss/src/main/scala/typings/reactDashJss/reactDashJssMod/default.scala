package typings.reactDashJss.reactDashJssMod

import typings.jss.jssMod.Styles
import typings.react.reactMod.ComponentType
import typings.reactDashJss.Anon_Classes
import typings.reactDashJss.Omit
import typings.reactDashJss.reactDashJssStrings.classes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[S /* <: Styles[String] | ThemedStyles[_] */](styles: S): js.Function1[
    /* comp */ ComponentType[WithStyles[S]], 
    ComponentType[(Omit[WithStyles[S], classes]) with Anon_Classes[WithStyles[S]]]
  ] = js.native
  def apply[S /* <: Styles[String] | ThemedStyles[_] */](styles: S, options: WithStylesOptions): js.Function1[
    /* comp */ ComponentType[WithStyles[S]], 
    ComponentType[(Omit[WithStyles[S], classes]) with Anon_Classes[WithStyles[S]]]
  ] = js.native
}

