package typings.pulumiAws.workspaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.workspaces.WorkspaceWorkspaceProperties
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceState extends js.Object {
  
  /**
    * The ID of the bundle for the WorkSpace.
    */
  val bundleId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the WorkSpace, as seen by the operating system.
    */
  val computerName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the directory for the WorkSpace.
    */
  val directoryId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The IP address of the WorkSpace.
    */
  val ipAddress: js.UndefOr[Input[String]] = js.native
  
  /**
    * Indicates whether the data stored on the root volume is encrypted.
    */
  val rootVolumeEncryptionEnabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The operational state of the WorkSpace.
    */
  val state: js.UndefOr[Input[String]] = js.native
  
  /**
    * The tags for the WorkSpace.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The user name of the user for the WorkSpace. This user name must exist in the directory for the WorkSpace.
    */
  val userName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Indicates whether the data stored on the user volume is encrypted.
    */
  val userVolumeEncryptionEnabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The symmetric AWS KMS customer master key (CMK) used to encrypt data stored on your WorkSpace. Amazon WorkSpaces does not support asymmetric CMKs.
    */
  val volumeEncryptionKey: js.UndefOr[Input[String]] = js.native
  
  /**
    * The WorkSpace properties.
    */
  val workspaceProperties: js.UndefOr[Input[WorkspaceWorkspaceProperties]] = js.native
}
object WorkspaceState {
  
  @scala.inline
  def apply(): WorkspaceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceState]
  }
  
  @scala.inline
  implicit class WorkspaceStateOps[Self <: WorkspaceState] (val x: Self) extends AnyVal {
    
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
    def setBundleId(value: Input[String]): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    
    @scala.inline
    def setComputerName(value: Input[String]): Self = this.set("computerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputerName: Self = this.set("computerName", js.undefined)
    
    @scala.inline
    def setDirectoryId(value: Input[String]): Self = this.set("directoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryId: Self = this.set("directoryId", js.undefined)
    
    @scala.inline
    def setIpAddress(value: Input[String]): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    
    @scala.inline
    def setRootVolumeEncryptionEnabled(value: Input[Boolean]): Self = this.set("rootVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootVolumeEncryptionEnabled: Self = this.set("rootVolumeEncryptionEnabled", js.undefined)
    
    @scala.inline
    def setState(value: Input[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setUserName(value: Input[String]): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
    
    @scala.inline
    def setUserVolumeEncryptionEnabled(value: Input[Boolean]): Self = this.set("userVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserVolumeEncryptionEnabled: Self = this.set("userVolumeEncryptionEnabled", js.undefined)
    
    @scala.inline
    def setVolumeEncryptionKey(value: Input[String]): Self = this.set("volumeEncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeEncryptionKey: Self = this.set("volumeEncryptionKey", js.undefined)
    
    @scala.inline
    def setWorkspaceProperties(value: Input[WorkspaceWorkspaceProperties]): Self = this.set("workspaceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceProperties: Self = this.set("workspaceProperties", js.undefined)
  }
}
