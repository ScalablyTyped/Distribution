package typings.rcTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowTitle extends js.Object {
  var showTitle: js.UndefOr[Boolean] = js.undefined
}

object ShowTitle {
  @scala.inline
  def apply(showTitle: js.UndefOr[Boolean] = js.undefined): ShowTitle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowTitle]
  }
}

