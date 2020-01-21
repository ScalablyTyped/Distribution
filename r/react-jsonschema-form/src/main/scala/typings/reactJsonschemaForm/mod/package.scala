package typings.reactJsonschemaForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Field = typings.react.mod.StatelessComponent[typings.reactJsonschemaForm.mod.FieldProps[js.Any]] | (typings.react.mod.ComponentClass[
    typings.reactJsonschemaForm.mod.FieldProps[js.Any], 
    typings.react.mod.ComponentState
  ])
  type FieldError = java.lang.String
  type FormValidation = typings.reactJsonschemaForm.mod.FieldValidation with org.scalablytyped.runtime.StringDictionary[typings.reactJsonschemaForm.mod.FieldValidation]
  type ISubmitEvent[T] = typings.reactJsonschemaForm.mod.IChangeEvent[T]
  type IdSchema = typings.reactJsonschemaForm.mod.FieldId with org.scalablytyped.runtime.StringDictionary[typings.reactJsonschemaForm.mod.FieldId]
  type ThemeProps[T] = typings.std.Omit[
    typings.reactJsonschemaForm.mod.FormProps[T], 
    typings.reactJsonschemaForm.reactJsonschemaFormStrings.schema
  ]
  type Widget = typings.react.mod.StatelessComponent[typings.reactJsonschemaForm.mod.WidgetProps] | (typings.react.mod.ComponentClass[typings.reactJsonschemaForm.mod.WidgetProps, typings.react.mod.ComponentState])
}
