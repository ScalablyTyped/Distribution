package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Draft extends js.Object {
  var draft: js.UndefOr[Boolean] = js.undefined
}

object Draft {
  @scala.inline
  def apply(draft: js.UndefOr[Boolean] = js.undefined): Draft = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(draft)) __obj.updateDynamic("draft")(draft.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Draft]
  }
}

