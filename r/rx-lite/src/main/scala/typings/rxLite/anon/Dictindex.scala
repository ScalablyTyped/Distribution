package typings.rxLite.anon

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictindex[T] extends /* index */ NumberDictionary[T] {
  var length: Double = js.native
}

object Dictindex {
  @scala.inline
  def apply[T](length: Double): Dictindex[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictindex[T]]
  }
  @scala.inline
  implicit class DictindexOps[Self <: Dictindex[_], T] (val x: Self with Dictindex[T]) extends AnyVal {
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
  
}

