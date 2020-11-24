package typings.pulumiAws.getWorkspaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.workspaces.GetWorkspaceWorkspaceProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWorkspaceResult extends js.Object {
  
  val bundleId: String = js.native
  
  /**
    * The name of the WorkSpace, as seen by the operating system.
    */
  val computerName: String = js.native
  
  val directoryId: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * The IP address of the WorkSpace.
    */
  val ipAddress: String = js.native
  
  val rootVolumeEncryptionEnabled: Boolean = js.native
  
  /**
    * The operational state of the WorkSpace.
    */
  val state: String = js.native
  
  val tags: StringDictionary[String] = js.native
  
  val userName: String = js.native
  
  val userVolumeEncryptionEnabled: Boolean = js.native
  
  val volumeEncryptionKey: String = js.native
  
  val workspaceId: String = js.native
  
  val workspaceProperties: js.Array[GetWorkspaceWorkspaceProperty] = js.native
}
object GetWorkspaceResult {
  
  @scala.inline
  def apply(
    bundleId: String,
    computerName: String,
    directoryId: String,
    id: String,
    ipAddress: String,
    rootVolumeEncryptionEnabled: Boolean,
    state: String,
    tags: StringDictionary[String],
    userName: String,
    userVolumeEncryptionEnabled: Boolean,
    volumeEncryptionKey: String,
    workspaceId: String,
    workspaceProperties: js.Array[GetWorkspaceWorkspaceProperty]
  ): GetWorkspaceResult = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any], computerName = computerName.asInstanceOf[js.Any], directoryId = directoryId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], rootVolumeEncryptionEnabled = rootVolumeEncryptionEnabled.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userVolumeEncryptionEnabled = userVolumeEncryptionEnabled.asInstanceOf[js.Any], volumeEncryptionKey = volumeEncryptionKey.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any], workspaceProperties = workspaceProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkspaceResult]
  }
  
  @scala.inline
  implicit class GetWorkspaceResultOps[Self <: GetWorkspaceResult] (val x: Self) extends AnyVal {
    
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
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputerName(value: String): Self = this.set("computerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryId(value: String): Self = this.set("directoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootVolumeEncryptionEnabled(value: Boolean): Self = this.set("rootVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserVolumeEncryptionEnabled(value: Boolean): Self = this.set("userVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeEncryptionKey(value: String): Self = this.set("volumeEncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceId(value: String): Self = this.set("workspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspacePropertiesVarargs(value: GetWorkspaceWorkspaceProperty*): Self = this.set("workspaceProperties", js.Array(value :_*))
    
    @scala.inline
    def setWorkspaceProperties(value: js.Array[GetWorkspaceWorkspaceProperty]): Self = this.set("workspaceProperties", value.asInstanceOf[js.Any])
  }
}
