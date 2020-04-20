package typings.reactNativeDialog

import typings.react.mod.ComponentType
import typings.reactNative.mod.TextInputProps
import typings.reactNative.mod.TextProps
import typings.reactNative.mod.ViewProps
import typings.reactNativeDialog.mod.ButtonProps
import typings.reactNativeDialog.mod.ContainerProps
import typings.reactNativeDialog.mod.DescriptionProps
import typings.reactNativeDialog.mod.Dialog.Button
import typings.reactNativeDialog.mod.Dialog.Container
import typings.reactNativeDialog.mod.Dialog.Description
import typings.reactNativeDialog.mod.Dialog.Input
import typings.reactNativeDialog.mod.Dialog.Title
import typings.reactNativeDialog.mod.InputProps
import typings.reactNativeDialog.mod.TitleProps
import typings.reactNativeDialog.mod.reactNativeModalContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNativeDialogComponents extends reactNativeDialogProps {
  @scala.inline
  def Button: ComponentType[ButtonProps with ViewProps with TextProps] = js.constructorOf[typings.reactNativeDialog.mod.default.Button].asInstanceOf[ComponentType[ButtonProps with ViewProps with TextProps]]
  @scala.inline
  def Container: ComponentType[ContainerProps with ViewProps with reactNativeModalContainerProps] = js.constructorOf[typings.reactNativeDialog.mod.default.Container].asInstanceOf[ComponentType[ContainerProps with ViewProps with reactNativeModalContainerProps]]
  @scala.inline
  def Description: ComponentType[DescriptionProps with ViewProps with TextProps] = js.constructorOf[typings.reactNativeDialog.mod.default.Description].asInstanceOf[ComponentType[DescriptionProps with ViewProps with TextProps]]
  @scala.inline
  def DialogButton: ComponentType[ButtonProps with ViewProps with TextProps] = js.constructorOf[Button].asInstanceOf[ComponentType[ButtonProps with ViewProps with TextProps]]
  @scala.inline
  def DialogContainer: ComponentType[ContainerProps with ViewProps with reactNativeModalContainerProps] = js.constructorOf[Container].asInstanceOf[ComponentType[ContainerProps with ViewProps with reactNativeModalContainerProps]]
  @scala.inline
  def DialogDescription: ComponentType[DescriptionProps with ViewProps with TextProps] = js.constructorOf[Description].asInstanceOf[ComponentType[DescriptionProps with ViewProps with TextProps]]
  @scala.inline
  def DialogInput[T]: ComponentType[InputProps[T] with ViewProps with TextInputProps] = js.constructorOf[Input[T]].asInstanceOf[ComponentType[InputProps[T] with ViewProps with TextInputProps]]
  @scala.inline
  def DialogTitle: ComponentType[TitleProps with ViewProps with TextProps] = js.constructorOf[Title].asInstanceOf[ComponentType[TitleProps with ViewProps with TextProps]]
  @scala.inline
  def Input[T]: ComponentType[InputProps[T] with ViewProps with TextInputProps] = js.constructorOf[typings.reactNativeDialog.mod.default.Input[T]].asInstanceOf[ComponentType[InputProps[T] with ViewProps with TextInputProps]]
  @scala.inline
  def Title: ComponentType[TitleProps with ViewProps with TextProps] = js.constructorOf[typings.reactNativeDialog.mod.default.Title].asInstanceOf[ComponentType[TitleProps with ViewProps with TextProps]]
}

