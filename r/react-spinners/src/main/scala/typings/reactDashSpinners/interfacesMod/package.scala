package typings.reactDashSpinners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type CalcFunction[T] = js.Function0[T]
  type StyleFunction = js.Function0[PrecompiledCss]
  type StyleFunctionWithIndex = js.Function1[/* i */ Double, PrecompiledCss]
}
