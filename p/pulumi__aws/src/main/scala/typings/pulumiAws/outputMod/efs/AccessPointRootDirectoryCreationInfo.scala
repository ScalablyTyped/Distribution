package typings.pulumiAws.outputMod.efs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessPointRootDirectoryCreationInfo extends js.Object {
  /**
    * Specifies the POSIX group ID to apply to the `rootDirectory`.
    */
  var ownerGid: Double = js.native
  /**
    * Specifies the POSIX user ID to apply to the `rootDirectory`.
    */
  var ownerUid: Double = js.native
  /**
    * Specifies the POSIX permissions to apply to the RootDirectory, in the format of an octal number representing the file's mode bits.
    */
  var permissions: String = js.native
}

object AccessPointRootDirectoryCreationInfo {
  @scala.inline
  def apply(ownerGid: Double, ownerUid: Double, permissions: String): AccessPointRootDirectoryCreationInfo = {
    val __obj = js.Dynamic.literal(ownerGid = ownerGid.asInstanceOf[js.Any], ownerUid = ownerUid.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPointRootDirectoryCreationInfo]
  }
  @scala.inline
  implicit class AccessPointRootDirectoryCreationInfoOps[Self <: AccessPointRootDirectoryCreationInfo] (val x: Self) extends AnyVal {
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
    def setOwnerGid(value: Double): Self = this.set("ownerGid", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerUid(value: Double): Self = this.set("ownerUid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissions(value: String): Self = this.set("permissions", value.asInstanceOf[js.Any])
  }
  
}

