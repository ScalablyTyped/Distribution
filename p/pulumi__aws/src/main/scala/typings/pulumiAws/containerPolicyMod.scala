package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/mediastore/containerPolicy", "ContainerPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ContainerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): ContainerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ContainerPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ContainerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ContainerPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: ContainerPolicyState): ContainerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ContainerPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: ContainerPolicyState, opts: CustomResourceOptions): ContainerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ContainerPolicy]
    
    /**
      * Returns true if the given object is an instance of ContainerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mediastore/containerPolicy.ContainerPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/mediastore/containerPolicy.ContainerPolicy */ Boolean]
  }
  
  trait ContainerPolicyArgs extends StObject {
    
    /**
      * The name of the container.
      */
    val containerName: Input[String]
    
    /**
      * The contents of the policy.
      */
    val policy: Input[String]
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
  
  trait ContainerPolicyState extends StObject {
    
    /**
      * The name of the container.
      */
    val containerName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The contents of the policy.
      */
    val policy: js.UndefOr[Input[String]] = js.undefined
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
