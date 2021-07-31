package typings.pulumiAws

import typings.pulumiAws.outputMod.emr.InstanceGroupEbsConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instanceGroupMod {
  
  @JSImport("@pulumi/aws/emr/instanceGroup", "InstanceGroup")
  @js.native
  class InstanceGroup protected () extends CustomResource {
    /**
      * Create a InstanceGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InstanceGroupArgs) = this()
    def this(name: String, args: InstanceGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The autoscaling policy document. This is a JSON formatted string. See [EMR Auto Scaling](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html)
      */
    val autoscalingPolicy: Output_[js.UndefOr[String]] = js.native
    
    /**
      * If set, the bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
      */
    val bidPrice: Output_[js.UndefOr[String]] = js.native
    
    /**
      * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
      */
    val clusterId: Output_[String] = js.native
    
    /**
      * A JSON string for supplying list of configurations specific to the EMR instance group. Note that this can only be changed when using EMR release 5.21 or later.
      */
    val configurationsJson: Output_[js.UndefOr[String]] = js.native
    
    /**
      * One or more `ebsConfig` blocks as defined below. Changing this forces a new resource to be created.
      */
    val ebsConfigs: Output_[js.Array[InstanceGroupEbsConfig]] = js.native
    
    /**
      * Indicates whether an Amazon EBS volume is EBS-optimized. Changing this forces a new resource to be created.
      */
    val ebsOptimized: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * target number of instances for the instance group. defaults to 0.
      */
    val instanceCount: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The EC2 instance type for all instances in the instance group. Changing this forces a new resource to be created.
      */
    val instanceType: Output_[String] = js.native
    
    /**
      * Human friendly name given to the instance group. Changing this forces a new resource to be created.
      */
    val name: Output_[String] = js.native
    
    val runningInstanceCount: Output_[Double] = js.native
    
    val status: Output_[String] = js.native
  }
  /* static members */
  object InstanceGroup {
    
    @JSImport("@pulumi/aws/emr/instanceGroup", "InstanceGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing InstanceGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): InstanceGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[InstanceGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): InstanceGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[InstanceGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: InstanceGroupState): InstanceGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[InstanceGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: InstanceGroupState, opts: CustomResourceOptions): InstanceGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[InstanceGroup]
    
    /**
      * Returns true if the given object is an instance of InstanceGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/instanceGroup.InstanceGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/emr/instanceGroup.InstanceGroup */ Boolean]
  }
  
  trait InstanceGroupArgs extends StObject {
    
    /**
      * The autoscaling policy document. This is a JSON formatted string. See [EMR Auto Scaling](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html)
      */
    val autoscalingPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If set, the bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
      */
    val bidPrice: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
      */
    val clusterId: Input[String]
    
    /**
      * A JSON string for supplying list of configurations specific to the EMR instance group. Note that this can only be changed when using EMR release 5.21 or later.
      */
    val configurationsJson: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * One or more `ebsConfig` blocks as defined below. Changing this forces a new resource to be created.
      */
    val ebsConfigs: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.emr.InstanceGroupEbsConfig]]]] = js.undefined
    
    /**
      * Indicates whether an Amazon EBS volume is EBS-optimized. Changing this forces a new resource to be created.
      */
    val ebsOptimized: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * target number of instances for the instance group. defaults to 0.
      */
    val instanceCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The EC2 instance type for all instances in the instance group. Changing this forces a new resource to be created.
      */
    val instanceType: Input[String]
    
    /**
      * Human friendly name given to the instance group. Changing this forces a new resource to be created.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object InstanceGroupArgs {
    
    @scala.inline
    def apply(clusterId: Input[String], instanceType: Input[String]): InstanceGroupArgs = {
      val __obj = js.Dynamic.literal(clusterId = clusterId.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstanceGroupArgs]
    }
    
    @scala.inline
    implicit class InstanceGroupArgsMutableBuilder[Self <: InstanceGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoscalingPolicy(value: Input[String]): Self = StObject.set(x, "autoscalingPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoscalingPolicyUndefined: Self = StObject.set(x, "autoscalingPolicy", js.undefined)
      
      @scala.inline
      def setBidPrice(value: Input[String]): Self = StObject.set(x, "bidPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBidPriceUndefined: Self = StObject.set(x, "bidPrice", js.undefined)
      
      @scala.inline
      def setClusterId(value: Input[String]): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationsJson(value: Input[String]): Self = StObject.set(x, "configurationsJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationsJsonUndefined: Self = StObject.set(x, "configurationsJson", js.undefined)
      
      @scala.inline
      def setEbsConfigs(value: Input[js.Array[Input[typings.pulumiAws.inputMod.emr.InstanceGroupEbsConfig]]]): Self = StObject.set(x, "ebsConfigs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsConfigsUndefined: Self = StObject.set(x, "ebsConfigs", js.undefined)
      
      @scala.inline
      def setEbsConfigsVarargs(value: Input[typings.pulumiAws.inputMod.emr.InstanceGroupEbsConfig]*): Self = StObject.set(x, "ebsConfigs", js.Array(value :_*))
      
      @scala.inline
      def setEbsOptimized(value: Input[Boolean]): Self = StObject.set(x, "ebsOptimized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsOptimizedUndefined: Self = StObject.set(x, "ebsOptimized", js.undefined)
      
      @scala.inline
      def setInstanceCount(value: Input[Double]): Self = StObject.set(x, "instanceCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceCountUndefined: Self = StObject.set(x, "instanceCount", js.undefined)
      
      @scala.inline
      def setInstanceType(value: Input[String]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait InstanceGroupState extends StObject {
    
    /**
      * The autoscaling policy document. This is a JSON formatted string. See [EMR Auto Scaling](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html)
      */
    val autoscalingPolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If set, the bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
      */
    val bidPrice: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
      */
    val clusterId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A JSON string for supplying list of configurations specific to the EMR instance group. Note that this can only be changed when using EMR release 5.21 or later.
      */
    val configurationsJson: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * One or more `ebsConfig` blocks as defined below. Changing this forces a new resource to be created.
      */
    val ebsConfigs: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.emr.InstanceGroupEbsConfig]]]] = js.undefined
    
    /**
      * Indicates whether an Amazon EBS volume is EBS-optimized. Changing this forces a new resource to be created.
      */
    val ebsOptimized: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * target number of instances for the instance group. defaults to 0.
      */
    val instanceCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The EC2 instance type for all instances in the instance group. Changing this forces a new resource to be created.
      */
    val instanceType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Human friendly name given to the instance group. Changing this forces a new resource to be created.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    val runningInstanceCount: js.UndefOr[Input[Double]] = js.undefined
    
    val status: js.UndefOr[Input[String]] = js.undefined
  }
  object InstanceGroupState {
    
    @scala.inline
    def apply(): InstanceGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstanceGroupState]
    }
    
    @scala.inline
    implicit class InstanceGroupStateMutableBuilder[Self <: InstanceGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoscalingPolicy(value: Input[String]): Self = StObject.set(x, "autoscalingPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoscalingPolicyUndefined: Self = StObject.set(x, "autoscalingPolicy", js.undefined)
      
      @scala.inline
      def setBidPrice(value: Input[String]): Self = StObject.set(x, "bidPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBidPriceUndefined: Self = StObject.set(x, "bidPrice", js.undefined)
      
      @scala.inline
      def setClusterId(value: Input[String]): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
      
      @scala.inline
      def setConfigurationsJson(value: Input[String]): Self = StObject.set(x, "configurationsJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationsJsonUndefined: Self = StObject.set(x, "configurationsJson", js.undefined)
      
      @scala.inline
      def setEbsConfigs(value: Input[js.Array[Input[typings.pulumiAws.inputMod.emr.InstanceGroupEbsConfig]]]): Self = StObject.set(x, "ebsConfigs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsConfigsUndefined: Self = StObject.set(x, "ebsConfigs", js.undefined)
      
      @scala.inline
      def setEbsConfigsVarargs(value: Input[typings.pulumiAws.inputMod.emr.InstanceGroupEbsConfig]*): Self = StObject.set(x, "ebsConfigs", js.Array(value :_*))
      
      @scala.inline
      def setEbsOptimized(value: Input[Boolean]): Self = StObject.set(x, "ebsOptimized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsOptimizedUndefined: Self = StObject.set(x, "ebsOptimized", js.undefined)
      
      @scala.inline
      def setInstanceCount(value: Input[Double]): Self = StObject.set(x, "instanceCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceCountUndefined: Self = StObject.set(x, "instanceCount", js.undefined)
      
      @scala.inline
      def setInstanceType(value: Input[String]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRunningInstanceCount(value: Input[Double]): Self = StObject.set(x, "runningInstanceCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunningInstanceCountUndefined: Self = StObject.set(x, "runningInstanceCount", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
