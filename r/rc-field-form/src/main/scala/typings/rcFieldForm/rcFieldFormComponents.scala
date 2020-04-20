package typings.rcFieldForm

import typings.rcFieldForm.fieldMod.default
import typings.rcFieldForm.formMod.FormProps
import typings.rcFieldForm.interfaceMod.FormInstance
import typings.react.mod.ComponentType
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcFieldFormComponents extends rcFieldFormProps {
  @scala.inline
  def Field: ComponentType[FieldProps] = default.asInstanceOf[ComponentType[FieldProps]]
  @scala.inline
  def FormProvider: ComponentType[FormProviderProps] = typings.rcFieldForm.mod.FormProvider.asInstanceOf[ComponentType[FormProviderProps]]
  @scala.inline
  def Lib: ComponentType[FormProps with RefAttributes[FormInstance]] = typings.rcFieldForm.mod.default.asInstanceOf[ComponentType[FormProps with RefAttributes[FormInstance]]]
  @scala.inline
  def List: ComponentType[ListProps] = typings.rcFieldForm.listMod.default.asInstanceOf[ComponentType[ListProps]]
}

