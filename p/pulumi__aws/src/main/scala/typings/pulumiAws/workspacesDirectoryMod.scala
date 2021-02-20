package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.workspaces.DirectorySelfServicePermissions
import typings.pulumiAws.outputMod.workspaces.DirectoryWorkspaceCreationProperties
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspacesDirectoryMod {
  
  @JSImport("@pulumi/aws/workspaces/directory", "Directory")
  @js.native
  class Directory protected () extends CustomResource {
    /**
      * Create a Directory resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DirectoryArgs) = this()
    def this(name: String, args: DirectoryArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The directory alias.
      */
    val alias: Output_[String] = js.native
    
    /**
      * The user name for the service account.
      */
    val customerUserName: Output_[String] = js.native
    
    /**
      * The directory identifier for registration in WorkSpaces service.
      */
    val directoryId: Output_[String] = js.native
    
    /**
      * The name of the directory.
      */
    val directoryName: Output_[String] = js.native
    
    /**
      * The directory type.
      */
    val directoryType: Output_[String] = js.native
    
    /**
      * The IP addresses of the DNS servers for the directory.
      */
    val dnsIpAddresses: Output_[js.Array[String]] = js.native
    
    /**
      * The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
      */
    val iamRoleId: Output_[String] = js.native
    
    /**
      * The identifiers of the IP access control groups associated with the directory.
      */
    val ipGroupIds: Output_[js.Array[String]] = js.native
    
    /**
      * The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
      */
    val registrationCode: Output_[String] = js.native
    
    /**
      * Permissions to enable or disable self-service capabilities. Defined below.
      */
    val selfServicePermissions: Output_[DirectorySelfServicePermissions] = js.native
    
    /**
      * The subnets identifiers where the workspaces are created.
      */
    val subnetIds: Output_[js.Array[String]] = js.native
    
    /**
      * A map of tags assigned to the WorkSpaces directory.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Default properties that are used for creating WorkSpaces. Defined below.
      */
    val workspaceCreationProperties: Output_[DirectoryWorkspaceCreationProperties] = js.native
    
    /**
      * The identifier of the security group that is assigned to new WorkSpaces.
      */
    val workspaceSecurityGroupId: Output_[String] = js.native
  }
  /* static members */
  object Directory {
    
    /**
      * Get an existing Directory resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/workspaces/directory", "Directory.get")
    @js.native
    def get(name: String, id: Input[ID]): Directory = js.native
    @JSImport("@pulumi/aws/workspaces/directory", "Directory.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Directory = js.native
    @JSImport("@pulumi/aws/workspaces/directory", "Directory.get")
    @js.native
    def get(name: String, id: Input[ID], state: DirectoryState): Directory = js.native
    @JSImport("@pulumi/aws/workspaces/directory", "Directory.get")
    @js.native
    def get(name: String, id: Input[ID], state: DirectoryState, opts: CustomResourceOptions): Directory = js.native
    
    /**
      * Returns true if the given object is an instance of Directory.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/workspaces/directory", "Directory.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/workspaces/directory.Directory */ Boolean = js.native
  }
  
  @js.native
  trait DirectoryArgs extends StObject {
    
    /**
      * The directory identifier for registration in WorkSpaces service.
      */
    val directoryId: Input[String] = js.native
    
    /**
      * Permissions to enable or disable self-service capabilities. Defined below.
      */
    val selfServicePermissions: js.UndefOr[Input[typings.pulumiAws.inputMod.workspaces.DirectorySelfServicePermissions]] = js.native
    
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
    val workspaceCreationProperties: js.UndefOr[
        Input[typings.pulumiAws.inputMod.workspaces.DirectoryWorkspaceCreationProperties]
      ] = js.native
  }
  object DirectoryArgs {
    
    @scala.inline
    def apply(directoryId: Input[String]): DirectoryArgs = {
      val __obj = js.Dynamic.literal(directoryId = directoryId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryArgs]
    }
    
    @scala.inline
    implicit class DirectoryArgsMutableBuilder[Self <: DirectoryArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectoryId(value: Input[String]): Self = StObject.set(x, "directoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfServicePermissions(value: Input[typings.pulumiAws.inputMod.workspaces.DirectorySelfServicePermissions]): Self = StObject.set(x, "selfServicePermissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfServicePermissionsUndefined: Self = StObject.set(x, "selfServicePermissions", js.undefined)
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setWorkspaceCreationProperties(value: Input[typings.pulumiAws.inputMod.workspaces.DirectoryWorkspaceCreationProperties]): Self = StObject.set(x, "workspaceCreationProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspaceCreationPropertiesUndefined: Self = StObject.set(x, "workspaceCreationProperties", js.undefined)
    }
  }
  
  @js.native
  trait DirectoryState extends StObject {
    
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
    val selfServicePermissions: js.UndefOr[Input[typings.pulumiAws.inputMod.workspaces.DirectorySelfServicePermissions]] = js.native
    
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
    val workspaceCreationProperties: js.UndefOr[
        Input[typings.pulumiAws.inputMod.workspaces.DirectoryWorkspaceCreationProperties]
      ] = js.native
    
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
    implicit class DirectoryStateMutableBuilder[Self <: DirectoryState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: Input[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setCustomerUserName(value: Input[String]): Self = StObject.set(x, "customerUserName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerUserNameUndefined: Self = StObject.set(x, "customerUserName", js.undefined)
      
      @scala.inline
      def setDirectoryId(value: Input[String]): Self = StObject.set(x, "directoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryIdUndefined: Self = StObject.set(x, "directoryId", js.undefined)
      
      @scala.inline
      def setDirectoryName(value: Input[String]): Self = StObject.set(x, "directoryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryNameUndefined: Self = StObject.set(x, "directoryName", js.undefined)
      
      @scala.inline
      def setDirectoryType(value: Input[String]): Self = StObject.set(x, "directoryType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryTypeUndefined: Self = StObject.set(x, "directoryType", js.undefined)
      
      @scala.inline
      def setDnsIpAddresses(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "dnsIpAddresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsIpAddressesUndefined: Self = StObject.set(x, "dnsIpAddresses", js.undefined)
      
      @scala.inline
      def setDnsIpAddressesVarargs(value: Input[String]*): Self = StObject.set(x, "dnsIpAddresses", js.Array(value :_*))
      
      @scala.inline
      def setIamRoleId(value: Input[String]): Self = StObject.set(x, "iamRoleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamRoleIdUndefined: Self = StObject.set(x, "iamRoleId", js.undefined)
      
      @scala.inline
      def setIpGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "ipGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpGroupIdsUndefined: Self = StObject.set(x, "ipGroupIds", js.undefined)
      
      @scala.inline
      def setIpGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "ipGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setRegistrationCode(value: Input[String]): Self = StObject.set(x, "registrationCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistrationCodeUndefined: Self = StObject.set(x, "registrationCode", js.undefined)
      
      @scala.inline
      def setSelfServicePermissions(value: Input[typings.pulumiAws.inputMod.workspaces.DirectorySelfServicePermissions]): Self = StObject.set(x, "selfServicePermissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfServicePermissionsUndefined: Self = StObject.set(x, "selfServicePermissions", js.undefined)
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setWorkspaceCreationProperties(value: Input[typings.pulumiAws.inputMod.workspaces.DirectoryWorkspaceCreationProperties]): Self = StObject.set(x, "workspaceCreationProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspaceCreationPropertiesUndefined: Self = StObject.set(x, "workspaceCreationProperties", js.undefined)
      
      @scala.inline
      def setWorkspaceSecurityGroupId(value: Input[String]): Self = StObject.set(x, "workspaceSecurityGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspaceSecurityGroupIdUndefined: Self = StObject.set(x, "workspaceSecurityGroupId", js.undefined)
    }
  }
}
