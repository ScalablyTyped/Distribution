package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileSystemPolicyMod {
  
  @JSImport("@pulumi/aws/efs/fileSystemPolicy", "FileSystemPolicy")
  @js.native
  class FileSystemPolicy protected () extends CustomResource {
    /**
      * Create a FileSystemPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FileSystemPolicyArgs) = this()
    def this(name: String, args: FileSystemPolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ID of the EFS file system.
      */
    val fileSystemId: Output_[String] = js.native
    
    /**
      * The JSON formatted file system policy for the EFS file system. see [Docs](https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies) for more info.
      */
    val policy: Output_[String] = js.native
  }
  /* static members */
  object FileSystemPolicy {
    
    /**
      * Get an existing FileSystemPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/efs/fileSystemPolicy", "FileSystemPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): FileSystemPolicy = js.native
    @JSImport("@pulumi/aws/efs/fileSystemPolicy", "FileSystemPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): FileSystemPolicy = js.native
    @JSImport("@pulumi/aws/efs/fileSystemPolicy", "FileSystemPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: FileSystemPolicyState): FileSystemPolicy = js.native
    @JSImport("@pulumi/aws/efs/fileSystemPolicy", "FileSystemPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: FileSystemPolicyState, opts: CustomResourceOptions): FileSystemPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of FileSystemPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/efs/fileSystemPolicy", "FileSystemPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/fileSystemPolicy.FileSystemPolicy */ Boolean = js.native
  }
  
  @js.native
  trait FileSystemPolicyArgs extends StObject {
    
    /**
      * The ID of the EFS file system.
      */
    val fileSystemId: Input[String] = js.native
    
    /**
      * The JSON formatted file system policy for the EFS file system. see [Docs](https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies) for more info.
      */
    val policy: Input[String] = js.native
  }
  object FileSystemPolicyArgs {
    
    @scala.inline
    def apply(fileSystemId: Input[String], policy: Input[String]): FileSystemPolicyArgs = {
      val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileSystemPolicyArgs]
    }
    
    @scala.inline
    implicit class FileSystemPolicyArgsMutableBuilder[Self <: FileSystemPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileSystemId(value: Input[String]): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileSystemPolicyState extends StObject {
    
    /**
      * The ID of the EFS file system.
      */
    val fileSystemId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The JSON formatted file system policy for the EFS file system. see [Docs](https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies) for more info.
      */
    val policy: js.UndefOr[Input[String]] = js.native
  }
  object FileSystemPolicyState {
    
    @scala.inline
    def apply(): FileSystemPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileSystemPolicyState]
    }
    
    @scala.inline
    implicit class FileSystemPolicyStateMutableBuilder[Self <: FileSystemPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileSystemId(value: Input[String]): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSystemIdUndefined: Self = StObject.set(x, "fileSystemId", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
}
