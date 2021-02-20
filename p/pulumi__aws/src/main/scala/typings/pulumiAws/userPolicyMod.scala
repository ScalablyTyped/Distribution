package typings.pulumiAws

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userPolicyMod {
  
  @JSImport("@pulumi/aws/iam/userPolicy", "UserPolicy")
  @js.native
  class UserPolicy protected () extends CustomResource {
    /**
      * Create a UserPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserPolicyArgs) = this()
    def this(name: String, args: UserPolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the policy. If omitted, this provider will assign a random, unique name.
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The policy document. This is a JSON formatted string.
      */
    val policy: Output_[String] = js.native
    
    /**
      * IAM user to which to attach this policy.
      */
    val user: Output_[String] = js.native
  }
  /* static members */
  object UserPolicy {
    
    /**
      * Get an existing UserPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/iam/userPolicy", "UserPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): UserPolicy = js.native
    @JSImport("@pulumi/aws/iam/userPolicy", "UserPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): UserPolicy = js.native
    @JSImport("@pulumi/aws/iam/userPolicy", "UserPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserPolicyState): UserPolicy = js.native
    @JSImport("@pulumi/aws/iam/userPolicy", "UserPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserPolicyState, opts: CustomResourceOptions): UserPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of UserPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/iam/userPolicy", "UserPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/userPolicy.UserPolicy */ Boolean = js.native
  }
  
  @js.native
  trait UserPolicyArgs extends StObject {
    
    /**
      * The name of the policy. If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * The policy document. This is a JSON formatted string.
      */
    val policy: Input[String | PolicyDocument] = js.native
    
    /**
      * IAM user to which to attach this policy.
      */
    val user: Input[String] = js.native
  }
  object UserPolicyArgs {
    
    @scala.inline
    def apply(policy: Input[String | PolicyDocument], user: Input[String]): UserPolicyArgs = {
      val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserPolicyArgs]
    }
    
    @scala.inline
    implicit class UserPolicyArgsMutableBuilder[Self <: UserPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String | PolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: Input[String]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserPolicyState extends StObject {
    
    /**
      * The name of the policy. If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * The policy document. This is a JSON formatted string.
      */
    val policy: js.UndefOr[Input[String | PolicyDocument]] = js.native
    
    /**
      * IAM user to which to attach this policy.
      */
    val user: js.UndefOr[Input[String]] = js.native
  }
  object UserPolicyState {
    
    @scala.inline
    def apply(): UserPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserPolicyState]
    }
    
    @scala.inline
    implicit class UserPolicyStateMutableBuilder[Self <: UserPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String | PolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setUser(value: Input[String]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
