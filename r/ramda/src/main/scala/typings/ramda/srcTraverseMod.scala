package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/traverse", JSImport.Namespace)
@js.native
object srcTraverseMod extends js.Object {
  def default[A, B](of: js.Function1[/* a */ B, js.Array[B]]): js.Function2[
    /* fn */ js.Function1[/* t */ A, js.Array[B]], 
    /* list */ js.Array[A], 
    js.Array[js.Array[B]]
  ] = js.native
  def default[A, B](of: js.Function1[/* a */ B, js.Array[B]], fn: js.Function1[/* t */ A, js.Array[B]]): js.Function1[/* list */ js.Array[A], js.Array[js.Array[B]]] = js.native
  def default[A, B](
    of: js.Function1[/* a */ B, js.Array[B]],
    fn: js.Function1[/* t */ A, js.Array[B]],
    list: js.Array[A]
  ): js.Array[js.Array[B]] = js.native
}

