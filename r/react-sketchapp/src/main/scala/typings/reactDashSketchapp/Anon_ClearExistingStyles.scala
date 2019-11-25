package typings.reactDashSketchapp

import typings.reactDashSketchapp.typesMod.SketchContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClearExistingStyles extends js.Object {
  var clearExistingStyles: js.UndefOr[Boolean] = js.undefined
  var context: SketchContext
}

object Anon_ClearExistingStyles {
  @scala.inline
  def apply(context: SketchContext, clearExistingStyles: js.UndefOr[Boolean] = js.undefined): Anon_ClearExistingStyles = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    if (!js.isUndefined(clearExistingStyles)) __obj.updateDynamic("clearExistingStyles")(clearExistingStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClearExistingStyles]
  }
}

