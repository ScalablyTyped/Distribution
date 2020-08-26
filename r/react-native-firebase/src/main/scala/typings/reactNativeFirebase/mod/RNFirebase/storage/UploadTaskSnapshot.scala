package typings.reactNativeFirebase.mod.RNFirebase.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadTaskSnapshot extends js.Object {
  var bytesTransferred: Double = js.native
  var downloadURL: String | Null = js.native
  var metadata: FullMetadata = js.native
  var ref: Reference = js.native
  var state: TaskState = js.native
  var task: StorageTask[UploadTaskSnapshot] = js.native
  var totalBytes: Double = js.native
}

object UploadTaskSnapshot {
  @scala.inline
  def apply(
    bytesTransferred: Double,
    metadata: FullMetadata,
    ref: Reference,
    state: TaskState,
    task: StorageTask[UploadTaskSnapshot],
    totalBytes: Double
  ): UploadTaskSnapshot = {
    val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadTaskSnapshot]
  }
  @scala.inline
  implicit class UploadTaskSnapshotOps[Self <: UploadTaskSnapshot] (val x: Self) extends AnyVal {
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
    def setBytesTransferred(value: Double): Self = this.set("bytesTransferred", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: FullMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: Reference): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: TaskState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTask(value: StorageTask[UploadTaskSnapshot]): Self = this.set("task", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalBytes(value: Double): Self = this.set("totalBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadURL(value: String): Self = this.set("downloadURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadURLNull: Self = this.set("downloadURL", null)
  }
  
}

