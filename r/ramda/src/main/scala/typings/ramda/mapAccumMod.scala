package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/mapAccum", JSImport.Namespace)
@js.native
object mapAccumMod extends js.Object {
  def default[T, U, TResult](fn: js.Function2[/* acc */ U, /* value */ T, js.Tuple2[U, TResult]]): js.Function2[/* acc */ U, /* list */ js.Array[T], js.Tuple2[U, js.Array[TResult]]] = js.native
  def default[T, U, TResult](fn: js.Function2[/* acc */ U, /* value */ T, js.Tuple2[U, TResult]], acc: U): js.Function1[/* list */ js.Array[T], js.Tuple2[U, js.Array[TResult]]] = js.native
  def default[T, U, TResult](fn: js.Function2[/* acc */ U, /* value */ T, js.Tuple2[U, TResult]], acc: U, list: js.Array[T]): js.Tuple2[U, js.Array[TResult]] = js.native
}

