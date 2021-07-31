package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.workspaces.WorkspaceWorkspaceProperties
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspaceMod {
  
  @JSImport("@pulumi/aws/workspaces/workspace", "Workspace")
  @js.native
  class Workspace protected () extends CustomResource {
    /**
      * Create a Workspace resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WorkspaceArgs) = this()
    def this(name: String, args: WorkspaceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ID of the bundle for the WorkSpace.
      */
    val bundleId: Output_[String] = js.native
    
    /**
      * The name of the WorkSpace, as seen by the operating system.
      */
    val computerName: Output_[String] = js.native
    
    /**
      * The ID of the directory for the WorkSpace.
      */
    val directoryId: Output_[String] = js.native
    
    /**
      * The IP address of the WorkSpace.
      */
    val ipAddress: Output_[String] = js.native
    
    /**
      * Indicates whether the data stored on the root volume is encrypted.
      */
    val rootVolumeEncryptionEnabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The operational state of the WorkSpace.
      */
    val state: Output_[String] = js.native
    
    /**
      * The tags for the WorkSpace.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The user name of the user for the WorkSpace. This user name must exist in the directory for the WorkSpace.
      */
    val userName: Output_[String] = js.native
    
    /**
      * Indicates whether the data stored on the user volume is encrypted.
      */
    val userVolumeEncryptionEnabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The symmetric AWS KMS customer master key (CMK) used to encrypt data stored on your WorkSpace. Amazon WorkSpaces does not support asymmetric CMKs.
      */
    val volumeEncryptionKey: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The WorkSpace properties.
      */
    val workspaceProperties: Output_[WorkspaceWorkspaceProperties] = js.native
  }
  /* static members */
  object Workspace {
    
    @JSImport("@pulumi/aws/workspaces/workspace", "Workspace")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Workspace resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Workspace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Workspace]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Workspace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Workspace]
    @scala.inline
    def get(name: String, id: Input[ID], state: WorkspaceState): Workspace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Workspace]
    @scala.inline
    def get(name: String, id: Input[ID], state: WorkspaceState, opts: CustomResourceOptions): Workspace = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Workspace]
    
    /**
      * Returns true if the given object is an instance of Workspace.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/workspaces/workspace.Workspace */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/workspaces/workspace.Workspace */ Boolean]
  }
  
  trait WorkspaceArgs extends StObject {
    
    /**
      * The ID of the bundle for the WorkSpace.
      */
    val bundleId: Input[String]
    
    /**
      * The ID of the directory for the WorkSpace.
      */
    val directoryId: Input[String]
    
    /**
      * Indicates whether the data stored on the root volume is encrypted.
      */
    val rootVolumeEncryptionEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The tags for the WorkSpace.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The user name of the user for the WorkSpace. This user name must exist in the directory for the WorkSpace.
      */
    val userName: Input[String]
    
    /**
      * Indicates whether the data stored on the user volume is encrypted.
      */
    val userVolumeEncryptionEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The symmetric AWS KMS customer master key (CMK) used to encrypt data stored on your WorkSpace. Amazon WorkSpaces does not support asymmetric CMKs.
      */
    val volumeEncryptionKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The WorkSpace properties.
      */
    val workspaceProperties: js.UndefOr[Input[typings.pulumiAws.inputMod.workspaces.WorkspaceWorkspaceProperties]] = js.undefined
  }
  object WorkspaceArgs {
    
    @scala.inline
    def apply(bundleId: Input[String], directoryId: Input[String], userName: Input[String]): WorkspaceArgs = {
      val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any], directoryId = directoryId.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkspaceArgs]
    }
    
    @scala.inline
    implicit class WorkspaceArgsMutableBuilder[Self <: WorkspaceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBundleId(value: Input[String]): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryId(value: Input[String]): Self = StObject.set(x, "directoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootVolumeEncryptionEnabled(value: Input[Boolean]): Self = StObject.set(x, "rootVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootVolumeEncryptionEnabledUndefined: Self = StObject.set(x, "rootVolumeEncryptionEnabled", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUserName(value: Input[String]): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserVolumeEncryptionEnabled(value: Input[Boolean]): Self = StObject.set(x, "userVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserVolumeEncryptionEnabledUndefined: Self = StObject.set(x, "userVolumeEncryptionEnabled", js.undefined)
      
      @scala.inline
      def setVolumeEncryptionKey(value: Input[String]): Self = StObject.set(x, "volumeEncryptionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeEncryptionKeyUndefined: Self = StObject.set(x, "volumeEncryptionKey", js.undefined)
      
      @scala.inline
      def setWorkspaceProperties(value: Input[typings.pulumiAws.inputMod.workspaces.WorkspaceWorkspaceProperties]): Self = StObject.set(x, "workspaceProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspacePropertiesUndefined: Self = StObject.set(x, "workspaceProperties", js.undefined)
    }
  }
  
  trait WorkspaceState extends StObject {
    
    /**
      * The ID of the bundle for the WorkSpace.
      */
    val bundleId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the WorkSpace, as seen by the operating system.
      */
    val computerName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the directory for the WorkSpace.
      */
    val directoryId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IP address of the WorkSpace.
      */
    val ipAddress: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates whether the data stored on the root volume is encrypted.
      */
    val rootVolumeEncryptionEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The operational state of the WorkSpace.
      */
    val state: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The tags for the WorkSpace.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The user name of the user for the WorkSpace. This user name must exist in the directory for the WorkSpace.
      */
    val userName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates whether the data stored on the user volume is encrypted.
      */
    val userVolumeEncryptionEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The symmetric AWS KMS customer master key (CMK) used to encrypt data stored on your WorkSpace. Amazon WorkSpaces does not support asymmetric CMKs.
      */
    val volumeEncryptionKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The WorkSpace properties.
      */
    val workspaceProperties: js.UndefOr[Input[typings.pulumiAws.inputMod.workspaces.WorkspaceWorkspaceProperties]] = js.undefined
  }
  object WorkspaceState {
    
    @scala.inline
    def apply(): WorkspaceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkspaceState]
    }
    
    @scala.inline
    implicit class WorkspaceStateMutableBuilder[Self <: WorkspaceState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBundleId(value: Input[String]): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
      
      @scala.inline
      def setComputerName(value: Input[String]): Self = StObject.set(x, "computerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputerNameUndefined: Self = StObject.set(x, "computerName", js.undefined)
      
      @scala.inline
      def setDirectoryId(value: Input[String]): Self = StObject.set(x, "directoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryIdUndefined: Self = StObject.set(x, "directoryId", js.undefined)
      
      @scala.inline
      def setIpAddress(value: Input[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
      
      @scala.inline
      def setRootVolumeEncryptionEnabled(value: Input[Boolean]): Self = StObject.set(x, "rootVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootVolumeEncryptionEnabledUndefined: Self = StObject.set(x, "rootVolumeEncryptionEnabled", js.undefined)
      
      @scala.inline
      def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUserName(value: Input[String]): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
      
      @scala.inline
      def setUserVolumeEncryptionEnabled(value: Input[Boolean]): Self = StObject.set(x, "userVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserVolumeEncryptionEnabledUndefined: Self = StObject.set(x, "userVolumeEncryptionEnabled", js.undefined)
      
      @scala.inline
      def setVolumeEncryptionKey(value: Input[String]): Self = StObject.set(x, "volumeEncryptionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeEncryptionKeyUndefined: Self = StObject.set(x, "volumeEncryptionKey", js.undefined)
      
      @scala.inline
      def setWorkspaceProperties(value: Input[typings.pulumiAws.inputMod.workspaces.WorkspaceWorkspaceProperties]): Self = StObject.set(x, "workspaceProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspacePropertiesUndefined: Self = StObject.set(x, "workspaceProperties", js.undefined)
    }
  }
}
