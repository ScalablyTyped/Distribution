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
    val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
    if (downloadURL != null) __obj.updateDynamic("downloadURL")(downloadURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadTaskSnapshot]
  }
}

