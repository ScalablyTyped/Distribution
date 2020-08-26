package typings.rcTreeSelect.interfaceMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEventExtra extends js.Object {
  /** @deprecated This prop not work as react node anymore. */
  var allCheckedNodes: js.Array[LegacyCheckedNode] = js.native
  /** @deprecated Use `onSelect` or `onDeselect` instead. */
  var checked: js.UndefOr[Boolean] = js.native
  /** @deprecated Please save prev value by control logic instead */
  var preValue: js.Array[LabelValueType] = js.native
  /** @deprecated Use `onSelect` or `onDeselect` instead. */
  var selected: js.UndefOr[Boolean] = js.native
  /** @deprecated This prop not work as react node anymore. */
  var triggerNode: ReactElement = js.native
  var triggerValue: RawValueType = js.native
}

object ChangeEventExtra {
  @scala.inline
  def apply(
    allCheckedNodes: js.Array[LegacyCheckedNode],
    preValue: js.Array[LabelValueType],
    triggerNode: ReactElement,
    triggerValue: RawValueType
  ): ChangeEventExtra = {
    val __obj = js.Dynamic.literal(allCheckedNodes = allCheckedNodes.asInstanceOf[js.Any], preValue = preValue.asInstanceOf[js.Any], triggerNode = triggerNode.asInstanceOf[js.Any], triggerValue = triggerValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventExtra]
  }
  @scala.inline
  implicit class ChangeEventExtraOps[Self <: ChangeEventExtra] (val x: Self) extends AnyVal {
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
    def setAllCheckedNodesVarargs(value: LegacyCheckedNode*): Self = this.set("allCheckedNodes", js.Array(value :_*))
    @scala.inline
    def setAllCheckedNodes(value: js.Array[LegacyCheckedNode]): Self = this.set("allCheckedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreValueVarargs(value: LabelValueType*): Self = this.set("preValue", js.Array(value :_*))
    @scala.inline
    def setPreValue(value: js.Array[LabelValueType]): Self = this.set("preValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerNode(value: ReactElement): Self = this.set("triggerNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerValue(value: RawValueType): Self = this.set("triggerValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
  
}

