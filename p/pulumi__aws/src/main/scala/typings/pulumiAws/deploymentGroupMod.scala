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
    
    @JSImport("@pulumi/aws/codedeploy/deploymentGroup", "DeploymentGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DeploymentGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): DeploymentGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[DeploymentGroup]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): DeploymentGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DeploymentGroup]
    inline def get(name: String, id: Input[ID], state: DeploymentGroupState): DeploymentGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[DeploymentGroup]
    inline def get(name: String, id: Input[ID], state: DeploymentGroupState, opts: CustomResourceOptions): DeploymentGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DeploymentGroup]
    
    /**
      * Returns true if the given object is an instance of DeploymentGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codedeploy/deploymentGroup.DeploymentGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/codedeploy/deploymentGroup.DeploymentGroup */ Boolean]
  }
  
  trait DeploymentGroupArgs extends StObject {
    
    /**
      * Configuration block of alarms associated with the deployment group (documented below).
      */
    val alarmConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupAlarmConfiguration]] = js.undefined
    
    /**
      * The name of the application.
      */
    val appName: Input[String]
    
    /**
      * Configuration block of the automatic rollback configuration associated with the deployment group (documented below).
      */
    val autoRollbackConfiguration: js.UndefOr[
        Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupAutoRollbackConfiguration]
      ] = js.undefined
    
    /**
      * Autoscaling groups associated with the deployment group.
      */
    val autoscalingGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Configuration block of the blue/green deployment options for a deployment group (documented below).
      */
    val blueGreenDeploymentConfig: js.UndefOr[
        Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupBlueGreenDeploymentConfig]
      ] = js.undefined
    
    /**
      * The name of the group's deployment config. The default is "CodeDeployDefault.OneAtATime".
      */
    val deploymentConfigName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the deployment group.
      */
    val deploymentGroupName: Input[String]
    
    /**
      * Configuration block of the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer (documented below).
      */
    val deploymentStyle: js.UndefOr[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupDeploymentStyle]] = js.undefined
    
    /**
      * Tag filters associated with the deployment group. See the AWS docs for details.
      */
    val ec2TagFilters: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagFilter]]
        ]
      ] = js.undefined
    
    /**
      * Configuration block(s) of Tag filters associated with the deployment group, which are also referred to as tag groups (documented below). See the AWS docs for details.
      */
    val ec2TagSets: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagSet]]]
      ] = js.undefined
    
    /**
      * Configuration block(s) of the ECS services for a deployment group (documented below).
      */
    val ecsService: js.UndefOr[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEcsService]] = js.undefined
    
    /**
      * Single configuration block of the load balancer to use in a blue/green deployment (documented below).
      */
    val loadBalancerInfo: js.UndefOr[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupLoadBalancerInfo]] = js.undefined
    
    /**
      * On premise tag filters associated with the group. See the AWS docs for details.
      */
    val onPremisesInstanceTagFilters: js.UndefOr[
        Input[
          js.Array[
            Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupOnPremisesInstanceTagFilter]
          ]
        ]
      ] = js.undefined
    
    /**
      * The service role ARN that allows deployments.
      */
    val serviceRoleArn: Input[String]
    
    /**
      * Configuration block(s) of the triggers for the deployment group (documented below).
      */
    val triggerConfigurations: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupTriggerConfiguration]]
        ]
      ] = js.undefined
  }
  object DeploymentGroupArgs {
    
    inline def apply(appName: Input[String], deploymentGroupName: Input[String], serviceRoleArn: Input[String]): DeploymentGroupArgs = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], deploymentGroupName = deploymentGroupName.asInstanceOf[js.Any], serviceRoleArn = serviceRoleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeploymentGroupArgs]
    }
    
    extension [Self <: DeploymentGroupArgs](x: Self) {
      
      inline def setAlarmConfiguration(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupAlarmConfiguration]): Self = StObject.set(x, "alarmConfiguration", value.asInstanceOf[js.Any])
      
      inline def setAlarmConfigurationUndefined: Self = StObject.set(x, "alarmConfiguration", js.undefined)
      
      inline def setAppName(value: Input[String]): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAutoRollbackConfiguration(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupAutoRollbackConfiguration]): Self = StObject.set(x, "autoRollbackConfiguration", value.asInstanceOf[js.Any])
      
      inline def setAutoRollbackConfigurationUndefined: Self = StObject.set(x, "autoRollbackConfiguration", js.undefined)
      
      inline def setAutoscalingGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "autoscalingGroups", value.asInstanceOf[js.Any])
      
      inline def setAutoscalingGroupsUndefined: Self = StObject.set(x, "autoscalingGroups", js.undefined)
      
      inline def setAutoscalingGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "autoscalingGroups", js.Array(value :_*))
      
      inline def setBlueGreenDeploymentConfig(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupBlueGreenDeploymentConfig]): Self = StObject.set(x, "blueGreenDeploymentConfig", value.asInstanceOf[js.Any])
      
      inline def setBlueGreenDeploymentConfigUndefined: Self = StObject.set(x, "blueGreenDeploymentConfig", js.undefined)
      
      inline def setDeploymentConfigName(value: Input[String]): Self = StObject.set(x, "deploymentConfigName", value.asInstanceOf[js.Any])
      
      inline def setDeploymentConfigNameUndefined: Self = StObject.set(x, "deploymentConfigName", js.undefined)
      
      inline def setDeploymentGroupName(value: Input[String]): Self = StObject.set(x, "deploymentGroupName", value.asInstanceOf[js.Any])
      
      inline def setDeploymentStyle(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupDeploymentStyle]): Self = StObject.set(x, "deploymentStyle", value.asInstanceOf[js.Any])
      
      inline def setDeploymentStyleUndefined: Self = StObject.set(x, "deploymentStyle", js.undefined)
      
      inline def setEc2TagFilters(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagFilter]]
            ]
      ): Self = StObject.set(x, "ec2TagFilters", value.asInstanceOf[js.Any])
      
      inline def setEc2TagFiltersUndefined: Self = StObject.set(x, "ec2TagFilters", js.undefined)
      
      inline def setEc2TagFiltersVarargs(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagFilter]*): Self = StObject.set(x, "ec2TagFilters", js.Array(value :_*))
      
      inline def setEc2TagSets(value: Input[js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagSet]]]): Self = StObject.set(x, "ec2TagSets", value.asInstanceOf[js.Any])
      
      inline def setEc2TagSetsUndefined: Self = StObject.set(x, "ec2TagSets", js.undefined)
      
      inline def setEc2TagSetsVarargs(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagSet]*): Self = StObject.set(x, "ec2TagSets", js.Array(value :_*))
      
      inline def setEcsService(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEcsService]): Self = StObject.set(x, "ecsService", value.asInstanceOf[js.Any])
      
      inline def setEcsServiceUndefined: Self = StObject.set(x, "ecsService", js.undefined)
      
      inline def setLoadBalancerInfo(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupLoadBalancerInfo]): Self = StObject.set(x, "loadBalancerInfo", value.asInstanceOf[js.Any])
      
      inline def setLoadBalancerInfoUndefined: Self = StObject.set(x, "loadBalancerInfo", js.undefined)
      
      inline def setOnPremisesInstanceTagFilters(
        value: Input[
              js.Array[
                Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupOnPremisesInstanceTagFilter]
              ]
            ]
      ): Self = StObject.set(x, "onPremisesInstanceTagFilters", value.asInstanceOf[js.Any])
      
      inline def setOnPremisesInstanceTagFiltersUndefined: Self = StObject.set(x, "onPremisesInstanceTagFilters", js.undefined)
      
      inline def setOnPremisesInstanceTagFiltersVarargs(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupOnPremisesInstanceTagFilter]*): Self = StObject.set(x, "onPremisesInstanceTagFilters", js.Array(value :_*))
      
      inline def setServiceRoleArn(value: Input[String]): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
      
      inline def setTriggerConfigurations(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupTriggerConfiguration]]
            ]
      ): Self = StObject.set(x, "triggerConfigurations", value.asInstanceOf[js.Any])
      
      inline def setTriggerConfigurationsUndefined: Self = StObject.set(x, "triggerConfigurations", js.undefined)
      
      inline def setTriggerConfigurationsVarargs(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupTriggerConfiguration]*): Self = StObject.set(x, "triggerConfigurations", js.Array(value :_*))
    }
  }
  
  trait DeploymentGroupState extends StObject {
    
    /**
      * Configuration block of alarms associated with the deployment group (documented below).
      */
    val alarmConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupAlarmConfiguration]] = js.undefined
    
    /**
      * The name of the application.
      */
    val appName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block of the automatic rollback configuration associated with the deployment group (documented below).
      */
    val autoRollbackConfiguration: js.UndefOr[
        Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupAutoRollbackConfiguration]
      ] = js.undefined
    
    /**
      * Autoscaling groups associated with the deployment group.
      */
    val autoscalingGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Configuration block of the blue/green deployment options for a deployment group (documented below).
      */
    val blueGreenDeploymentConfig: js.UndefOr[
        Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupBlueGreenDeploymentConfig]
      ] = js.undefined
    
    /**
      * The name of the group's deployment config. The default is "CodeDeployDefault.OneAtATime".
      */
    val deploymentConfigName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the deployment group.
      */
    val deploymentGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block of the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer (documented below).
      */
    val deploymentStyle: js.UndefOr[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupDeploymentStyle]] = js.undefined
    
    /**
      * Tag filters associated with the deployment group. See the AWS docs for details.
      */
    val ec2TagFilters: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagFilter]]
        ]
      ] = js.undefined
    
    /**
      * Configuration block(s) of Tag filters associated with the deployment group, which are also referred to as tag groups (documented below). See the AWS docs for details.
      */
    val ec2TagSets: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagSet]]]
      ] = js.undefined
    
    /**
      * Configuration block(s) of the ECS services for a deployment group (documented below).
      */
    val ecsService: js.UndefOr[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEcsService]] = js.undefined
    
    /**
      * Single configuration block of the load balancer to use in a blue/green deployment (documented below).
      */
    val loadBalancerInfo: js.UndefOr[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupLoadBalancerInfo]] = js.undefined
    
    /**
      * On premise tag filters associated with the group. See the AWS docs for details.
      */
    val onPremisesInstanceTagFilters: js.UndefOr[
        Input[
          js.Array[
            Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupOnPremisesInstanceTagFilter]
          ]
        ]
      ] = js.undefined
    
    /**
      * The service role ARN that allows deployments.
      */
    val serviceRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block(s) of the triggers for the deployment group (documented below).
      */
    val triggerConfigurations: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupTriggerConfiguration]]
        ]
      ] = js.undefined
  }
  object DeploymentGroupState {
    
    inline def apply(): DeploymentGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentGroupState]
    }
    
    extension [Self <: DeploymentGroupState](x: Self) {
      
      inline def setAlarmConfiguration(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupAlarmConfiguration]): Self = StObject.set(x, "alarmConfiguration", value.asInstanceOf[js.Any])
      
      inline def setAlarmConfigurationUndefined: Self = StObject.set(x, "alarmConfiguration", js.undefined)
      
      inline def setAppName(value: Input[String]): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      inline def setAutoRollbackConfiguration(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupAutoRollbackConfiguration]): Self = StObject.set(x, "autoRollbackConfiguration", value.asInstanceOf[js.Any])
      
      inline def setAutoRollbackConfigurationUndefined: Self = StObject.set(x, "autoRollbackConfiguration", js.undefined)
      
      inline def setAutoscalingGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "autoscalingGroups", value.asInstanceOf[js.Any])
      
      inline def setAutoscalingGroupsUndefined: Self = StObject.set(x, "autoscalingGroups", js.undefined)
      
      inline def setAutoscalingGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "autoscalingGroups", js.Array(value :_*))
      
      inline def setBlueGreenDeploymentConfig(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupBlueGreenDeploymentConfig]): Self = StObject.set(x, "blueGreenDeploymentConfig", value.asInstanceOf[js.Any])
      
      inline def setBlueGreenDeploymentConfigUndefined: Self = StObject.set(x, "blueGreenDeploymentConfig", js.undefined)
      
      inline def setDeploymentConfigName(value: Input[String]): Self = StObject.set(x, "deploymentConfigName", value.asInstanceOf[js.Any])
      
      inline def setDeploymentConfigNameUndefined: Self = StObject.set(x, "deploymentConfigName", js.undefined)
      
      inline def setDeploymentGroupName(value: Input[String]): Self = StObject.set(x, "deploymentGroupName", value.asInstanceOf[js.Any])
      
      inline def setDeploymentGroupNameUndefined: Self = StObject.set(x, "deploymentGroupName", js.undefined)
      
      inline def setDeploymentStyle(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupDeploymentStyle]): Self = StObject.set(x, "deploymentStyle", value.asInstanceOf[js.Any])
      
      inline def setDeploymentStyleUndefined: Self = StObject.set(x, "deploymentStyle", js.undefined)
      
      inline def setEc2TagFilters(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagFilter]]
            ]
      ): Self = StObject.set(x, "ec2TagFilters", value.asInstanceOf[js.Any])
      
      inline def setEc2TagFiltersUndefined: Self = StObject.set(x, "ec2TagFilters", js.undefined)
      
      inline def setEc2TagFiltersVarargs(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagFilter]*): Self = StObject.set(x, "ec2TagFilters", js.Array(value :_*))
      
      inline def setEc2TagSets(value: Input[js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagSet]]]): Self = StObject.set(x, "ec2TagSets", value.asInstanceOf[js.Any])
      
      inline def setEc2TagSetsUndefined: Self = StObject.set(x, "ec2TagSets", js.undefined)
      
      inline def setEc2TagSetsVarargs(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEc2TagSet]*): Self = StObject.set(x, "ec2TagSets", js.Array(value :_*))
      
      inline def setEcsService(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupEcsService]): Self = StObject.set(x, "ecsService", value.asInstanceOf[js.Any])
      
      inline def setEcsServiceUndefined: Self = StObject.set(x, "ecsService", js.undefined)
      
      inline def setLoadBalancerInfo(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupLoadBalancerInfo]): Self = StObject.set(x, "loadBalancerInfo", value.asInstanceOf[js.Any])
      
      inline def setLoadBalancerInfoUndefined: Self = StObject.set(x, "loadBalancerInfo", js.undefined)
      
      inline def setOnPremisesInstanceTagFilters(
        value: Input[
              js.Array[
                Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupOnPremisesInstanceTagFilter]
              ]
            ]
      ): Self = StObject.set(x, "onPremisesInstanceTagFilters", value.asInstanceOf[js.Any])
      
      inline def setOnPremisesInstanceTagFiltersUndefined: Self = StObject.set(x, "onPremisesInstanceTagFilters", js.undefined)
      
      inline def setOnPremisesInstanceTagFiltersVarargs(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupOnPremisesInstanceTagFilter]*): Self = StObject.set(x, "onPremisesInstanceTagFilters", js.Array(value :_*))
      
      inline def setServiceRoleArn(value: Input[String]): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
      
      inline def setServiceRoleArnUndefined: Self = StObject.set(x, "serviceRoleArn", js.undefined)
      
      inline def setTriggerConfigurations(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupTriggerConfiguration]]
            ]
      ): Self = StObject.set(x, "triggerConfigurations", value.asInstanceOf[js.Any])
      
      inline def setTriggerConfigurationsUndefined: Self = StObject.set(x, "triggerConfigurations", js.undefined)
      
      inline def setTriggerConfigurationsVarargs(value: Input[typings.pulumiAws.inputMod.codedeploy.DeploymentGroupTriggerConfiguration]*): Self = StObject.set(x, "triggerConfigurations", js.Array(value :_*))
    }
  }
}
