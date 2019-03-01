package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Atime extends js.Object {
  var atime: js.UndefOr[java.lang.String] = js.undefined
  var bytesPerSecond: js.UndefOr[scala.Double] = js.undefined
  var gid: js.UndefOr[java.lang.String] = js.undefined
  var mtime: js.UndefOr[java.lang.String] = js.undefined
  var posixPermissions: js.UndefOr[java.lang.String] = js.undefined
  var preserveDeletedFiles: js.UndefOr[java.lang.String] = js.undefined
  var preserveDevices: js.UndefOr[java.lang.String] = js.undefined
  var uid: js.UndefOr[java.lang.String] = js.undefined
  var verifyMode: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Atime {
  @scala.inline
  def apply(
    atime: java.lang.String = null,
    bytesPerSecond: scala.Int | scala.Double = null,
    gid: java.lang.String = null,
    mtime: java.lang.String = null,
    posixPermissions: java.lang.String = null,
    preserveDeletedFiles: java.lang.String = null,
    preserveDevices: java.lang.String = null,
    uid: java.lang.String = null,
    verifyMode: java.lang.String = null
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

