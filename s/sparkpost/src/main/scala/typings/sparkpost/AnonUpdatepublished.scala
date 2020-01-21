package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUpdatepublished extends js.Object {
  var update_published: js.UndefOr[Boolean] = js.undefined
}

object AnonUpdatepublished {
  @scala.inline
  def apply(update_published: js.UndefOr[Boolean] = js.undefined): AnonUpdatepublished = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(update_published)) __obj.updateDynamic("update_published")(update_published.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUpdatepublished]
  }
}

