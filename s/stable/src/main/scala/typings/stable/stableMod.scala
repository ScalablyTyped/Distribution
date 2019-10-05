package typings.stable

import typings.stable.stableMod.Comparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stable", JSImport.Namespace)
@js.native
object stableMod extends js.Object {
  def apply[T](array: js.Array[T]): js.Array[T] = js.native
  def apply[T](array: js.Array[T], comparator: Comparator[T]): js.Array[T] = js.native
  def inplace[T](array: js.Array[T]): js.Array[T] = js.native
  def inplace[T](array: js.Array[T], comparator: Comparator[T]): js.Array[T] = js.native
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, Boolean | Double]
}

