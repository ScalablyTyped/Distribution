package typings.pulumiAws.outputMod.workspaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceWorkspaceProperties extends js.Object {
  /**
    * The compute type. For more information, see [Amazon WorkSpaces Bundles](http://aws.amazon.com/workspaces/details/#Amazon_WorkSpaces_Bundles). Valid values are `VALUE`, `STANDARD`, `PERFORMANCE`, `POWER`, `GRAPHICS`, `POWERPRO` and `GRAPHICSPRO`.
    */
  var computeTypeName: js.UndefOr[String] = js.native
  /**
    * The size of the root volume.
    */
  var rootVolumeSizeGib: js.UndefOr[Double] = js.native
  /**
    * The running mode. For more information, see [Manage the WorkSpace Running Mode](https://docs.aws.amazon.com/workspaces/latest/adminguide/running-mode.html). Valid values are `AUTO_STOP` and `ALWAYS_ON`.
    */
  var runningMode: js.UndefOr[String] = js.native
  /**
    * The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60-minute intervals.
    */
  var runningModeAutoStopTimeoutInMinutes: Double = js.native
  /**
    * The size of the user storage.
    */
  var userVolumeSizeGib: js.UndefOr[Double] = js.native
}

object WorkspaceWorkspaceProperties {
  @scala.inline
  def apply(runningModeAutoStopTimeoutInMinutes: Double): WorkspaceWorkspaceProperties = {
    val __obj = js.Dynamic.literal(runningModeAutoStopTimeoutInMinutes = runningModeAutoStopTimeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceWorkspaceProperties]
  }
  @scala.inline
  implicit class WorkspaceWorkspacePropertiesOps[Self <: WorkspaceWorkspaceProperties] (val x: Self) extends AnyVal {
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
    def setRunningModeAutoStopTimeoutInMinutes(value: Double): Self = this.set("runningModeAutoStopTimeoutInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setComputeTypeName(value: String): Self = this.set("computeTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputeTypeName: Self = this.set("computeTypeName", js.undefined)
    @scala.inline
    def setRootVolumeSizeGib(value: Double): Self = this.set("rootVolumeSizeGib", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootVolumeSizeGib: Self = this.set("rootVolumeSizeGib", js.undefined)
    @scala.inline
    def setRunningMode(value: String): Self = this.set("runningMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunningMode: Self = this.set("runningMode", js.undefined)
    @scala.inline
    def setUserVolumeSizeGib(value: Double): Self = this.set("userVolumeSizeGib", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserVolumeSizeGib: Self = this.set("userVolumeSizeGib", js.undefined)
  }
  
}

