package typings.reactInstantsearchCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentRefinement extends js.Object {
  var currentRefinement: String
  var items: js.UndefOr[scala.Nothing] = js.undefined
}

object AnonCurrentRefinement {
  @scala.inline
  def apply(currentRefinement: String, items: js.UndefOr[scala.Nothing] = js.undefined): AnonCurrentRefinement = {
    val __obj = js.Dynamic.literal(currentRefinement = currentRefinement.asInstanceOf[js.Any])
    if (!js.isUndefined(items)) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrentRefinement]
  }
}

