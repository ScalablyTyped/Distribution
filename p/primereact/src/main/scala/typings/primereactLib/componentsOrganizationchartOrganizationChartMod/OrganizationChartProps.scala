package typings
package primereactLib.componentsOrganizationchartOrganizationChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationChartProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var nodeTemplate: js.UndefOr[
    js.Function1[/* node */ OrganizationChartNodeData, reactLib.reactMod.ReactNs.ReactNode]
  ] = js.undefined
  var onNodeSelect: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Node, scala.Unit]] = js.undefined
  var onNodeUnselect: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Node, scala.Unit]] = js.undefined
  var selection: js.UndefOr[js.Any] = js.undefined
  var selectionChange: js.UndefOr[js.Function1[/* data */ js.Any, scala.Unit]] = js.undefined
  var selectionMode: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var value: js.UndefOr[js.Array[OrganizationChartNodeData]] = js.undefined
}

object OrganizationChartProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    id: java.lang.String = null,
    nodeTemplate: /* node */ OrganizationChartNodeData => reactLib.reactMod.ReactNs.ReactNode = null,
    onNodeSelect: /* e */ primereactLib.Anon_Node => scala.Unit = null,
    onNodeUnselect: /* e */ primereactLib.Anon_Node => scala.Unit = null,
    selection: js.Any = null,
    selectionChange: /* data */ js.Any => scala.Unit = null,
    selectionMode: java.lang.String = null,
    style: js.Object = null,
    value: js.Array[OrganizationChartNodeData] = null
  ): OrganizationChartProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (nodeTemplate != null) __obj.updateDynamic("nodeTemplate")(js.Any.fromFunction1(nodeTemplate))
    if (onNodeSelect != null) __obj.updateDynamic("onNodeSelect")(js.Any.fromFunction1(onNodeSelect))
    if (onNodeUnselect != null) __obj.updateDynamic("onNodeUnselect")(js.Any.fromFunction1(onNodeUnselect))
    if (selection != null) __obj.updateDynamic("selection")(selection)
    if (selectionChange != null) __obj.updateDynamic("selectionChange")(js.Any.fromFunction1(selectionChange))
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OrganizationChartProps]
  }
}

