package typings.rcTreeSelect.interfaceMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacyDataNode extends DataNode {
  var props: js.Any
}

object LegacyDataNode {
  @scala.inline
  def apply(
    props: js.Any,
    checkable: js.UndefOr[Boolean] = js.undefined,
    children: js.Array[DataNode] = null,
    disableCheckbox: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    label: ReactNode = null,
    title: ReactNode = null,
    value: RawValueType = null
  ): LegacyDataNode = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    if (!js.isUndefined(checkable)) __obj.updateDynamic("checkable")(checkable.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCheckbox)) __obj.updateDynamic("disableCheckbox")(disableCheckbox.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacyDataNode]
  }
}

