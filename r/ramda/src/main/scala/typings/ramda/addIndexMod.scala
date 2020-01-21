package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/addIndex", JSImport.Namespace)
@js.native
object addIndexMod extends js.Object {
  def default[T](fn: js.Function2[/* f */ js.Function1[/* item */ T, Unit], /* list */ js.Array[T], js.Array[T]]): js.Any = js.native
  def default[T, U](
    fn: js.Function3[
      /* f */ js.Function2[/* acc */ U, /* item */ T, U], 
      /* aci */ U, 
      /* list */ js.Array[T], 
      U
    ]
  ): js.Any = js.native
  @JSName("default")
  def default_TU[T, U](fn: js.Function2[/* f */ js.Function1[/* item */ T, U], /* list */ js.Array[T], js.Array[U]]): js.Any = js.native
}

