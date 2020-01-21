package typings.storybookClientApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHierarchyRootSeparatorHierarchySeparator extends js.Object {
  var hierarchyRootSeparator: js.UndefOr[scala.Nothing] = js.undefined
  var hierarchySeparator: String
}

object AnonHierarchyRootSeparatorHierarchySeparator {
  @scala.inline
  def apply(hierarchySeparator: String, hierarchyRootSeparator: js.UndefOr[scala.Nothing] = js.undefined): AnonHierarchyRootSeparatorHierarchySeparator = {
    val __obj = js.Dynamic.literal(hierarchySeparator = hierarchySeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(hierarchyRootSeparator)) __obj.updateDynamic("hierarchyRootSeparator")(hierarchyRootSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHierarchyRootSeparatorHierarchySeparator]
  }
}

