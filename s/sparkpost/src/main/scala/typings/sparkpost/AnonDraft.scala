package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDraft extends js.Object {
  var draft: js.UndefOr[Boolean] = js.undefined
}

object AnonDraft {
  @scala.inline
  def apply(draft: js.UndefOr[Boolean] = js.undefined): AnonDraft = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(draft)) __obj.updateDynamic("draft")(draft.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDraft]
  }
}

