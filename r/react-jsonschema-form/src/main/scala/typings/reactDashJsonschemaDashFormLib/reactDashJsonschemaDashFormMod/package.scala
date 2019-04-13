package typings
package reactDashJsonschemaDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashJsonschemaDashFormMod {
  type ErrorSchema = org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias react-jsonschema-form.react-jsonschema-form.ErrorSchema */ js.Object
  ]
  type Field = reactLib.reactMod.StatelessComponent[FieldProps[js.Any]] | (reactLib.reactMod.ComponentClass[FieldProps[js.Any], reactLib.reactMod.ComponentState])
  type FieldError = java.lang.String
  type Form[T] = reactLib.reactMod.Component[FormProps[T], js.Object, js.Any]
  type FormValidation = FieldValidation with org.scalablytyped.runtime.StringDictionary[FieldValidation]
  type ISubmitEvent[T] = IChangeEvent[T]
  type IdSchema = FieldId with org.scalablytyped.runtime.StringDictionary[FieldId]
  type Widget = reactLib.reactMod.StatelessComponent[WidgetProps] | (reactLib.reactMod.ComponentClass[WidgetProps, reactLib.reactMod.ComponentState])
}
