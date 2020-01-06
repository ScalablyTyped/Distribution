package typings.atPulumiAws.typesOutputMod.datasync

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
    * Whether a data integrity verification should be performed at the end of a task execution after all data and metadata have been transferred. Valid values: `NONE`, `POINT_IN_TIME_CONSISTENT`. Default: `POINT_IN_TIME_CONSISTENT`.
    */
  var verifyMode: js.UndefOr[String] = js.native
}

object TaskOptions {
  @scala.inline
  def apply(
    atime: String = null,
    bytesPerSecond: Int | Double = null,
    gid: String = null,
    mtime: String = null,
    posixPermissions: String = null,
    preserveDeletedFiles: String = null,
    preserveDevices: String = null,
    uid: String = null,
    verifyMode: String = null
  ): TaskOptions = {
    val __obj = js.Dynamic.literal()
    if (atime != null) __obj.updateDynamic("atime")(atime.asInstanceOf[js.Any])
    if (bytesPerSecond != null) __obj.updateDynamic("bytesPerSecond")(bytesPerSecond.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (posixPermissions != null) __obj.updateDynamic("posixPermissions")(posixPermissions.asInstanceOf[js.Any])
    if (preserveDeletedFiles != null) __obj.updateDynamic("preserveDeletedFiles")(preserveDeletedFiles.asInstanceOf[js.Any])
    if (preserveDevices != null) __obj.updateDynamic("preserveDevices")(preserveDevices.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (verifyMode != null) __obj.updateDynamic("verifyMode")(verifyMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOptions]
  }
}

