package typings.reactJsonschemaForm

import typings.react.mod.ComponentType
import typings.reactJsonschemaForm.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactJsonschemaFormComponents extends reactJsonschemaFormProps {
  @scala.inline
  def ReactJsonschemaForm[T]: ComponentType[ReactJsonschemaFormProps[T]] = js.constructorOf[default[T]].asInstanceOf[ComponentType[ReactJsonschemaFormProps[T]]]
  @scala.inline
  def SchemaField: ComponentType[SchemaFieldProps[js.Any]] = js.constructorOf[typings.reactJsonschemaForm.schemaFieldMod.default].asInstanceOf[ComponentType[SchemaFieldProps[js.Any]]]
}

