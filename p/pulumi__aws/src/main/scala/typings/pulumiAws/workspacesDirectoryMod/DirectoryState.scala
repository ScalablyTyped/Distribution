package typings.pulumiAws.workspacesDirectoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.workspaces.DirectorySelfServicePermissions
import typings.pulumiAws.inputMod.workspaces.DirectoryWorkspaceCreationProperties
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectoryState extends js.Object {
  
  /**
    * The directory alias.
    */
  val alias: js.UndefOr[Input[String]] = js.native
  
  /**
    * The user name for the service account.
    */
  val customerUserName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The directory identifier for registration in WorkSpaces service.
    */
  val directoryId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the directory.
    */
  val directoryName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The directory type.
    */
  val directoryType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The IP addresses of the DNS servers for the directory.
    */
  val dnsIpAddresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
    */
  val iamRoleId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The identifiers of the IP access control groups associated with the directory.
    */
  val ipGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
    */
  val registrationCode: js.UndefOr[Input[String]] = js.native
  
  /**
    * Permissions to enable or disable self-service capabilities. Defined below.
    */
  val selfServicePermissions: js.UndefOr[Input[DirectorySelfServicePermissions]] = js.native
  
  /**
    * The subnets identifiers where the workspaces are created.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * A map of tags assigned to the WorkSpaces directory.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Default properties that are used for creating WorkSpaces. Defined below.
    */
  val workspaceCreationProperties: js.UndefOr[Input[DirectoryWorkspaceCreationProperties]] = js.native
  
  /**
    * The identifier of the security group that is assigned to new WorkSpaces.
    */
  val workspaceSecurityGroupId: js.UndefOr[Input[String]] = js.native
}
object DirectoryState {
  
  @scala.inline
  def apply(): DirectoryState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryState]
  }
  
  @scala.inline
  implicit class DirectoryStateOps[Self <: DirectoryState] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: Input[String]): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setCustomerUserName(value: Input[String]): Self = this.set("customerUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerUserName: Self = this.set("customerUserName", js.undefined)
    
    @scala.inline
    def setDirectoryId(value: Input[String]): Self = this.set("directoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryId: Self = this.set("directoryId", js.undefined)
    
    @scala.inline
    def setDirectoryName(value: Input[String]): Self = this.set("directoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryName: Self = this.set("directoryName", js.undefined)
    
    @scala.inline
    def setDirectoryType(value: Input[String]): Self = this.set("directoryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryType: Self = this.set("directoryType", js.undefined)
    
    @scala.inline
    def setDnsIpAddressesVarargs(value: Input[String]*): Self = this.set("dnsIpAddresses", js.Array(value :_*))
    
    @scala.inline
    def setDnsIpAddresses(value: Input[js.Array[Input[String]]]): Self = this.set("dnsIpAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsIpAddresses: Self = this.set("dnsIpAddresses", js.undefined)
    
    @scala.inline
    def setIamRoleId(value: Input[String]): Self = this.set("iamRoleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamRoleId: Self = this.set("iamRoleId", js.undefined)
    
    @scala.inline
    def setIpGroupIdsVarargs(value: Input[String]*): Self = this.set("ipGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setIpGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("ipGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpGroupIds: Self = this.set("ipGroupIds", js.undefined)
    
    @scala.inline
    def setRegistrationCode(value: Input[String]): Self = this.set("registrationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistrationCode: Self = this.set("registrationCode", js.undefined)
    
    @scala.inline
    def setSelfServicePermissions(value: Input[DirectorySelfServicePermissions]): Self = this.set("selfServicePermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfServicePermissions: Self = this.set("selfServicePermissions", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: Input[String]*): Self = this.set("subnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetIds: Self = this.set("subnetIds", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setWorkspaceCreationProperties(value: Input[DirectoryWorkspaceCreationProperties]): Self = this.set("workspaceCreationProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceCreationProperties: Self = this.set("workspaceCreationProperties", js.undefined)
    
    @scala.inline
    def setWorkspaceSecurityGroupId(value: Input[String]): Self = this.set("workspaceSecurityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceSecurityGroupId: Self = this.set("workspaceSecurityGroupId", js.undefined)
  }
}
