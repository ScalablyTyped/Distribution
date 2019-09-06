package typings.reactDashJsonschemaDashForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashJsonschemaDashFormMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.StatelessComponent
  import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormStrings.schema
  import typings.std.Omit

  type Field = StatelessComponent[FieldProps[js.Any]] | (ComponentClass[FieldProps[js.Any], ComponentState])
  type FieldError = String
  type FormValidation = FieldValidation with StringDictionary[FieldValidation]
  type ISubmitEvent[T] = IChangeEvent[T]
  type IdSchema = FieldId with StringDictionary[FieldId]
  type ThemeProps[T] = Omit[FormProps[T], schema]
  type Widget = StatelessComponent[WidgetProps] | (ComponentClass[WidgetProps, ComponentState])
}
