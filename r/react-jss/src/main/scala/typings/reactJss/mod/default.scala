package typings.reactJss.mod

import typings.jss.mod.Styles
import typings.react.mod.ComponentType
import typings.reactJss.anon.Classes
import typings.reactJss.anon.ClassesPartial
import typings.reactJss.reactJssStrings.classes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[ClassNames /* <: String | Double | js.Symbol */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */](styles: S): js.Function1[
    /* comp */ ComponentType[Classes[S, ClassNames]], 
    ComponentType[
      (Omit[Classes[S, ClassNames], classes]) with (ClassesPartial[Classes[S, ClassNames], S, ClassNames])
    ]
  ] = js.native
  def apply[ClassNames /* <: String | Double | js.Symbol */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */](styles: S, options: WithStylesOptions): js.Function1[
    /* comp */ ComponentType[Classes[S, ClassNames]], 
    ComponentType[
      (Omit[Classes[S, ClassNames], classes]) with (ClassesPartial[Classes[S, ClassNames], S, ClassNames])
    ]
  ] = js.native
}

