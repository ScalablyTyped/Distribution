package typings.pulumiAws.outputMod.efs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessPointRootDirectoryCreationInfo extends js.Object {
  /**
    * POSIX owner group ID
    */
  var ownerGid: Double = js.native
  /**
    * POSIX owner user ID
    */
  var ownerUid: Double = js.native
  /**
    * POSIX permissions mode
    */
  var permissions: String = js.native
}

object GetAccessPointRootDirectoryCreationInfo {
  @scala.inline
  def apply(ownerGid: Double, ownerUid: Double, permissions: String): GetAccessPointRootDirectoryCreationInfo = {
    val __obj = js.Dynamic.literal(ownerGid = ownerGid.asInstanceOf[js.Any], ownerUid = ownerUid.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessPointRootDirectoryCreationInfo]
  }
  @scala.inline
  implicit class GetAccessPointRootDirectoryCreationInfoOps[Self <: GetAccessPointRootDirectoryCreationInfo] (val x: Self) extends AnyVal {
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

