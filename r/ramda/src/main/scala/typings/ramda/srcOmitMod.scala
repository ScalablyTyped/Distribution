package typings.ramda

import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/omit", JSImport.Namespace)
@js.native
object srcOmitMod extends js.Object {
  def default[K /* <: String */](names: js.Array[K]): js.Function1[/* obj */ js.Any, Omit[_, K]] = js.native
  def default[T, K /* <: String */](names: js.Array[K], obj: T): Omit[T, K] = js.native
}

