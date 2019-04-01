package typings
package primereactLib.componentsOrganizationchartOrganizationChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationChartNodeData extends js.Object {
  var children: js.UndefOr[js.Array[OrganizationChartNodeData]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
}

object OrganizationChartNodeData {
  @scala.inline
  def apply(
    children: js.Array[OrganizationChartNodeData] = null,
    className: java.lang.String = null,
    expanded: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined
  ): OrganizationChartNodeData = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    __obj.asInstanceOf[OrganizationChartNodeData]
  }
}

