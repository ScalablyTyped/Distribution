package typings.reactNativeFirebase.mod.RNFirebase.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadTaskSnapshot extends js.Object {
  
  var bytesTransferred: Double = js.native
  
  var ref: Reference = js.native
  
  var state: TaskState = js.native
  
  var totalBytes: Double = js.native
}
object DownloadTaskSnapshot {
  
  @scala.inline
  def apply(bytesTransferred: Double, ref: Reference, state: TaskState, totalBytes: Double): DownloadTaskSnapshot = {
    val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadTaskSnapshot]
  }
  
  @scala.inline
  implicit class DownloadTaskSnapshotOps[Self <: DownloadTaskSnapshot] (val x: Self) extends AnyVal {
    
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
    def setRef(value: Reference): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: TaskState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytes(value: Double): Self = this.set("totalBytes", value.asInstanceOf[js.Any])
  }
}
