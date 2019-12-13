package typings.ramda

import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/pick", JSImport.Namespace)
@js.native
object srcPickMod extends js.Object {
  def default[K /* <: String */](names: js.Array[K]): js.Function1[/* obj */ js.Any, Pick[_, Exclude[String, Exclude[String, K]]]] = js.native
  def default[T, K /* <: String */](names: js.Array[K], obj: T): Pick[T, Exclude[String, Exclude[String, K]]] = js.native
}

