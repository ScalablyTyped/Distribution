package typings.pulumiAws.outputMod.datasync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskOptions extends js.Object {
  /**
    * A file metadata that shows the last time a file was accessed (that is when the file was read or written to). If set to `BEST_EFFORT`, the DataSync Task attempts to preserve the original (that is, the version before sync `PREPARING` phase) `atime` attribute on all source files. Valid values: `BEST_EFFORT`, `NONE`. Default: `BEST_EFFORT`.
    */
  var atime: js.UndefOr[String] = js.native
  /**
    * Limits the bandwidth utilized. For example, to set a maximum of 1 MB, set this value to `1048576`. Value values: `-1` or greater. Default: `-1` (unlimited).
    */
  var bytesPerSecond: js.UndefOr[Double] = js.native
  /**
    * Group identifier of the file's owners. Valid values: `BOTH`, `INT_VALUE`, `NAME`, `NONE`. Default: `INT_VALUE` (preserve integer value of the ID).
    */
  var gid: js.UndefOr[String] = js.native
  /**
    * A file metadata that indicates the last time a file was modified (written to) before the sync `PREPARING` phase. Value values: `NONE`, `PRESERVE`. Default: `PRESERVE`.
    */
  var mtime: js.UndefOr[String] = js.native
  /**
    * Determines which users or groups can access a file for a specific purpose such as reading, writing, or execution of the file. Valid values: `NONE`, `PRESERVE`. Default: `PRESERVE`.
    */
  var posixPermissions: js.UndefOr[String] = js.native
  /**
    * Whether files deleted in the source should be removed or preserved in the destination file system. Valid values: `PRESERVE`, `REMOVE`. Default: `PRESERVE`.
    */
  var preserveDeletedFiles: js.UndefOr[String] = js.native
  /**
    * Whether the DataSync Task should preserve the metadata of block and character devices in the source files system, and recreate the files with that device name and metadata on the destination. The DataSync Task can’t sync the actual contents of such devices, because many of the devices are non-terminal and don’t return an end of file (EOF) marker. Valid values: `NONE`, `PRESERVE`. Default: `NONE` (ignore special devices).
    */
  var preserveDevices: js.UndefOr[String] = js.native
  /**
    * User identifier of the file's owners. Valid values: `BOTH`, `INT_VALUE`, `NAME`, `NONE`. Default: `INT_VALUE` (preserve integer value of the ID).
    */
  var uid: js.UndefOr[String] = js.native
  /**
    * Whether a data integrity verification should be performed at the end of a task execution after all data and metadata have been transferred. Valid values: `NONE`, `POINT_IN_TIME_CONSISTENT`, `ONLY_FILES_TRANSFERRED`. Default: `POINT_IN_TIME_CONSISTENT`.
    */
  var verifyMode: js.UndefOr[String] = js.native
}

object TaskOptions {
  @scala.inline
  def apply(): TaskOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskOptions]
  }
  @scala.inline
  implicit class TaskOptionsOps[Self <: TaskOptions] (val x: Self) extends AnyVal {
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
    def setAtime(value: String): Self = this.set("atime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtime: Self = this.set("atime", js.undefined)
    @scala.inline
    def setBytesPerSecond(value: Double): Self = this.set("bytesPerSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesPerSecond: Self = this.set("bytesPerSecond", js.undefined)
    @scala.inline
    def setGid(value: String): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGid: Self = this.set("gid", js.undefined)
    @scala.inline
    def setMtime(value: String): Self = this.set("mtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMtime: Self = this.set("mtime", js.undefined)
    @scala.inline
    def setPosixPermissions(value: String): Self = this.set("posixPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosixPermissions: Self = this.set("posixPermissions", js.undefined)
    @scala.inline
    def setPreserveDeletedFiles(value: String): Self = this.set("preserveDeletedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveDeletedFiles: Self = this.set("preserveDeletedFiles", js.undefined)
    @scala.inline
    def setPreserveDevices(value: String): Self = this.set("preserveDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveDevices: Self = this.set("preserveDevices", js.undefined)
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
    @scala.inline
    def setVerifyMode(value: String): Self = this.set("verifyMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerifyMode: Self = this.set("verifyMode", js.undefined)
  }
  
}

