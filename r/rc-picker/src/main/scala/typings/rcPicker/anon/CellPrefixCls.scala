package typings.rcPicker.anon

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.NullableDateType
import typings.rcPicker.interfaceMod.RangeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellPrefixCls[DateType] extends js.Object {
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

object CellPrefixCls {
  @scala.inline
  def apply[DateType](
    cellPrefixCls: String,
    generateConfig: GenerateConfig[DateType],
    isInView: DateType => Boolean,
    isSameCell: (NullableDateType[DateType], NullableDateType[DateType]) => Boolean,
    offsetCell: (DateType, Double) => DateType,
    hoverRangedValue: js.UndefOr[Null | RangeValue[DateType]] = js.undefined,
    rangedValue: js.UndefOr[Null | RangeValue[DateType]] = js.undefined,
    today: js.UndefOr[Null | NullableDateType[DateType]] = js.undefined,
    value: js.UndefOr[Null | NullableDateType[DateType]] = js.undefined
  ): CellPrefixCls[DateType] = {
    val __obj = js.Dynamic.literal(cellPrefixCls = cellPrefixCls.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], isInView = js.Any.fromFunction1(isInView), isSameCell = js.Any.fromFunction2(isSameCell), offsetCell = js.Any.fromFunction2(offsetCell))
    if (!js.isUndefined(hoverRangedValue)) __obj.updateDynamic("hoverRangedValue")(hoverRangedValue.asInstanceOf[js.Any])
    if (!js.isUndefined(rangedValue)) __obj.updateDynamic("rangedValue")(rangedValue.asInstanceOf[js.Any])
    if (!js.isUndefined(today)) __obj.updateDynamic("today")(today.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellPrefixCls[DateType]]
  }
}

