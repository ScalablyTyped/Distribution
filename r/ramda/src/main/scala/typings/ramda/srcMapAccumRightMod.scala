package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/mapAccumRight", JSImport.Namespace)
@js.native
object srcMapAccumRightMod extends js.Object {
  def default[T, U, TResult](fn: js.Function2[/* acc */ U, /* value */ T, js.Tuple2[U, TResult]]): js.Function2[/* acc */ U, /* list */ js.Array[T], js.Tuple2[U, js.Array[TResult]]] = js.native
  def default[T, U, TResult](fn: js.Function2[/* acc */ U, /* value */ T, js.Tuple2[U, TResult]], acc: U): js.Function1[/* list */ js.Array[T], js.Tuple2[U, js.Array[TResult]]] = js.native
  def default[T, U, TResult](fn: js.Function2[/* acc */ U, /* value */ T, js.Tuple2[U, TResult]], acc: U, list: js.Array[T]): js.Tuple2[U, js.Array[TResult]] = js.native
}

