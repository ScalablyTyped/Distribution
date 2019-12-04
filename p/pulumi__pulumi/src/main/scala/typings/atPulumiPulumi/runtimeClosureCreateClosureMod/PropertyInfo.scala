package typings.atPulumiPulumi.runtimeClosureCreateClosureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyInfo extends js.Object {
  var configurable: js.UndefOr[Boolean] = js.undefined
  var enumerable: js.UndefOr[Boolean] = js.undefined
  var get: js.UndefOr[Entry] = js.undefined
  var hasValue: Boolean
  var set: js.UndefOr[Entry] = js.undefined
  var writable: js.UndefOr[Boolean] = js.undefined
}

object PropertyInfo {
  @scala.inline
  def apply(
    hasValue: Boolean,
    configurable: js.UndefOr[Boolean] = js.undefined,
    enumerable: js.UndefOr[Boolean] = js.undefined,
    get: Entry = null,
    set: Entry = null,
    writable: js.UndefOr[Boolean] = js.undefined
  ): PropertyInfo = {
    val __obj = js.Dynamic.literal(hasValue = hasValue.asInstanceOf[js.Any])
    if (!js.isUndefined(configurable)) __obj.updateDynamic("configurable")(configurable.asInstanceOf[js.Any])
    if (!js.isUndefined(enumerable)) __obj.updateDynamic("enumerable")(enumerable.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(get.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyInfo]
  }
}

