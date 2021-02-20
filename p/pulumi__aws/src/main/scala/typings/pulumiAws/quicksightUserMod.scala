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

object quicksightUserMod {
  
  @JSImport("@pulumi/aws/quicksight/user", "User")
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
      * Amazon Resource Name (ARN) of the user
      */
    val arn: Output_[String] = js.native
    
    /**
      * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
      */
    val awsAccountId: Output_[String] = js.native
    
    /**
      * The email address of the user that you want to register.
      */
    val email: Output_[String] = js.native
    
    /**
      * The ARN of the IAM user or role that you are registering with Amazon QuickSight.
      */
    val iamArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts either  `IAM` or `QUICKSIGHT`.
      */
    val identityType: Output_[String] = js.native
    
    /**
      * The namespace. Currently, you should set this to `default`.
      */
    val namespace: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the IAM session to use when assuming roles that can embed QuickSight dashboards.
      */
    val sessionName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The Amazon QuickSight user name that you want to create for the user you are registering.
      */
    val userName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The Amazon QuickSight role of the user. The user role can be one of the following: `READER`, `AUTHOR`, or `ADMIN`
      */
    val userRole: Output_[String] = js.native
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
    @JSImport("@pulumi/aws/quicksight/user", "User.get")
    @js.native
    def get(name: String, id: Input[ID]): User = js.native
    @JSImport("@pulumi/aws/quicksight/user", "User.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): User = js.native
    @JSImport("@pulumi/aws/quicksight/user", "User.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserState): User = js.native
    @JSImport("@pulumi/aws/quicksight/user", "User.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserState, opts: CustomResourceOptions): User = js.native
    
    /**
      * Returns true if the given object is an instance of User.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/quicksight/user", "User.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/quicksight/user.User */ Boolean = js.native
  }
  
  @js.native
  trait UserArgs extends StObject {
    
    /**
      * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
      */
    val awsAccountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The email address of the user that you want to register.
      */
    val email: Input[String] = js.native
    
    /**
      * The ARN of the IAM user or role that you are registering with Amazon QuickSight.
      */
    val iamArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts either  `IAM` or `QUICKSIGHT`.
      */
    val identityType: Input[String] = js.native
    
    /**
      * The namespace. Currently, you should set this to `default`.
      */
    val namespace: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the IAM session to use when assuming roles that can embed QuickSight dashboards.
      */
    val sessionName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Amazon QuickSight user name that you want to create for the user you are registering.
      */
    val userName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Amazon QuickSight role of the user. The user role can be one of the following: `READER`, `AUTHOR`, or `ADMIN`
      */
    val userRole: Input[String] = js.native
  }
  object UserArgs {
    
    @scala.inline
    def apply(email: Input[String], identityType: Input[String], userRole: Input[String]): UserArgs = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], identityType = identityType.asInstanceOf[js.Any], userRole = userRole.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserArgs]
    }
    
    @scala.inline
    implicit class UserArgsMutableBuilder[Self <: UserArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAwsAccountId(value: Input[String]): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
      
      @scala.inline
      def setEmail(value: Input[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamArn(value: Input[String]): Self = StObject.set(x, "iamArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamArnUndefined: Self = StObject.set(x, "iamArn", js.undefined)
      
      @scala.inline
      def setIdentityType(value: Input[String]): Self = StObject.set(x, "identityType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setSessionName(value: Input[String]): Self = StObject.set(x, "sessionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionNameUndefined: Self = StObject.set(x, "sessionName", js.undefined)
      
      @scala.inline
      def setUserName(value: Input[String]): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
      
      @scala.inline
      def setUserRole(value: Input[String]): Self = StObject.set(x, "userRole", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the user
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
      */
    val awsAccountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The email address of the user that you want to register.
      */
    val email: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the IAM user or role that you are registering with Amazon QuickSight.
      */
    val iamArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts either  `IAM` or `QUICKSIGHT`.
      */
    val identityType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The namespace. Currently, you should set this to `default`.
      */
    val namespace: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the IAM session to use when assuming roles that can embed QuickSight dashboards.
      */
    val sessionName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Amazon QuickSight user name that you want to create for the user you are registering.
      */
    val userName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Amazon QuickSight role of the user. The user role can be one of the following: `READER`, `AUTHOR`, or `ADMIN`
      */
    val userRole: js.UndefOr[Input[String]] = js.native
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
      def setAwsAccountId(value: Input[String]): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
      
      @scala.inline
      def setEmail(value: Input[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setIamArn(value: Input[String]): Self = StObject.set(x, "iamArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamArnUndefined: Self = StObject.set(x, "iamArn", js.undefined)
      
      @scala.inline
      def setIdentityType(value: Input[String]): Self = StObject.set(x, "identityType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityTypeUndefined: Self = StObject.set(x, "identityType", js.undefined)
      
      @scala.inline
      def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setSessionName(value: Input[String]): Self = StObject.set(x, "sessionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionNameUndefined: Self = StObject.set(x, "sessionName", js.undefined)
      
      @scala.inline
      def setUserName(value: Input[String]): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
      
      @scala.inline
      def setUserRole(value: Input[String]): Self = StObject.set(x, "userRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserRoleUndefined: Self = StObject.set(x, "userRole", js.undefined)
    }
  }
}
