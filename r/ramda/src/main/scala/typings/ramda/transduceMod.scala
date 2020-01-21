package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/transduce", JSImport.Namespace)
@js.native
object transduceMod extends js.Object {
  def default[T, U](xf: js.Function1[/* arg */ js.Array[T], js.Array[T]]): js.Function3[
    /* fn */ js.Function2[/* acc */ js.Array[U], /* val */ U, js.Array[U]], 
    /* acc */ js.Array[T], 
    /* list */ js.Array[T], 
    U
  ] = js.native
  def default[T, U](
    xf: js.Function1[/* arg */ js.Array[T], js.Array[T]],
    fn: js.Function2[/* acc */ js.Array[U], /* val */ U, js.Array[U]]
  ): js.Function2[/* acc */ js.Array[T], /* list */ js.Array[T], U] = js.native
  def default[T, U](
    xf: js.Function1[/* arg */ js.Array[T], js.Array[T]],
    fn: js.Function2[/* acc */ js.Array[U], /* val */ U, js.Array[U]],
    acc: js.Array[T]
  ): js.Function1[/* list */ js.Array[T], U] = js.native
  def default[T, U](
    xf: js.Function1[/* arg */ js.Array[T], js.Array[T]],
    fn: js.Function2[/* acc */ js.Array[U], /* val */ U, js.Array[U]],
    acc: js.Array[T],
    list: js.Array[T]
  ): U = js.native
}

