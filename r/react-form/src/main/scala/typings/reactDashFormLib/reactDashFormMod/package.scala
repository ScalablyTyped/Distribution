package typings
package reactDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashFormMod {
  type FormError = js.UndefOr[java.lang.String]
  type FormValue = js.Any
  type FormValues = Nested[FormValue]
  type NestedErrors = Nested[FormErrors]
  type RenderReturn = reactLib.reactMod.Global.JSXNs.Element | reactDashFormLib.reactDashFormLibNumbers.`false` | scala.Null | js.Array[scala.Nothing]
  type SelectOptions = js.Array[reactDashFormLib.Anon_Label]
  type Touched = Nested[scala.Boolean]
  type ValidateValuesFunction = js.Function1[/* values */ FormValues, FormErrors]
}
