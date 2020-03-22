package typings.rcPicker

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.NullableDateType
import typings.rcPicker.interfaceMod.RangeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCellPrefixCls[DateType] extends js.Object {
  var cellPrefixCls: String
  var generateConfig: GenerateConfig[DateType]
  var hoverRangedValue: js.UndefOr[RangeValue[DateType]] = js.undefined
  var rangedValue: js.UndefOr[RangeValue[DateType]] = js.undefined
  var today: js.UndefOr[NullableDateType[DateType]] = js.undefined
  var value: js.UndefOr[NullableDateType[DateType]] = js.undefined
  def isInView(date: DateType): Boolean
  def isSameCell(current: NullableDateType[DateType], target: NullableDateType[DateType]): Boolean
  def offsetCell(date: DateType, offset: Double): DateType
}

object AnonCellPrefixCls {
  @scala.inline
  def apply[DateType](
    cellPrefixCls: String,
    generateConfig: GenerateConfig[DateType],
    isInView: DateType => Boolean,
    isSameCell: (NullableDateType[DateType], NullableDateType[DateType]) => Boolean,
    offsetCell: (DateType, Double) => DateType,
    hoverRangedValue: RangeValue[DateType] = null,
    rangedValue: RangeValue[DateType] = null,
    today: NullableDateType[DateType] = null,
    value: NullableDateType[DateType] = null
  ): AnonCellPrefixCls[DateType] = {
    val __obj = js.Dynamic.literal(cellPrefixCls = cellPrefixCls.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], isInView = js.Any.fromFunction1(isInView), isSameCell = js.Any.fromFunction2(isSameCell), offsetCell = js.Any.fromFunction2(offsetCell))
    if (hoverRangedValue != null) __obj.updateDynamic("hoverRangedValue")(hoverRangedValue.asInstanceOf[js.Any])
    if (rangedValue != null) __obj.updateDynamic("rangedValue")(rangedValue.asInstanceOf[js.Any])
    if (today != null) __obj.updateDynamic("today")(today.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCellPrefixCls[DateType]]
  }
}

