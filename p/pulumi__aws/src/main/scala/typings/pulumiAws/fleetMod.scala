package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.FleetLaunchTemplateConfig
import typings.pulumiAws.outputMod.ec2.FleetOnDemandOptions
import typings.pulumiAws.outputMod.ec2.FleetSpotOptions
import typings.pulumiAws.outputMod.ec2.FleetTargetCapacitySpecification
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fleetMod {
  
  @JSImport("@pulumi/aws/ec2/fleet", "Fleet")
  @js.native
  class Fleet protected () extends CustomResource {
    /**
      * Create a Fleet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FleetArgs) = this()
    def this(name: String, args: FleetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
      */
    val excessCapacityTerminationPolicy: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Nested argument containing EC2 Launch Template configurations. Defined below.
      */
    val launchTemplateConfig: Output_[FleetLaunchTemplateConfig] = js.native
    
    /**
      * Nested argument containing On-Demand configurations. Defined below.
      */
    val onDemandOptions: Output_[js.UndefOr[FleetOnDemandOptions]] = js.native
    
    /**
      * Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
      */
    val replaceUnhealthyInstances: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Nested argument containing Spot configurations. Defined below.
      */
    val spotOptions: Output_[js.UndefOr[FleetSpotOptions]] = js.native
    
    /**
      * Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Nested argument containing target capacity configurations. Defined below.
      */
    val targetCapacitySpecification: Output_[FleetTargetCapacitySpecification] = js.native
    
    /**
      * Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
      */
    val terminateInstances: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
      */
    val terminateInstancesWithExpiration: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
      */
    val `type`: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object Fleet {
    
    @JSImport("@pulumi/aws/ec2/fleet", "Fleet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Fleet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Fleet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Fleet]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Fleet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Fleet]
    inline def get(name: String, id: Input[ID], state: FleetState): Fleet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Fleet]
    inline def get(name: String, id: Input[ID], state: FleetState, opts: CustomResourceOptions): Fleet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Fleet]
    
    /**
      * Returns true if the given object is an instance of Fleet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/fleet.Fleet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/fleet.Fleet */ Boolean]
  }
  
  trait FleetArgs extends StObject {
    
    /**
      * Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
      */
    val excessCapacityTerminationPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Nested argument containing EC2 Launch Template configurations. Defined below.
      */
    val launchTemplateConfig: Input[typings.pulumiAws.inputMod.ec2.FleetLaunchTemplateConfig]
    
    /**
      * Nested argument containing On-Demand configurations. Defined below.
      */
    val onDemandOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.FleetOnDemandOptions]] = js.undefined
    
    /**
      * Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
      */
    val replaceUnhealthyInstances: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Nested argument containing Spot configurations. Defined below.
      */
    val spotOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.FleetSpotOptions]] = js.undefined
    
    /**
      * Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Nested argument containing target capacity configurations. Defined below.
      */
    val targetCapacitySpecification: Input[typings.pulumiAws.inputMod.ec2.FleetTargetCapacitySpecification]
    
    /**
      * Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
      */
    val terminateInstances: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
      */
    val terminateInstancesWithExpiration: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
      */
    val `type`: js.UndefOr[Input[String]] = js.undefined
  }
  object FleetArgs {
    
    inline def apply(
      launchTemplateConfig: Input[typings.pulumiAws.inputMod.ec2.FleetLaunchTemplateConfig],
      targetCapacitySpecification: Input[typings.pulumiAws.inputMod.ec2.FleetTargetCapacitySpecification]
    ): FleetArgs = {
      val __obj = js.Dynamic.literal(launchTemplateConfig = launchTemplateConfig.asInstanceOf[js.Any], targetCapacitySpecification = targetCapacitySpecification.asInstanceOf[js.Any])
      __obj.asInstanceOf[FleetArgs]
    }
    
    extension [Self <: FleetArgs](x: Self) {
      
      inline def setExcessCapacityTerminationPolicy(value: Input[String]): Self = StObject.set(x, "excessCapacityTerminationPolicy", value.asInstanceOf[js.Any])
      
      inline def setExcessCapacityTerminationPolicyUndefined: Self = StObject.set(x, "excessCapacityTerminationPolicy", js.undefined)
      
      inline def setLaunchTemplateConfig(value: Input[typings.pulumiAws.inputMod.ec2.FleetLaunchTemplateConfig]): Self = StObject.set(x, "launchTemplateConfig", value.asInstanceOf[js.Any])
      
      inline def setOnDemandOptions(value: Input[typings.pulumiAws.inputMod.ec2.FleetOnDemandOptions]): Self = StObject.set(x, "onDemandOptions", value.asInstanceOf[js.Any])
      
      inline def setOnDemandOptionsUndefined: Self = StObject.set(x, "onDemandOptions", js.undefined)
      
      inline def setReplaceUnhealthyInstances(value: Input[Boolean]): Self = StObject.set(x, "replaceUnhealthyInstances", value.asInstanceOf[js.Any])
      
      inline def setReplaceUnhealthyInstancesUndefined: Self = StObject.set(x, "replaceUnhealthyInstances", js.undefined)
      
      inline def setSpotOptions(value: Input[typings.pulumiAws.inputMod.ec2.FleetSpotOptions]): Self = StObject.set(x, "spotOptions", value.asInstanceOf[js.Any])
      
      inline def setSpotOptionsUndefined: Self = StObject.set(x, "spotOptions", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTargetCapacitySpecification(value: Input[typings.pulumiAws.inputMod.ec2.FleetTargetCapacitySpecification]): Self = StObject.set(x, "targetCapacitySpecification", value.asInstanceOf[js.Any])
      
      inline def setTerminateInstances(value: Input[Boolean]): Self = StObject.set(x, "terminateInstances", value.asInstanceOf[js.Any])
      
      inline def setTerminateInstancesUndefined: Self = StObject.set(x, "terminateInstances", js.undefined)
      
      inline def setTerminateInstancesWithExpiration(value: Input[Boolean]): Self = StObject.set(x, "terminateInstancesWithExpiration", value.asInstanceOf[js.Any])
      
      inline def setTerminateInstancesWithExpirationUndefined: Self = StObject.set(x, "terminateInstancesWithExpiration", js.undefined)
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait FleetState extends StObject {
    
    /**
      * Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
      */
    val excessCapacityTerminationPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Nested argument containing EC2 Launch Template configurations. Defined below.
      */
    val launchTemplateConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.FleetLaunchTemplateConfig]] = js.undefined
    
    /**
      * Nested argument containing On-Demand configurations. Defined below.
      */
    val onDemandOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.FleetOnDemandOptions]] = js.undefined
    
    /**
      * Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
      */
    val replaceUnhealthyInstances: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Nested argument containing Spot configurations. Defined below.
      */
    val spotOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.FleetSpotOptions]] = js.undefined
    
    /**
      * Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Nested argument containing target capacity configurations. Defined below.
      */
    val targetCapacitySpecification: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.FleetTargetCapacitySpecification]] = js.undefined
    
    /**
      * Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
      */
    val terminateInstances: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
      */
    val terminateInstancesWithExpiration: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
      */
    val `type`: js.UndefOr[Input[String]] = js.undefined
  }
  object FleetState {
    
    inline def apply(): FleetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FleetState]
    }
    
    extension [Self <: FleetState](x: Self) {
      
      inline def setExcessCapacityTerminationPolicy(value: Input[String]): Self = StObject.set(x, "excessCapacityTerminationPolicy", value.asInstanceOf[js.Any])
      
      inline def setExcessCapacityTerminationPolicyUndefined: Self = StObject.set(x, "excessCapacityTerminationPolicy", js.undefined)
      
      inline def setLaunchTemplateConfig(value: Input[typings.pulumiAws.inputMod.ec2.FleetLaunchTemplateConfig]): Self = StObject.set(x, "launchTemplateConfig", value.asInstanceOf[js.Any])
      
      inline def setLaunchTemplateConfigUndefined: Self = StObject.set(x, "launchTemplateConfig", js.undefined)
      
      inline def setOnDemandOptions(value: Input[typings.pulumiAws.inputMod.ec2.FleetOnDemandOptions]): Self = StObject.set(x, "onDemandOptions", value.asInstanceOf[js.Any])
      
      inline def setOnDemandOptionsUndefined: Self = StObject.set(x, "onDemandOptions", js.undefined)
      
      inline def setReplaceUnhealthyInstances(value: Input[Boolean]): Self = StObject.set(x, "replaceUnhealthyInstances", value.asInstanceOf[js.Any])
      
      inline def setReplaceUnhealthyInstancesUndefined: Self = StObject.set(x, "replaceUnhealthyInstances", js.undefined)
      
      inline def setSpotOptions(value: Input[typings.pulumiAws.inputMod.ec2.FleetSpotOptions]): Self = StObject.set(x, "spotOptions", value.asInstanceOf[js.Any])
      
      inline def setSpotOptionsUndefined: Self = StObject.set(x, "spotOptions", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTargetCapacitySpecification(value: Input[typings.pulumiAws.inputMod.ec2.FleetTargetCapacitySpecification]): Self = StObject.set(x, "targetCapacitySpecification", value.asInstanceOf[js.Any])
      
      inline def setTargetCapacitySpecificationUndefined: Self = StObject.set(x, "targetCapacitySpecification", js.undefined)
      
      inline def setTerminateInstances(value: Input[Boolean]): Self = StObject.set(x, "terminateInstances", value.asInstanceOf[js.Any])
      
      inline def setTerminateInstancesUndefined: Self = StObject.set(x, "terminateInstances", js.undefined)
      
      inline def setTerminateInstancesWithExpiration(value: Input[Boolean]): Self = StObject.set(x, "terminateInstancesWithExpiration", value.asInstanceOf[js.Any])
      
      inline def setTerminateInstancesWithExpirationUndefined: Self = StObject.set(x, "terminateInstancesWithExpiration", js.undefined)
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
