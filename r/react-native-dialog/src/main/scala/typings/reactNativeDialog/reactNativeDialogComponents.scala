package typings.reactNativeDialog

import typings.react.mod.ComponentType
import typings.reactNative.mod.TextInputProps
import typings.reactNative.mod.TextProps
import typings.reactNative.mod.ViewProps
import typings.reactNativeDialog.mod.ButtonProps
import typings.reactNativeDialog.mod.ContainerProps
import typings.reactNativeDialog.mod.DescriptionProps
import typings.reactNativeDialog.mod.InputProps
import typings.reactNativeDialog.mod.TitleProps
import typings.reactNativeDialog.mod.reactNativeModalContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNativeDialogComponents extends reactNativeDialogProps {
  @scala.inline
  def Button: ComponentType[ButtonProps with ViewProps with TextProps] = js.constructorOf[typings.reactNativeDialog.mod.default.Button].asInstanceOf[typings.react.mod.ComponentType[
  typings.reactNativeDialog.mod.ButtonProps with typings.reactNative.mod.ViewProps with typings.reactNative.mod.TextProps]]
  @scala.inline
  def Container: ComponentType[ContainerProps with ViewProps with reactNativeModalContainerProps] = js.constructorOf[typings.reactNativeDialog.mod.default.Container].asInstanceOf[typings.react.mod.ComponentType[
  typings.reactNativeDialog.mod.ContainerProps with typings.reactNative.mod.ViewProps with typings.reactNativeDialog.mod.reactNativeModalContainerProps]]
  @scala.inline
  def Description: ComponentType[DescriptionProps with ViewProps with TextProps] = js.constructorOf[typings.reactNativeDialog.mod.default.Description].asInstanceOf[typings.react.mod.ComponentType[
  typings.reactNativeDialog.mod.DescriptionProps with typings.reactNative.mod.ViewProps with typings.reactNative.mod.TextProps]]
  @scala.inline
  def DialogButton: ComponentType[ButtonProps with ViewProps with TextProps] = js.constructorOf[typings.reactNativeDialog.mod.Dialog.Button].asInstanceOf[typings.react.mod.ComponentType[
  typings.reactNativeDialog.mod.ButtonProps with typings.reactNative.mod.ViewProps with typings.reactNative.mod.TextProps]]
  @scala.inline
  def DialogContainer: ComponentType[ContainerProps with ViewProps with reactNativeModalContainerProps] = js.constructorOf[typings.reactNativeDialog.mod.Dialog.Container].asInstanceOf[typings.react.mod.ComponentType[
  typings.reactNativeDialog.mod.ContainerProps with typings.reactNative.mod.ViewProps with typings.reactNativeDialog.mod.reactNativeModalContainerProps]]
  @scala.inline
  def DialogDescription: ComponentType[DescriptionProps with ViewProps with TextProps] = js.constructorOf[typings.reactNativeDialog.mod.Dialog.Description].asInstanceOf[typings.react.mod.ComponentType[
  typings.reactNativeDialog.mod.DescriptionProps with typings.reactNative.mod.ViewProps with typings.reactNative.mod.TextProps]]
  @scala.inline
  def DialogInput[T]: ComponentType[InputProps[T] with ViewProps with TextInputProps] = js.constructorOf[typings.reactNativeDialog.mod.Dialog.Input[T]].asInstanceOf[typings.react.mod.ComponentType[
  typings.reactNativeDialog.mod.InputProps[T] with typings.reactNative.mod.ViewProps with typings.reactNative.mod.TextInputProps]]
  @scala.inline
  def DialogTitle: ComponentType[TitleProps with ViewProps with TextProps] = js.constructorOf[typings.reactNativeDialog.mod.Dialog.Title].asInstanceOf[typings.react.mod.ComponentType[
  typings.reactNativeDialog.mod.TitleProps with typings.reactNative.mod.ViewProps with typings.reactNative.mod.TextProps]]
  @scala.inline
  def Input[T]: ComponentType[InputProps[T] with ViewProps with TextInputProps] = js.constructorOf[typings.reactNativeDialog.mod.default.Input[T]].asInstanceOf[typings.react.mod.ComponentType[
  typings.reactNativeDialog.mod.InputProps[T] with typings.reactNative.mod.ViewProps with typings.reactNative.mod.TextInputProps]]
  @scala.inline
  def Title: ComponentType[TitleProps with ViewProps with TextProps] = js.constructorOf[typings.reactNativeDialog.mod.default.Title].asInstanceOf[typings.react.mod.ComponentType[
  typings.reactNativeDialog.mod.TitleProps with typings.reactNative.mod.ViewProps with typings.reactNative.mod.TextProps]]
}

