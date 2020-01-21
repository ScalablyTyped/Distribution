package typings.qlik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNoInteraction extends js.Object {
  var noInteraction: js.UndefOr[Boolean] = js.undefined
  var noSelections: js.UndefOr[Boolean] = js.undefined
}

object AnonNoInteraction {
  @scala.inline
  def apply(
    noInteraction: js.UndefOr[Boolean] = js.undefined,
    noSelections: js.UndefOr[Boolean] = js.undefined
  ): AnonNoInteraction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noInteraction)) __obj.updateDynamic("noInteraction")(noInteraction.asInstanceOf[js.Any])
    if (!js.isUndefined(noSelections)) __obj.updateDynamic("noSelections")(noSelections.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNoInteraction]
  }
}

