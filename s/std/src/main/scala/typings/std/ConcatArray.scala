package typings.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConcatArray[T] extends /* n */ NumberDictionary[T] {
  val length: Double = js.native
  def join(): java.lang.String = js.native
  def join(separator: java.lang.String): java.lang.String = js.native
  def slice(): js.Array[T] = js.native
  def slice(start: Double): js.Array[T] = js.native
  def slice(start: Double, end: Double): js.Array[T] = js.native
}

