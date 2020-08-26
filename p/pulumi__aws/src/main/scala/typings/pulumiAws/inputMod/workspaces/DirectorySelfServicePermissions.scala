package typings.pulumiAws.inputMod.workspaces

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectorySelfServicePermissions extends js.Object {
  /**
    * Whether WorkSpaces directory users can change the compute type (bundle) for their workspace. Default `false`.
    */
  var changeComputeType: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether WorkSpaces directory users can increase the volume size of the drives on their workspace. Default `false`.
    */
  var increaseVolumeSize: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether WorkSpaces directory users can rebuild the operating system of a workspace to its original state. Default `false`.
    */
  var rebuildWorkspace: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether WorkSpaces directory users can restart their workspace. Default `true`.
    */
  var restartWorkspace: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether WorkSpaces directory users can switch the running mode of their workspace. Default `false`.
    */
  var switchRunningMode: js.UndefOr[Input[Boolean]] = js.native
}

object DirectorySelfServicePermissions {
  @scala.inline
  def apply(): DirectorySelfServicePermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectorySelfServicePermissions]
  }
  @scala.inline
  implicit class DirectorySelfServicePermissionsOps[Self <: DirectorySelfServicePermissions] (val x: Self) extends AnyVal {
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
    def setChangeComputeType(value: Input[Boolean]): Self = this.set("changeComputeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeComputeType: Self = this.set("changeComputeType", js.undefined)
    @scala.inline
    def setIncreaseVolumeSize(value: Input[Boolean]): Self = this.set("increaseVolumeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncreaseVolumeSize: Self = this.set("increaseVolumeSize", js.undefined)
    @scala.inline
    def setRebuildWorkspace(value: Input[Boolean]): Self = this.set("rebuildWorkspace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRebuildWorkspace: Self = this.set("rebuildWorkspace", js.undefined)
    @scala.inline
    def setRestartWorkspace(value: Input[Boolean]): Self = this.set("restartWorkspace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestartWorkspace: Self = this.set("restartWorkspace", js.undefined)
    @scala.inline
    def setSwitchRunningMode(value: Input[Boolean]): Self = this.set("switchRunningMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwitchRunningMode: Self = this.set("switchRunningMode", js.undefined)
  }
  
}

