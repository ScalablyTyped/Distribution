package typings
package refDashArrayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer[T]
  extends /* i */ org.scalablytyped.runtime.NumberDictionary[T] {
  var buffer: nodeLib.Buffer
  var length: scala.Double
  def inspect(): java.lang.String
  def ref(): nodeLib.Buffer
  def toArray(): js.Array[T]
  def toJSON(): js.Array[T]
}

object Anon_Buffer {
  @scala.inline
  def apply[T](
    buffer: nodeLib.Buffer,
    inspect: () => java.lang.String,
    length: scala.Double,
    ref: () => nodeLib.Buffer,
    toArray: () => js.Array[T],
    toJSON: () => js.Array[T],
    NumberDictionary: /* i */ org.scalablytyped.runtime.NumberDictionary[T] = null
  ): Anon_Buffer[T] = {
    val __obj = js.Dynamic.literal(buffer = buffer, inspect = js.Any.fromFunction0(inspect), length = length, ref = js.Any.fromFunction0(ref), toArray = js.Any.fromFunction0(toArray), toJSON = js.Any.fromFunction0(toJSON))
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Anon_Buffer[T]]
  }
}

