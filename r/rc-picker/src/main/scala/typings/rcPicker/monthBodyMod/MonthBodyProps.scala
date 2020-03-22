package typings.rcPicker.monthBodyMod

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonthBodyProps[DateType] extends js.Object {
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
  var generateConfig: GenerateConfig[DateType]
  var locale: Locale
  var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.undefined
  var prefixCls: String
  var value: js.UndefOr[DateType | Null] = js.undefined
  var viewDate: DateType
  def onSelect(value: DateType): Unit
}

object MonthBodyProps {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    onSelect: DateType => Unit,
    prefixCls: String,
    viewDate: DateType,
    disabledDate: /* date */ DateType => Boolean = null,
    monthCellRender: (DateType, /* locale */ Locale) => ReactNode = null,
    value: DateType = null
  ): MonthBodyProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (monthCellRender != null) __obj.updateDynamic("monthCellRender")(js.Any.fromFunction2(monthCellRender))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthBodyProps[DateType]]
  }
}

