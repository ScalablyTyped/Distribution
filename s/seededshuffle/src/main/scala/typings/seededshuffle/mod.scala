package typings.seededshuffle

import typings.seededshuffle.seededshuffleBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seededshuffle", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val seed: Double = js.native
  val strSeed: String = js.native
  def shuffle[T](arr: js.Array[T], seed: String): js.Array[T] = js.native
  def shuffle[T](arr: js.Array[T], seed: Double): js.Array[T] = js.native
  @JSName("shuffle")
  def shuffle_true[T](arr: js.Array[T], seed: String, copy: `true`): js.Array[T] = js.native
  @JSName("shuffle")
  def shuffle_true[T](arr: js.Array[T], seed: Double, copy: `true`): js.Array[T] = js.native
  def unshuffle[T](arr: js.Array[T], seed: String): js.Array[T] = js.native
  def unshuffle[T](arr: js.Array[T], seed: Double): js.Array[T] = js.native
  @JSName("unshuffle")
  def unshuffle_true[T](arr: js.Array[T], seed: String, copy: `true`): js.Array[T] = js.native
  @JSName("unshuffle")
  def unshuffle_true[T](arr: js.Array[T], seed: Double, copy: `true`): js.Array[T] = js.native
}

