package typings.rcTreeSelect.interfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataNode
  extends /** Customize data info */
/* prop */ StringDictionary[js.Any] {
  var checkable: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[js.Array[DataNode]] = js.undefined
  var disableCheckbox: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  var value: js.UndefOr[RawValueType] = js.undefined
}

object DataNode {
  @scala.inline
  def apply(
    StringDictionary: /** Customize data info */
  /* prop */ StringDictionary[js.Any] = null,
    checkable: js.UndefOr[Boolean] = js.undefined,
    children: js.Array[DataNode] = null,
    disableCheckbox: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    label: ReactNode = null,
    title: ReactNode = null,
    value: RawValueType = null
  ): DataNode = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(checkable)) __obj.updateDynamic("checkable")(checkable.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCheckbox)) __obj.updateDynamic("disableCheckbox")(disableCheckbox.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataNode]
  }
}

