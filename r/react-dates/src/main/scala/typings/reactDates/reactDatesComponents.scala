package typings.reactDates

import typings.react.mod.ComponentType
import typings.reactDates.mod.DateRangePickerCls
import typings.reactDates.mod.DayPickerRangeControllerCls
import typings.reactDates.mod.DayPickerSingleDateControllerCls
import typings.reactDates.mod.SingleDatePickerCls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDatesComponents extends reactDatesProps {
  @scala.inline
  def DateRangePicker: ComponentType[DateRangePickerProps] = js.constructorOf[DateRangePickerCls].asInstanceOf[ComponentType[DateRangePickerProps]]
  @scala.inline
  def DayPickerRangeController: ComponentType[DayPickerRangeControllerProps] = js.constructorOf[DayPickerRangeControllerCls].asInstanceOf[ComponentType[DayPickerRangeControllerProps]]
  @scala.inline
  def DayPickerSingleDateController: ComponentType[DayPickerSingleDateControllerProps] = js.constructorOf[DayPickerSingleDateControllerCls].asInstanceOf[ComponentType[DayPickerSingleDateControllerProps]]
  @scala.inline
  def SingleDatePicker: ComponentType[SingleDatePickerProps] = js.constructorOf[SingleDatePickerCls].asInstanceOf[ComponentType[SingleDatePickerProps]]
}

