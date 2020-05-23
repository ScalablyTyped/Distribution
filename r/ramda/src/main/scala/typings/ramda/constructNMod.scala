package typings.ramda

import typings.ramda.anon.Instantiable
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/constructN", JSImport.Namespace)
@js.native
object constructNMod extends js.Object {
  def default[A /* <: js.Array[_] */, T](n: Double, constructor: js.Function1[/* a */ A, T]): js.Function1[/* a */ Partial[A], T] = js.native
  def default[A /* <: js.Array[_] */, T](n: Double, constructor: Instantiable[A, T]): js.Function1[/* a */ Partial[A], T] = js.native
}

