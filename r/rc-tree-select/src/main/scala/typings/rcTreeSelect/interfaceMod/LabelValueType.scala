package typings.rcTreeSelect.interfaceMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelValueType extends js.Object {
  /** Only works on `treeCheckStrictly` */
  var halfChecked: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var value: js.UndefOr[RawValueType] = js.undefined
}

object LabelValueType {
  @scala.inline
  def apply(
    halfChecked: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    label: ReactNode = null,
    value: RawValueType = null
  ): LabelValueType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(halfChecked)) __obj.updateDynamic("halfChecked")(halfChecked.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelValueType]
  }
}

