package typings.reactSketchapp

import typings.reactSketchapp.typesMod.SketchContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClearExistingStyles extends js.Object {
  var clearExistingStyles: js.UndefOr[Boolean] = js.undefined
  var context: SketchContext
}

object AnonClearExistingStyles {
  @scala.inline
  def apply(context: SketchContext, clearExistingStyles: js.UndefOr[Boolean] = js.undefined): AnonClearExistingStyles = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    if (!js.isUndefined(clearExistingStyles)) __obj.updateDynamic("clearExistingStyles")(clearExistingStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClearExistingStyles]
  }
}

