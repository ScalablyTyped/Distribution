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
    val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred, ref = ref, state = state, totalBytes = totalBytes)
  
    __obj.asInstanceOf[DownloadTaskSnapshot]
  }
}

