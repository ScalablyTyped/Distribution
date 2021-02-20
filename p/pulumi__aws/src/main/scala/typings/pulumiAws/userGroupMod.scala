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

object userGroupMod {
  
  @JSImport("@pulumi/aws/cognito/userGroup", "UserGroup")
  @js.native
  class UserGroup protected () extends CustomResource {
    /**
      * Create a UserGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserGroupArgs) = this()
    def this(name: String, args: UserGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The description of the user group.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the user group.
      */
    val name: Output_[String] = js.native
    
    /**
      * The precedence of the user group.
      */
    val precedence: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The ARN of the IAM role to be associated with the user group.
      */
    val roleArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The user pool ID.
      */
    val userPoolId: Output_[String] = js.native
  }
  /* static members */
  object UserGroup {
    
    /**
      * Get an existing UserGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cognito/userGroup", "UserGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): UserGroup = js.native
    @JSImport("@pulumi/aws/cognito/userGroup", "UserGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): UserGroup = js.native
    @JSImport("@pulumi/aws/cognito/userGroup", "UserGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserGroupState): UserGroup = js.native
    @JSImport("@pulumi/aws/cognito/userGroup", "UserGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserGroupState, opts: CustomResourceOptions): UserGroup = js.native
    
    /**
      * Returns true if the given object is an instance of UserGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cognito/userGroup", "UserGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userGroup.UserGroup */ Boolean = js.native
  }
  
  @js.native
  trait UserGroupArgs extends StObject {
    
    /**
      * The description of the user group.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the user group.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The precedence of the user group.
      */
    val precedence: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The ARN of the IAM role to be associated with the user group.
      */
    val roleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The user pool ID.
      */
    val userPoolId: Input[String] = js.native
  }
  object UserGroupArgs {
    
    @scala.inline
    def apply(userPoolId: Input[String]): UserGroupArgs = {
      val __obj = js.Dynamic.literal(userPoolId = userPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserGroupArgs]
    }
    
    @scala.inline
    implicit class UserGroupArgsMutableBuilder[Self <: UserGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPrecedence(value: Input[Double]): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecedenceUndefined: Self = StObject.set(x, "precedence", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      @scala.inline
      def setUserPoolId(value: Input[String]): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserGroupState extends StObject {
    
    /**
      * The description of the user group.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the user group.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The precedence of the user group.
      */
    val precedence: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The ARN of the IAM role to be associated with the user group.
      */
    val roleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The user pool ID.
      */
    val userPoolId: js.UndefOr[Input[String]] = js.native
  }
  object UserGroupState {
    
    @scala.inline
    def apply(): UserGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserGroupState]
    }
    
    @scala.inline
    implicit class UserGroupStateMutableBuilder[Self <: UserGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPrecedence(value: Input[Double]): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecedenceUndefined: Self = StObject.set(x, "precedence", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      @scala.inline
      def setUserPoolId(value: Input[String]): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPoolIdUndefined: Self = StObject.set(x, "userPoolId", js.undefined)
    }
  }
}
