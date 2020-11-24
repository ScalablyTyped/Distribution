package typings.pulumiAws.outputMod.workspaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDirectorySelfServicePermission extends js.Object {
  
  /**
    * Whether WorkSpaces directory users can change the compute type (bundle) for their workspace.
    */
  var changeComputeType: Boolean = js.native
  
  /**
    * Whether WorkSpaces directory users can increase the volume size of the drives on their workspace.
    */
  var increaseVolumeSize: Boolean = js.native
  
  /**
    * Whether WorkSpaces directory users can rebuild the operating system of a workspace to its original state.
    */
  var rebuildWorkspace: Boolean = js.native
  
  /**
    * Whether WorkSpaces directory users can restart their workspace.
    */
  var restartWorkspace: Boolean = js.native
  
  /**
    * Whether WorkSpaces directory users can switch the running mode of their workspace.
    */
  var switchRunningMode: Boolean = js.native
}
object GetDirectorySelfServicePermission {
  
  @scala.inline
  def apply(
    changeComputeType: Boolean,
    increaseVolumeSize: Boolean,
    rebuildWorkspace: Boolean,
    restartWorkspace: Boolean,
    switchRunningMode: Boolean
  ): GetDirectorySelfServicePermission = {
    val __obj = js.Dynamic.literal(changeComputeType = changeComputeType.asInstanceOf[js.Any], increaseVolumeSize = increaseVolumeSize.asInstanceOf[js.Any], rebuildWorkspace = rebuildWorkspace.asInstanceOf[js.Any], restartWorkspace = restartWorkspace.asInstanceOf[js.Any], switchRunningMode = switchRunningMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectorySelfServicePermission]
  }
  
  @scala.inline
  implicit class GetDirectorySelfServicePermissionOps[Self <: GetDirectorySelfServicePermission] (val x: Self) extends AnyVal {
    
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
    def setChangeComputeType(value: Boolean): Self = this.set("changeComputeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreaseVolumeSize(value: Boolean): Self = this.set("increaseVolumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebuildWorkspace(value: Boolean): Self = this.set("rebuildWorkspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartWorkspace(value: Boolean): Self = this.set("restartWorkspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchRunningMode(value: Boolean): Self = this.set("switchRunningMode", value.asInstanceOf[js.Any])
  }
}
