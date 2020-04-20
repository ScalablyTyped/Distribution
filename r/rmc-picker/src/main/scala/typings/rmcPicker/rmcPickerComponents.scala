package typings.rmcPicker

import typings.react.mod.ComponentType
import typings.rmcPicker.nativePickerIosMod.default
import typings.rmcPicker.nativePickerIosMod.default.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rmcPickerComponents extends rmcPickerProps {
  @scala.inline
  def NativePickerDotios: ComponentType[NativePickerDotiosProps] = js.constructorOf[default].asInstanceOf[ComponentType[NativePickerDotiosProps]]
  @scala.inline
  def NativePickerDotiosItem: ComponentType[NativePickerDotiosItemProps] = Item.asInstanceOf[ComponentType[NativePickerDotiosItemProps]]
  @scala.inline
  def PickerDotnative: ComponentType[PickerDotnativeProps] = js.constructorOf[typings.rmcPicker.pickerNativeMod.default].asInstanceOf[ComponentType[PickerDotnativeProps]]
}

