package typings.reactInlinesvg.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageItem extends js.Object {
  var content: String = js.native
  var queue: js.Array[_] = js.native
  var status: String = js.native
}

object StorageItem {
  @scala.inline
  def apply(content: String, queue: js.Array[_], status: String): StorageItem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageItem]
  }
  @scala.inline
  implicit class StorageItemOps[Self <: StorageItem] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueueVarargs(value: js.Any*): Self = this.set("queue", js.Array(value :_*))
    @scala.inline
    def setQueue(value: js.Array[_]): Self = this.set("queue", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

