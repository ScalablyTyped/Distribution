package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.transfer.UserHomeDirectoryMapping
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transferUserMod {
  
  @JSImport("@pulumi/aws/transfer/user", "User")
  @js.native
  class User protected () extends CustomResource {
    /**
      * Create a User resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserArgs) = this()
    def this(name: String, args: UserArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of Transfer User
      */
    val arn: Output_[String] = js.native
    
    /**
      * The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
      */
    val homeDirectory: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. documented below.
      */
    val homeDirectoryMappings: Output_[js.UndefOr[js.Array[UserHomeDirectoryMapping]]] = js.native
    
    /**
      * The type of landing directory (folder) you mapped for your users' home directory. Valid values are `PATH` and `LOGICAL`.
      */
    val homeDirectoryType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
      */
    val policy: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
      */
    val role: Output_[String] = js.native
    
    /**
      * The Server ID of the Transfer Server (e.g. `s-12345678`)
      */
    val serverId: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The name used for log in to your SFTP server.
      */
    val userName: Output_[String] = js.native
  }
  /* static members */
  object User {
    
    /**
      * Get an existing User resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/transfer/user", "User.get")
    @js.native
    def get(name: String, id: Input[ID]): User = js.native
    @JSImport("@pulumi/aws/transfer/user", "User.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): User = js.native
    @JSImport("@pulumi/aws/transfer/user", "User.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserState): User = js.native
    @JSImport("@pulumi/aws/transfer/user", "User.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserState, opts: CustomResourceOptions): User = js.native
    
    /**
      * Returns true if the given object is an instance of User.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/transfer/user", "User.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/transfer/user.User */ Boolean = js.native
  }
  
  @js.native
  trait UserArgs extends StObject {
    
    /**
      * The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
      */
    val homeDirectory: js.UndefOr[Input[String]] = js.native
    
    /**
      * Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. documented below.
      */
    val homeDirectoryMappings: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.transfer.UserHomeDirectoryMapping]]]
      ] = js.native
    
    /**
      * The type of landing directory (folder) you mapped for your users' home directory. Valid values are `PATH` and `LOGICAL`.
      */
    val homeDirectoryType: js.UndefOr[Input[String]] = js.native
    
    /**
      * An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
      */
    val policy: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
      */
    val role: Input[String] = js.native
    
    /**
      * The Server ID of the Transfer Server (e.g. `s-12345678`)
      */
    val serverId: Input[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The name used for log in to your SFTP server.
      */
    val userName: Input[String] = js.native
  }
  object UserArgs {
    
    @scala.inline
    def apply(role: Input[String], serverId: Input[String], userName: Input[String]): UserArgs = {
      val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserArgs]
    }
    
    @scala.inline
    implicit class UserArgsMutableBuilder[Self <: UserArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHomeDirectory(value: Input[String]): Self = StObject.set(x, "homeDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeDirectoryMappings(value: Input[js.Array[Input[typings.pulumiAws.inputMod.transfer.UserHomeDirectoryMapping]]]): Self = StObject.set(x, "homeDirectoryMappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeDirectoryMappingsUndefined: Self = StObject.set(x, "homeDirectoryMappings", js.undefined)
      
      @scala.inline
      def setHomeDirectoryMappingsVarargs(value: Input[typings.pulumiAws.inputMod.transfer.UserHomeDirectoryMapping]*): Self = StObject.set(x, "homeDirectoryMappings", js.Array(value :_*))
      
      @scala.inline
      def setHomeDirectoryType(value: Input[String]): Self = StObject.set(x, "homeDirectoryType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeDirectoryTypeUndefined: Self = StObject.set(x, "homeDirectoryType", js.undefined)
      
      @scala.inline
      def setHomeDirectoryUndefined: Self = StObject.set(x, "homeDirectory", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setRole(value: Input[String]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerId(value: Input[String]): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUserName(value: Input[String]): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of Transfer User
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
      */
    val homeDirectory: js.UndefOr[Input[String]] = js.native
    
    /**
      * Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. documented below.
      */
    val homeDirectoryMappings: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.transfer.UserHomeDirectoryMapping]]]
      ] = js.native
    
    /**
      * The type of landing directory (folder) you mapped for your users' home directory. Valid values are `PATH` and `LOGICAL`.
      */
    val homeDirectoryType: js.UndefOr[Input[String]] = js.native
    
    /**
      * An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
      */
    val policy: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
      */
    val role: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Server ID of the Transfer Server (e.g. `s-12345678`)
      */
    val serverId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The name used for log in to your SFTP server.
      */
    val userName: js.UndefOr[Input[String]] = js.native
  }
  object UserState {
    
    @scala.inline
    def apply(): UserState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserState]
    }
    
    @scala.inline
    implicit class UserStateMutableBuilder[Self <: UserState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setHomeDirectory(value: Input[String]): Self = StObject.set(x, "homeDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeDirectoryMappings(value: Input[js.Array[Input[typings.pulumiAws.inputMod.transfer.UserHomeDirectoryMapping]]]): Self = StObject.set(x, "homeDirectoryMappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeDirectoryMappingsUndefined: Self = StObject.set(x, "homeDirectoryMappings", js.undefined)
      
      @scala.inline
      def setHomeDirectoryMappingsVarargs(value: Input[typings.pulumiAws.inputMod.transfer.UserHomeDirectoryMapping]*): Self = StObject.set(x, "homeDirectoryMappings", js.Array(value :_*))
      
      @scala.inline
      def setHomeDirectoryType(value: Input[String]): Self = StObject.set(x, "homeDirectoryType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeDirectoryTypeUndefined: Self = StObject.set(x, "homeDirectoryType", js.undefined)
      
      @scala.inline
      def setHomeDirectoryUndefined: Self = StObject.set(x, "homeDirectory", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setRole(value: Input[String]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setServerId(value: Input[String]): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerIdUndefined: Self = StObject.set(x, "serverId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUserName(value: Input[String]): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    }
  }
}
