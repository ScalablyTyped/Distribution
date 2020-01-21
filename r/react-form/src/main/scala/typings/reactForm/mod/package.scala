package typings.reactForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FormError = js.UndefOr[java.lang.String]
  type FormErrors = org.scalablytyped.runtime.StringDictionary[typings.reactForm.mod.FormError]
  type FormValue = js.Any
  type FormValues = typings.reactForm.mod.Nested[typings.reactForm.mod.FormValue]
  type NestedErrors = typings.reactForm.mod.Nested[typings.reactForm.mod.FormErrors]
  type RenderReturn = typings.react.mod._Global_.JSX.Element | typings.reactForm.reactFormBooleans.`false` | scala.Null | js.Array[scala.Nothing]
  type SelectOptions = js.Array[typings.reactForm.AnonLabel]
  type Touched = typings.reactForm.mod.Nested[scala.Boolean]
  type ValidateValuesFunction = js.Function1[/* values */ typings.reactForm.mod.FormValues, typings.reactForm.mod.FormErrors]
}
