package typings.rcTreeSelect.interfaceMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventExtra extends js.Object {
  /** @deprecated This prop not work as react node anymore. */
  var allCheckedNodes: js.Array[LegacyCheckedNode]
  /** @deprecated Use `onSelect` or `onDeselect` instead. */
  var checked: js.UndefOr[Boolean] = js.undefined
  /** @deprecated Please save prev value by control logic instead */
  var preValue: js.Array[LabelValueType]
  /** @deprecated Use `onSelect` or `onDeselect` instead. */
  var selected: js.UndefOr[Boolean] = js.undefined
  /** @deprecated This prop not work as react node anymore. */
  var triggerNode: ReactElement
  var triggerValue: RawValueType
}

object ChangeEventExtra {
  @scala.inline
  def apply(
    allCheckedNodes: js.Array[LegacyCheckedNode],
    preValue: js.Array[LabelValueType],
    triggerNode: ReactElement,
    triggerValue: RawValueType,
    checked: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined
  ): ChangeEventExtra = {
    val __obj = js.Dynamic.literal(allCheckedNodes = allCheckedNodes.asInstanceOf[js.Any], preValue = preValue.asInstanceOf[js.Any], triggerNode = triggerNode.asInstanceOf[js.Any], triggerValue = triggerValue.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventExtra]
  }
}

