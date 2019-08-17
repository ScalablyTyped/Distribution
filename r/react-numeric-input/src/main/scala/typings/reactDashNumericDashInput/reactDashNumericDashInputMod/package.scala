package typings.reactDashNumericDashInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNumericDashInputMod {
  import typings.react.reactMod.Component
  import typings.std.Exclude
  import typings.std.Pick

  type BoundsFunctionProp = Double | (js.Function1[/* component */ NumericInput, js.UndefOr[Double]])
  type NumericInput = Component[NumericInputProps, NumericInputState, js.Any]
  type Omit[T, K] = Pick[T, Exclude[String, K]]
}
