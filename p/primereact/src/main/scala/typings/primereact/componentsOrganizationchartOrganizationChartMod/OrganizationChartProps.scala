package typings.primereact.componentsOrganizationchartOrganizationChartMod

import typings.primereact.Anon_Node
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationChartProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var nodeTemplate: js.UndefOr[js.Function1[/* node */ OrganizationChartNodeData, ReactNode]] = js.undefined
  var onNodeSelect: js.UndefOr[js.Function1[/* e */ Anon_Node, Unit]] = js.undefined
  var onNodeUnselect: js.UndefOr[js.Function1[/* e */ Anon_Node, Unit]] = js.undefined
  var selection: js.UndefOr[js.Any] = js.undefined
  var selectionChange: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
  var selectionMode: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var value: js.UndefOr[js.Array[OrganizationChartNodeData]] = js.undefined
}

object OrganizationChartProps {
  @scala.inline
  def apply(
    className: String = null,
    id: String = null,
    nodeTemplate: /* node */ OrganizationChartNodeData => ReactNode = null,
    onNodeSelect: /* e */ Anon_Node => Unit = null,
    onNodeUnselect: /* e */ Anon_Node => Unit = null,
    selection: js.Any = null,
    selectionChange: /* data */ js.Any => Unit = null,
    selectionMode: String = null,
    style: js.Object = null,
    value: js.Array[OrganizationChartNodeData] = null
  ): OrganizationChartProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (nodeTemplate != null) __obj.updateDynamic("nodeTemplate")(js.Any.fromFunction1(nodeTemplate))
    if (onNodeSelect != null) __obj.updateDynamic("onNodeSelect")(js.Any.fromFunction1(onNodeSelect))
    if (onNodeUnselect != null) __obj.updateDynamic("onNodeUnselect")(js.Any.fromFunction1(onNodeUnselect))
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionChange != null) __obj.updateDynamic("selectionChange")(js.Any.fromFunction1(selectionChange))
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationChartProps]
  }
}

