package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Atime extends js.Object {
  var atime: js.UndefOr[String] = js.undefined
  var bytesPerSecond: js.UndefOr[Double] = js.undefined
  var gid: js.UndefOr[String] = js.undefined
  var mtime: js.UndefOr[String] = js.undefined
  var posixPermissions: js.UndefOr[String] = js.undefined
  var preserveDeletedFiles: js.UndefOr[String] = js.undefined
  var preserveDevices: js.UndefOr[String] = js.undefined
  var uid: js.UndefOr[String] = js.undefined
  var verifyMode: js.UndefOr[String] = js.undefined
}

object Anon_Atime {
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
  ): Anon_Atime = {
    val __obj = js.Dynamic.literal()
    if (atime != null) __obj.updateDynamic("atime")(atime)
    if (bytesPerSecond != null) __obj.updateDynamic("bytesPerSecond")(bytesPerSecond.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid)
    if (mtime != null) __obj.updateDynamic("mtime")(mtime)
    if (posixPermissions != null) __obj.updateDynamic("posixPermissions")(posixPermissions)
    if (preserveDeletedFiles != null) __obj.updateDynamic("preserveDeletedFiles")(preserveDeletedFiles)
    if (preserveDevices != null) __obj.updateDynamic("preserveDevices")(preserveDevices)
    if (uid != null) __obj.updateDynamic("uid")(uid)
    if (verifyMode != null) __obj.updateDynamic("verifyMode")(verifyMode)
    __obj.asInstanceOf[Anon_Atime]
  }
}

