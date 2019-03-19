package typings
package stableLib.stableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](array: js.Array[T]): js.Array[T] = js.native
  def apply[T](array: js.Array[T], comparator: stableLib.Comparator[T]): js.Array[T] = js.native
  def inplace[T](array: js.Array[T]): js.Array[T] = js.native
  def inplace[T](array: js.Array[T], comparator: stableLib.Comparator[T]): js.Array[T] = js.native
}

