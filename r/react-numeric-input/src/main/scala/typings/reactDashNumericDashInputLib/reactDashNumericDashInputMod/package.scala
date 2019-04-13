package typings
package reactDashNumericDashInputLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNumericDashInputMod {
  type BoundsFunctionProp = scala.Double | (js.Function1[/* component */ NumericInput, js.UndefOr[scala.Double]])
  type NumericInput = reactLib.reactMod.Component[NumericInputProps, NumericInputState, js.Any]
  type Omit[T, K] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
}
