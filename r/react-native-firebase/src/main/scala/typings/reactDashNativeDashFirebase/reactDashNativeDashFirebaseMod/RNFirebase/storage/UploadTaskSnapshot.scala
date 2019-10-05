package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadTaskSnapshot extends js.Object {
  var bytesTransferred: Double
  var downloadURL: String | Null
  var metadata: FullMetadata
  var ref: Reference
  var state: TaskState
  var task: StorageTask[UploadTaskSnapshot]
  var totalBytes: Double
}

object UploadTaskSnapshot {
  @scala.inline
  def apply(
    bytesTransferred: Double,
    metadata: FullMetadata,
    ref: Reference,
    state: TaskState,
    task: StorageTask[UploadTaskSnapshot],
    totalBytes: Double,
    downloadURL: String = null
  ): UploadTaskSnapshot = {
    val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred, metadata = metadata, ref = ref, state = state, task = task, totalBytes = totalBytes)
    if (downloadURL != null) __obj.updateDynamic("downloadURL")(downloadURL)
    __obj.asInstanceOf[UploadTaskSnapshot]
  }
}

