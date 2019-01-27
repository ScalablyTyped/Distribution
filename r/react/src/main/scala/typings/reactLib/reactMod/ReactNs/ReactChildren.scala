package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// React.Children
// ----------------------------------------------------------------------
@js.native
trait ReactChildren extends js.Object {
  def count(children: js.Any): scala.Double = js.native
  def forEach[C](children: C, fn: js.Function2[/* child */ C, /* index */ scala.Double, scala.Unit]): scala.Unit = js.native
  def forEach[C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ scala.Double, scala.Unit]): scala.Unit = js.native
  def map[T, C](children: C, fn: js.Function2[/* child */ C, /* index */ scala.Double, T]): js.Array[T] = js.native
  def map[T, C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ scala.Double, T]): js.Array[T] = js.native
  def only[C](children: C): C = js.native
  def toArray[C](children: C): js.Array[C] = js.native
  def toArray[C](children: js.Array[C]): js.Array[C] = js.native
}

