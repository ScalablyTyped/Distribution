package typings.reactJsonschemaForm

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactJsonschemaFormComponents extends reactJsonschemaFormProps {
  @scala.inline
  def ReactJsonschemaForm[T]: ComponentType[ReactJsonschemaFormProps[T]] = js.constructorOf[typings.reactJsonschemaForm.mod.default[T]].asInstanceOf[typings.react.mod.ComponentType[ReactJsonschemaFormProps[T]]]
  @scala.inline
  def SchemaField: ComponentType[SchemaFieldProps[js.Any]] = js.constructorOf[typings.reactJsonschemaForm.schemaFieldMod.default].asInstanceOf[typings.react.mod.ComponentType[SchemaFieldProps[js.Any]]]
}

