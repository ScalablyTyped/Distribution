package typings.pulumiAws.amiLaunchPermissionMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmiLaunchPermissionState extends js.Object {
  
  /**
    * An AWS Account ID to add launch permissions.
    */
  val accountId: js.UndefOr[Input[String]] = js.native
  
  /**
    * A region-unique name for the AMI.
    */
  val imageId: js.UndefOr[Input[String]] = js.native
}
object AmiLaunchPermissionState {
  
  @scala.inline
  def apply(): AmiLaunchPermissionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmiLaunchPermissionState]
  }
  
  @scala.inline
  implicit class AmiLaunchPermissionStateOps[Self <: AmiLaunchPermissionState] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: Input[String]): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setImageId(value: Input[String]): Self = this.set("imageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageId: Self = this.set("imageId", js.undefined)
  }
}
