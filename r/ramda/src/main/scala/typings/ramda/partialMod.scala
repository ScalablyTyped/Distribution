package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/partial", JSImport.Namespace)
@js.native
object partialMod extends js.Object {
  def default[T](fn: js.Function1[/* repeated */ js.Any, T], args: js.Array[_]): js.Function1[/* repeated */ js.Any, T] = js.native
  def default[V0, V1, T](fn: js.Function2[/* x0 */ V0, /* x1 */ V1, T], args: js.Array[V0]): js.Function1[/* x1 */ V1, T] = js.native
  def default[V0, V1, V2, T](fn: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T], args: js.Array[V0]): js.Function2[/* x1 */ V1, /* x2 */ V2, T] = js.native
  def default[V0, V1, V2, T](fn: js.Function3[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, T], args: js.Tuple2[V0, V1]): js.Function1[/* x2 */ V2, T] = js.native
  def default[V0, V1, V2, V3, T](fn: js.Function4[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, /* x3 */ V3, T], args: js.Array[V0]): js.Function3[/* x1 */ V1, /* x2 */ V2, /* x3 */ V3, T] = js.native
  def default[V0, V1, V2, V3, T](fn: js.Function4[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, /* x3 */ V3, T], args: js.Tuple2[V0, V1]): js.Function2[/* x2 */ V2, /* x3 */ V3, T] = js.native
  def default[V0, V1, V2, V3, T](
    fn: js.Function4[/* x0 */ V0, /* x1 */ V1, /* x2 */ V2, /* x3 */ V3, T],
    args: js.Tuple3[V0, V1, V2]
  ): js.Function1[/* x2 */ V3, T] = js.native
}

