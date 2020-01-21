package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/unless", JSImport.Namespace)
@js.native
object unlessMod extends js.Object {
  def default[T, U](pred: js.Function1[/* a */ T, Boolean], whenFalseFn: js.Function1[/* a */ T, U]): js.Function1[/* obj */ T, U] = js.native
  def default[T, U](pred: js.Function1[/* a */ T, Boolean], whenFalseFn: js.Function1[/* a */ T, U], obj: T): U = js.native
}

