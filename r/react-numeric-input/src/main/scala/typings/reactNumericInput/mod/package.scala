package typings.reactNumericInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BoundsFunctionProp = scala.Double | (js.Function1[
    /* component */ typings.reactNumericInput.mod.NumericInput, 
    js.UndefOr[scala.Double]
  ])
  type NumericInput = typings.react.mod.Component[
    typings.reactNumericInput.mod.NumericInputProps, 
    typings.reactNumericInput.mod.NumericInputState, 
    js.Any
  ]
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
}
