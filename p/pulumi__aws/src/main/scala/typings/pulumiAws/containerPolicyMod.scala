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

object containerPolicyMod {
  
  @JSImport("@pulumi/aws/mediastore/containerPolicy", "ContainerPolicy")
  @js.native
  class ContainerPolicy protected () extends CustomResource {
    /**
      * Create a ContainerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ContainerPolicyArgs) = this()
    def this(name: String, args: ContainerPolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the container.
      */
    val containerName: Output_[String] = js.native
    
    /**
      * The contents of the policy.
      */
    val policy: Output_[String] = js.native
  }
  /* static members */
  object ContainerPolicy {
    
    /**
      * Get an existing ContainerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/mediastore/containerPolicy", "ContainerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): ContainerPolicy = js.native
    @JSImport("@pulumi/aws/mediastore/containerPolicy", "ContainerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ContainerPolicy = js.native
    @JSImport("@pulumi/aws/mediastore/containerPolicy", "ContainerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: ContainerPolicyState): ContainerPolicy = js.native
    @JSImport("@pulumi/aws/mediastore/containerPolicy", "ContainerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: ContainerPolicyState, opts: CustomResourceOptions): ContainerPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of ContainerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/mediastore/containerPolicy", "ContainerPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mediastore/containerPolicy.ContainerPolicy */ Boolean = js.native
  }
  
  @js.native
  trait ContainerPolicyArgs extends StObject {
    
    /**
      * The name of the container.
      */
    val containerName: Input[String] = js.native
    
    /**
      * The contents of the policy.
      */
    val policy: Input[String] = js.native
  }
  object ContainerPolicyArgs {
    
    @scala.inline
    def apply(containerName: Input[String], policy: Input[String]): ContainerPolicyArgs = {
      val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerPolicyArgs]
    }
    
    @scala.inline
    implicit class ContainerPolicyArgsMutableBuilder[Self <: ContainerPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerName(value: Input[String]): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ContainerPolicyState extends StObject {
    
    /**
      * The name of the container.
      */
    val containerName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The contents of the policy.
      */
    val policy: js.UndefOr[Input[String]] = js.native
  }
  object ContainerPolicyState {
    
    @scala.inline
    def apply(): ContainerPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerPolicyState]
    }
    
    @scala.inline
    implicit class ContainerPolicyStateMutableBuilder[Self <: ContainerPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerName(value: Input[String]): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
}
