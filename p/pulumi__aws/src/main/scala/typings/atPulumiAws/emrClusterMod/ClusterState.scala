package typings.atPulumiAws.emrClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_ActionOnFailureHadoopJarStep
import typings.atPulumiAws.Anon_AdDomainJoinPasswordAdDomainJoinUser
import typings.atPulumiAws.Anon_AdditionalMasterSecurityGroupsAdditionalSlaveSecurityGroups
import typings.atPulumiAws.Anon_ArgsName
import typings.atPulumiAws.Anon_AutoscalingPolicyBidPriceEbsConfigs
import typings.atPulumiAws.Anon_AutoscalingPolicyBidPriceEbsConfigsId
import typings.atPulumiAws.Anon_BidPriceEbsConfigs
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterState extends js.Object {
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
    * List of bootstrap actions that will be run before Hadoop is started on the cluster nodes. Defined below
    */
  val bootstrapActions: js.UndefOr[Input[js.Array[Input[Anon_ArgsName]]]] = js.undefined
  val clusterState: js.UndefOr[Input[String]] = js.undefined
  /**
    * List of configurations supplied for the EMR cluster you are creating
    */
  val configurations: js.UndefOr[Input[String]] = js.undefined
  /**
    * A JSON string for supplying list of configurations for the EMR cluster.
    */
  val configurationsJson: js.UndefOr[Input[String]] = js.undefined
  /**
    * Use the `core_instance_group` configuration block `instance_count` argument instead. Number of Amazon EC2 instances used to execute the job flow. EMR will use one node as the cluster's master node and use the remainder of the nodes (`core_instance_count`-1) as core nodes. Cannot be specified if `core_instance_group` or `instance_group` configuration blocks are set. Default `1`
    */
  val coreInstanceCount: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [core node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-core). Cannot be specified if `core_instance_count` argument, `core_instance_type` argument, or `instance_group` configuration blocks are set. Detailed below.
    */
  val coreInstanceGroup: js.UndefOr[Input[Anon_AutoscalingPolicyBidPriceEbsConfigs]] = js.undefined
  /**
    * Use the `core_instance_group` configuration block `instance_type` argument instead. The EC2 instance type of the slave nodes. Cannot be specified if `core_instance_group` or `instance_group` configuration blocks are set.
    */
  val coreInstanceType: js.UndefOr[Input[String]] = js.undefined
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
  val ec2Attributes: js.UndefOr[Input[Anon_AdditionalMasterSecurityGroupsAdditionalSlaveSecurityGroups]] = js.undefined
  /**
    * Use the `master_instance_group` configuration block, `core_instance_group` configuration block and [`aws_emr_instance_group` resource(s)](https://www.terraform.io/docs/providers/aws/r/emr_instance_group.html) instead. A list of `instance_group` objects for each instance group in the cluster. Exactly one of `master_instance_type` and `instance_group` must be specified. If `instance_group` is set, then it must contain a configuration block for at least the `MASTER` instance group type (as well as any additional instance groups). Cannot be specified if `master_instance_group` or `core_instance_group` configuration blocks are set. Defined below
    */
  val instanceGroups: js.UndefOr[Input[js.Array[Input[Anon_AutoscalingPolicyBidPriceEbsConfigsId]]]] = js.undefined
  /**
    * Switch on/off run cluster with no steps or when all steps are complete (default is on)
    */
  val keepJobFlowAliveWhenNoSteps: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Kerberos configuration for the cluster. Defined below
    */
  val kerberosAttributes: js.UndefOr[Input[Anon_AdDomainJoinPasswordAdDomainJoinUser]] = js.undefined
  /**
    * S3 bucket to write the log files of the job flow. If a value is not provided, logs are not created
    */
  val logUri: js.UndefOr[Input[String]] = js.undefined
  /**
    * Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [master node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-master). Cannot be specified if `master_instance_type` argument or `instance_group` configuration blocks are set. Detailed below.
    */
  val masterInstanceGroup: js.UndefOr[Input[Anon_BidPriceEbsConfigs]] = js.undefined
  /**
    * Use the `master_instance_group` configuration block `instance_type` argument instead. The EC2 instance type of the master node. Cannot be specified if `master_instance_group` or `instance_group` configuration blocks are set.
    */
  val masterInstanceType: js.UndefOr[Input[String]] = js.undefined
  /**
    * The public DNS name of the master EC2 instance.
    * * `core_instance_group.0.id` - Core node type Instance Group ID, if using Instance Group for this node type.
    */
  val masterPublicDns: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the job flow
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
    * The security configuration name to attach to the EMR cluster. Only valid for EMR clusters with `release_label` 4.8.0 or greater
    */
  val securityConfiguration: js.UndefOr[Input[String]] = js.undefined
  /**
    * IAM role that will be assumed by the Amazon EMR service to access AWS resources
    */
  val serviceRole: js.UndefOr[Input[String]] = js.undefined
  /**
    * List of steps to run when creating the cluster. Defined below. It is highly recommended to utilize the [lifecycle configuration block](https://www.terraform.io/docs/configuration/resources.html) with `ignore_changes` if other steps are being managed outside of this provider. This argument is processed in [attribute-as-blocks mode](https://www.terraform.io/docs/configuration/attr-as-blocks.html).
    */
  val steps: js.UndefOr[Input[js.Array[Input[Anon_ActionOnFailureHadoopJarStep]]]] = js.undefined
  /**
    * list of tags to apply to the EMR Cluster
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
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
  def apply(
    additionalInfo: Input[String] = null,
    applications: Input[js.Array[Input[String]]] = null,
    autoscalingRole: Input[String] = null,
    bootstrapActions: Input[js.Array[Input[Anon_ArgsName]]] = null,
    clusterState: Input[String] = null,
    configurations: Input[String] = null,
    configurationsJson: Input[String] = null,
    coreInstanceCount: Input[Double] = null,
    coreInstanceGroup: Input[Anon_AutoscalingPolicyBidPriceEbsConfigs] = null,
    coreInstanceType: Input[String] = null,
    customAmiId: Input[String] = null,
    ebsRootVolumeSize: Input[Double] = null,
    ec2Attributes: Input[Anon_AdditionalMasterSecurityGroupsAdditionalSlaveSecurityGroups] = null,
    instanceGroups: Input[js.Array[Input[Anon_AutoscalingPolicyBidPriceEbsConfigsId]]] = null,
    keepJobFlowAliveWhenNoSteps: Input[Boolean] = null,
    kerberosAttributes: Input[Anon_AdDomainJoinPasswordAdDomainJoinUser] = null,
    logUri: Input[String] = null,
    masterInstanceGroup: Input[Anon_BidPriceEbsConfigs] = null,
    masterInstanceType: Input[String] = null,
    masterPublicDns: Input[String] = null,
    name: Input[String] = null,
    releaseLabel: Input[String] = null,
    scaleDownBehavior: Input[String] = null,
    securityConfiguration: Input[String] = null,
    serviceRole: Input[String] = null,
    steps: Input[js.Array[Input[Anon_ActionOnFailureHadoopJarStep]]] = null,
    tags: Input[StringDictionary[_]] = null,
    terminationProtection: Input[Boolean] = null,
    visibleToAllUsers: Input[Boolean] = null
  ): ClusterState = {
    val __obj = js.Dynamic.literal()
    if (additionalInfo != null) __obj.updateDynamic("additionalInfo")(additionalInfo.asInstanceOf[js.Any])
    if (applications != null) __obj.updateDynamic("applications")(applications.asInstanceOf[js.Any])
    if (autoscalingRole != null) __obj.updateDynamic("autoscalingRole")(autoscalingRole.asInstanceOf[js.Any])
    if (bootstrapActions != null) __obj.updateDynamic("bootstrapActions")(bootstrapActions.asInstanceOf[js.Any])
    if (clusterState != null) __obj.updateDynamic("clusterState")(clusterState.asInstanceOf[js.Any])
    if (configurations != null) __obj.updateDynamic("configurations")(configurations.asInstanceOf[js.Any])
    if (configurationsJson != null) __obj.updateDynamic("configurationsJson")(configurationsJson.asInstanceOf[js.Any])
    if (coreInstanceCount != null) __obj.updateDynamic("coreInstanceCount")(coreInstanceCount.asInstanceOf[js.Any])
    if (coreInstanceGroup != null) __obj.updateDynamic("coreInstanceGroup")(coreInstanceGroup.asInstanceOf[js.Any])
    if (coreInstanceType != null) __obj.updateDynamic("coreInstanceType")(coreInstanceType.asInstanceOf[js.Any])
    if (customAmiId != null) __obj.updateDynamic("customAmiId")(customAmiId.asInstanceOf[js.Any])
    if (ebsRootVolumeSize != null) __obj.updateDynamic("ebsRootVolumeSize")(ebsRootVolumeSize.asInstanceOf[js.Any])
    if (ec2Attributes != null) __obj.updateDynamic("ec2Attributes")(ec2Attributes.asInstanceOf[js.Any])
    if (instanceGroups != null) __obj.updateDynamic("instanceGroups")(instanceGroups.asInstanceOf[js.Any])
    if (keepJobFlowAliveWhenNoSteps != null) __obj.updateDynamic("keepJobFlowAliveWhenNoSteps")(keepJobFlowAliveWhenNoSteps.asInstanceOf[js.Any])
    if (kerberosAttributes != null) __obj.updateDynamic("kerberosAttributes")(kerberosAttributes.asInstanceOf[js.Any])
    if (logUri != null) __obj.updateDynamic("logUri")(logUri.asInstanceOf[js.Any])
    if (masterInstanceGroup != null) __obj.updateDynamic("masterInstanceGroup")(masterInstanceGroup.asInstanceOf[js.Any])
    if (masterInstanceType != null) __obj.updateDynamic("masterInstanceType")(masterInstanceType.asInstanceOf[js.Any])
    if (masterPublicDns != null) __obj.updateDynamic("masterPublicDns")(masterPublicDns.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (releaseLabel != null) __obj.updateDynamic("releaseLabel")(releaseLabel.asInstanceOf[js.Any])
    if (scaleDownBehavior != null) __obj.updateDynamic("scaleDownBehavior")(scaleDownBehavior.asInstanceOf[js.Any])
    if (securityConfiguration != null) __obj.updateDynamic("securityConfiguration")(securityConfiguration.asInstanceOf[js.Any])
    if (serviceRole != null) __obj.updateDynamic("serviceRole")(serviceRole.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (terminationProtection != null) __obj.updateDynamic("terminationProtection")(terminationProtection.asInstanceOf[js.Any])
    if (visibleToAllUsers != null) __obj.updateDynamic("visibleToAllUsers")(visibleToAllUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterState]
  }
}

