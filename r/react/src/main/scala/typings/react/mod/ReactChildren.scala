package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// React.Children
// ----------------------------------------------------------------------
@js.native
trait ReactChildren extends js.Object {
  def count(children: js.Any): Double = js.native
  def forEach[C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = js.native
  def forEach[C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = js.native
  def map[T, C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, T]): js.Array[T] = js.native
  def map[T, C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, T]): js.Array[T] = js.native
  def only[C](children: C): C = js.native
  def toArray[C](children: C): js.Array[C] = js.native
  def toArray[C](children: js.Array[C]): js.Array[C] = js.native
}

