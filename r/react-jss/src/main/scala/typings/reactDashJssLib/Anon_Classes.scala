package typings
package reactDashJssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Classes[S /* <: java.lang.String | (reactDashJssLib.libInjectSheetMod.Styles[java.lang.String, js.Object]) | (reactDashJssLib.libInjectSheetMod.StyleCreator[java.lang.String, _, js.Object]) */] extends js.Object {
  var classes: reactDashJssLib.libInjectSheetMod.ClassNameMap[S]
}

object Anon_Classes {
  @scala.inline
  def apply[S /* <: java.lang.String | (reactDashJssLib.libInjectSheetMod.Styles[java.lang.String, js.Object]) | (reactDashJssLib.libInjectSheetMod.StyleCreator[java.lang.String, _, js.Object]) */](classes: reactDashJssLib.libInjectSheetMod.ClassNameMap[S]): Anon_Classes[S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("classes")(classes)
    __obj.asInstanceOf[Anon_Classes[S]]
  }
}

