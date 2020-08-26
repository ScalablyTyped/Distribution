package typings.refArray.anon

import org.scalablytyped.runtime.NumberDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dicti[T] extends /* i */ NumberDictionary[T] {
  var buffer: Buffer = js.native
  var length: Double = js.native
  def inspect(): String = js.native
  def ref(): Buffer = js.native
  def toArray(): js.Array[T] = js.native
  def toJSON(): js.Array[T] = js.native
}

object Dicti {
  @scala.inline
  def apply[T](
    buffer: Buffer,
    inspect: () => String,
    length: Double,
    ref: () => Buffer,
    toArray: () => js.Array[T],
    toJSON: () => js.Array[T]
  ): Dicti[T] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], inspect = js.Any.fromFunction0(inspect), length = length.asInstanceOf[js.Any], ref = js.Any.fromFunction0(ref), toArray = js.Any.fromFunction0(toArray), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Dicti[T]]
  }
  @scala.inline
  implicit class DictiOps[Self <: Dicti[_], T] (val x: Self with Dicti[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuffer(value: Buffer): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setInspect(value: () => String): Self = this.set("inspect", js.Any.fromFunction0(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: () => Buffer): Self = this.set("ref", js.Any.fromFunction0(value))
    @scala.inline
    def setToArray(value: () => js.Array[T]): Self = this.set("toArray", js.Any.fromFunction0(value))
    @scala.inline
    def setToJSON(value: () => js.Array[T]): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
  
}

