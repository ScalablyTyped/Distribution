package typings.pulumiAws

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iamPolicyMod {
  
  @JSImport("@pulumi/aws/iam/policy", "Policy")
  @js.native
  class Policy protected () extends CustomResource {
    /**
      * Create a Policy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PolicyArgs) = this()
    def this(name: String, args: PolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN assigned by AWS to this policy.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Description of the IAM policy.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the policy. If omitted, this provider will assign a random, unique name.
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Path in which to create the policy.
      * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
      */
    val path: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The policy document. This is a JSON formatted string.
      */
    val policy: Output_[String] = js.native
  }
  /* static members */
  object Policy {
    
    @JSImport("@pulumi/aws/iam/policy", "Policy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Policy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Policy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Policy]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Policy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Policy]
    @scala.inline
    def get(name: String, id: Input[ID], state: PolicyState): Policy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Policy]
    @scala.inline
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): Policy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Policy]
    
    /**
      * Returns true if the given object is an instance of Policy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/policy.Policy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iam/policy.Policy */ Boolean]
  }
  
  trait PolicyArgs extends StObject {
    
    /**
      * Description of the IAM policy.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the policy. If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Path in which to create the policy.
      * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
      */
    val path: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The policy document. This is a JSON formatted string.
      */
    val policy: Input[String | PolicyDocument]
  }
  object PolicyArgs {
    
    @scala.inline
    def apply(policy: Input[String | PolicyDocument]): PolicyArgs = {
      val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyArgs]
    }
    
    @scala.inline
    implicit class PolicyArgsMutableBuilder[Self <: PolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String | PolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolicyState extends StObject {
    
    /**
      * The ARN assigned by AWS to this policy.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Description of the IAM policy.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the policy. If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Path in which to create the policy.
      * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
      */
    val path: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The policy document. This is a JSON formatted string.
      */
    val policy: js.UndefOr[Input[String | PolicyDocument]] = js.undefined
  }
  object PolicyState {
    
    @scala.inline
    def apply(): PolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolicyState]
    }
    
    @scala.inline
    implicit class PolicyStateMutableBuilder[Self <: PolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String | PolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
}
