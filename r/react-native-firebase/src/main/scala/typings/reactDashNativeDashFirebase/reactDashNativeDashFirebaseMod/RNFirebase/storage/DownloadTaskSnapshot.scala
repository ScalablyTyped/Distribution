package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadTaskSnapshot extends js.Object {
  var bytesTransferred: Double
  var ref: Reference
  var state: TaskState
  var totalBytes: Double
}

object DownloadTaskSnapshot {
  @scala.inline
  def apply(bytesTransferred: Double, ref: Reference, state: TaskState, totalBytes: Double): DownloadTaskSnapshot = {
    val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DownloadTaskSnapshot]
  }
}

