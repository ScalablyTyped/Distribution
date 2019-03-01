package typings
package qlikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NoInteraction extends js.Object {
  var noInteraction: js.UndefOr[scala.Boolean] = js.undefined
  var noSelections: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_NoInteraction {
  @scala.inline
  def apply(
    noInteraction: js.UndefOr[scala.Boolean] = js.undefined,
    noSelections: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_NoInteraction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noInteraction)) __obj.updateDynamic("noInteraction")(noInteraction)
    if (!js.isUndefined(noSelections)) __obj.updateDynamic("noSelections")(noSelections)
    __obj.asInstanceOf[Anon_NoInteraction]
  }
}

