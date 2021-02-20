package typings.pulumiAws

import typings.pulumiAws.outputMod.codedeploy.DeploymentGroupAlarmConfiguration
import typings.pulumiAws.outputMod.codedeploy.DeploymentGroupAutoRollbackConfiguration
import typings.pulumiAws.outputMod.codedeploy.DeploymentGroupBlueGreenDeploymentConfig
import typings.pulumiAws.outputMod.codedeploy.DeploymentGroupDeploymentStyle
import typings.pulumiAws.outputMod.codedeploy.DeploymentGroupEc2TagFilter
import typings.pulumiAws.outputMod.codedeploy.DeploymentGroupEc2TagSet
import typings.pulumiAws.outputMod.codedeploy.DeploymentGroupEcsService
import typings.pulumiAws.outputMod.codedeploy.DeploymentGroupLoadBalancerInfo
import typings.pulumiAws.outputMod.codedeploy.DeploymentGroupOnPremisesInstanceTagFilter
import typings.pulumiAws.outputMod.codedeploy.DeploymentGroupTriggerConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deploymentGroupMod {
  
  @JSImport("@pulumi/aws/codedeploy/deploymentGroup", "DeploymentGroup")
  @js.native
  class DeploymentGroup protected () extends CustomResource {
    /**
      * Create a DeploymentGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DeploymentGroupArgs) = this()
    def this(name: String, args: DeploymentGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Configuration block of alarms associated with the deployment group (documented below).
      */
    val alarmConfiguration: Output_[js.UndefOr[DeploymentGroupAlarmConfiguration]] = js.native
    
    /**
      * The name of the application.
      */
    val appName: Output_[String] = js.native
    
    /**
      * Configuration block of the automatic rollback configuration associated with the deployment group (documented below).
      */
    val autoRollbackConfiguration: Output_[js.UndefOr[DeploymentGroupAutoRollbackConfiguration]] = js.native
    
    /**
      * Autoscaling groups associated with the deployment group.
      */
    val autoscalingGroups: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Configuration block of the blue/green deployment options for a deployment group (documented below).
      */
    val blueGreenDeploymentConfig: Output_[DeploymentGroupBlueGreenDeploymentConfig] = js.native
    
    /**
      * The name of the group's deployment config. The default is "CodeDeployDefault.OneAtATime".
      */
    val deploymentConfigName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the deployment group.
      */
    val deploymentGroupName: Output_[String] = js.native
    
    /**
      * Configuration block of the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer (documented below).
      */
    val deploymentStyle: Output_[js.UndefOr[DeploymentGroupDeploymentStyle]] = js.native
    
    /**
      * Tag filters associated with the deployment group. See the AWS docs for details.
      */
    val ec2TagFilters: Output_[js.UndefOr[js.Array[DeploymentGroupEc2TagFilter]]] = js.native
    
    /**
      * Configuration block(s) of Tag filters associated with the deployment group, which are also referred to as tag groups (documented below). See the AWS docs for details.
      */
    val ec2TagSets: Output_[js.UndefOr[js.Array[DeploymentGroupEc2TagSet]]] = js.native
    
    /**
      * Configuration block(s) of the ECS services for a deployment group (documented below).
      */
    val ecsService: Output_[js.UndefOr[DeploymentGroupEcsService]] = js.native
    
    /**
      * Single configuration block of the load balancer to use in a blue/green deployment (documented below).
      */
    val loadBalancerInfo: Output_[js.UndefOr[DeploymentGroupLoadBalancerInfo]] = js.native
    
    /**
      * On premise tag filters associated with the group. See the AWS docs for details.
      */
    val onPremisesInstanceTagFilters: Output_[js.UndefOr[js.Array[DeploymentGroupOnPremisesInstanceTagFilter]]] = js.native
    
    /**
      * The service role ARN that allows deployments.
      */
    val serviceRoleArn: Output_[String] = js.native
    
    /**
      * Configuration block(s) of the triggers for the deployment group (documented below).
      */
    val triggerConfigurations: Output_[js.UndefOr[js.Array[DeploymentGroupTriggerConfiguration]]] = js.native
  }
  /* static members */
  object DeploymentGroup {
    
    /**
      * Get an existing DeploymentGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/codedeploy/deploymentGroup", "DeploymentGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): DeploymentGroup = js.native
    @JSImport("@pulumi/aws/codedeploy/deploymentGroup", "DeploymentGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DeploymentGroup = js.native
    @JSImport("@pulumi/aws/codedeploy/deploymentGroup", "DeploymentGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: DeploymentGroupState): DeploymentGroup = js.native
    @JSImport("@pulumi/aws/codedeploy/deploymentGroup", "DeploymentGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: DeploymentGroupState, opts: CustomResourceOptions): DeploymentGroup = js.native
    
    /**
      * Returns true if the given object is an instance of DeploymentGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/codedeploy/deploymentGroup", "DeploymentGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codedeploy/deploymentGroup.DeploymentGroup */ Boolean = js.native
  }
  
  @js.native
  trait DeploymentGroupArgs extends StObject {
    
    /**
      * Configuration block of alarms associated with the deployment group (documented below).
      */
    val alarmConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupAlarmConfiguration]] = js.native
    
    /**
      * The name of the application.
      */
    val appName: Input[String] = js.native
    
    /**
      * Configuration block of the automatic rollback configuration associated with the deployment group (documented below).
      */
    val autoRollbackConfiguration: js.UndefOr[
        Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupAutoRollbackConfiguration]
      ] = js.native
    
    /**
      * Autoscaling groups associated with the deployment group.
      */
    val autoscalingGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Configuration block of the blue/green deployment options for a deployment group (documented below).
      */
    val blueGreenDeploymentConfig: js.UndefOr[
        Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupBlueGreenDeploymentConfig]
      ] = js.native
    
    /**
      * The name of the group's deployment config. The default is "CodeDeployDefault.OneAtATime".
      */
    val deploymentConfigName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the deployment group.
      */
    val deploymentGroupName: Input[String] = js.native
    
    /**
      * Configuration block of the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer (documented below).
      */
    val deploymentStyle: js.UndefOr[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupDeploymentStyle]] = js.native
    
    /**
      * Tag filters associated with the deployment group. See the AWS docs for details.
      */
    val ec2TagFilters: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagFilter]]
        ]
      ] = js.native
    
    /**
      * Configuration block(s) of Tag filters associated with the deployment group, which are also referred to as tag groups (documented below). See the AWS docs for details.
      */
    val ec2TagSets: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagSet]]]
      ] = js.native
    
    /**
      * Configuration block(s) of the ECS services for a deployment group (documented below).
      */
    val ecsService: js.UndefOr[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEcsService]] = js.native
    
    /**
      * Single configuration block of the load balancer to use in a blue/green deployment (documented below).
      */
    val loadBalancerInfo: js.UndefOr[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupLoadBalancerInfo]] = js.native
    
    /**
      * On premise tag filters associated with the group. See the AWS docs for details.
      */
    val onPremisesInstanceTagFilters: js.UndefOr[
        Input[
          js.Array[
            Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupOnPremisesInstanceTagFilter]
          ]
        ]
      ] = js.native
    
    /**
      * The service role ARN that allows deployments.
      */
    val serviceRoleArn: Input[String] = js.native
    
    /**
      * Configuration block(s) of the triggers for the deployment group (documented below).
      */
    val triggerConfigurations: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupTriggerConfiguration]]
        ]
      ] = js.native
  }
  object DeploymentGroupArgs {
    
    @scala.inline
    def apply(appName: Input[String], deploymentGroupName: Input[String], serviceRoleArn: Input[String]): DeploymentGroupArgs = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], deploymentGroupName = deploymentGroupName.asInstanceOf[js.Any], serviceRoleArn = serviceRoleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeploymentGroupArgs]
    }
    
    @scala.inline
    implicit class DeploymentGroupArgsMutableBuilder[Self <: DeploymentGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlarmConfiguration(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupAlarmConfiguration]): Self = StObject.set(x, "alarmConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlarmConfigurationUndefined: Self = StObject.set(x, "alarmConfiguration", js.undefined)
      
      @scala.inline
      def setAppName(value: Input[String]): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRollbackConfiguration(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupAutoRollbackConfiguration]): Self = StObject.set(x, "autoRollbackConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRollbackConfigurationUndefined: Self = StObject.set(x, "autoRollbackConfiguration", js.undefined)
      
      @scala.inline
      def setAutoscalingGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "autoscalingGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoscalingGroupsUndefined: Self = StObject.set(x, "autoscalingGroups", js.undefined)
      
      @scala.inline
      def setAutoscalingGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "autoscalingGroups", js.Array(value :_*))
      
      @scala.inline
      def setBlueGreenDeploymentConfig(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupBlueGreenDeploymentConfig]): Self = StObject.set(x, "blueGreenDeploymentConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlueGreenDeploymentConfigUndefined: Self = StObject.set(x, "blueGreenDeploymentConfig", js.undefined)
      
      @scala.inline
      def setDeploymentConfigName(value: Input[String]): Self = StObject.set(x, "deploymentConfigName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeploymentConfigNameUndefined: Self = StObject.set(x, "deploymentConfigName", js.undefined)
      
      @scala.inline
      def setDeploymentGroupName(value: Input[String]): Self = StObject.set(x, "deploymentGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeploymentStyle(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupDeploymentStyle]): Self = StObject.set(x, "deploymentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeploymentStyleUndefined: Self = StObject.set(x, "deploymentStyle", js.undefined)
      
      @scala.inline
      def setEc2TagFilters(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagFilter]]
            ]
      ): Self = StObject.set(x, "ec2TagFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEc2TagFiltersUndefined: Self = StObject.set(x, "ec2TagFilters", js.undefined)
      
      @scala.inline
      def setEc2TagFiltersVarargs(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagFilter]*): Self = StObject.set(x, "ec2TagFilters", js.Array(value :_*))
      
      @scala.inline
      def setEc2TagSets(value: Input[js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagSet]]]): Self = StObject.set(x, "ec2TagSets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEc2TagSetsUndefined: Self = StObject.set(x, "ec2TagSets", js.undefined)
      
      @scala.inline
      def setEc2TagSetsVarargs(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagSet]*): Self = StObject.set(x, "ec2TagSets", js.Array(value :_*))
      
      @scala.inline
      def setEcsService(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEcsService]): Self = StObject.set(x, "ecsService", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcsServiceUndefined: Self = StObject.set(x, "ecsService", js.undefined)
      
      @scala.inline
      def setLoadBalancerInfo(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupLoadBalancerInfo]): Self = StObject.set(x, "loadBalancerInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancerInfoUndefined: Self = StObject.set(x, "loadBalancerInfo", js.undefined)
      
      @scala.inline
      def setOnPremisesInstanceTagFilters(
        value: Input[
              js.Array[
                Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupOnPremisesInstanceTagFilter]
              ]
            ]
      ): Self = StObject.set(x, "onPremisesInstanceTagFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPremisesInstanceTagFiltersUndefined: Self = StObject.set(x, "onPremisesInstanceTagFilters", js.undefined)
      
      @scala.inline
      def setOnPremisesInstanceTagFiltersVarargs(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupOnPremisesInstanceTagFilter]*): Self = StObject.set(x, "onPremisesInstanceTagFilters", js.Array(value :_*))
      
      @scala.inline
      def setServiceRoleArn(value: Input[String]): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerConfigurations(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupTriggerConfiguration]]
            ]
      ): Self = StObject.set(x, "triggerConfigurations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerConfigurationsUndefined: Self = StObject.set(x, "triggerConfigurations", js.undefined)
      
      @scala.inline
      def setTriggerConfigurationsVarargs(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupTriggerConfiguration]*): Self = StObject.set(x, "triggerConfigurations", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DeploymentGroupState extends StObject {
    
    /**
      * Configuration block of alarms associated with the deployment group (documented below).
      */
    val alarmConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupAlarmConfiguration]] = js.native
    
    /**
      * The name of the application.
      */
    val appName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block of the automatic rollback configuration associated with the deployment group (documented below).
      */
    val autoRollbackConfiguration: js.UndefOr[
        Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupAutoRollbackConfiguration]
      ] = js.native
    
    /**
      * Autoscaling groups associated with the deployment group.
      */
    val autoscalingGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Configuration block of the blue/green deployment options for a deployment group (documented below).
      */
    val blueGreenDeploymentConfig: js.UndefOr[
        Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupBlueGreenDeploymentConfig]
      ] = js.native
    
    /**
      * The name of the group's deployment config. The default is "CodeDeployDefault.OneAtATime".
      */
    val deploymentConfigName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the deployment group.
      */
    val deploymentGroupName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block of the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer (documented below).
      */
    val deploymentStyle: js.UndefOr[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupDeploymentStyle]] = js.native
    
    /**
      * Tag filters associated with the deployment group. See the AWS docs for details.
      */
    val ec2TagFilters: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagFilter]]
        ]
      ] = js.native
    
    /**
      * Configuration block(s) of Tag filters associated with the deployment group, which are also referred to as tag groups (documented below). See the AWS docs for details.
      */
    val ec2TagSets: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagSet]]]
      ] = js.native
    
    /**
      * Configuration block(s) of the ECS services for a deployment group (documented below).
      */
    val ecsService: js.UndefOr[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEcsService]] = js.native
    
    /**
      * Single configuration block of the load balancer to use in a blue/green deployment (documented below).
      */
    val loadBalancerInfo: js.UndefOr[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupLoadBalancerInfo]] = js.native
    
    /**
      * On premise tag filters associated with the group. See the AWS docs for details.
      */
    val onPremisesInstanceTagFilters: js.UndefOr[
        Input[
          js.Array[
            Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupOnPremisesInstanceTagFilter]
          ]
        ]
      ] = js.native
    
    /**
      * The service role ARN that allows deployments.
      */
    val serviceRoleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block(s) of the triggers for the deployment group (documented below).
      */
    val triggerConfigurations: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupTriggerConfiguration]]
        ]
      ] = js.native
  }
  object DeploymentGroupState {
    
    @scala.inline
    def apply(): DeploymentGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentGroupState]
    }
    
    @scala.inline
    implicit class DeploymentGroupStateMutableBuilder[Self <: DeploymentGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlarmConfiguration(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupAlarmConfiguration]): Self = StObject.set(x, "alarmConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlarmConfigurationUndefined: Self = StObject.set(x, "alarmConfiguration", js.undefined)
      
      @scala.inline
      def setAppName(value: Input[String]): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      @scala.inline
      def setAutoRollbackConfiguration(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupAutoRollbackConfiguration]): Self = StObject.set(x, "autoRollbackConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRollbackConfigurationUndefined: Self = StObject.set(x, "autoRollbackConfiguration", js.undefined)
      
      @scala.inline
      def setAutoscalingGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "autoscalingGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoscalingGroupsUndefined: Self = StObject.set(x, "autoscalingGroups", js.undefined)
      
      @scala.inline
      def setAutoscalingGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "autoscalingGroups", js.Array(value :_*))
      
      @scala.inline
      def setBlueGreenDeploymentConfig(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupBlueGreenDeploymentConfig]): Self = StObject.set(x, "blueGreenDeploymentConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlueGreenDeploymentConfigUndefined: Self = StObject.set(x, "blueGreenDeploymentConfig", js.undefined)
      
      @scala.inline
      def setDeploymentConfigName(value: Input[String]): Self = StObject.set(x, "deploymentConfigName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeploymentConfigNameUndefined: Self = StObject.set(x, "deploymentConfigName", js.undefined)
      
      @scala.inline
      def setDeploymentGroupName(value: Input[String]): Self = StObject.set(x, "deploymentGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeploymentGroupNameUndefined: Self = StObject.set(x, "deploymentGroupName", js.undefined)
      
      @scala.inline
      def setDeploymentStyle(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupDeploymentStyle]): Self = StObject.set(x, "deploymentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeploymentStyleUndefined: Self = StObject.set(x, "deploymentStyle", js.undefined)
      
      @scala.inline
      def setEc2TagFilters(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagFilter]]
            ]
      ): Self = StObject.set(x, "ec2TagFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEc2TagFiltersUndefined: Self = StObject.set(x, "ec2TagFilters", js.undefined)
      
      @scala.inline
      def setEc2TagFiltersVarargs(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagFilter]*): Self = StObject.set(x, "ec2TagFilters", js.Array(value :_*))
      
      @scala.inline
      def setEc2TagSets(value: Input[js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagSet]]]): Self = StObject.set(x, "ec2TagSets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEc2TagSetsUndefined: Self = StObject.set(x, "ec2TagSets", js.undefined)
      
      @scala.inline
      def setEc2TagSetsVarargs(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagSet]*): Self = StObject.set(x, "ec2TagSets", js.Array(value :_*))
      
      @scala.inline
      def setEcsService(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEcsService]): Self = StObject.set(x, "ecsService", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcsServiceUndefined: Self = StObject.set(x, "ecsService", js.undefined)
      
      @scala.inline
      def setLoadBalancerInfo(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupLoadBalancerInfo]): Self = StObject.set(x, "loadBalancerInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancerInfoUndefined: Self = StObject.set(x, "loadBalancerInfo", js.undefined)
      
      @scala.inline
      def setOnPremisesInstanceTagFilters(
        value: Input[
              js.Array[
                Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupOnPremisesInstanceTagFilter]
              ]
            ]
      ): Self = StObject.set(x, "onPremisesInstanceTagFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPremisesInstanceTagFiltersUndefined: Self = StObject.set(x, "onPremisesInstanceTagFilters", js.undefined)
      
      @scala.inline
      def setOnPremisesInstanceTagFiltersVarargs(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupOnPremisesInstanceTagFilter]*): Self = StObject.set(x, "onPremisesInstanceTagFilters", js.Array(value :_*))
      
      @scala.inline
      def setServiceRoleArn(value: Input[String]): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceRoleArnUndefined: Self = StObject.set(x, "serviceRoleArn", js.undefined)
      
      @scala.inline
      def setTriggerConfigurations(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupTriggerConfiguration]]
            ]
      ): Self = StObject.set(x, "triggerConfigurations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerConfigurationsUndefined: Self = StObject.set(x, "triggerConfigurations", js.undefined)
      
      @scala.inline
      def setTriggerConfigurationsVarargs(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupTriggerConfiguration]*): Self = StObject.set(x, "triggerConfigurations", js.Array(value :_*))
    }
  }
}
