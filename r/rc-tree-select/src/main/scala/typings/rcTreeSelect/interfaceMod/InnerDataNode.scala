package typings.rcTreeSelect.interfaceMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InnerDataNode extends DataNode {
  @JSName("children")
  var children_InnerDataNode: js.UndefOr[js.Array[InnerDataNode]] = js.undefined
  @JSName("key")
  var key_InnerDataNode: Key
  @JSName("value")
  var value_InnerDataNode: RawValueType
}

object InnerDataNode {
  @scala.inline
  def apply(
    key: Key,
    value: RawValueType,
    checkable: js.UndefOr[Boolean] = js.undefined,
    children: js.Array[InnerDataNode] = null,
    disableCheckbox: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    label: ReactNode = null,
    title: ReactNode = null
  ): InnerDataNode = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(checkable)) __obj.updateDynamic("checkable")(checkable.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCheckbox)) __obj.updateDynamic("disableCheckbox")(disableCheckbox.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerDataNode]
  }
}

