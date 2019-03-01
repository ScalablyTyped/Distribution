package typings
package atPulumiAwsLib.emrClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterArgs extends js.Object {
  /**
    * A JSON string for selecting additional features such as adding proxy information. Note: Currently there is no API to retrieve the value of this argument after EMR cluster creation from provider, therefore Terraform cannot detect drift from the actual EMR cluster if its value is changed outside Terraform.
    */
  val additionalInfo: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of applications for the cluster. Valid values are: `Flink`, `Hadoop`, `Hive`, `Mahout`, `Pig`, `Spark`, and `JupyterHub` (as of EMR 5.14.0). Case insensitive
    */
  val applications: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * An IAM role for automatic scaling policies. The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an instance group.
    */
  val autoscalingRole: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * List of bootstrap actions that will be run before Hadoop is started on the cluster nodes. Defined below
    */
  val bootstrapActions: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ArgsName]]]
  ] = js.undefined
  /**
    * List of configurations supplied for the EMR cluster you are creating
    */
  val configurations: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A JSON string for supplying list of configurations for the EMR cluster.
    */
  val configurationsJson: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Number of Amazon EC2 instances used to execute the job flow. EMR will use one node as the cluster's master node and use the remainder of the nodes (`core_instance_count`-1) as core nodes. Cannot be specified if `instance_groups` is set. Default `1`
    */
  val coreInstanceCount: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The EC2 instance type of the slave nodes. Cannot be specified if `instance_groups` is set
    */
  val coreInstanceType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A custom Amazon Linux AMI for the cluster (instead of an EMR-owned AMI). Available in Amazon EMR version 5.7.0 and later.
    */
  val customAmiId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Size in GiB of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in Amazon EMR version 4.x and later.
    */
  val ebsRootVolumeSize: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Attributes for the EC2 instances running the job flow. Defined below
    */
  val ec2Attributes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AdditionalMasterSecurityGroupsAdditionalSlaveSecurityGroups]
  ] = js.undefined
  /**
    * A list of `instance_group` objects for each instance group in the cluster. Exactly one of `master_instance_type` and `instance_group` must be specified. If `instance_group` is set, then it must contain a configuration block for at least the `MASTER` instance group type (as well as any additional instance groups). Defined below
    */
  val instanceGroups: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AutoscalingPolicyBidPrice]]
    ]
  ] = js.undefined
  /**
    * Switch on/off run cluster with no steps or when all steps are complete (default is on)
    */
  val keepJobFlowAliveWhenNoSteps: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Kerberos configuration for the cluster. Defined below
    */
  val kerberosAttributes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AdDomainJoinPasswordAdDomainJoinUser]
  ] = js.undefined
  /**
    * S3 bucket to write the log files of the job flow. If a value is not provided, logs are not created
    */
  val logUri: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The EC2 instance type of the master node. Exactly one of `master_instance_type` and `instance_group` must be specified.
    */
  val masterInstanceType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the job flow
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The release label for the Amazon EMR release
    */
  val releaseLabel: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an `instance group` is resized.
    */
  val scaleDownBehavior: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The security configuration name to attach to the EMR cluster. Only valid for EMR clusters with `release_label` 4.8.0 or greater
    */
  val securityConfiguration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * IAM role that will be assumed by the Amazon EMR service to access AWS resources
    */
  val serviceRole: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * List of steps to run when creating the cluster. Defined below. It is highly recommended to utilize the [lifecycle configuration block](https://www.terraform.io/docs/configuration/resources.html) with `ignore_changes` if other steps are being managed outside of Terraform.
    */
  val steps: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ActionOnFailureHadoopJarStep]
      ]
    ]
  ] = js.undefined
  /**
    * list of tags to apply to the EMR Cluster
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Switch on/off termination protection (default is off)
    */
  val terminationProtection: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Whether the job flow is visible to all IAM users of the AWS account associated with the job flow. Default `true`
    */
  val visibleToAllUsers: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object ClusterArgs {
  @scala.inline
  def apply(
    releaseLabel: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    serviceRole: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    additionalInfo: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    applications: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    autoscalingRole: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    bootstrapActions: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ArgsName]]] = null,
    configurations: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    configurationsJson: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    coreInstanceCount: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    coreInstanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    customAmiId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ebsRootVolumeSize: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    ec2Attributes: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AdditionalMasterSecurityGroupsAdditionalSlaveSecurityGroups] = null,
    instanceGroups: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AutoscalingPolicyBidPrice]]
    ] = null,
    keepJobFlowAliveWhenNoSteps: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    kerberosAttributes: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AdDomainJoinPasswordAdDomainJoinUser] = null,
    logUri: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    masterInstanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    scaleDownBehavior: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    securityConfiguration: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    steps: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ActionOnFailureHadoopJarStep]
      ]
    ] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    terminationProtection: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    visibleToAllUsers: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): ClusterArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("releaseLabel")(releaseLabel.asInstanceOf[js.Any])
    __obj.updateDynamic("serviceRole")(serviceRole.asInstanceOf[js.Any])
    if (additionalInfo != null) __obj.updateDynamic("additionalInfo")(additionalInfo.asInstanceOf[js.Any])
    if (applications != null) __obj.updateDynamic("applications")(applications.asInstanceOf[js.Any])
    if (autoscalingRole != null) __obj.updateDynamic("autoscalingRole")(autoscalingRole.asInstanceOf[js.Any])
    if (bootstrapActions != null) __obj.updateDynamic("bootstrapActions")(bootstrapActions.asInstanceOf[js.Any])
    if (configurations != null) __obj.updateDynamic("configurations")(configurations.asInstanceOf[js.Any])
    if (configurationsJson != null) __obj.updateDynamic("configurationsJson")(configurationsJson.asInstanceOf[js.Any])
    if (coreInstanceCount != null) __obj.updateDynamic("coreInstanceCount")(coreInstanceCount.asInstanceOf[js.Any])
    if (coreInstanceType != null) __obj.updateDynamic("coreInstanceType")(coreInstanceType.asInstanceOf[js.Any])
    if (customAmiId != null) __obj.updateDynamic("customAmiId")(customAmiId.asInstanceOf[js.Any])
    if (ebsRootVolumeSize != null) __obj.updateDynamic("ebsRootVolumeSize")(ebsRootVolumeSize.asInstanceOf[js.Any])
    if (ec2Attributes != null) __obj.updateDynamic("ec2Attributes")(ec2Attributes.asInstanceOf[js.Any])
    if (instanceGroups != null) __obj.updateDynamic("instanceGroups")(instanceGroups.asInstanceOf[js.Any])
    if (keepJobFlowAliveWhenNoSteps != null) __obj.updateDynamic("keepJobFlowAliveWhenNoSteps")(keepJobFlowAliveWhenNoSteps.asInstanceOf[js.Any])
    if (kerberosAttributes != null) __obj.updateDynamic("kerberosAttributes")(kerberosAttributes.asInstanceOf[js.Any])
    if (logUri != null) __obj.updateDynamic("logUri")(logUri.asInstanceOf[js.Any])
    if (masterInstanceType != null) __obj.updateDynamic("masterInstanceType")(masterInstanceType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scaleDownBehavior != null) __obj.updateDynamic("scaleDownBehavior")(scaleDownBehavior.asInstanceOf[js.Any])
    if (securityConfiguration != null) __obj.updateDynamic("securityConfiguration")(securityConfiguration.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (terminationProtection != null) __obj.updateDynamic("terminationProtection")(terminationProtection.asInstanceOf[js.Any])
    if (visibleToAllUsers != null) __obj.updateDynamic("visibleToAllUsers")(visibleToAllUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterArgs]
  }
}

