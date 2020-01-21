package typings.ramda

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/props", JSImport.Namespace)
@js.native
object propsMod extends js.Object {
  def default[P /* <: String */](ps: js.Array[P]): js.Function1[/* obj */ Record[P, _], js.Array[_]] = js.native
  def default[P /* <: String */, T](ps: js.Array[P], obj: Record[P, T]): js.Array[T] = js.native
  @JSName("default")
  def default_P_StringT[P /* <: String */, T](ps: js.Array[P]): js.Function1[/* obj */ Record[P, T], js.Array[T]] = js.native
}

