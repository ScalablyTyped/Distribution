package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.SpotFleetRequestLaunchSpecification
import typings.pulumiAws.outputMod.ec2.SpotFleetRequestLaunchTemplateConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spotFleetRequestMod {
  
  @JSImport("@pulumi/aws/ec2/spotFleetRequest", "SpotFleetRequest")
  @js.native
  class SpotFleetRequest protected () extends CustomResource {
    /**
      * Create a SpotFleetRequest resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SpotFleetRequestArgs) = this()
    def this(name: String, args: SpotFleetRequestArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Indicates how to allocate the target capacity across
      * the Spot pools specified by the Spot fleet request. The default is
      * `lowestPrice`.
      */
    val allocationStrategy: Output_[js.UndefOr[String]] = js.native
    
    val clientToken: Output_[String] = js.native
    
    /**
      * Indicates whether running Spot
      * instances should be terminated if the target capacity of the Spot fleet
      * request is decreased below the current size of the Spot fleet.
      */
    val excessCapacityTerminationPolicy: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The type of fleet request. Indicates whether the Spot Fleet only requests the target
      * capacity or also attempts to maintain it. Default is `maintain`.
      */
    val fleetType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Grants the Spot fleet permission to terminate
      * Spot instances on your behalf when you cancel its Spot fleet request using
      * CancelSpotFleetRequests or when the Spot fleet request expires, if you set
      * terminateInstancesWithExpiration.
      */
    val iamFleetRole: Output_[String] = js.native
    
    /**
      * Indicates whether a Spot
      * instance stops or terminates when it is interrupted. Default is
      * `terminate`.
      */
    val instanceInterruptionBehaviour: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The number of Spot pools across which to allocate your target Spot capacity.
      * Valid only when `allocationStrategy` is set to `lowestPrice`. Spot Fleet selects
      * the cheapest Spot pools and evenly allocates your target Spot capacity across
      * the number of Spot pools that you specify.
      */
    val instancePoolsToUseCount: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * Used to define the launch configuration of the
      * spot-fleet request. Can be specified multiple times to define different bids
      * across different markets and instance types. Conflicts with `launchTemplateConfig`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
      */
    val launchSpecifications: Output_[js.UndefOr[js.Array[SpotFleetRequestLaunchSpecification]]] = js.native
    
    /**
      * Launch template configuration block. See Launch Template Configs below for more details. Conflicts with `launchSpecification`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
      */
    val launchTemplateConfigs: Output_[js.UndefOr[js.Array[SpotFleetRequestLaunchTemplateConfig]]] = js.native
    
    /**
      * A list of elastic load balancer names to add to the Spot fleet.
      */
    val loadBalancers: Output_[js.Array[String]] = js.native
    
    /**
      * Indicates whether Spot fleet should replace unhealthy instances. Default `false`.
      */
    val replaceUnhealthyInstances: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The maximum spot bid for this override request.
      */
    val spotPrice: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The state of the Spot fleet request.
      */
    val spotRequestState: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The number of units to request. You can choose to set the
      * target capacity in terms of instances or a performance characteristic that is
      * important to your application workload, such as vCPUs, memory, or I/O.
      */
    val targetCapacity: Output_[Double] = js.native
    
    /**
      * A list of `aws.alb.TargetGroup` ARNs, for use with Application Load Balancing.
      */
    val targetGroupArns: Output_[js.Array[String]] = js.native
    
    /**
      * Indicates whether running Spot
      * instances should be terminated when the Spot fleet request expires.
      */
    val terminateInstancesWithExpiration: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
      */
    val validFrom: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request.
      */
    val validUntil: Output_[js.UndefOr[String]] = js.native
    
    /**
      * If set, this provider will
      * wait for the Spot Request to be fulfilled, and will throw an error if the
      * timeout of 10m is reached.
      */
    val waitForFulfillment: Output_[js.UndefOr[Boolean]] = js.native
  }
  /* static members */
  object SpotFleetRequest {
    
    /**
      * Get an existing SpotFleetRequest resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/spotFleetRequest", "SpotFleetRequest.get")
    @js.native
    def get(name: String, id: Input[ID]): SpotFleetRequest = js.native
    @JSImport("@pulumi/aws/ec2/spotFleetRequest", "SpotFleetRequest.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SpotFleetRequest = js.native
    @JSImport("@pulumi/aws/ec2/spotFleetRequest", "SpotFleetRequest.get")
    @js.native
    def get(name: String, id: Input[ID], state: SpotFleetRequestState): SpotFleetRequest = js.native
    @JSImport("@pulumi/aws/ec2/spotFleetRequest", "SpotFleetRequest.get")
    @js.native
    def get(name: String, id: Input[ID], state: SpotFleetRequestState, opts: CustomResourceOptions): SpotFleetRequest = js.native
    
    /**
      * Returns true if the given object is an instance of SpotFleetRequest.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/spotFleetRequest", "SpotFleetRequest.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/spotFleetRequest.SpotFleetRequest */ Boolean = js.native
  }
  
  @js.native
  trait SpotFleetRequestArgs extends StObject {
    
    /**
      * Indicates how to allocate the target capacity across
      * the Spot pools specified by the Spot fleet request. The default is
      * `lowestPrice`.
      */
    val allocationStrategy: js.UndefOr[Input[String]] = js.native
    
    /**
      * Indicates whether running Spot
      * instances should be terminated if the target capacity of the Spot fleet
      * request is decreased below the current size of the Spot fleet.
      */
    val excessCapacityTerminationPolicy: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of fleet request. Indicates whether the Spot Fleet only requests the target
      * capacity or also attempts to maintain it. Default is `maintain`.
      */
    val fleetType: js.UndefOr[Input[String]] = js.native
    
    /**
      * Grants the Spot fleet permission to terminate
      * Spot instances on your behalf when you cancel its Spot fleet request using
      * CancelSpotFleetRequests or when the Spot fleet request expires, if you set
      * terminateInstancesWithExpiration.
      */
    val iamFleetRole: Input[String] = js.native
    
    /**
      * Indicates whether a Spot
      * instance stops or terminates when it is interrupted. Default is
      * `terminate`.
      */
    val instanceInterruptionBehaviour: js.UndefOr[Input[String]] = js.native
    
    /**
      * The number of Spot pools across which to allocate your target Spot capacity.
      * Valid only when `allocationStrategy` is set to `lowestPrice`. Spot Fleet selects
      * the cheapest Spot pools and evenly allocates your target Spot capacity across
      * the number of Spot pools that you specify.
      */
    val instancePoolsToUseCount: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Used to define the launch configuration of the
      * spot-fleet request. Can be specified multiple times to define different bids
      * across different markets and instance types. Conflicts with `launchTemplateConfig`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
      */
    val launchSpecifications: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2.SpotFleetRequestLaunchSpecification]]
        ]
      ] = js.native
    
    /**
      * Launch template configuration block. See Launch Template Configs below for more details. Conflicts with `launchSpecification`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
      */
    val launchTemplateConfigs: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2.SpotFleetRequestLaunchTemplateConfig]]
        ]
      ] = js.native
    
    /**
      * A list of elastic load balancer names to add to the Spot fleet.
      */
    val loadBalancers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Indicates whether Spot fleet should replace unhealthy instances. Default `false`.
      */
    val replaceUnhealthyInstances: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The maximum spot bid for this override request.
      */
    val spotPrice: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The number of units to request. You can choose to set the
      * target capacity in terms of instances or a performance characteristic that is
      * important to your application workload, such as vCPUs, memory, or I/O.
      */
    val targetCapacity: Input[Double] = js.native
    
    /**
      * A list of `aws.alb.TargetGroup` ARNs, for use with Application Load Balancing.
      */
    val targetGroupArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Indicates whether running Spot
      * instances should be terminated when the Spot fleet request expires.
      */
    val terminateInstancesWithExpiration: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
      */
    val validFrom: js.UndefOr[Input[String]] = js.native
    
    /**
      * The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request.
      */
    val validUntil: js.UndefOr[Input[String]] = js.native
    
    /**
      * If set, this provider will
      * wait for the Spot Request to be fulfilled, and will throw an error if the
      * timeout of 10m is reached.
      */
    val waitForFulfillment: js.UndefOr[Input[Boolean]] = js.native
  }
  object SpotFleetRequestArgs {
    
    @scala.inline
    def apply(iamFleetRole: Input[String], targetCapacity: Input[Double]): SpotFleetRequestArgs = {
      val __obj = js.Dynamic.literal(iamFleetRole = iamFleetRole.asInstanceOf[js.Any], targetCapacity = targetCapacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpotFleetRequestArgs]
    }
    
    @scala.inline
    implicit class SpotFleetRequestArgsMutableBuilder[Self <: SpotFleetRequestArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllocationStrategy(value: Input[String]): Self = StObject.set(x, "allocationStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllocationStrategyUndefined: Self = StObject.set(x, "allocationStrategy", js.undefined)
      
      @scala.inline
      def setExcessCapacityTerminationPolicy(value: Input[String]): Self = StObject.set(x, "excessCapacityTerminationPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcessCapacityTerminationPolicyUndefined: Self = StObject.set(x, "excessCapacityTerminationPolicy", js.undefined)
      
      @scala.inline
      def setFleetType(value: Input[String]): Self = StObject.set(x, "fleetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFleetTypeUndefined: Self = StObject.set(x, "fleetType", js.undefined)
      
      @scala.inline
      def setIamFleetRole(value: Input[String]): Self = StObject.set(x, "iamFleetRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceInterruptionBehaviour(value: Input[String]): Self = StObject.set(x, "instanceInterruptionBehaviour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceInterruptionBehaviourUndefined: Self = StObject.set(x, "instanceInterruptionBehaviour", js.undefined)
      
      @scala.inline
      def setInstancePoolsToUseCount(value: Input[Double]): Self = StObject.set(x, "instancePoolsToUseCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstancePoolsToUseCountUndefined: Self = StObject.set(x, "instancePoolsToUseCount", js.undefined)
      
      @scala.inline
      def setLaunchSpecifications(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2.SpotFleetRequestLaunchSpecification]]
            ]
      ): Self = StObject.set(x, "launchSpecifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchSpecificationsUndefined: Self = StObject.set(x, "launchSpecifications", js.undefined)
      
      @scala.inline
      def setLaunchSpecificationsVarargs(value: Input[typings.pulumiAws.inputMod.ec2.SpotFleetRequestLaunchSpecification]*): Self = StObject.set(x, "launchSpecifications", js.Array(value :_*))
      
      @scala.inline
      def setLaunchTemplateConfigs(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2.SpotFleetRequestLaunchTemplateConfig]]
            ]
      ): Self = StObject.set(x, "launchTemplateConfigs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchTemplateConfigsUndefined: Self = StObject.set(x, "launchTemplateConfigs", js.undefined)
      
      @scala.inline
      def setLaunchTemplateConfigsVarargs(value: Input[typings.pulumiAws.inputMod.ec2.SpotFleetRequestLaunchTemplateConfig]*): Self = StObject.set(x, "launchTemplateConfigs", js.Array(value :_*))
      
      @scala.inline
      def setLoadBalancers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "loadBalancers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancersUndefined: Self = StObject.set(x, "loadBalancers", js.undefined)
      
      @scala.inline
      def setLoadBalancersVarargs(value: Input[String]*): Self = StObject.set(x, "loadBalancers", js.Array(value :_*))
      
      @scala.inline
      def setReplaceUnhealthyInstances(value: Input[Boolean]): Self = StObject.set(x, "replaceUnhealthyInstances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceUnhealthyInstancesUndefined: Self = StObject.set(x, "replaceUnhealthyInstances", js.undefined)
      
      @scala.inline
      def setSpotPrice(value: Input[String]): Self = StObject.set(x, "spotPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpotPriceUndefined: Self = StObject.set(x, "spotPrice", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTargetCapacity(value: Input[Double]): Self = StObject.set(x, "targetCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetGroupArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "targetGroupArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetGroupArnsUndefined: Self = StObject.set(x, "targetGroupArns", js.undefined)
      
      @scala.inline
      def setTargetGroupArnsVarargs(value: Input[String]*): Self = StObject.set(x, "targetGroupArns", js.Array(value :_*))
      
      @scala.inline
      def setTerminateInstancesWithExpiration(value: Input[Boolean]): Self = StObject.set(x, "terminateInstancesWithExpiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminateInstancesWithExpirationUndefined: Self = StObject.set(x, "terminateInstancesWithExpiration", js.undefined)
      
      @scala.inline
      def setValidFrom(value: Input[String]): Self = StObject.set(x, "validFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidFromUndefined: Self = StObject.set(x, "validFrom", js.undefined)
      
      @scala.inline
      def setValidUntil(value: Input[String]): Self = StObject.set(x, "validUntil", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUntilUndefined: Self = StObject.set(x, "validUntil", js.undefined)
      
      @scala.inline
      def setWaitForFulfillment(value: Input[Boolean]): Self = StObject.set(x, "waitForFulfillment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForFulfillmentUndefined: Self = StObject.set(x, "waitForFulfillment", js.undefined)
    }
  }
  
  @js.native
  trait SpotFleetRequestState extends StObject {
    
    /**
      * Indicates how to allocate the target capacity across
      * the Spot pools specified by the Spot fleet request. The default is
      * `lowestPrice`.
      */
    val allocationStrategy: js.UndefOr[Input[String]] = js.native
    
    val clientToken: js.UndefOr[Input[String]] = js.native
    
    /**
      * Indicates whether running Spot
      * instances should be terminated if the target capacity of the Spot fleet
      * request is decreased below the current size of the Spot fleet.
      */
    val excessCapacityTerminationPolicy: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of fleet request. Indicates whether the Spot Fleet only requests the target
      * capacity or also attempts to maintain it. Default is `maintain`.
      */
    val fleetType: js.UndefOr[Input[String]] = js.native
    
    /**
      * Grants the Spot fleet permission to terminate
      * Spot instances on your behalf when you cancel its Spot fleet request using
      * CancelSpotFleetRequests or when the Spot fleet request expires, if you set
      * terminateInstancesWithExpiration.
      */
    val iamFleetRole: js.UndefOr[Input[String]] = js.native
    
    /**
      * Indicates whether a Spot
      * instance stops or terminates when it is interrupted. Default is
      * `terminate`.
      */
    val instanceInterruptionBehaviour: js.UndefOr[Input[String]] = js.native
    
    /**
      * The number of Spot pools across which to allocate your target Spot capacity.
      * Valid only when `allocationStrategy` is set to `lowestPrice`. Spot Fleet selects
      * the cheapest Spot pools and evenly allocates your target Spot capacity across
      * the number of Spot pools that you specify.
      */
    val instancePoolsToUseCount: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Used to define the launch configuration of the
      * spot-fleet request. Can be specified multiple times to define different bids
      * across different markets and instance types. Conflicts with `launchTemplateConfig`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
      */
    val launchSpecifications: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2.SpotFleetRequestLaunchSpecification]]
        ]
      ] = js.native
    
    /**
      * Launch template configuration block. See Launch Template Configs below for more details. Conflicts with `launchSpecification`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
      */
    val launchTemplateConfigs: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2.SpotFleetRequestLaunchTemplateConfig]]
        ]
      ] = js.native
    
    /**
      * A list of elastic load balancer names to add to the Spot fleet.
      */
    val loadBalancers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Indicates whether Spot fleet should replace unhealthy instances. Default `false`.
      */
    val replaceUnhealthyInstances: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The maximum spot bid for this override request.
      */
    val spotPrice: js.UndefOr[Input[String]] = js.native
    
    /**
      * The state of the Spot fleet request.
      */
    val spotRequestState: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The number of units to request. You can choose to set the
      * target capacity in terms of instances or a performance characteristic that is
      * important to your application workload, such as vCPUs, memory, or I/O.
      */
    val targetCapacity: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A list of `aws.alb.TargetGroup` ARNs, for use with Application Load Balancing.
      */
    val targetGroupArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Indicates whether running Spot
      * instances should be terminated when the Spot fleet request expires.
      */
    val terminateInstancesWithExpiration: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
      */
    val validFrom: js.UndefOr[Input[String]] = js.native
    
    /**
      * The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request.
      */
    val validUntil: js.UndefOr[Input[String]] = js.native
    
    /**
      * If set, this provider will
      * wait for the Spot Request to be fulfilled, and will throw an error if the
      * timeout of 10m is reached.
      */
    val waitForFulfillment: js.UndefOr[Input[Boolean]] = js.native
  }
  object SpotFleetRequestState {
    
    @scala.inline
    def apply(): SpotFleetRequestState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpotFleetRequestState]
    }
    
    @scala.inline
    implicit class SpotFleetRequestStateMutableBuilder[Self <: SpotFleetRequestState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllocationStrategy(value: Input[String]): Self = StObject.set(x, "allocationStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllocationStrategyUndefined: Self = StObject.set(x, "allocationStrategy", js.undefined)
      
      @scala.inline
      def setClientToken(value: Input[String]): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
      
      @scala.inline
      def setExcessCapacityTerminationPolicy(value: Input[String]): Self = StObject.set(x, "excessCapacityTerminationPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcessCapacityTerminationPolicyUndefined: Self = StObject.set(x, "excessCapacityTerminationPolicy", js.undefined)
      
      @scala.inline
      def setFleetType(value: Input[String]): Self = StObject.set(x, "fleetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFleetTypeUndefined: Self = StObject.set(x, "fleetType", js.undefined)
      
      @scala.inline
      def setIamFleetRole(value: Input[String]): Self = StObject.set(x, "iamFleetRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamFleetRoleUndefined: Self = StObject.set(x, "iamFleetRole", js.undefined)
      
      @scala.inline
      def setInstanceInterruptionBehaviour(value: Input[String]): Self = StObject.set(x, "instanceInterruptionBehaviour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceInterruptionBehaviourUndefined: Self = StObject.set(x, "instanceInterruptionBehaviour", js.undefined)
      
      @scala.inline
      def setInstancePoolsToUseCount(value: Input[Double]): Self = StObject.set(x, "instancePoolsToUseCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstancePoolsToUseCountUndefined: Self = StObject.set(x, "instancePoolsToUseCount", js.undefined)
      
      @scala.inline
      def setLaunchSpecifications(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2.SpotFleetRequestLaunchSpecification]]
            ]
      ): Self = StObject.set(x, "launchSpecifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchSpecificationsUndefined: Self = StObject.set(x, "launchSpecifications", js.undefined)
      
      @scala.inline
      def setLaunchSpecificationsVarargs(value: Input[typings.pulumiAws.inputMod.ec2.SpotFleetRequestLaunchSpecification]*): Self = StObject.set(x, "launchSpecifications", js.Array(value :_*))
      
      @scala.inline
      def setLaunchTemplateConfigs(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2.SpotFleetRequestLaunchTemplateConfig]]
            ]
      ): Self = StObject.set(x, "launchTemplateConfigs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchTemplateConfigsUndefined: Self = StObject.set(x, "launchTemplateConfigs", js.undefined)
      
      @scala.inline
      def setLaunchTemplateConfigsVarargs(value: Input[typings.pulumiAws.inputMod.ec2.SpotFleetRequestLaunchTemplateConfig]*): Self = StObject.set(x, "launchTemplateConfigs", js.Array(value :_*))
      
      @scala.inline
      def setLoadBalancers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "loadBalancers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancersUndefined: Self = StObject.set(x, "loadBalancers", js.undefined)
      
      @scala.inline
      def setLoadBalancersVarargs(value: Input[String]*): Self = StObject.set(x, "loadBalancers", js.Array(value :_*))
      
      @scala.inline
      def setReplaceUnhealthyInstances(value: Input[Boolean]): Self = StObject.set(x, "replaceUnhealthyInstances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceUnhealthyInstancesUndefined: Self = StObject.set(x, "replaceUnhealthyInstances", js.undefined)
      
      @scala.inline
      def setSpotPrice(value: Input[String]): Self = StObject.set(x, "spotPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpotPriceUndefined: Self = StObject.set(x, "spotPrice", js.undefined)
      
      @scala.inline
      def setSpotRequestState(value: Input[String]): Self = StObject.set(x, "spotRequestState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpotRequestStateUndefined: Self = StObject.set(x, "spotRequestState", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTargetCapacity(value: Input[Double]): Self = StObject.set(x, "targetCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetCapacityUndefined: Self = StObject.set(x, "targetCapacity", js.undefined)
      
      @scala.inline
      def setTargetGroupArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "targetGroupArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetGroupArnsUndefined: Self = StObject.set(x, "targetGroupArns", js.undefined)
      
      @scala.inline
      def setTargetGroupArnsVarargs(value: Input[String]*): Self = StObject.set(x, "targetGroupArns", js.Array(value :_*))
      
      @scala.inline
      def setTerminateInstancesWithExpiration(value: Input[Boolean]): Self = StObject.set(x, "terminateInstancesWithExpiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminateInstancesWithExpirationUndefined: Self = StObject.set(x, "terminateInstancesWithExpiration", js.undefined)
      
      @scala.inline
      def setValidFrom(value: Input[String]): Self = StObject.set(x, "validFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidFromUndefined: Self = StObject.set(x, "validFrom", js.undefined)
      
      @scala.inline
      def setValidUntil(value: Input[String]): Self = StObject.set(x, "validUntil", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUntilUndefined: Self = StObject.set(x, "validUntil", js.undefined)
      
      @scala.inline
      def setWaitForFulfillment(value: Input[Boolean]): Self = StObject.set(x, "waitForFulfillment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForFulfillmentUndefined: Self = StObject.set(x, "waitForFulfillment", js.undefined)
    }
  }
}
