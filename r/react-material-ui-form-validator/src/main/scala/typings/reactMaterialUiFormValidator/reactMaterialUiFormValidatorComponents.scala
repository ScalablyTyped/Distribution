package typings.reactMaterialUiFormValidator

import typings.materialUi.MaterialUI.SelectFieldProps
import typings.materialUi.MaterialUI.TextFieldProps
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactMaterialUiFormValidatorComponents extends reactMaterialUiFormValidatorProps {
  @scala.inline
  def SelectValidator: ComponentType[
    typings.reactMaterialUiFormValidator.mod.ValidatorComponentProps with SelectFieldProps
  ] = js.constructorOf[typings.reactMaterialUiFormValidator.mod.SelectValidator].asInstanceOf[ComponentType[
    typings.reactMaterialUiFormValidator.mod.ValidatorComponentProps with SelectFieldProps
  ]]
  @scala.inline
  def TextValidator: ComponentType[
    typings.reactMaterialUiFormValidator.mod.ValidatorComponentProps with TextFieldProps
  ] = js.constructorOf[typings.reactMaterialUiFormValidator.mod.TextValidator].asInstanceOf[ComponentType[
    typings.reactMaterialUiFormValidator.mod.ValidatorComponentProps with TextFieldProps
  ]]
  @scala.inline
  def ValidatorComponent: ComponentType[ValidatorComponentProps] = js.constructorOf[typings.reactMaterialUiFormValidator.mod.ValidatorComponent].asInstanceOf[ComponentType[ValidatorComponentProps]]
  @scala.inline
  def ValidatorForm: ComponentType[ValidatorFormProps] = js.constructorOf[typings.reactMaterialUiFormValidator.mod.ValidatorForm].asInstanceOf[ComponentType[ValidatorFormProps]]
}

