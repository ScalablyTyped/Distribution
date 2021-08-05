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
    
    @JSImport("@pulumi/aws/workspaces/directory", "Directory")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Directory resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Directory = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Directory]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Directory = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Directory]
    inline def get(name: String, id: Input[ID], state: DirectoryState): Directory = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Directory]
    inline def get(name: String, id: Input[ID], state: DirectoryState, opts: CustomResourceOptions): Directory = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Directory]
    
    /**
      * Returns true if the given object is an instance of Directory.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/workspaces/directory.Directory */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/workspaces/directory.Directory */ Boolean]
  }
  
  trait DirectoryArgs extends StObject {
    
    /**
      * The directory identifier for registration in WorkSpaces service.
      */
    val directoryId: Input[String]
    
    /**
      * Permissions to enable or disable self-service capabilities. Defined below.
      */
    val selfServicePermissions: js.UndefOr[Input[typings.pulumiAws.inputMod.workspaces.DirectorySelfServicePermissions]] = js.undefined
    
    /**
      * The subnets identifiers where the workspaces are created.
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A map of tags assigned to the WorkSpaces directory.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Default properties that are used for creating WorkSpaces. Defined below.
      */
    val workspaceCreationProperties: js.UndefOr[
        Input[typings.pulumiAws.inputMod.workspaces.DirectoryWorkspaceCreationProperties]
      ] = js.undefined
  }
  object DirectoryArgs {
    
    inline def apply(directoryId: Input[String]): DirectoryArgs = {
      val __obj = js.Dynamic.literal(directoryId = directoryId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryArgs]
    }
    
    extension [Self <: DirectoryArgs](x: Self) {
      
      inline def setDirectoryId(value: Input[String]): Self = StObject.set(x, "directoryId", value.asInstanceOf[js.Any])
      
      inline def setSelfServicePermissions(value: Input[typings.pulumiAws.inputMod.workspaces.DirectorySelfServicePermissions]): Self = StObject.set(x, "selfServicePermissions", value.asInstanceOf[js.Any])
      
      inline def setSelfServicePermissionsUndefined: Self = StObject.set(x, "selfServicePermissions", js.undefined)
      
      inline def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      inline def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setWorkspaceCreationProperties(value: Input[typings.pulumiAws.inputMod.workspaces.DirectoryWorkspaceCreationProperties]): Self = StObject.set(x, "workspaceCreationProperties", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceCreationPropertiesUndefined: Self = StObject.set(x, "workspaceCreationProperties", js.undefined)
    }
  }
  
  trait DirectoryState extends StObject {
    
    /**
      * The directory alias.
      */
    val alias: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The user name for the service account.
      */
    val customerUserName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The directory identifier for registration in WorkSpaces service.
      */
    val directoryId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the directory.
      */
    val directoryName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The directory type.
      */
    val directoryType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IP addresses of the DNS servers for the directory.
      */
    val dnsIpAddresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
      */
    val iamRoleId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The identifiers of the IP access control groups associated with the directory.
      */
    val ipGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
      */
    val registrationCode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Permissions to enable or disable self-service capabilities. Defined below.
      */
    val selfServicePermissions: js.UndefOr[Input[typings.pulumiAws.inputMod.workspaces.DirectorySelfServicePermissions]] = js.undefined
    
    /**
      * The subnets identifiers where the workspaces are created.
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A map of tags assigned to the WorkSpaces directory.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Default properties that are used for creating WorkSpaces. Defined below.
      */
    val workspaceCreationProperties: js.UndefOr[
        Input[typings.pulumiAws.inputMod.workspaces.DirectoryWorkspaceCreationProperties]
      ] = js.undefined
    
    /**
      * The identifier of the security group that is assigned to new WorkSpaces.
      */
    val workspaceSecurityGroupId: js.UndefOr[Input[String]] = js.undefined
  }
  object DirectoryState {
    
    inline def apply(): DirectoryState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryState]
    }
    
    extension [Self <: DirectoryState](x: Self) {
      
      inline def setAlias(value: Input[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setCustomerUserName(value: Input[String]): Self = StObject.set(x, "customerUserName", value.asInstanceOf[js.Any])
      
      inline def setCustomerUserNameUndefined: Self = StObject.set(x, "customerUserName", js.undefined)
      
      inline def setDirectoryId(value: Input[String]): Self = StObject.set(x, "directoryId", value.asInstanceOf[js.Any])
      
      inline def setDirectoryIdUndefined: Self = StObject.set(x, "directoryId", js.undefined)
      
      inline def setDirectoryName(value: Input[String]): Self = StObject.set(x, "directoryName", value.asInstanceOf[js.Any])
      
      inline def setDirectoryNameUndefined: Self = StObject.set(x, "directoryName", js.undefined)
      
      inline def setDirectoryType(value: Input[String]): Self = StObject.set(x, "directoryType", value.asInstanceOf[js.Any])
      
      inline def setDirectoryTypeUndefined: Self = StObject.set(x, "directoryType", js.undefined)
      
      inline def setDnsIpAddresses(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "dnsIpAddresses", value.asInstanceOf[js.Any])
      
      inline def setDnsIpAddressesUndefined: Self = StObject.set(x, "dnsIpAddresses", js.undefined)
      
      inline def setDnsIpAddressesVarargs(value: Input[String]*): Self = StObject.set(x, "dnsIpAddresses", js.Array(value :_*))
      
      inline def setIamRoleId(value: Input[String]): Self = StObject.set(x, "iamRoleId", value.asInstanceOf[js.Any])
      
      inline def setIamRoleIdUndefined: Self = StObject.set(x, "iamRoleId", js.undefined)
      
      inline def setIpGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "ipGroupIds", value.asInstanceOf[js.Any])
      
      inline def setIpGroupIdsUndefined: Self = StObject.set(x, "ipGroupIds", js.undefined)
      
      inline def setIpGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "ipGroupIds", js.Array(value :_*))
      
      inline def setRegistrationCode(value: Input[String]): Self = StObject.set(x, "registrationCode", value.asInstanceOf[js.Any])
      
      inline def setRegistrationCodeUndefined: Self = StObject.set(x, "registrationCode", js.undefined)
      
      inline def setSelfServicePermissions(value: Input[typings.pulumiAws.inputMod.workspaces.DirectorySelfServicePermissions]): Self = StObject.set(x, "selfServicePermissions", value.asInstanceOf[js.Any])
      
      inline def setSelfServicePermissionsUndefined: Self = StObject.set(x, "selfServicePermissions", js.undefined)
      
      inline def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      inline def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setWorkspaceCreationProperties(value: Input[typings.pulumiAws.inputMod.workspaces.DirectoryWorkspaceCreationProperties]): Self = StObject.set(x, "workspaceCreationProperties", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceCreationPropertiesUndefined: Self = StObject.set(x, "workspaceCreationProperties", js.undefined)
      
      inline def setWorkspaceSecurityGroupId(value: Input[String]): Self = StObject.set(x, "workspaceSecurityGroupId", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceSecurityGroupIdUndefined: Self = StObject.set(x, "workspaceSecurityGroupId", js.undefined)
    }
  }
}
