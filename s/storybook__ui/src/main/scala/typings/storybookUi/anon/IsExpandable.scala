package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsExpandable extends js.Object {
  var isExpandable: js.UndefOr[Boolean] = js.undefined
  var isExpanded: js.UndefOr[Boolean] = js.undefined
}

object IsExpandable {
  @scala.inline
  def apply(isExpandable: js.UndefOr[Boolean] = js.undefined, isExpanded: js.UndefOr[Boolean] = js.undefined): IsExpandable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isExpandable)) __obj.updateDynamic("isExpandable")(isExpandable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsExpandable]
  }
}

