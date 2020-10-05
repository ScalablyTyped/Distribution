package typings.rcPicker.anon

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.NullableDateType
import typings.rcPicker.interfaceMod.RangeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellPrefixCls[DateType] extends js.Object {
  var cellPrefixCls: String = js.native
  var generateConfig: GenerateConfig[DateType] = js.native
  var hoverRangedValue: js.UndefOr[RangeValue[DateType]] = js.native
  var rangedValue: js.UndefOr[RangeValue[DateType]] = js.native
  var today: js.UndefOr[NullableDateType[DateType]] = js.native
  var value: js.UndefOr[NullableDateType[DateType]] = js.native
  def isInView(date: DateType): Boolean = js.native
  def isSameCell(current: NullableDateType[DateType], target: NullableDateType[DateType]): Boolean = js.native
  def offsetCell(date: DateType, offset: Double): DateType = js.native
}

object CellPrefixCls {
  @scala.inline
  def apply[DateType](
    cellPrefixCls: String,
    generateConfig: GenerateConfig[DateType],
    isInView: DateType => Boolean,
    isSameCell: (NullableDateType[DateType], NullableDateType[DateType]) => Boolean,
    offsetCell: (DateType, Double) => DateType
  ): CellPrefixCls[DateType] = {
    val __obj = js.Dynamic.literal(cellPrefixCls = cellPrefixCls.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], isInView = js.Any.fromFunction1(isInView), isSameCell = js.Any.fromFunction2(isSameCell), offsetCell = js.Any.fromFunction2(offsetCell))
    __obj.asInstanceOf[CellPrefixCls[DateType]]
  }
  @scala.inline
  implicit class CellPrefixClsOps[Self <: CellPrefixCls[_], DateType] (val x: Self with CellPrefixCls[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCellPrefixCls(value: String): Self = this.set("cellPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenerateConfig(value: GenerateConfig[DateType]): Self = this.set("generateConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsInView(value: DateType => Boolean): Self = this.set("isInView", js.Any.fromFunction1(value))
    @scala.inline
    def setIsSameCell(value: (NullableDateType[DateType], NullableDateType[DateType]) => Boolean): Self = this.set("isSameCell", js.Any.fromFunction2(value))
    @scala.inline
    def setOffsetCell(value: (DateType, Double) => DateType): Self = this.set("offsetCell", js.Any.fromFunction2(value))
    @scala.inline
    def setHoverRangedValue(value: RangeValue[DateType]): Self = this.set("hoverRangedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverRangedValue: Self = this.set("hoverRangedValue", js.undefined)
    @scala.inline
    def setHoverRangedValueNull: Self = this.set("hoverRangedValue", null)
    @scala.inline
    def setRangedValue(value: RangeValue[DateType]): Self = this.set("rangedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangedValue: Self = this.set("rangedValue", js.undefined)
    @scala.inline
    def setRangedValueNull: Self = this.set("rangedValue", null)
    @scala.inline
    def setToday(value: NullableDateType[DateType]): Self = this.set("today", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToday: Self = this.set("today", js.undefined)
    @scala.inline
    def setTodayNull: Self = this.set("today", null)
    @scala.inline
    def setValue(value: NullableDateType[DateType]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

