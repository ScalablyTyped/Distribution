package typings.promiseFs.anon

import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferDataView extends js.Object {
  var buffer: DataView = js.native
  var bytesRead: Double = js.native
}

object BufferDataView {
  @scala.inline
  def apply(buffer: DataView, bytesRead: Double): BufferDataView = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferDataView]
  }
  @scala.inline
  implicit class BufferDataViewOps[Self <: BufferDataView] (val x: Self) extends AnyVal {
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
    def setBuffer(value: DataView): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytesRead(value: Double): Self = this.set("bytesRead", value.asInstanceOf[js.Any])
  }
  
}

