package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.elasticbeanstalkMod.Application
import typings.pulumiAws.elasticbeanstalkMod.ApplicationVersion
import typings.pulumiAws.outputMod.elasticbeanstalk.EnvironmentAllSetting
import typings.pulumiAws.outputMod.elasticbeanstalk.EnvironmentSetting
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environmentMod {
  
  @JSImport("@pulumi/aws/elasticbeanstalk/environment", "Environment")
  @js.native
  class Environment protected () extends CustomResource {
    /**
      * Create a Environment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EnvironmentArgs) = this()
    def this(name: String, args: EnvironmentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * List of all option settings configured in this Environment. These
      * are a combination of default settings and their overrides from `setting` in
      * the configuration.
      */
    val allSettings: Output_[js.Array[EnvironmentAllSetting]] = js.native
    
    /**
      * Name of the application that contains the version
      * to be deployed
      */
    val application: Output_[String] = js.native
    
    val arn: Output_[String] = js.native
    
    /**
      * The autoscaling groups used by this Environment.
      */
    val autoscalingGroups: Output_[js.Array[String]] = js.native
    
    /**
      * Fully qualified DNS name for this Environment.
      */
    val cname: Output_[String] = js.native
    
    /**
      * Prefix to use for the fully qualified DNS name of
      * the Environment.
      */
    val cnamePrefix: Output_[String] = js.native
    
    /**
      * Short description of the Environment
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The URL to the Load Balancer for this Environment
      */
    val endpointUrl: Output_[String] = js.native
    
    /**
      * Instances used by this Environment.
      */
    val instances: Output_[js.Array[String]] = js.native
    
    /**
      * Launch configurations in use by this Environment.
      */
    val launchConfigurations: Output_[js.Array[String]] = js.native
    
    /**
      * Elastic load balancers in use by this Environment.
      */
    val loadBalancers: Output_[js.Array[String]] = js.native
    
    /**
      * A unique name for this Environment. This name is used
      * in the application URL
      */
    val name: Output_[String] = js.native
    
    /**
      * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the Elastic Beanstalk [Platform](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-platformarn)
      * to use in deployment
      */
    val platformArn: Output_[String] = js.native
    
    /**
      * The time between polling the AWS API to
      * check if changes have been applied. Use this to adjust the rate of API calls
      * for any `create` or `update` action. Minimum `10s`, maximum `180s`. Omit this to
      * use the default behavior, which is an exponential backoff
      */
    val pollInterval: Output_[js.UndefOr[String]] = js.native
    
    /**
      * SQS queues in use by this Environment.
      */
    val queues: Output_[js.Array[String]] = js.native
    
    /**
      * Option settings to configure the new Environment. These
      * override specific values that are set as defaults. The format is detailed
      * below in Option Settings
      */
    val settings: Output_[js.UndefOr[js.Array[EnvironmentSetting]]] = js.native
    
    /**
      * A solution stack to base your environment
      * off of. Example stacks can be found in the [Amazon API documentation](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html)
      */
    val solutionStackName: Output_[String] = js.native
    
    /**
      * A set of tags to apply to the Environment.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The name of the Elastic Beanstalk Configuration
      * template to use in deployment
      */
    val templateName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Elastic Beanstalk Environment tier. Valid values are `Worker`
      * or `WebServer`. If tier is left blank `WebServer` will be used.
      */
    val tier: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Autoscaling triggers in use by this Environment.
      */
    val triggers: Output_[js.Array[String]] = js.native
    
    /**
      * The name of the Elastic Beanstalk Application Version
      * to use in deployment.
      */
    val version: Output_[ApplicationVersion] = js.native
    
    /**
      * The maximum
      * [duration](https://golang.org/pkg/time/#ParseDuration) that this provider should
      * wait for an Elastic Beanstalk Environment to be in a ready state before timing
      * out.
      */
    val waitForReadyTimeout: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object Environment {
    
    @JSImport("@pulumi/aws/elasticbeanstalk/environment", "Environment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Environment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Environment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Environment]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Environment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Environment]
    @scala.inline
    def get(name: String, id: Input[ID], state: EnvironmentState): Environment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Environment]
    @scala.inline
    def get(name: String, id: Input[ID], state: EnvironmentState, opts: CustomResourceOptions): Environment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Environment]
    
    /**
      * Returns true if the given object is an instance of Environment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/environment.Environment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/environment.Environment */ Boolean]
  }
  
  trait EnvironmentArgs extends StObject {
    
    /**
      * Name of the application that contains the version
      * to be deployed
      */
    val application: Input[String | Application]
    
    /**
      * Prefix to use for the fully qualified DNS name of
      * the Environment.
      */
    val cnamePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Short description of the Environment
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A unique name for this Environment. This name is used
      * in the application URL
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the Elastic Beanstalk [Platform](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-platformarn)
      * to use in deployment
      */
    val platformArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The time between polling the AWS API to
      * check if changes have been applied. Use this to adjust the rate of API calls
      * for any `create` or `update` action. Minimum `10s`, maximum `180s`. Omit this to
      * use the default behavior, which is an exponential backoff
      */
    val pollInterval: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Option settings to configure the new Environment. These
      * override specific values that are set as defaults. The format is detailed
      * below in Option Settings
      */
    val settings: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.elasticbeanstalk.EnvironmentSetting]]]
      ] = js.undefined
    
    /**
      * A solution stack to base your environment
      * off of. Example stacks can be found in the [Amazon API documentation](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html)
      */
    val solutionStackName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A set of tags to apply to the Environment.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The name of the Elastic Beanstalk Configuration
      * template to use in deployment
      */
    val templateName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Elastic Beanstalk Environment tier. Valid values are `Worker`
      * or `WebServer`. If tier is left blank `WebServer` will be used.
      */
    val tier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the Elastic Beanstalk Application Version
      * to use in deployment.
      */
    val version: js.UndefOr[Input[ApplicationVersion]] = js.undefined
    
    /**
      * The maximum
      * [duration](https://golang.org/pkg/time/#ParseDuration) that this provider should
      * wait for an Elastic Beanstalk Environment to be in a ready state before timing
      * out.
      */
    val waitForReadyTimeout: js.UndefOr[Input[String]] = js.undefined
  }
  object EnvironmentArgs {
    
    @scala.inline
    def apply(application: Input[String | Application]): EnvironmentArgs = {
      val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentArgs]
    }
    
    @scala.inline
    implicit class EnvironmentArgsMutableBuilder[Self <: EnvironmentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplication(value: Input[String | Application]): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCnamePrefix(value: Input[String]): Self = StObject.set(x, "cnamePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCnamePrefixUndefined: Self = StObject.set(x, "cnamePrefix", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlatformArn(value: Input[String]): Self = StObject.set(x, "platformArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformArnUndefined: Self = StObject.set(x, "platformArn", js.undefined)
      
      @scala.inline
      def setPollInterval(value: Input[String]): Self = StObject.set(x, "pollInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPollIntervalUndefined: Self = StObject.set(x, "pollInterval", js.undefined)
      
      @scala.inline
      def setSettings(value: Input[js.Array[Input[typings.pulumiAws.inputMod.elasticbeanstalk.EnvironmentSetting]]]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      @scala.inline
      def setSettingsVarargs(value: Input[typings.pulumiAws.inputMod.elasticbeanstalk.EnvironmentSetting]*): Self = StObject.set(x, "settings", js.Array(value :_*))
      
      @scala.inline
      def setSolutionStackName(value: Input[String]): Self = StObject.set(x, "solutionStackName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolutionStackNameUndefined: Self = StObject.set(x, "solutionStackName", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTemplateName(value: Input[String]): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateNameUndefined: Self = StObject.set(x, "templateName", js.undefined)
      
      @scala.inline
      def setTier(value: Input[String]): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[ApplicationVersion]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setWaitForReadyTimeout(value: Input[String]): Self = StObject.set(x, "waitForReadyTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForReadyTimeoutUndefined: Self = StObject.set(x, "waitForReadyTimeout", js.undefined)
    }
  }
  
  trait EnvironmentState extends StObject {
    
    /**
      * List of all option settings configured in this Environment. These
      * are a combination of default settings and their overrides from `setting` in
      * the configuration.
      */
    val allSettings: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.elasticbeanstalk.EnvironmentAllSetting]]
        ]
      ] = js.undefined
    
    /**
      * Name of the application that contains the version
      * to be deployed
      */
    val application: js.UndefOr[Input[String | Application]] = js.undefined
    
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The autoscaling groups used by this Environment.
      */
    val autoscalingGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Fully qualified DNS name for this Environment.
      */
    val cname: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Prefix to use for the fully qualified DNS name of
      * the Environment.
      */
    val cnamePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Short description of the Environment
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The URL to the Load Balancer for this Environment
      */
    val endpointUrl: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Instances used by this Environment.
      */
    val instances: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Launch configurations in use by this Environment.
      */
    val launchConfigurations: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Elastic load balancers in use by this Environment.
      */
    val loadBalancers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A unique name for this Environment. This name is used
      * in the application URL
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the Elastic Beanstalk [Platform](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-platformarn)
      * to use in deployment
      */
    val platformArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The time between polling the AWS API to
      * check if changes have been applied. Use this to adjust the rate of API calls
      * for any `create` or `update` action. Minimum `10s`, maximum `180s`. Omit this to
      * use the default behavior, which is an exponential backoff
      */
    val pollInterval: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * SQS queues in use by this Environment.
      */
    val queues: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Option settings to configure the new Environment. These
      * override specific values that are set as defaults. The format is detailed
      * below in Option Settings
      */
    val settings: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.elasticbeanstalk.EnvironmentSetting]]]
      ] = js.undefined
    
    /**
      * A solution stack to base your environment
      * off of. Example stacks can be found in the [Amazon API documentation](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html)
      */
    val solutionStackName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A set of tags to apply to the Environment.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The name of the Elastic Beanstalk Configuration
      * template to use in deployment
      */
    val templateName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Elastic Beanstalk Environment tier. Valid values are `Worker`
      * or `WebServer`. If tier is left blank `WebServer` will be used.
      */
    val tier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Autoscaling triggers in use by this Environment.
      */
    val triggers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The name of the Elastic Beanstalk Application Version
      * to use in deployment.
      */
    val version: js.UndefOr[Input[ApplicationVersion]] = js.undefined
    
    /**
      * The maximum
      * [duration](https://golang.org/pkg/time/#ParseDuration) that this provider should
      * wait for an Elastic Beanstalk Environment to be in a ready state before timing
      * out.
      */
    val waitForReadyTimeout: js.UndefOr[Input[String]] = js.undefined
  }
  object EnvironmentState {
    
    @scala.inline
    def apply(): EnvironmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnvironmentState]
    }
    
    @scala.inline
    implicit class EnvironmentStateMutableBuilder[Self <: EnvironmentState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllSettings(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.elasticbeanstalk.EnvironmentAllSetting]]
            ]
      ): Self = StObject.set(x, "allSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllSettingsUndefined: Self = StObject.set(x, "allSettings", js.undefined)
      
      @scala.inline
      def setAllSettingsVarargs(value: Input[typings.pulumiAws.inputMod.elasticbeanstalk.EnvironmentAllSetting]*): Self = StObject.set(x, "allSettings", js.Array(value :_*))
      
      @scala.inline
      def setApplication(value: Input[String | Application]): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAutoscalingGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "autoscalingGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoscalingGroupsUndefined: Self = StObject.set(x, "autoscalingGroups", js.undefined)
      
      @scala.inline
      def setAutoscalingGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "autoscalingGroups", js.Array(value :_*))
      
      @scala.inline
      def setCname(value: Input[String]): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCnamePrefix(value: Input[String]): Self = StObject.set(x, "cnamePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCnamePrefixUndefined: Self = StObject.set(x, "cnamePrefix", js.undefined)
      
      @scala.inline
      def setCnameUndefined: Self = StObject.set(x, "cname", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEndpointUrl(value: Input[String]): Self = StObject.set(x, "endpointUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUrlUndefined: Self = StObject.set(x, "endpointUrl", js.undefined)
      
      @scala.inline
      def setInstances(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
      
      @scala.inline
      def setInstancesVarargs(value: Input[String]*): Self = StObject.set(x, "instances", js.Array(value :_*))
      
      @scala.inline
      def setLaunchConfigurations(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "launchConfigurations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchConfigurationsUndefined: Self = StObject.set(x, "launchConfigurations", js.undefined)
      
      @scala.inline
      def setLaunchConfigurationsVarargs(value: Input[String]*): Self = StObject.set(x, "launchConfigurations", js.Array(value :_*))
      
      @scala.inline
      def setLoadBalancers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "loadBalancers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancersUndefined: Self = StObject.set(x, "loadBalancers", js.undefined)
      
      @scala.inline
      def setLoadBalancersVarargs(value: Input[String]*): Self = StObject.set(x, "loadBalancers", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlatformArn(value: Input[String]): Self = StObject.set(x, "platformArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformArnUndefined: Self = StObject.set(x, "platformArn", js.undefined)
      
      @scala.inline
      def setPollInterval(value: Input[String]): Self = StObject.set(x, "pollInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPollIntervalUndefined: Self = StObject.set(x, "pollInterval", js.undefined)
      
      @scala.inline
      def setQueues(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueuesUndefined: Self = StObject.set(x, "queues", js.undefined)
      
      @scala.inline
      def setQueuesVarargs(value: Input[String]*): Self = StObject.set(x, "queues", js.Array(value :_*))
      
      @scala.inline
      def setSettings(value: Input[js.Array[Input[typings.pulumiAws.inputMod.elasticbeanstalk.EnvironmentSetting]]]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      @scala.inline
      def setSettingsVarargs(value: Input[typings.pulumiAws.inputMod.elasticbeanstalk.EnvironmentSetting]*): Self = StObject.set(x, "settings", js.Array(value :_*))
      
      @scala.inline
      def setSolutionStackName(value: Input[String]): Self = StObject.set(x, "solutionStackName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolutionStackNameUndefined: Self = StObject.set(x, "solutionStackName", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTemplateName(value: Input[String]): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateNameUndefined: Self = StObject.set(x, "templateName", js.undefined)
      
      @scala.inline
      def setTier(value: Input[String]): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
      
      @scala.inline
      def setTriggers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
      
      @scala.inline
      def setTriggersVarargs(value: Input[String]*): Self = StObject.set(x, "triggers", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: Input[ApplicationVersion]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setWaitForReadyTimeout(value: Input[String]): Self = StObject.set(x, "waitForReadyTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForReadyTimeoutUndefined: Self = StObject.set(x, "waitForReadyTimeout", js.undefined)
    }
  }
}
