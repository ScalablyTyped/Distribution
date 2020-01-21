package typings.ramda

import typings.ramda.toolsMod.Ord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/maxBy", JSImport.Namespace)
@js.native
object maxByMod extends js.Object {
  def default[T](keyFn: js.Function1[/* a */ T, Ord]): js.Any = js.native
  def default[T](keyFn: js.Function1[/* a */ T, Ord], a: T): js.Function1[/* b */ T, T] = js.native
  def default[T](keyFn: js.Function1[/* a */ T, Ord], a: T, b: T): T = js.native
}

