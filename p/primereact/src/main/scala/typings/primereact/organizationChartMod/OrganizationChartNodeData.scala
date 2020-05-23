package typings.primereact.organizationChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationChartNodeData extends js.Object {
  var children: js.UndefOr[js.Array[OrganizationChartNodeData]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var expanded: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
}

object OrganizationChartNodeData {
  @scala.inline
  def apply(
    children: js.Array[OrganizationChartNodeData] = null,
    className: String = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    selectable: js.UndefOr[Boolean] = js.undefined
  ): OrganizationChartNodeData = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationChartNodeData]
  }
}

