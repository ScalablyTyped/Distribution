package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/applyTo", JSImport.Namespace)
@js.native
object applyToMod extends js.Object {
  def default[T](el: T): js.Function1[/* fn */ js.Function1[/* t */ T, _], _] = js.native
  def default[T, U](el: T, fn: js.Function1[/* t */ T, U]): U = js.native
}

