package typings.pulumiAws.inputMod.efs

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessPointRootDirectoryCreationInfo extends js.Object {
  
  /**
    * Specifies the POSIX group ID to apply to the `rootDirectory`.
    */
  var ownerGid: Input[Double] = js.native
  
  /**
    * Specifies the POSIX user ID to apply to the `rootDirectory`.
    */
  var ownerUid: Input[Double] = js.native
  
  /**
    * Specifies the POSIX permissions to apply to the RootDirectory, in the format of an octal number representing the file's mode bits.
    */
  var permissions: Input[String] = js.native
}
object AccessPointRootDirectoryCreationInfo {
  
  @scala.inline
  def apply(ownerGid: Input[Double], ownerUid: Input[Double], permissions: Input[String]): AccessPointRootDirectoryCreationInfo = {
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
    def setOwnerGid(value: Input[Double]): Self = this.set("ownerGid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUid(value: Input[Double]): Self = this.set("ownerUid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: Input[String]): Self = this.set("permissions", value.asInstanceOf[js.Any])
  }
}
