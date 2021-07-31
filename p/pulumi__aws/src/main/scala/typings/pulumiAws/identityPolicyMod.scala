package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identityPolicyMod {
  
  @JSImport("@pulumi/aws/ses/identityPolicy", "IdentityPolicy")
  @js.native
  class IdentityPolicy protected () extends CustomResource {
    /**
      * Create a IdentityPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IdentityPolicyArgs) = this()
    def this(name: String, args: IdentityPolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Name or Amazon Resource Name (ARN) of the SES Identity.
      */
    val identity: Output_[String] = js.native
    
    /**
      * Name of the policy.
      */
    val name: Output_[String] = js.native
    
    /**
      * JSON string of the policy.
      */
    val policy: Output_[String] = js.native
  }
  /* static members */
  object IdentityPolicy {
    
    @JSImport("@pulumi/aws/ses/identityPolicy", "IdentityPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing IdentityPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): IdentityPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[IdentityPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): IdentityPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IdentityPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: IdentityPolicyState): IdentityPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[IdentityPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: IdentityPolicyState, opts: CustomResourceOptions): IdentityPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IdentityPolicy]
    
    /**
      * Returns true if the given object is an instance of IdentityPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/identityPolicy.IdentityPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/identityPolicy.IdentityPolicy */ Boolean]
  }
  
  trait IdentityPolicyArgs extends StObject {
    
    /**
      * Name or Amazon Resource Name (ARN) of the SES Identity.
      */
    val identity: Input[String]
    
    /**
      * Name of the policy.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * JSON string of the policy.
      */
    val policy: Input[String]
  }
  object IdentityPolicyArgs {
    
    @scala.inline
    def apply(identity: Input[String], policy: Input[String]): IdentityPolicyArgs = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentityPolicyArgs]
    }
    
    @scala.inline
    implicit class IdentityPolicyArgsMutableBuilder[Self <: IdentityPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentity(value: Input[String]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdentityPolicyState extends StObject {
    
    /**
      * Name or Amazon Resource Name (ARN) of the SES Identity.
      */
    val identity: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the policy.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * JSON string of the policy.
      */
    val policy: js.UndefOr[Input[String]] = js.undefined
  }
  object IdentityPolicyState {
    
    @scala.inline
    def apply(): IdentityPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdentityPolicyState]
    }
    
    @scala.inline
    implicit class IdentityPolicyStateMutableBuilder[Self <: IdentityPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentity(value: Input[String]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
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
