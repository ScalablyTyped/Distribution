package typings.rcPicker.timeUnitColumnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeUnitColumnProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var hideDisabledOptions: js.UndefOr[Boolean] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* value */ Double, scala.Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var units: js.UndefOr[js.Array[Unit]] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object TimeUnitColumnProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    hideDisabledOptions: js.UndefOr[Boolean] = js.undefined,
    onSelect: /* value */ Double => scala.Unit = null,
    prefixCls: String = null,
    units: js.Array[Unit] = null,
    value: Int | Double = null
  ): TimeUnitColumnProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDisabledOptions)) __obj.updateDynamic("hideDisabledOptions")(hideDisabledOptions.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeUnitColumnProps]
  }
}

