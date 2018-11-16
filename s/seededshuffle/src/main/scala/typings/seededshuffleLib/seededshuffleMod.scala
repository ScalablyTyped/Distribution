package typings
package seededshuffleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seededshuffle", JSImport.Namespace)
@js.native
object seededshuffleMod extends js.Object {
  val seed: scala.Double = js.native
  val strSeed: java.lang.String = js.native
  def shuffle[T](arr: js.Array[T], seed: java.lang.String): js.Array[T] = js.native
  def shuffle[T](arr: js.Array[T], seed: java.lang.String, copy: seededshuffleLib.seededshuffleLibNumbers.`true`): js.Array[T] = js.native
  def shuffle[T](arr: js.Array[T], seed: scala.Double): js.Array[T] = js.native
  def shuffle[T](arr: js.Array[T], seed: scala.Double, copy: seededshuffleLib.seededshuffleLibNumbers.`true`): js.Array[T] = js.native
  def unshuffle[T](arr: js.Array[T], seed: java.lang.String): js.Array[T] = js.native
  def unshuffle[T](arr: js.Array[T], seed: java.lang.String, copy: seededshuffleLib.seededshuffleLibNumbers.`true`): js.Array[T] = js.native
  def unshuffle[T](arr: js.Array[T], seed: scala.Double): js.Array[T] = js.native
  def unshuffle[T](arr: js.Array[T], seed: scala.Double, copy: seededshuffleLib.seededshuffleLibNumbers.`true`): js.Array[T] = js.native
}

