package typings.atPulumiAws.typesOutputMod.workspaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectorySelfServicePermissions extends js.Object {
  /**
    * Whether WorkSpaces directory users can change the compute type (bundle) for their workspace. Default `false`.
    */
  var changeComputeType: js.UndefOr[Boolean] = js.native
  /**
    * Whether WorkSpaces directory users can increase the volume size of the drives on their workspace. Default `false`.
    */
  var increaseVolumeSize: js.UndefOr[Boolean] = js.native
  /**
    * Whether WorkSpaces directory users can rebuild the operating system of a workspace to its original state. Default `false`.
    */
  var rebuildWorkspace: js.UndefOr[Boolean] = js.native
  /**
    * Whether WorkSpaces directory users can restart their workspace. Default `true`.
    */
  var restartWorkspace: js.UndefOr[Boolean] = js.native
  /**
    * Whether WorkSpaces directory users can switch the running mode of their workspace. Default `false`.
    */
  var switchRunningMode: js.UndefOr[Boolean] = js.native
}

object DirectorySelfServicePermissions {
  @scala.inline
  def apply(
    changeComputeType: js.UndefOr[Boolean] = js.undefined,
    increaseVolumeSize: js.UndefOr[Boolean] = js.undefined,
    rebuildWorkspace: js.UndefOr[Boolean] = js.undefined,
    restartWorkspace: js.UndefOr[Boolean] = js.undefined,
    switchRunningMode: js.UndefOr[Boolean] = js.undefined
  ): DirectorySelfServicePermissions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(changeComputeType)) __obj.updateDynamic("changeComputeType")(changeComputeType.asInstanceOf[js.Any])
    if (!js.isUndefined(increaseVolumeSize)) __obj.updateDynamic("increaseVolumeSize")(increaseVolumeSize.asInstanceOf[js.Any])
    if (!js.isUndefined(rebuildWorkspace)) __obj.updateDynamic("rebuildWorkspace")(rebuildWorkspace.asInstanceOf[js.Any])
    if (!js.isUndefined(restartWorkspace)) __obj.updateDynamic("restartWorkspace")(restartWorkspace.asInstanceOf[js.Any])
    if (!js.isUndefined(switchRunningMode)) __obj.updateDynamic("switchRunningMode")(switchRunningMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectorySelfServicePermissions]
  }
}

