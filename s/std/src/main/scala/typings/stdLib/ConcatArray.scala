package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConcatArray[T]
  extends /* n */ ScalablyTyped.runtime.NumberDictionary[T] {
  val length: scala.Double = js.native
  def join(): java.lang.String = js.native
  def join(separator: java.lang.String): java.lang.String = js.native
  def slice(): js.Array[T] = js.native
  def slice(start: scala.Double): js.Array[T] = js.native
  def slice(start: scala.Double, end: scala.Double): js.Array[T] = js.native
}

