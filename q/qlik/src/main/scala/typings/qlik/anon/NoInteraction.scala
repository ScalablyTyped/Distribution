package typings.qlik.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoInteraction extends js.Object {
  var noInteraction: js.UndefOr[Boolean] = js.undefined
  var noSelections: js.UndefOr[Boolean] = js.undefined
}

object NoInteraction {
  @scala.inline
  def apply(
    noInteraction: js.UndefOr[Boolean] = js.undefined,
    noSelections: js.UndefOr[Boolean] = js.undefined
  ): NoInteraction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noInteraction)) __obj.updateDynamic("noInteraction")(noInteraction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noSelections)) __obj.updateDynamic("noSelections")(noSelections.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoInteraction]
  }
}

