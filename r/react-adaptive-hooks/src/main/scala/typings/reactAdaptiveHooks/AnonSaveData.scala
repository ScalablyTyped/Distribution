package typings.reactAdaptiveHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSaveData extends js.Object {
  var saveData: Boolean | Null
  var unsupported: Boolean
}

object AnonSaveData {
  @scala.inline
  def apply(unsupported: Boolean, saveData: js.UndefOr[Boolean] = js.undefined): AnonSaveData = {
    val __obj = js.Dynamic.literal(unsupported = unsupported.asInstanceOf[js.Any])
    if (!js.isUndefined(saveData)) __obj.updateDynamic("saveData")(saveData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSaveData]
  }
}

