package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyDescriptor extends js.Object {
  var configurable: js.UndefOr[scala.Boolean] = js.undefined
  var enumerable: js.UndefOr[scala.Boolean] = js.undefined
  var get: js.UndefOr[js.Function0[_]] = js.undefined
  var set: js.UndefOr[js.Function1[/* v */ js.Any, Unit]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var writable: js.UndefOr[scala.Boolean] = js.undefined
}

object PropertyDescriptor {
  @scala.inline
  def apply(
    configurable: js.UndefOr[scala.Boolean] = js.undefined,
    enumerable: js.UndefOr[scala.Boolean] = js.undefined,
    get: () => _ = null,
    set: /* v */ js.Any => Unit = null,
    value: js.Any = null,
    writable: js.UndefOr[scala.Boolean] = js.undefined
  ): PropertyDescriptor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(configurable)) __obj.updateDynamic("configurable")(configurable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enumerable)) __obj.updateDynamic("enumerable")(enumerable.get.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction0(get))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction1(set))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyDescriptor]
  }
}

