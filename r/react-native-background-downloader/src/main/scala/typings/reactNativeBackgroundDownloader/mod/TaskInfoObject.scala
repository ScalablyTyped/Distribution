package typings.reactNativeBackgroundDownloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskInfoObject extends js.Object {
  var bytesWritten: Double = js.native
  var id: String = js.native
  var percent: Double = js.native
  var totalBytes: Double = js.native
}

object TaskInfoObject {
  @scala.inline
  def apply(bytesWritten: Double, id: String, percent: Double, totalBytes: Double): TaskInfoObject = {
    val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskInfoObject]
  }
  @scala.inline
  implicit class TaskInfoObjectOps[Self <: TaskInfoObject] (val x: Self) extends AnyVal {
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
    def setBytesWritten(value: Double): Self = this.set("bytesWritten", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalBytes(value: Double): Self = this.set("totalBytes", value.asInstanceOf[js.Any])
  }
  
}

