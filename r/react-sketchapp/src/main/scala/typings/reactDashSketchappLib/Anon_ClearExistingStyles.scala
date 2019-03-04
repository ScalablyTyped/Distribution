package typings
package reactDashSketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClearExistingStyles extends js.Object {
  var clearExistingStyles: js.UndefOr[scala.Boolean] = js.undefined
  var context: reactDashSketchappLib.reactDashSketchappMod.SketchContext
}

object Anon_ClearExistingStyles {
  @scala.inline
  def apply(
    context: reactDashSketchappLib.reactDashSketchappMod.SketchContext,
    clearExistingStyles: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ClearExistingStyles = {
    val __obj = js.Dynamic.literal(context = context)
    if (!js.isUndefined(clearExistingStyles)) __obj.updateDynamic("clearExistingStyles")(clearExistingStyles)
    __obj.asInstanceOf[Anon_ClearExistingStyles]
  }
}

