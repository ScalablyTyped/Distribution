package typings.primereact.organizationChartMod

import typings.primereact.anon.Node
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationChartProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var nodeTemplate: js.UndefOr[js.Function1[/* node */ OrganizationChartNodeData, ReactNode]] = js.native
  var onNodeSelect: js.UndefOr[js.Function1[/* e */ Node, Unit]] = js.native
  var onNodeUnselect: js.UndefOr[js.Function1[/* e */ Node, Unit]] = js.native
  var selection: js.UndefOr[js.Any] = js.native
  var selectionChange: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  var selectionMode: js.UndefOr[String] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var value: js.UndefOr[js.Array[OrganizationChartNodeData]] = js.native
}

object OrganizationChartProps {
  @scala.inline
  def apply(): OrganizationChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationChartProps]
  }
  @scala.inline
  implicit class OrganizationChartPropsOps[Self <: OrganizationChartProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setNodeTemplate(value: /* node */ OrganizationChartNodeData => ReactNode): Self = this.set("nodeTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNodeTemplate: Self = this.set("nodeTemplate", js.undefined)
    @scala.inline
    def setOnNodeSelect(value: /* e */ Node => Unit): Self = this.set("onNodeSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNodeSelect: Self = this.set("onNodeSelect", js.undefined)
    @scala.inline
    def setOnNodeUnselect(value: /* e */ Node => Unit): Self = this.set("onNodeUnselect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNodeUnselect: Self = this.set("onNodeUnselect", js.undefined)
    @scala.inline
    def setSelection(value: js.Any): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    @scala.inline
    def setSelectionChange(value: /* data */ js.Any => Unit): Self = this.set("selectionChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelectionChange: Self = this.set("selectionChange", js.undefined)
    @scala.inline
    def setSelectionMode(value: String): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setValueVarargs(value: OrganizationChartNodeData*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[OrganizationChartNodeData]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

