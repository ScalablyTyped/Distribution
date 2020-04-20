package typings.rmcDatePicker

import typings.react.mod.ComponentType
import typings.rmcDatePicker.datePickerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rmcDatePickerComponents extends rmcDatePickerProps {
  @scala.inline
  def DatePicker: ComponentType[DatePickerProps] = js.constructorOf[default].asInstanceOf[ComponentType[DatePickerProps]]
  @scala.inline
  def Popup: ComponentType[PopupProps] = js.constructorOf[typings.rmcDatePicker.popupMod.default].asInstanceOf[ComponentType[PopupProps]]
  @scala.inline
  def RmcDatePicker: ComponentType[RmcDatePickerProps] = js.constructorOf[typings.rmcDatePicker.mod.default].asInstanceOf[ComponentType[RmcDatePickerProps]]
}

