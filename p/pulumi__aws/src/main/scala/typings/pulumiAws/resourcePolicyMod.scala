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

object resourcePolicyMod {
  
  @JSImport("@pulumi/aws/glue/resourcePolicy", "ResourcePolicy")
  @js.native
  class ResourcePolicy protected () extends CustomResource {
    /**
      * Create a ResourcePolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourcePolicyArgs) = this()
    def this(name: String, args: ResourcePolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The policy to be applied to the aws glue data catalog.
      */
    val policy: Output_[String] = js.native
  }
  /* static members */
  object ResourcePolicy {
    
    /**
      * Get an existing ResourcePolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue/resourcePolicy", "ResourcePolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): ResourcePolicy = js.native
    @JSImport("@pulumi/aws/glue/resourcePolicy", "ResourcePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ResourcePolicy = js.native
    @JSImport("@pulumi/aws/glue/resourcePolicy", "ResourcePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourcePolicyState): ResourcePolicy = js.native
    @JSImport("@pulumi/aws/glue/resourcePolicy", "ResourcePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourcePolicyState, opts: CustomResourceOptions): ResourcePolicy = js.native
    
    /**
      * Returns true if the given object is an instance of ResourcePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue/resourcePolicy", "ResourcePolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/resourcePolicy.ResourcePolicy */ Boolean = js.native
  }
  
  @js.native
  trait ResourcePolicyArgs extends StObject {
    
    /**
      * The policy to be applied to the aws glue data catalog.
      */
    val policy: Input[String] = js.native
  }
  object ResourcePolicyArgs {
    
    @scala.inline
    def apply(policy: Input[String]): ResourcePolicyArgs = {
      val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourcePolicyArgs]
    }
    
    @scala.inline
    implicit class ResourcePolicyArgsMutableBuilder[Self <: ResourcePolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResourcePolicyState extends StObject {
    
    /**
      * The policy to be applied to the aws glue data catalog.
      */
    val policy: js.UndefOr[Input[String]] = js.native
  }
  object ResourcePolicyState {
    
    @scala.inline
    def apply(): ResourcePolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourcePolicyState]
    }
    
    @scala.inline
    implicit class ResourcePolicyStateMutableBuilder[Self <: ResourcePolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
}
