package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/when", JSImport.Namespace)
@js.native
object whenMod extends js.Object {
  def default[T, U](pred: js.Function1[/* a */ T, Boolean], whenTrueFn: js.Function1[/* a */ T, U]): js.Function1[/* obj */ T, U] = js.native
  def default[T, U](pred: js.Function1[/* a */ T, Boolean], whenTrueFn: js.Function1[/* a */ T, U], obj: T): U = js.native
}

