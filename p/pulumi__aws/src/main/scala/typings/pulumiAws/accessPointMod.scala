package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.efs.AccessPointPosixUser
import typings.pulumiAws.outputMod.efs.AccessPointRootDirectory
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accessPointMod {
  
  @JSImport("@pulumi/aws/efs/accessPoint", "AccessPoint")
  @js.native
  class AccessPoint protected () extends CustomResource {
    /**
      * Create a AccessPoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AccessPointArgs) = this()
    def this(name: String, args: AccessPointArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name of the access point.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Amazon Resource Name of the file system.
      */
    val fileSystemArn: Output_[String] = js.native
    
    /**
      * The ID of the file system for which the access point is intended.
      */
    val fileSystemId: Output_[String] = js.native
    
    val ownerId: Output_[String] = js.native
    
    /**
      * The operating system user and group applied to all file system requests made using the access point. See Posix User below.
      */
    val posixUser: Output_[js.UndefOr[AccessPointPosixUser]] = js.native
    
    /**
      * Specifies the directory on the Amazon EFS file system that the access point provides access to. See Root Directory below.
      */
    val rootDirectory: Output_[AccessPointRootDirectory] = js.native
    
    /**
      * Key-value mapping of resource tags.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object AccessPoint {
    
    @JSImport("@pulumi/aws/efs/accessPoint", "AccessPoint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AccessPoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): AccessPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[AccessPoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): AccessPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AccessPoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: AccessPointState): AccessPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[AccessPoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: AccessPointState, opts: CustomResourceOptions): AccessPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AccessPoint]
    
    /**
      * Returns true if the given object is an instance of AccessPoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/accessPoint.AccessPoint */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/efs/accessPoint.AccessPoint */ Boolean]
  }
  
  trait AccessPointArgs extends StObject {
    
    /**
      * The ID of the file system for which the access point is intended.
      */
    val fileSystemId: Input[String]
    
    /**
      * The operating system user and group applied to all file system requests made using the access point. See Posix User below.
      */
    val posixUser: js.UndefOr[Input[typings.pulumiAws.inputMod.efs.AccessPointPosixUser]] = js.undefined
    
    /**
      * Specifies the directory on the Amazon EFS file system that the access point provides access to. See Root Directory below.
      */
    val rootDirectory: js.UndefOr[Input[typings.pulumiAws.inputMod.efs.AccessPointRootDirectory]] = js.undefined
    
    /**
      * Key-value mapping of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object AccessPointArgs {
    
    @scala.inline
    def apply(fileSystemId: Input[String]): AccessPointArgs = {
      val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessPointArgs]
    }
    
    @scala.inline
    implicit class AccessPointArgsMutableBuilder[Self <: AccessPointArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileSystemId(value: Input[String]): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosixUser(value: Input[typings.pulumiAws.inputMod.efs.AccessPointPosixUser]): Self = StObject.set(x, "posixUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosixUserUndefined: Self = StObject.set(x, "posixUser", js.undefined)
      
      @scala.inline
      def setRootDirectory(value: Input[typings.pulumiAws.inputMod.efs.AccessPointRootDirectory]): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDirectoryUndefined: Self = StObject.set(x, "rootDirectory", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait AccessPointState extends StObject {
    
    /**
      * Amazon Resource Name of the access point.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon Resource Name of the file system.
      */
    val fileSystemArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the file system for which the access point is intended.
      */
    val fileSystemId: js.UndefOr[Input[String]] = js.undefined
    
    val ownerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The operating system user and group applied to all file system requests made using the access point. See Posix User below.
      */
    val posixUser: js.UndefOr[Input[typings.pulumiAws.inputMod.efs.AccessPointPosixUser]] = js.undefined
    
    /**
      * Specifies the directory on the Amazon EFS file system that the access point provides access to. See Root Directory below.
      */
    val rootDirectory: js.UndefOr[Input[typings.pulumiAws.inputMod.efs.AccessPointRootDirectory]] = js.undefined
    
    /**
      * Key-value mapping of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object AccessPointState {
    
    @scala.inline
    def apply(): AccessPointState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccessPointState]
    }
    
    @scala.inline
    implicit class AccessPointStateMutableBuilder[Self <: AccessPointState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setFileSystemArn(value: Input[String]): Self = StObject.set(x, "fileSystemArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSystemArnUndefined: Self = StObject.set(x, "fileSystemArn", js.undefined)
      
      @scala.inline
      def setFileSystemId(value: Input[String]): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSystemIdUndefined: Self = StObject.set(x, "fileSystemId", js.undefined)
      
      @scala.inline
      def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      @scala.inline
      def setPosixUser(value: Input[typings.pulumiAws.inputMod.efs.AccessPointPosixUser]): Self = StObject.set(x, "posixUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosixUserUndefined: Self = StObject.set(x, "posixUser", js.undefined)
      
      @scala.inline
      def setRootDirectory(value: Input[typings.pulumiAws.inputMod.efs.AccessPointRootDirectory]): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDirectoryUndefined: Self = StObject.set(x, "rootDirectory", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
