package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iotPolicyMod {
  
  @JSImport("@pulumi/aws/iot/policy", "Policy")
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
      * The default version of this policy.
      */
    val defaultVersionId: Output_[String] = js.native
    
    /**
      * The name of the policy.
      */
    val name: Output_[String] = js.native
    
    /**
      * The policy document. This is a JSON formatted string. Use the [IoT Developer Guide](http://docs.aws.amazon.com/iot/latest/developerguide/iot-policies.html) for more information on IoT Policies.
      */
    val policy: Output_[String] = js.native
  }
  /* static members */
  object Policy {
    
    @JSImport("@pulumi/aws/iot/policy", "Policy")
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
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/policy.Policy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iot/policy.Policy */ Boolean]
  }
  
  trait PolicyArgs extends StObject {
    
    /**
      * The name of the policy.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The policy document. This is a JSON formatted string. Use the [IoT Developer Guide](http://docs.aws.amazon.com/iot/latest/developerguide/iot-policies.html) for more information on IoT Policies.
      */
    val policy: Input[String]
  }
  object PolicyArgs {
    
    @scala.inline
    def apply(policy: Input[String]): PolicyArgs = {
      val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyArgs]
    }
    
    @scala.inline
    implicit class PolicyArgsMutableBuilder[Self <: PolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolicyState extends StObject {
    
    /**
      * The ARN assigned by AWS to this policy.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The default version of this policy.
      */
    val defaultVersionId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the policy.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The policy document. This is a JSON formatted string. Use the [IoT Developer Guide](http://docs.aws.amazon.com/iot/latest/developerguide/iot-policies.html) for more information on IoT Policies.
      */
    val policy: js.UndefOr[Input[String]] = js.undefined
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
      def setDefaultVersionId(value: Input[String]): Self = StObject.set(x, "defaultVersionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultVersionIdUndefined: Self = StObject.set(x, "defaultVersionId", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
}
