package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ecs.CapacityProviderAutoScalingGroupProvider
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object capacityProviderMod {
  
  @JSImport("@pulumi/aws/ecs/capacityProvider", "CapacityProvider")
  @js.native
  class CapacityProvider protected () extends CustomResource {
    /**
      * Create a CapacityProvider resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CapacityProviderArgs) = this()
    def this(name: String, args: CapacityProviderArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) that identifies the capacity provider.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Nested argument defining the provider for the ECS auto scaling group. Defined below.
      */
    val autoScalingGroupProvider: Output_[CapacityProviderAutoScalingGroupProvider] = js.native
    
    /**
      * The name of the capacity provider.
      */
    val name: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object CapacityProvider {
    
    /**
      * Get an existing CapacityProvider resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ecs/capacityProvider", "CapacityProvider.get")
    @js.native
    def get(name: String, id: Input[ID]): CapacityProvider = js.native
    @JSImport("@pulumi/aws/ecs/capacityProvider", "CapacityProvider.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): CapacityProvider = js.native
    @JSImport("@pulumi/aws/ecs/capacityProvider", "CapacityProvider.get")
    @js.native
    def get(name: String, id: Input[ID], state: CapacityProviderState): CapacityProvider = js.native
    @JSImport("@pulumi/aws/ecs/capacityProvider", "CapacityProvider.get")
    @js.native
    def get(name: String, id: Input[ID], state: CapacityProviderState, opts: CustomResourceOptions): CapacityProvider = js.native
    
    /**
      * Returns true if the given object is an instance of CapacityProvider.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ecs/capacityProvider", "CapacityProvider.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/capacityProvider.CapacityProvider */ Boolean = js.native
  }
  
  @js.native
  trait CapacityProviderArgs extends StObject {
    
    /**
      * Nested argument defining the provider for the ECS auto scaling group. Defined below.
      */
    val autoScalingGroupProvider: Input[typings.pulumiAws.inputMod.ecs.CapacityProviderAutoScalingGroupProvider] = js.native
    
    /**
      * The name of the capacity provider.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object CapacityProviderArgs {
    
    @scala.inline
    def apply(
      autoScalingGroupProvider: Input[typings.pulumiAws.inputMod.ecs.CapacityProviderAutoScalingGroupProvider]
    ): CapacityProviderArgs = {
      val __obj = js.Dynamic.literal(autoScalingGroupProvider = autoScalingGroupProvider.asInstanceOf[js.Any])
      __obj.asInstanceOf[CapacityProviderArgs]
    }
    
    @scala.inline
    implicit class CapacityProviderArgsMutableBuilder[Self <: CapacityProviderArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoScalingGroupProvider(value: Input[typings.pulumiAws.inputMod.ecs.CapacityProviderAutoScalingGroupProvider]): Self = StObject.set(x, "autoScalingGroupProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait CapacityProviderState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) that identifies the capacity provider.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Nested argument defining the provider for the ECS auto scaling group. Defined below.
      */
    val autoScalingGroupProvider: js.UndefOr[Input[typings.pulumiAws.inputMod.ecs.CapacityProviderAutoScalingGroupProvider]] = js.native
    
    /**
      * The name of the capacity provider.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object CapacityProviderState {
    
    @scala.inline
    def apply(): CapacityProviderState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CapacityProviderState]
    }
    
    @scala.inline
    implicit class CapacityProviderStateMutableBuilder[Self <: CapacityProviderState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAutoScalingGroupProvider(value: Input[typings.pulumiAws.inputMod.ecs.CapacityProviderAutoScalingGroupProvider]): Self = StObject.set(x, "autoScalingGroupProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoScalingGroupProviderUndefined: Self = StObject.set(x, "autoScalingGroupProvider", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
