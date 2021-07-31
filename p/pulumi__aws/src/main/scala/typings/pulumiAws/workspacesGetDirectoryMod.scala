package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.workspaces.GetDirectoryWorkspaceCreationProperties
import typings.pulumiAws.outputMod.workspaces.GetDirectorySelfServicePermission
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspacesGetDirectoryMod {
  
  @JSImport("@pulumi/aws/workspaces/getDirectory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getDirectory(args: GetDirectoryArgs): js.Promise[GetDirectoryResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectory")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetDirectoryResult]]
  @scala.inline
  def getDirectory(args: GetDirectoryArgs, opts: InvokeOptions): js.Promise[GetDirectoryResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirectory")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetDirectoryResult]]
  
  trait GetDirectoryArgs extends StObject {
    
    /**
      * The directory identifier for registration in WorkSpaces service.
      */
    val directoryId: String
    
    /**
      * A map of tags assigned to the WorkSpaces directory.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The default properties that are used for creating WorkSpaces. Defined below.
      */
    val workspaceCreationProperties: js.UndefOr[GetDirectoryWorkspaceCreationProperties] = js.undefined
  }
  object GetDirectoryArgs {
    
    @scala.inline
    def apply(directoryId: String): GetDirectoryArgs = {
      val __obj = js.Dynamic.literal(directoryId = directoryId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDirectoryArgs]
    }
    
    @scala.inline
    implicit class GetDirectoryArgsMutableBuilder[Self <: GetDirectoryArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectoryId(value: String): Self = StObject.set(x, "directoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setWorkspaceCreationProperties(value: GetDirectoryWorkspaceCreationProperties): Self = StObject.set(x, "workspaceCreationProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspaceCreationPropertiesUndefined: Self = StObject.set(x, "workspaceCreationProperties", js.undefined)
    }
  }
  
  trait GetDirectoryResult extends StObject {
    
    /**
      * The directory alias.
      */
    val alias: String
    
    /**
      * The user name for the service account.
      */
    val customerUserName: String
    
    val directoryId: String
    
    /**
      * The name of the directory.
      */
    val directoryName: String
    
    /**
      * The directory type.
      */
    val directoryType: String
    
    /**
      * The IP addresses of the DNS servers for the directory.
      */
    val dnsIpAddresses: js.Array[String]
    
    /**
      * The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
      */
    val iamRoleId: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The identifiers of the IP access control groups associated with the directory.
      */
    val ipGroupIds: js.Array[String]
    
    /**
      * The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
      */
    val registrationCode: String
    
    /**
      * The permissions to enable or disable self-service capabilities.
      */
    val selfServicePermissions: js.Array[GetDirectorySelfServicePermission]
    
    /**
      * The identifiers of the subnets where the directory resides.
      */
    val subnetIds: js.Array[String]
    
    /**
      * A map of tags assigned to the WorkSpaces directory.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The default properties that are used for creating WorkSpaces. Defined below.
      */
    val workspaceCreationProperties: typings.pulumiAws.outputMod.workspaces.GetDirectoryWorkspaceCreationProperties
    
    /**
      * The identifier of the security group that is assigned to new WorkSpaces. Defined below.
      */
    val workspaceSecurityGroupId: String
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
      workspaceCreationProperties: typings.pulumiAws.outputMod.workspaces.GetDirectoryWorkspaceCreationProperties,
      workspaceSecurityGroupId: String
    ): GetDirectoryResult = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], customerUserName = customerUserName.asInstanceOf[js.Any], directoryId = directoryId.asInstanceOf[js.Any], directoryName = directoryName.asInstanceOf[js.Any], directoryType = directoryType.asInstanceOf[js.Any], dnsIpAddresses = dnsIpAddresses.asInstanceOf[js.Any], iamRoleId = iamRoleId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ipGroupIds = ipGroupIds.asInstanceOf[js.Any], registrationCode = registrationCode.asInstanceOf[js.Any], selfServicePermissions = selfServicePermissions.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], workspaceCreationProperties = workspaceCreationProperties.asInstanceOf[js.Any], workspaceSecurityGroupId = workspaceSecurityGroupId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDirectoryResult]
    }
    
    @scala.inline
    implicit class GetDirectoryResultMutableBuilder[Self <: GetDirectoryResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerUserName(value: String): Self = StObject.set(x, "customerUserName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryId(value: String): Self = StObject.set(x, "directoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryName(value: String): Self = StObject.set(x, "directoryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryType(value: String): Self = StObject.set(x, "directoryType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsIpAddresses(value: js.Array[String]): Self = StObject.set(x, "dnsIpAddresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsIpAddressesVarargs(value: String*): Self = StObject.set(x, "dnsIpAddresses", js.Array(value :_*))
      
      @scala.inline
      def setIamRoleId(value: String): Self = StObject.set(x, "iamRoleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpGroupIds(value: js.Array[String]): Self = StObject.set(x, "ipGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpGroupIdsVarargs(value: String*): Self = StObject.set(x, "ipGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setRegistrationCode(value: String): Self = StObject.set(x, "registrationCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfServicePermissions(value: js.Array[GetDirectorySelfServicePermission]): Self = StObject.set(x, "selfServicePermissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfServicePermissionsVarargs(value: GetDirectorySelfServicePermission*): Self = StObject.set(x, "selfServicePermissions", js.Array(value :_*))
      
      @scala.inline
      def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setWorkspaceCreationProperties(value: typings.pulumiAws.outputMod.workspaces.GetDirectoryWorkspaceCreationProperties): Self = StObject.set(x, "workspaceCreationProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspaceSecurityGroupId(value: String): Self = StObject.set(x, "workspaceSecurityGroupId", value.asInstanceOf[js.Any])
    }
  }
}
