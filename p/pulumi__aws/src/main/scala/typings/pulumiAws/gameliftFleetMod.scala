package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.gamelift.FleetEc2InboundPermission
import typings.pulumiAws.outputMod.gamelift.FleetResourceCreationLimitPolicy
import typings.pulumiAws.outputMod.gamelift.FleetRuntimeConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gameliftFleetMod {
  
  @JSImport("@pulumi/aws/gamelift/fleet", "Fleet")
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
      * Fleet ARN.
      */
    val arn: Output_[String] = js.native
    
    /**
      * ID of the Gamelift Build to be deployed on the fleet.
      */
    val buildId: Output_[String] = js.native
    
    /**
      * Human-readable description of the fleet.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
      */
    val ec2InboundPermissions: Output_[js.UndefOr[js.Array[FleetEc2InboundPermission]]] = js.native
    
    /**
      * Name of an EC2 instance type. e.g. `t2.micro`
      */
    val ec2InstanceType: Output_[String] = js.native
    
    /**
      * Type of fleet. This value must be `ON_DEMAND` or `SPOT`. Defaults to `ON_DEMAND`.
      */
    val fleetType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * ARN of an IAM role that instances in the fleet can assume.
      */
    val instanceRoleArn: Output_[js.UndefOr[String]] = js.native
    
    val logPaths: Output_[js.Array[String]] = js.native
    
    /**
      * List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
      */
    val metricGroups: Output_[js.Array[String]] = js.native
    
    /**
      * The name of the fleet.
      */
    val name: Output_[String] = js.native
    
    /**
      * Game session protection policy to apply to all instances in this fleet. e.g. `FullProtection`. Defaults to `NoProtection`.
      */
    val newGameSessionProtectionPolicy: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Operating system of the fleet's computing resources.
      */
    val operatingSystem: Output_[String] = js.native
    
    /**
      * Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
      */
    val resourceCreationLimitPolicy: Output_[js.UndefOr[FleetResourceCreationLimitPolicy]] = js.native
    
    /**
      * Instructions for launching server processes on each instance in the fleet. See below.
      */
    val runtimeConfiguration: Output_[js.UndefOr[FleetRuntimeConfiguration]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Fleet {
    
    @JSImport("@pulumi/aws/gamelift/fleet", "Fleet")
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
    @scala.inline
    def get(name: String, id: Input[ID]): Fleet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Fleet]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Fleet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Fleet]
    @scala.inline
    def get(name: String, id: Input[ID], state: FleetState): Fleet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Fleet]
    @scala.inline
    def get(name: String, id: Input[ID], state: FleetState, opts: CustomResourceOptions): Fleet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Fleet]
    
    /**
      * Returns true if the given object is an instance of Fleet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/gamelift/fleet.Fleet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/gamelift/fleet.Fleet */ Boolean]
  }
  
  trait FleetArgs extends StObject {
    
    /**
      * ID of the Gamelift Build to be deployed on the fleet.
      */
    val buildId: Input[String]
    
    /**
      * Human-readable description of the fleet.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
      */
    val ec2InboundPermissions: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.gamelift.FleetEc2InboundPermission]]]
      ] = js.undefined
    
    /**
      * Name of an EC2 instance type. e.g. `t2.micro`
      */
    val ec2InstanceType: Input[String]
    
    /**
      * Type of fleet. This value must be `ON_DEMAND` or `SPOT`. Defaults to `ON_DEMAND`.
      */
    val fleetType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ARN of an IAM role that instances in the fleet can assume.
      */
    val instanceRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
      */
    val metricGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The name of the fleet.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Game session protection policy to apply to all instances in this fleet. e.g. `FullProtection`. Defaults to `NoProtection`.
      */
    val newGameSessionProtectionPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
      */
    val resourceCreationLimitPolicy: js.UndefOr[Input[typings.pulumiAws.inputMod.gamelift.FleetResourceCreationLimitPolicy]] = js.undefined
    
    /**
      * Instructions for launching server processes on each instance in the fleet. See below.
      */
    val runtimeConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.gamelift.FleetRuntimeConfiguration]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object FleetArgs {
    
    @scala.inline
    def apply(buildId: Input[String], ec2InstanceType: Input[String]): FleetArgs = {
      val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], ec2InstanceType = ec2InstanceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[FleetArgs]
    }
    
    @scala.inline
    implicit class FleetArgsMutableBuilder[Self <: FleetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuildId(value: Input[String]): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEc2InboundPermissions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.gamelift.FleetEc2InboundPermission]]]): Self = StObject.set(x, "ec2InboundPermissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEc2InboundPermissionsUndefined: Self = StObject.set(x, "ec2InboundPermissions", js.undefined)
      
      @scala.inline
      def setEc2InboundPermissionsVarargs(value: Input[typings.pulumiAws.inputMod.gamelift.FleetEc2InboundPermission]*): Self = StObject.set(x, "ec2InboundPermissions", js.Array(value :_*))
      
      @scala.inline
      def setEc2InstanceType(value: Input[String]): Self = StObject.set(x, "ec2InstanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFleetType(value: Input[String]): Self = StObject.set(x, "fleetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFleetTypeUndefined: Self = StObject.set(x, "fleetType", js.undefined)
      
      @scala.inline
      def setInstanceRoleArn(value: Input[String]): Self = StObject.set(x, "instanceRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceRoleArnUndefined: Self = StObject.set(x, "instanceRoleArn", js.undefined)
      
      @scala.inline
      def setMetricGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "metricGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricGroupsUndefined: Self = StObject.set(x, "metricGroups", js.undefined)
      
      @scala.inline
      def setMetricGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "metricGroups", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNewGameSessionProtectionPolicy(value: Input[String]): Self = StObject.set(x, "newGameSessionProtectionPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewGameSessionProtectionPolicyUndefined: Self = StObject.set(x, "newGameSessionProtectionPolicy", js.undefined)
      
      @scala.inline
      def setResourceCreationLimitPolicy(value: Input[typings.pulumiAws.inputMod.gamelift.FleetResourceCreationLimitPolicy]): Self = StObject.set(x, "resourceCreationLimitPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceCreationLimitPolicyUndefined: Self = StObject.set(x, "resourceCreationLimitPolicy", js.undefined)
      
      @scala.inline
      def setRuntimeConfiguration(value: Input[typings.pulumiAws.inputMod.gamelift.FleetRuntimeConfiguration]): Self = StObject.set(x, "runtimeConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeConfigurationUndefined: Self = StObject.set(x, "runtimeConfiguration", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait FleetState extends StObject {
    
    /**
      * Fleet ARN.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ID of the Gamelift Build to be deployed on the fleet.
      */
    val buildId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Human-readable description of the fleet.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
      */
    val ec2InboundPermissions: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.gamelift.FleetEc2InboundPermission]]]
      ] = js.undefined
    
    /**
      * Name of an EC2 instance type. e.g. `t2.micro`
      */
    val ec2InstanceType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Type of fleet. This value must be `ON_DEMAND` or `SPOT`. Defaults to `ON_DEMAND`.
      */
    val fleetType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ARN of an IAM role that instances in the fleet can assume.
      */
    val instanceRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    val logPaths: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
      */
    val metricGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The name of the fleet.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Game session protection policy to apply to all instances in this fleet. e.g. `FullProtection`. Defaults to `NoProtection`.
      */
    val newGameSessionProtectionPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Operating system of the fleet's computing resources.
      */
    val operatingSystem: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
      */
    val resourceCreationLimitPolicy: js.UndefOr[Input[typings.pulumiAws.inputMod.gamelift.FleetResourceCreationLimitPolicy]] = js.undefined
    
    /**
      * Instructions for launching server processes on each instance in the fleet. See below.
      */
    val runtimeConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.gamelift.FleetRuntimeConfiguration]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object FleetState {
    
    @scala.inline
    def apply(): FleetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FleetState]
    }
    
    @scala.inline
    implicit class FleetStateMutableBuilder[Self <: FleetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setBuildId(value: Input[String]): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildIdUndefined: Self = StObject.set(x, "buildId", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEc2InboundPermissions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.gamelift.FleetEc2InboundPermission]]]): Self = StObject.set(x, "ec2InboundPermissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEc2InboundPermissionsUndefined: Self = StObject.set(x, "ec2InboundPermissions", js.undefined)
      
      @scala.inline
      def setEc2InboundPermissionsVarargs(value: Input[typings.pulumiAws.inputMod.gamelift.FleetEc2InboundPermission]*): Self = StObject.set(x, "ec2InboundPermissions", js.Array(value :_*))
      
      @scala.inline
      def setEc2InstanceType(value: Input[String]): Self = StObject.set(x, "ec2InstanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEc2InstanceTypeUndefined: Self = StObject.set(x, "ec2InstanceType", js.undefined)
      
      @scala.inline
      def setFleetType(value: Input[String]): Self = StObject.set(x, "fleetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFleetTypeUndefined: Self = StObject.set(x, "fleetType", js.undefined)
      
      @scala.inline
      def setInstanceRoleArn(value: Input[String]): Self = StObject.set(x, "instanceRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceRoleArnUndefined: Self = StObject.set(x, "instanceRoleArn", js.undefined)
      
      @scala.inline
      def setLogPaths(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "logPaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogPathsUndefined: Self = StObject.set(x, "logPaths", js.undefined)
      
      @scala.inline
      def setLogPathsVarargs(value: Input[String]*): Self = StObject.set(x, "logPaths", js.Array(value :_*))
      
      @scala.inline
      def setMetricGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "metricGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricGroupsUndefined: Self = StObject.set(x, "metricGroups", js.undefined)
      
      @scala.inline
      def setMetricGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "metricGroups", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNewGameSessionProtectionPolicy(value: Input[String]): Self = StObject.set(x, "newGameSessionProtectionPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewGameSessionProtectionPolicyUndefined: Self = StObject.set(x, "newGameSessionProtectionPolicy", js.undefined)
      
      @scala.inline
      def setOperatingSystem(value: Input[String]): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
      
      @scala.inline
      def setResourceCreationLimitPolicy(value: Input[typings.pulumiAws.inputMod.gamelift.FleetResourceCreationLimitPolicy]): Self = StObject.set(x, "resourceCreationLimitPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceCreationLimitPolicyUndefined: Self = StObject.set(x, "resourceCreationLimitPolicy", js.undefined)
      
      @scala.inline
      def setRuntimeConfiguration(value: Input[typings.pulumiAws.inputMod.gamelift.FleetRuntimeConfiguration]): Self = StObject.set(x, "runtimeConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeConfigurationUndefined: Self = StObject.set(x, "runtimeConfiguration", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
