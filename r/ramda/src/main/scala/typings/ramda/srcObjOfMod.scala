package typings.ramda

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/objOf", JSImport.Namespace)
@js.native
object srcObjOfMod extends js.Object {
  def default[K /* <: String */](key: K): js.Function1[/* value */ js.Any, Record[K, _]] = js.native
  def default[T, K /* <: String */](key: K, value: T): Record[K, T] = js.native
}

