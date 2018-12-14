package typings
package reactDashJsonschemaDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashJsonschemaDashFormMod {
  type Field = reactLib.reactMod.ReactNs.StatelessComponent[FieldProps] | (reactLib.reactMod.ReactNs.ComponentClass[FieldProps, reactLib.reactMod.ReactNs.ComponentState])
  type FieldError = java.lang.String
  type Form[T] = reactLib.reactMod.Component[FormProps[T], js.Object, js.Any]
  type FormValidation = FieldValidation with org.scalablytyped.runtime.StringDictionary[FieldValidation]
  type ISubmitEvent[T] = IChangeEvent[T]
  type IdSchema = FieldId with org.scalablytyped.runtime.StringDictionary[FieldId]
  type Widget = reactLib.reactMod.ReactNs.StatelessComponent[WidgetProps] | (reactLib.reactMod.ReactNs.ComponentClass[WidgetProps, reactLib.reactMod.ReactNs.ComponentState])
}
