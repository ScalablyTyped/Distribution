package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AtimeBytesPerSecond extends js.Object {
  var atime: js.UndefOr[Input[String]] = js.undefined
  var bytesPerSecond: js.UndefOr[Input[Double]] = js.undefined
  var gid: js.UndefOr[Input[String]] = js.undefined
  var mtime: js.UndefOr[Input[String]] = js.undefined
  var posixPermissions: js.UndefOr[Input[String]] = js.undefined
  var preserveDeletedFiles: js.UndefOr[Input[String]] = js.undefined
  var preserveDevices: js.UndefOr[Input[String]] = js.undefined
  var uid: js.UndefOr[Input[String]] = js.undefined
  var verifyMode: js.UndefOr[Input[String]] = js.undefined
}

object Anon_AtimeBytesPerSecond {
  @scala.inline
  def apply(
    atime: Input[String] = null,
    bytesPerSecond: Input[Double] = null,
    gid: Input[String] = null,
    mtime: Input[String] = null,
    posixPermissions: Input[String] = null,
    preserveDeletedFiles: Input[String] = null,
    preserveDevices: Input[String] = null,
    uid: Input[String] = null,
    verifyMode: Input[String] = null
  ): Anon_AtimeBytesPerSecond = {
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
    __obj.asInstanceOf[Anon_AtimeBytesPerSecond]
  }
}

