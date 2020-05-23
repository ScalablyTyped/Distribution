package typings.reactJss.anon

import typings.jss.mod.Styles
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassesPartial[Props /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  classes  :S extends (theme : any): jss.jss.Styles<ClassNames> ? jss.jss.Classes<keyof std.ReturnType<S>> : jss.jss.Classes<ClassNames>} */ js.Any */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */, ClassNames /* <: String | Double | js.Symbol */] extends js.Object {
  var classes: js.UndefOr[
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: Props['classes'] */ js.Any
    ]
  ] = js.undefined
}

object ClassesPartial {
  @scala.inline
  def apply[Props, S, ClassNames](
    classes: Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: Props['classes'] */ js.Any
    ] = null
  ): ClassesPartial[Props, S, ClassNames] = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassesPartial[Props, S, ClassNames]]
  }
}

