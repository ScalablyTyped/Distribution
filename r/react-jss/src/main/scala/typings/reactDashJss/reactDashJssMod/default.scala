package typings.reactDashJss.reactDashJssMod

import typings.jss.jssMod.Styles
import typings.react.reactMod.ComponentType
import typings.reactDashJss.Anon_Classes
import typings.reactDashJss.Anon_ClassesPartial
import typings.reactDashJss.reactDashJssStrings.classes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[ClassNames /* <: String | Double | js.Symbol */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */](styles: S): js.Function1[
    /* comp */ ComponentType[Anon_Classes[S, ClassNames]], 
    ComponentType[
      (Omit[Anon_Classes[S, ClassNames], classes]) with (Anon_ClassesPartial[Anon_Classes[S, ClassNames]])
    ]
  ] = js.native
  def apply[ClassNames /* <: String | Double | js.Symbol */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */](styles: S, options: WithStylesOptions): js.Function1[
    /* comp */ ComponentType[Anon_Classes[S, ClassNames]], 
    ComponentType[
      (Omit[Anon_Classes[S, ClassNames], classes]) with (Anon_ClassesPartial[Anon_Classes[S, ClassNames]])
    ]
  ] = js.native
}

