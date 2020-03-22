package typings.rcPicker.dateBodyMod

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import typings.rcPicker.interfaceMod.OnSelect
import typings.rcPicker.rcPickerStrings.key
import typings.rcPicker.rcPickerStrings.mouse
import typings.rcPicker.rcPickerStrings.submit
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateBodyProps[DateType] extends DateBodyPassProps[DateType] {
  var generateConfig: GenerateConfig[DateType]
  var locale: Locale
  var onSelect: OnSelect[DateType]
  var prefixCls: String
  var rowCount: Double
  var value: js.UndefOr[DateType | Null] = js.undefined
  var viewDate: DateType
}

object DateBodyProps {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    onSelect: (DateType, /* type */ key | mouse | submit) => Unit,
    prefixCls: String,
    rowCount: Double,
    viewDate: DateType,
    dateRender: (DateType, DateType) => ReactNode = null,
    disabledDate: DateType => Boolean = null,
    prefixColumn: DateType => ReactNode = null,
    rowClassName: DateType => String = null,
    value: DateType = null
  ): DateBodyProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onSelect = js.Any.fromFunction2(onSelect), prefixCls = prefixCls.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2(dateRender))
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (prefixColumn != null) __obj.updateDynamic("prefixColumn")(js.Any.fromFunction1(prefixColumn))
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction1(rowClassName))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateBodyProps[DateType]]
  }
}

