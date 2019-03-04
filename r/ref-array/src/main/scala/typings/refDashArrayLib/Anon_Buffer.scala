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
    inspect: js.Function0[java.lang.String],
    length: scala.Double,
    ref: js.Function0[nodeLib.Buffer],
    toArray: js.Function0[js.Array[T]],
    toJSON: js.Function0[js.Array[T]],
    NumberDictionary: /* i */ org.scalablytyped.runtime.NumberDictionary[T] = null
  ): Anon_Buffer[T] = {
    val __obj = js.Dynamic.literal(buffer = buffer, inspect = inspect, length = length, ref = ref, toArray = toArray, toJSON = toJSON)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Anon_Buffer[T]]
  }
}

