package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.emr.ClusterBootstrapAction
import typings.pulumiAws.outputMod.emr.ClusterCoreInstanceFleet
import typings.pulumiAws.outputMod.emr.ClusterCoreInstanceGroup
import typings.pulumiAws.outputMod.emr.ClusterEc2Attributes
import typings.pulumiAws.outputMod.emr.ClusterKerberosAttributes
import typings.pulumiAws.outputMod.emr.ClusterMasterInstanceFleet
import typings.pulumiAws.outputMod.emr.ClusterMasterInstanceGroup
import typings.pulumiAws.outputMod.emr.ClusterStep
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emrClusterMod {
  
  @JSImport("@pulumi/aws/emr/cluster", "Cluster")
  @js.native
  class Cluster protected () extends CustomResource {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A JSON string for selecting additional features such as adding proxy information. Note: Currently there is no API to retrieve the value of this argument after EMR cluster creation from provider, therefore this provider cannot detect drift from the actual EMR cluster if its value is changed outside this provider.
      */
    val additionalInfo: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A list of applications for the cluster. Valid values are: `Flink`, `Hadoop`, `Hive`, `Mahout`, `Pig`, `Spark`, and `JupyterHub` (as of EMR 5.14.0). Case insensitive
      */
    val applications: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    val arn: Output_[String] = js.native
    
    /**
      * An IAM role for automatic scaling policies. The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an instance group.
      */
    val autoscalingRole: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Ordered list of bootstrap actions that will be run before Hadoop is started on the cluster nodes. Defined below.
      */
    val bootstrapActions: Output_[js.UndefOr[js.Array[ClusterBootstrapAction]]] = js.native
    
    val clusterState: Output_[String] = js.native
    
    /**
      * A configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
      */
    val configurations: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A JSON string for supplying list of configurations for the EMR cluster.
      */
    val configurationsJson: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Configuration block to use an [Instance Fleet](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-fleet.html) for the core node type. Cannot be specified if any `coreInstanceGroup` configuration blocks are set. Detailed below.
      */
    val coreInstanceFleet: Output_[ClusterCoreInstanceFleet] = js.native
    
    /**
      * Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [core node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-core).
      */
    val coreInstanceGroup: Output_[ClusterCoreInstanceGroup] = js.native
    
    /**
      * A custom Amazon Linux AMI for the cluster (instead of an EMR-owned AMI). Available in Amazon EMR version 5.7.0 and later.
      */
    val customAmiId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Size in GiB of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in Amazon EMR version 4.x and later.
      */
    val ebsRootVolumeSize: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * Attributes for the EC2 instances running the job flow. Defined below
      */
    val ec2Attributes: Output_[js.UndefOr[ClusterEc2Attributes]] = js.native
    
    /**
      * Switch on/off run cluster with no steps or when all steps are complete (default is on)
      */
    val keepJobFlowAliveWhenNoSteps: Output_[Boolean] = js.native
    
    /**
      * Kerberos configuration for the cluster. Defined below
      */
    val kerberosAttributes: Output_[js.UndefOr[ClusterKerberosAttributes]] = js.native
    
    /**
      * S3 bucket to write the log files of the job flow. If a value is not provided, logs are not created
      */
    val logUri: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Configuration block to use an [Instance Fleet](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-fleet.html) for the master node type. Cannot be specified if any `masterInstanceGroup` configuration blocks are set. Detailed below.
      */
    val masterInstanceFleet: Output_[ClusterMasterInstanceFleet] = js.native
    
    /**
      * Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [master node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-master).
      */
    val masterInstanceGroup: Output_[ClusterMasterInstanceGroup] = js.native
    
    /**
      * The public DNS name of the master EC2 instance.
      * * `core_instance_group.0.id` - Core node type Instance Group ID, if using Instance Group for this node type.
      */
    val masterPublicDns: Output_[String] = js.native
    
    /**
      * Friendly name given to the instance fleet.
      */
    val name: Output_[String] = js.native
    
    /**
      * The release label for the Amazon EMR release
      */
    val releaseLabel: Output_[String] = js.native
    
    /**
      * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an `instance group` is resized.
      */
    val scaleDownBehavior: Output_[String] = js.native
    
    /**
      * The security configuration name to attach to the EMR cluster. Only valid for EMR clusters with `releaseLabel` 4.8.0 or greater
      */
    val securityConfiguration: Output_[js.UndefOr[String]] = js.native
    
    /**
      * IAM role that will be assumed by the Amazon EMR service to access AWS resources
      */
    val serviceRole: Output_[String] = js.native
    
    /**
      * The number of steps that can be executed concurrently. You can specify a maximum of 256 steps. Only valid for EMR clusters with `releaseLabel` 5.28.0 or greater. (default is 1)
      */
    val stepConcurrencyLevel: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * List of steps to run when creating the cluster. Defined below. It is highly recommended to utilize [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) if other steps are being managed outside of this provider.
      */
    val steps: Output_[js.Array[ClusterStep]] = js.native
    
    /**
      * list of tags to apply to the EMR Cluster
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Switch on/off termination protection (default is `false`, except when using multiple master nodes). Before attempting to destroy the resource when termination protection is enabled, this configuration must be applied with its value set to `false`.
      */
    val terminationProtection: Output_[Boolean] = js.native
    
    /**
      * Whether the job flow is visible to all IAM users of the AWS account associated with the job flow. Default `true`
      */
    val visibleToAllUsers: Output_[js.UndefOr[Boolean]] = js.native
  }
  /* static members */
  object Cluster {
    
    @JSImport("@pulumi/aws/emr/cluster", "Cluster")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterState): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/cluster.Cluster */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/emr/cluster.Cluster */ Boolean]
  }
  
  trait ClusterArgs extends StObject {
    
    /**
      * A JSON string for selecting additional features such as adding proxy information. Note: Currently there is no API to retrieve the value of this argument after EMR cluster creation from provider, therefore this provider cannot detect drift from the actual EMR cluster if its value is changed outside this provider.
      */
    val additionalInfo: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of applications for the cluster. Valid values are: `Flink`, `Hadoop`, `Hive`, `Mahout`, `Pig`, `Spark`, and `JupyterHub` (as of EMR 5.14.0). Case insensitive
      */
    val applications: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * An IAM role for automatic scaling policies. The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an instance group.
      */
    val autoscalingRole: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Ordered list of bootstrap actions that will be run before Hadoop is started on the cluster nodes. Defined below.
      */
    val bootstrapActions: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.emr.ClusterBootstrapAction]]]] = js.undefined
    
    /**
      * A configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
      */
    val configurations: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A JSON string for supplying list of configurations for the EMR cluster.
      */
    val configurationsJson: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block to use an [Instance Fleet](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-fleet.html) for the core node type. Cannot be specified if any `coreInstanceGroup` configuration blocks are set. Detailed below.
      */
    val coreInstanceFleet: js.UndefOr[Input[typings.pulumiAws.inputMod.emr.ClusterCoreInstanceFleet]] = js.undefined
    
    /**
      * Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [core node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-core).
      */
    val coreInstanceGroup: js.UndefOr[Input[typings.pulumiAws.inputMod.emr.ClusterCoreInstanceGroup]] = js.undefined
    
    /**
      * A custom Amazon Linux AMI for the cluster (instead of an EMR-owned AMI). Available in Amazon EMR version 5.7.0 and later.
      */
    val customAmiId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Size in GiB of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in Amazon EMR version 4.x and later.
      */
    val ebsRootVolumeSize: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Attributes for the EC2 instances running the job flow. Defined below
      */
    val ec2Attributes: js.UndefOr[Input[typings.pulumiAws.inputMod.emr.ClusterEc2Attributes]] = js.undefined
    
    /**
      * Switch on/off run cluster with no steps or when all steps are complete (default is on)
      */
    val keepJobFlowAliveWhenNoSteps: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Kerberos configuration for the cluster. Defined below
      */
    val kerberosAttributes: js.UndefOr[Input[typings.pulumiAws.inputMod.emr.ClusterKerberosAttributes]] = js.undefined
    
    /**
      * S3 bucket to write the log files of the job flow. If a value is not provided, logs are not created
      */
    val logUri: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block to use an [Instance Fleet](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-fleet.html) for the master node type. Cannot be specified if any `masterInstanceGroup` configuration blocks are set. Detailed below.
      */
    val masterInstanceFleet: js.UndefOr[Input[typings.pulumiAws.inputMod.emr.ClusterMasterInstanceFleet]] = js.undefined
    
    /**
      * Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [master node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-master).
      */
    val masterInstanceGroup: js.UndefOr[Input[typings.pulumiAws.inputMod.emr.ClusterMasterInstanceGroup]] = js.undefined
    
    /**
      * Friendly name given to the instance fleet.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The release label for the Amazon EMR release
      */
    val releaseLabel: Input[String]
    
    /**
      * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an `instance group` is resized.
      */
    val scaleDownBehavior: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The security configuration name to attach to the EMR cluster. Only valid for EMR clusters with `releaseLabel` 4.8.0 or greater
      */
    val securityConfiguration: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * IAM role that will be assumed by the Amazon EMR service to access AWS resources
      */
    val serviceRole: Input[String]
    
    /**
      * The number of steps that can be executed concurrently. You can specify a maximum of 256 steps. Only valid for EMR clusters with `releaseLabel` 5.28.0 or greater. (default is 1)
      */
    val stepConcurrencyLevel: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * List of steps to run when creating the cluster. Defined below. It is highly recommended to utilize [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) if other steps are being managed outside of this provider.
      */
    val steps: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.emr.ClusterStep]]]] = js.undefined
    
    /**
      * list of tags to apply to the EMR Cluster
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Switch on/off termination protection (default is `false`, except when using multiple master nodes). Before attempting to destroy the resource when termination protection is enabled, this configuration must be applied with its value set to `false`.
      */
    val terminationProtection: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Whether the job flow is visible to all IAM users of the AWS account associated with the job flow. Default `true`
      */
    val visibleToAllUsers: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object ClusterArgs {
    
    @scala.inline
    def apply(releaseLabel: Input[String], serviceRole: Input[String]): ClusterArgs = {
      val __obj = js.Dynamic.literal(releaseLabel = releaseLabel.asInstanceOf[js.Any], serviceRole = serviceRole.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterArgs]
    }
    
    @scala.inline
    implicit class ClusterArgsMutableBuilder[Self <: ClusterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalInfo(value: Input[String]): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
      
      @scala.inline
      def setApplications(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
      
      @scala.inline
      def setApplicationsVarargs(value: Input[String]*): Self = StObject.set(x, "applications", js.Array(value :_*))
      
      @scala.inline
      def setAutoscalingRole(value: Input[String]): Self = StObject.set(x, "autoscalingRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoscalingRoleUndefined: Self = StObject.set(x, "autoscalingRole", js.undefined)
      
      @scala.inline
      def setBootstrapActions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.emr.ClusterBootstrapAction]]]): Self = StObject.set(x, "bootstrapActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBootstrapActionsUndefined: Self = StObject.set(x, "bootstrapActions", js.undefined)
      
      @scala.inline
      def setBootstrapActionsVarargs(value: Input[typings.pulumiAws.inputMod.emr.ClusterBootstrapAction]*): Self = StObject.set(x, "bootstrapActions", js.Array(value :_*))
      
      @scala.inline
      def setConfigurations(value: Input[String]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationsJson(value: Input[String]): Self = StObject.set(x, "configurationsJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationsJsonUndefined: Self = StObject.set(x, "configurationsJson", js.undefined)
      
      @scala.inline
      def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
      
      @scala.inline
      def setCoreInstanceFleet(value: Input[typings.pulumiAws.inputMod.emr.ClusterCoreInstanceFleet]): Self = StObject.set(x, "coreInstanceFleet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoreInstanceFleetUndefined: Self = StObject.set(x, "coreInstanceFleet", js.undefined)
      
      @scala.inline
      def setCoreInstanceGroup(value: Input[typings.pulumiAws.inputMod.emr.ClusterCoreInstanceGroup]): Self = StObject.set(x, "coreInstanceGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoreInstanceGroupUndefined: Self = StObject.set(x, "coreInstanceGroup", js.undefined)
      
      @scala.inline
      def setCustomAmiId(value: Input[String]): Self = StObject.set(x, "customAmiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomAmiIdUndefined: Self = StObject.set(x, "customAmiId", js.undefined)
      
      @scala.inline
      def setEbsRootVolumeSize(value: Input[Double]): Self = StObject.set(x, "ebsRootVolumeSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsRootVolumeSizeUndefined: Self = StObject.set(x, "ebsRootVolumeSize", js.undefined)
      
      @scala.inline
      def setEc2Attributes(value: Input[typings.pulumiAws.inputMod.emr.ClusterEc2Attributes]): Self = StObject.set(x, "ec2Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEc2AttributesUndefined: Self = StObject.set(x, "ec2Attributes", js.undefined)
      
      @scala.inline
      def setKeepJobFlowAliveWhenNoSteps(value: Input[Boolean]): Self = StObject.set(x, "keepJobFlowAliveWhenNoSteps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepJobFlowAliveWhenNoStepsUndefined: Self = StObject.set(x, "keepJobFlowAliveWhenNoSteps", js.undefined)
      
      @scala.inline
      def setKerberosAttributes(value: Input[typings.pulumiAws.inputMod.emr.ClusterKerberosAttributes]): Self = StObject.set(x, "kerberosAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKerberosAttributesUndefined: Self = StObject.set(x, "kerberosAttributes", js.undefined)
      
      @scala.inline
      def setLogUri(value: Input[String]): Self = StObject.set(x, "logUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUriUndefined: Self = StObject.set(x, "logUri", js.undefined)
      
      @scala.inline
      def setMasterInstanceFleet(value: Input[typings.pulumiAws.inputMod.emr.ClusterMasterInstanceFleet]): Self = StObject.set(x, "masterInstanceFleet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterInstanceFleetUndefined: Self = StObject.set(x, "masterInstanceFleet", js.undefined)
      
      @scala.inline
      def setMasterInstanceGroup(value: Input[typings.pulumiAws.inputMod.emr.ClusterMasterInstanceGroup]): Self = StObject.set(x, "masterInstanceGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterInstanceGroupUndefined: Self = StObject.set(x, "masterInstanceGroup", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setReleaseLabel(value: Input[String]): Self = StObject.set(x, "releaseLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleDownBehavior(value: Input[String]): Self = StObject.set(x, "scaleDownBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleDownBehaviorUndefined: Self = StObject.set(x, "scaleDownBehavior", js.undefined)
      
      @scala.inline
      def setSecurityConfiguration(value: Input[String]): Self = StObject.set(x, "securityConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityConfigurationUndefined: Self = StObject.set(x, "securityConfiguration", js.undefined)
      
      @scala.inline
      def setServiceRole(value: Input[String]): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepConcurrencyLevel(value: Input[Double]): Self = StObject.set(x, "stepConcurrencyLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepConcurrencyLevelUndefined: Self = StObject.set(x, "stepConcurrencyLevel", js.undefined)
      
      @scala.inline
      def setSteps(value: Input[js.Array[Input[typings.pulumiAws.inputMod.emr.ClusterStep]]]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      @scala.inline
      def setStepsVarargs(value: Input[typings.pulumiAws.inputMod.emr.ClusterStep]*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTerminationProtection(value: Input[Boolean]): Self = StObject.set(x, "terminationProtection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminationProtectionUndefined: Self = StObject.set(x, "terminationProtection", js.undefined)
      
      @scala.inline
      def setVisibleToAllUsers(value: Input[Boolean]): Self = StObject.set(x, "visibleToAllUsers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleToAllUsersUndefined: Self = StObject.set(x, "visibleToAllUsers", js.undefined)
    }
  }
  
  trait ClusterState extends StObject {
    
    /**
      * A JSON string for selecting additional features such as adding proxy information. Note: Currently there is no API to retrieve the value of this argument after EMR cluster creation from provider, therefore this provider cannot detect drift from the actual EMR cluster if its value is changed outside this provider.
      */
    val additionalInfo: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of applications for the cluster. Valid values are: `Flink`, `Hadoop`, `Hive`, `Mahout`, `Pig`, `Spark`, and `JupyterHub` (as of EMR 5.14.0). Case insensitive
      */
    val applications: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * An IAM role for automatic scaling policies. The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an instance group.
      */
    val autoscalingRole: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Ordered list of bootstrap actions that will be run before Hadoop is started on the cluster nodes. Defined below.
      */
    val bootstrapActions: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.emr.ClusterBootstrapAction]]]] = js.undefined
    
    val clusterState: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
      */
    val configurations: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A JSON string for supplying list of configurations for the EMR cluster.
      */
    val configurationsJson: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block to use an [Instance Fleet](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-fleet.html) for the core node type. Cannot be specified if any `coreInstanceGroup` configuration blocks are set. Detailed below.
      */
    val coreInstanceFleet: js.UndefOr[Input[typings.pulumiAws.inputMod.emr.ClusterCoreInstanceFleet]] = js.undefined
    
    /**
      * Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [core node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-core).
      */
    val coreInstanceGroup: js.UndefOr[Input[typings.pulumiAws.inputMod.emr.ClusterCoreInstanceGroup]] = js.undefined
    
    /**
      * A custom Amazon Linux AMI for the cluster (instead of an EMR-owned AMI). Available in Amazon EMR version 5.7.0 and later.
      */
    val customAmiId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Size in GiB of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in Amazon EMR version 4.x and later.
      */
    val ebsRootVolumeSize: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Attributes for the EC2 instances running the job flow. Defined below
      */
    val ec2Attributes: js.UndefOr[Input[typings.pulumiAws.inputMod.emr.ClusterEc2Attributes]] = js.undefined
    
    /**
      * Switch on/off run cluster with no steps or when all steps are complete (default is on)
      */
    val keepJobFlowAliveWhenNoSteps: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Kerberos configuration for the cluster. Defined below
      */
    val kerberosAttributes: js.UndefOr[Input[typings.pulumiAws.inputMod.emr.ClusterKerberosAttributes]] = js.undefined
    
    /**
      * S3 bucket to write the log files of the job flow. If a value is not provided, logs are not created
      */
    val logUri: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block to use an [Instance Fleet](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-fleet.html) for the master node type. Cannot be specified if any `masterInstanceGroup` configuration blocks are set. Detailed below.
      */
    val masterInstanceFleet: js.UndefOr[Input[typings.pulumiAws.inputMod.emr.ClusterMasterInstanceFleet]] = js.undefined
    
    /**
      * Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [master node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-master).
      */
    val masterInstanceGroup: js.UndefOr[Input[typings.pulumiAws.inputMod.emr.ClusterMasterInstanceGroup]] = js.undefined
    
    /**
      * The public DNS name of the master EC2 instance.
      * * `core_instance_group.0.id` - Core node type Instance Group ID, if using Instance Group for this node type.
      */
    val masterPublicDns: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Friendly name given to the instance fleet.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The release label for the Amazon EMR release
      */
    val releaseLabel: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an `instance group` is resized.
      */
    val scaleDownBehavior: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The security configuration name to attach to the EMR cluster. Only valid for EMR clusters with `releaseLabel` 4.8.0 or greater
      */
    val securityConfiguration: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * IAM role that will be assumed by the Amazon EMR service to access AWS resources
      */
    val serviceRole: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of steps that can be executed concurrently. You can specify a maximum of 256 steps. Only valid for EMR clusters with `releaseLabel` 5.28.0 or greater. (default is 1)
      */
    val stepConcurrencyLevel: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * List of steps to run when creating the cluster. Defined below. It is highly recommended to utilize [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) if other steps are being managed outside of this provider.
      */
    val steps: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.emr.ClusterStep]]]] = js.undefined
    
    /**
      * list of tags to apply to the EMR Cluster
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Switch on/off termination protection (default is `false`, except when using multiple master nodes). Before attempting to destroy the resource when termination protection is enabled, this configuration must be applied with its value set to `false`.
      */
    val terminationProtection: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Whether the job flow is visible to all IAM users of the AWS account associated with the job flow. Default `true`
      */
    val visibleToAllUsers: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object ClusterState {
    
    @scala.inline
    def apply(): ClusterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterState]
    }
    
    @scala.inline
    implicit class ClusterStateMutableBuilder[Self <: ClusterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalInfo(value: Input[String]): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
      
      @scala.inline
      def setApplications(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
      
      @scala.inline
      def setApplicationsVarargs(value: Input[String]*): Self = StObject.set(x, "applications", js.Array(value :_*))
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAutoscalingRole(value: Input[String]): Self = StObject.set(x, "autoscalingRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoscalingRoleUndefined: Self = StObject.set(x, "autoscalingRole", js.undefined)
      
      @scala.inline
      def setBootstrapActions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.emr.ClusterBootstrapAction]]]): Self = StObject.set(x, "bootstrapActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBootstrapActionsUndefined: Self = StObject.set(x, "bootstrapActions", js.undefined)
      
      @scala.inline
      def setBootstrapActionsVarargs(value: Input[typings.pulumiAws.inputMod.emr.ClusterBootstrapAction]*): Self = StObject.set(x, "bootstrapActions", js.Array(value :_*))
      
      @scala.inline
      def setClusterState(value: Input[String]): Self = StObject.set(x, "clusterState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterStateUndefined: Self = StObject.set(x, "clusterState", js.undefined)
      
      @scala.inline
      def setConfigurations(value: Input[String]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationsJson(value: Input[String]): Self = StObject.set(x, "configurationsJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationsJsonUndefined: Self = StObject.set(x, "configurationsJson", js.undefined)
      
      @scala.inline
      def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
      
      @scala.inline
      def setCoreInstanceFleet(value: Input[typings.pulumiAws.inputMod.emr.ClusterCoreInstanceFleet]): Self = StObject.set(x, "coreInstanceFleet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoreInstanceFleetUndefined: Self = StObject.set(x, "coreInstanceFleet", js.undefined)
      
      @scala.inline
      def setCoreInstanceGroup(value: Input[typings.pulumiAws.inputMod.emr.ClusterCoreInstanceGroup]): Self = StObject.set(x, "coreInstanceGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoreInstanceGroupUndefined: Self = StObject.set(x, "coreInstanceGroup", js.undefined)
      
      @scala.inline
      def setCustomAmiId(value: Input[String]): Self = StObject.set(x, "customAmiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomAmiIdUndefined: Self = StObject.set(x, "customAmiId", js.undefined)
      
      @scala.inline
      def setEbsRootVolumeSize(value: Input[Double]): Self = StObject.set(x, "ebsRootVolumeSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsRootVolumeSizeUndefined: Self = StObject.set(x, "ebsRootVolumeSize", js.undefined)
      
      @scala.inline
      def setEc2Attributes(value: Input[typings.pulumiAws.inputMod.emr.ClusterEc2Attributes]): Self = StObject.set(x, "ec2Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEc2AttributesUndefined: Self = StObject.set(x, "ec2Attributes", js.undefined)
      
      @scala.inline
      def setKeepJobFlowAliveWhenNoSteps(value: Input[Boolean]): Self = StObject.set(x, "keepJobFlowAliveWhenNoSteps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepJobFlowAliveWhenNoStepsUndefined: Self = StObject.set(x, "keepJobFlowAliveWhenNoSteps", js.undefined)
      
      @scala.inline
      def setKerberosAttributes(value: Input[typings.pulumiAws.inputMod.emr.ClusterKerberosAttributes]): Self = StObject.set(x, "kerberosAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKerberosAttributesUndefined: Self = StObject.set(x, "kerberosAttributes", js.undefined)
      
      @scala.inline
      def setLogUri(value: Input[String]): Self = StObject.set(x, "logUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUriUndefined: Self = StObject.set(x, "logUri", js.undefined)
      
      @scala.inline
      def setMasterInstanceFleet(value: Input[typings.pulumiAws.inputMod.emr.ClusterMasterInstanceFleet]): Self = StObject.set(x, "masterInstanceFleet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterInstanceFleetUndefined: Self = StObject.set(x, "masterInstanceFleet", js.undefined)
      
      @scala.inline
      def setMasterInstanceGroup(value: Input[typings.pulumiAws.inputMod.emr.ClusterMasterInstanceGroup]): Self = StObject.set(x, "masterInstanceGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterInstanceGroupUndefined: Self = StObject.set(x, "masterInstanceGroup", js.undefined)
      
      @scala.inline
      def setMasterPublicDns(value: Input[String]): Self = StObject.set(x, "masterPublicDns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterPublicDnsUndefined: Self = StObject.set(x, "masterPublicDns", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setReleaseLabel(value: Input[String]): Self = StObject.set(x, "releaseLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseLabelUndefined: Self = StObject.set(x, "releaseLabel", js.undefined)
      
      @scala.inline
      def setScaleDownBehavior(value: Input[String]): Self = StObject.set(x, "scaleDownBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleDownBehaviorUndefined: Self = StObject.set(x, "scaleDownBehavior", js.undefined)
      
      @scala.inline
      def setSecurityConfiguration(value: Input[String]): Self = StObject.set(x, "securityConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityConfigurationUndefined: Self = StObject.set(x, "securityConfiguration", js.undefined)
      
      @scala.inline
      def setServiceRole(value: Input[String]): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceRoleUndefined: Self = StObject.set(x, "serviceRole", js.undefined)
      
      @scala.inline
      def setStepConcurrencyLevel(value: Input[Double]): Self = StObject.set(x, "stepConcurrencyLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepConcurrencyLevelUndefined: Self = StObject.set(x, "stepConcurrencyLevel", js.undefined)
      
      @scala.inline
      def setSteps(value: Input[js.Array[Input[typings.pulumiAws.inputMod.emr.ClusterStep]]]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      @scala.inline
      def setStepsVarargs(value: Input[typings.pulumiAws.inputMod.emr.ClusterStep]*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTerminationProtection(value: Input[Boolean]): Self = StObject.set(x, "terminationProtection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminationProtectionUndefined: Self = StObject.set(x, "terminationProtection", js.undefined)
      
      @scala.inline
      def setVisibleToAllUsers(value: Input[Boolean]): Self = StObject.set(x, "visibleToAllUsers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleToAllUsersUndefined: Self = StObject.set(x, "visibleToAllUsers", js.undefined)
    }
  }
}
