package typings.rotJs.minHeapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeapWrapper[T] extends js.Object {
  var key: Double = js.native
  var timestamp: Double = js.native
  var value: T = js.native
}

object HeapWrapper {
  @scala.inline
  def apply[T](key: Double, timestamp: Double, value: T): HeapWrapper[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeapWrapper[T]]
  }
  @scala.inline
  implicit class HeapWrapperOps[Self <: HeapWrapper[_], T] (val x: Self with HeapWrapper[T]) extends AnyVal {
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
    def setKey(value: Double): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

