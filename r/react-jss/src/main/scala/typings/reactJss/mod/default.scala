package typings.reactJss.mod

import typings.jss.mod.Styles
import typings.react.mod.ComponentType
import typings.reactJss.AnonClasses
import typings.reactJss.AnonClassesPartial
import typings.reactJss.reactJssStrings.classes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[ClassNames /* <: String | Double | js.Symbol */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */](styles: S): js.Function1[
    /* comp */ ComponentType[AnonClasses[S, ClassNames]], 
    ComponentType[
      (Omit[AnonClasses[S, ClassNames], classes]) with (AnonClassesPartial[AnonClasses[S, ClassNames]])
    ]
  ] = js.native
  def apply[ClassNames /* <: String | Double | js.Symbol */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */](styles: S, options: WithStylesOptions): js.Function1[
    /* comp */ ComponentType[AnonClasses[S, ClassNames]], 
    ComponentType[
      (Omit[AnonClasses[S, ClassNames], classes]) with (AnonClassesPartial[AnonClasses[S, ClassNames]])
    ]
  ] = js.native
}

