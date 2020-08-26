package typings.pulumiAws.inputMod.efs

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessPointRootDirectory extends js.Object {
  /**
    * Specifies the POSIX IDs and permissions to apply to the access point's Root Directory. See Creation Info below.
    */
  var creationInfo: js.UndefOr[Input[AccessPointRootDirectoryCreationInfo]] = js.native
  /**
    * Specifies the path on the EFS file system to expose as the root directory to NFS clients using the access point to access the EFS file system. A path can have up to four subdirectories. If the specified path does not exist, you are required to provide `creationInfo`.
    */
  var path: js.UndefOr[Input[String]] = js.native
}

object AccessPointRootDirectory {
  @scala.inline
  def apply(): AccessPointRootDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPointRootDirectory]
  }
  @scala.inline
  implicit class AccessPointRootDirectoryOps[Self <: AccessPointRootDirectory] (val x: Self) extends AnyVal {
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
    def setCreationInfo(value: Input[AccessPointRootDirectoryCreationInfo]): Self = this.set("creationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationInfo: Self = this.set("creationInfo", js.undefined)
    @scala.inline
    def setPath(value: Input[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

