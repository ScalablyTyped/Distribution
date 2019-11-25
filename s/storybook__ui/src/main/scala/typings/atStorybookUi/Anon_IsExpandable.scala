package typings.atStorybookUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsExpandable extends js.Object {
  var isExpandable: js.UndefOr[Boolean] = js.undefined
  var isExpanded: js.UndefOr[Boolean] = js.undefined
}

object Anon_IsExpandable {
  @scala.inline
  def apply(isExpandable: js.UndefOr[Boolean] = js.undefined, isExpanded: js.UndefOr[Boolean] = js.undefined): Anon_IsExpandable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isExpandable)) __obj.updateDynamic("isExpandable")(isExpandable.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IsExpandable]
  }
}

