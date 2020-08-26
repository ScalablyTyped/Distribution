package typings.shapefile.mod

import typings.shapefile.anon.Done
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source[RecordType] extends js.Object {
  var bbox: js.Array[Double] = js.native
  def cancel(): js.Promise[Unit] = js.native
  def read(): js.Promise[Done[RecordType]] = js.native
}

object Source {
  @scala.inline
  def apply[RecordType](bbox: js.Array[Double], cancel: () => js.Promise[Unit], read: () => js.Promise[Done[RecordType]]): Source[RecordType] = {
    val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], cancel = js.Any.fromFunction0(cancel), read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[Source[RecordType]]
  }
  @scala.inline
  implicit class SourceOps[Self <: Source[_], RecordType] (val x: Self with Source[RecordType]) extends AnyVal {
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
    def setBboxVarargs(value: Double*): Self = this.set("bbox", js.Array(value :_*))
    @scala.inline
    def setBbox(value: js.Array[Double]): Self = this.set("bbox", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancel(value: () => js.Promise[Unit]): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def setRead(value: () => js.Promise[Done[RecordType]]): Self = this.set("read", js.Any.fromFunction0(value))
  }
  
}

