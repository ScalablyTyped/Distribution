package typings.pulumiAws.workspacesGetDirectoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.workspaces.GetDirectorySelfServicePermission
import typings.pulumiAws.outputMod.workspaces.GetDirectoryWorkspaceCreationProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDirectoryResult extends js.Object {
  
  /**
    * The directory alias.
    */
  val alias: String = js.native
  
  /**
    * The user name for the service account.
    */
  val customerUserName: String = js.native
  
  val directoryId: String = js.native
  
  /**
    * The name of the directory.
    */
  val directoryName: String = js.native
  
  /**
    * The directory type.
    */
  val directoryType: String = js.native
  
  /**
    * The IP addresses of the DNS servers for the directory.
    */
  val dnsIpAddresses: js.Array[String] = js.native
  
  /**
    * The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
    */
  val iamRoleId: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * The identifiers of the IP access control groups associated with the directory.
    */
  val ipGroupIds: js.Array[String] = js.native
  
  /**
    * The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
    */
  val registrationCode: String = js.native
  
  /**
    * The permissions to enable or disable self-service capabilities.
    */
  val selfServicePermissions: js.Array[GetDirectorySelfServicePermission] = js.native
  
  /**
    * The identifiers of the subnets where the directory resides.
    */
  val subnetIds: js.Array[String] = js.native
  
  /**
    * A map of tags assigned to the WorkSpaces directory.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The default properties that are used for creating WorkSpaces. Defined below.
    */
  val workspaceCreationProperties: GetDirectoryWorkspaceCreationProperties = js.native
  
  /**
    * The identifier of the security group that is assigned to new WorkSpaces. Defined below.
    */
  val workspaceSecurityGroupId: String = js.native
}
object GetDirectoryResult {
  
  @scala.inline
  def apply(
    alias: String,
    customerUserName: String,
    directoryId: String,
    directoryName: String,
    directoryType: String,
    dnsIpAddresses: js.Array[String],
    iamRoleId: String,
    id: String,
    ipGroupIds: js.Array[String],
    registrationCode: String,
    selfServicePermissions: js.Array[GetDirectorySelfServicePermission],
    subnetIds: js.Array[String],
    workspaceCreationProperties: GetDirectoryWorkspaceCreationProperties,
    workspaceSecurityGroupId: String
  ): GetDirectoryResult = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], customerUserName = customerUserName.asInstanceOf[js.Any], directoryId = directoryId.asInstanceOf[js.Any], directoryName = directoryName.asInstanceOf[js.Any], directoryType = directoryType.asInstanceOf[js.Any], dnsIpAddresses = dnsIpAddresses.asInstanceOf[js.Any], iamRoleId = iamRoleId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ipGroupIds = ipGroupIds.asInstanceOf[js.Any], registrationCode = registrationCode.asInstanceOf[js.Any], selfServicePermissions = selfServicePermissions.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], workspaceCreationProperties = workspaceCreationProperties.asInstanceOf[js.Any], workspaceSecurityGroupId = workspaceSecurityGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectoryResult]
  }
  
  @scala.inline
  implicit class GetDirectoryResultOps[Self <: GetDirectoryResult] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUserName(value: String): Self = this.set("customerUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryId(value: String): Self = this.set("directoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryName(value: String): Self = this.set("directoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryType(value: String): Self = this.set("directoryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsIpAddressesVarargs(value: String*): Self = this.set("dnsIpAddresses", js.Array(value :_*))
    
    @scala.inline
    def setDnsIpAddresses(value: js.Array[String]): Self = this.set("dnsIpAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRoleId(value: String): Self = this.set("iamRoleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpGroupIdsVarargs(value: String*): Self = this.set("ipGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setIpGroupIds(value: js.Array[String]): Self = this.set("ipGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationCode(value: String): Self = this.set("registrationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfServicePermissionsVarargs(value: GetDirectorySelfServicePermission*): Self = this.set("selfServicePermissions", js.Array(value :_*))
    
    @scala.inline
    def setSelfServicePermissions(value: js.Array[GetDirectorySelfServicePermission]): Self = this.set("selfServicePermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("subnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: js.Array[String]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceCreationProperties(value: GetDirectoryWorkspaceCreationProperties): Self = this.set("workspaceCreationProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceSecurityGroupId(value: String): Self = this.set("workspaceSecurityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
