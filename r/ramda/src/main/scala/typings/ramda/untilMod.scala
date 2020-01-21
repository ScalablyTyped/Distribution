package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/until", JSImport.Namespace)
@js.native
object untilMod extends js.Object {
  def default[T, U](pred: js.Function1[/* val */ T, Boolean], fn: js.Function1[/* val */ T, U]): js.Function1[/* init */ U, U] = js.native
  def default[T, U](pred: js.Function1[/* val */ T, Boolean], fn: js.Function1[/* val */ T, U], init: U): U = js.native
}

