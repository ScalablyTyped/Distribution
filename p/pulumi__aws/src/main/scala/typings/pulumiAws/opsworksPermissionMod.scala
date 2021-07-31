package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opsworksPermissionMod {
  
  @JSImport("@pulumi/aws/opsworks/permission", "Permission")
  @js.native
  class Permission protected () extends CustomResource {
    /**
      * Create a Permission resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PermissionArgs) = this()
    def this(name: String, args: PermissionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Whether the user is allowed to use SSH to communicate with the instance
      */
    val allowSsh: Output_[Boolean] = js.native
    
    /**
      * Whether the user is allowed to use sudo to elevate privileges
      */
    val allowSudo: Output_[Boolean] = js.native
    
    /**
      * The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iamOnly`
      */
    val level: Output_[String] = js.native
    
    /**
      * The stack to set the permissions for
      */
    val stackId: Output_[String] = js.native
    
    /**
      * The user's IAM ARN to set permissions for
      */
    val userArn: Output_[String] = js.native
  }
  /* static members */
  object Permission {
    
    @JSImport("@pulumi/aws/opsworks/permission", "Permission")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Permission resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Permission = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Permission]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Permission = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Permission]
    @scala.inline
    def get(name: String, id: Input[ID], state: PermissionState): Permission = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Permission]
    @scala.inline
    def get(name: String, id: Input[ID], state: PermissionState, opts: CustomResourceOptions): Permission = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Permission]
    
    /**
      * Returns true if the given object is an instance of Permission.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/permission.Permission */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/opsworks/permission.Permission */ Boolean]
  }
  
  trait PermissionArgs extends StObject {
    
    /**
      * Whether the user is allowed to use SSH to communicate with the instance
      */
    val allowSsh: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Whether the user is allowed to use sudo to elevate privileges
      */
    val allowSudo: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iamOnly`
      */
    val level: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The stack to set the permissions for
      */
    val stackId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The user's IAM ARN to set permissions for
      */
    val userArn: Input[String]
  }
  object PermissionArgs {
    
    @scala.inline
    def apply(userArn: Input[String]): PermissionArgs = {
      val __obj = js.Dynamic.literal(userArn = userArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionArgs]
    }
    
    @scala.inline
    implicit class PermissionArgsMutableBuilder[Self <: PermissionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowSsh(value: Input[Boolean]): Self = StObject.set(x, "allowSsh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSshUndefined: Self = StObject.set(x, "allowSsh", js.undefined)
      
      @scala.inline
      def setAllowSudo(value: Input[Boolean]): Self = StObject.set(x, "allowSudo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSudoUndefined: Self = StObject.set(x, "allowSudo", js.undefined)
      
      @scala.inline
      def setLevel(value: Input[String]): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setStackId(value: Input[String]): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackIdUndefined: Self = StObject.set(x, "stackId", js.undefined)
      
      @scala.inline
      def setUserArn(value: Input[String]): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait PermissionState extends StObject {
    
    /**
      * Whether the user is allowed to use SSH to communicate with the instance
      */
    val allowSsh: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Whether the user is allowed to use sudo to elevate privileges
      */
    val allowSudo: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iamOnly`
      */
    val level: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The stack to set the permissions for
      */
    val stackId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The user's IAM ARN to set permissions for
      */
    val userArn: js.UndefOr[Input[String]] = js.undefined
  }
  object PermissionState {
    
    @scala.inline
    def apply(): PermissionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PermissionState]
    }
    
    @scala.inline
    implicit class PermissionStateMutableBuilder[Self <: PermissionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowSsh(value: Input[Boolean]): Self = StObject.set(x, "allowSsh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSshUndefined: Self = StObject.set(x, "allowSsh", js.undefined)
      
      @scala.inline
      def setAllowSudo(value: Input[Boolean]): Self = StObject.set(x, "allowSudo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSudoUndefined: Self = StObject.set(x, "allowSudo", js.undefined)
      
      @scala.inline
      def setLevel(value: Input[String]): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setStackId(value: Input[String]): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackIdUndefined: Self = StObject.set(x, "stackId", js.undefined)
      
      @scala.inline
      def setUserArn(value: Input[String]): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserArnUndefined: Self = StObject.set(x, "userArn", js.undefined)
    }
  }
}
