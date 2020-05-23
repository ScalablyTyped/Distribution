package typings.reactSketchapp.anon

import typings.reactSketchapp.typesMod.SketchContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearExistingStyles extends js.Object {
  var clearExistingStyles: js.UndefOr[Boolean] = js.undefined
  var context: SketchContext
}

object ClearExistingStyles {
  @scala.inline
  def apply(context: SketchContext, clearExistingStyles: js.UndefOr[Boolean] = js.undefined): ClearExistingStyles = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    if (!js.isUndefined(clearExistingStyles)) __obj.updateDynamic("clearExistingStyles")(clearExistingStyles.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearExistingStyles]
  }
}

