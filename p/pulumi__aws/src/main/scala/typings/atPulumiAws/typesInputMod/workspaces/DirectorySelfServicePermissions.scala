package typings.atPulumiAws.typesInputMod.workspaces

import typings.atPulumiPulumi.outputMod.Input
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
  def apply(
    changeComputeType: Input[Boolean] = null,
    increaseVolumeSize: Input[Boolean] = null,
    rebuildWorkspace: Input[Boolean] = null,
    restartWorkspace: Input[Boolean] = null,
    switchRunningMode: Input[Boolean] = null
  ): DirectorySelfServicePermissions = {
    val __obj = js.Dynamic.literal()
    if (changeComputeType != null) __obj.updateDynamic("changeComputeType")(changeComputeType.asInstanceOf[js.Any])
    if (increaseVolumeSize != null) __obj.updateDynamic("increaseVolumeSize")(increaseVolumeSize.asInstanceOf[js.Any])
    if (rebuildWorkspace != null) __obj.updateDynamic("rebuildWorkspace")(rebuildWorkspace.asInstanceOf[js.Any])
    if (restartWorkspace != null) __obj.updateDynamic("restartWorkspace")(restartWorkspace.asInstanceOf[js.Any])
    if (switchRunningMode != null) __obj.updateDynamic("switchRunningMode")(switchRunningMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectorySelfServicePermissions]
  }
}

