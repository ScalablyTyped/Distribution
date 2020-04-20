package typings.reactJss

import typings.jss.mod.Styles
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassesPartial[Props /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  classes  :S extends (theme : any): jss.jss.Styles<ClassNames> ? jss.jss.Classes<keyof std.ReturnType<S>> : jss.jss.Classes<ClassNames>} */ js.Any */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */, ClassNames /* <: String | Double | js.Symbol */] extends js.Object {
  var classes: js.UndefOr[
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: Props['classes'] */ js.Any
    ]
  ] = js.undefined
}

object AnonClassesPartial {
  @scala.inline
  def apply[Props /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  classes  :S extends (theme : any): jss.jss.Styles<ClassNames> ? jss.jss.Classes<keyof std.ReturnType<S>> : jss.jss.Classes<ClassNames>} */ js.Any */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */, ClassNames /* <: String | Double | js.Symbol */](
    classes: Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: Props['classes'] */ js.Any
    ] = null
  ): AnonClassesPartial[Props, S, ClassNames] = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassesPartial[Props, S, ClassNames]]
  }
}

