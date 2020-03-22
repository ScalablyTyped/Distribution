package typings.reactSpinners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type CalcFunction[T] = js.Function0[T]
  type LengthType = scala.Double | java.lang.String
  type StyleFunction = js.Function0[typings.reactSpinners.interfacesMod.PrecompiledCss]
  type StyleFunctionWithIndex = js.Function1[/* i */ scala.Double, typings.reactSpinners.interfacesMod.PrecompiledCss]
}
