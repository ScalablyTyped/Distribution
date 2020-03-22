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
  type ISubmitEvent[T] = typings.reactJsonschemaForm.mod.IChangeEvent[T]
  type Widget = typings.react.mod.StatelessComponent[typings.reactJsonschemaForm.mod.WidgetProps] | (typings.react.mod.ComponentClass[typings.reactJsonschemaForm.mod.WidgetProps, typings.react.mod.ComponentState])
}
