package typings
package atPulumiAwsLib.emrClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/emr/cluster", "Cluster")
@js.native
class Cluster protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Cluster resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ClusterArgs) = this()
  def this(name: java.lang.String, args: ClusterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  val additionalInfo: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A list of applications for the cluster. Valid values are: `Flink`, `Hadoop`, `Hive`, `Mahout`, `Pig`, `Spark`, and `JupyterHub` (as of EMR 5.14.0). Case insensitive
    */
  val applications: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * An IAM role for automatic scaling policies. The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an instance group.
    */
  val autoscalingRole: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * List of bootstrap actions that will be run before Hadoop is started on the cluster nodes. Defined below
    */
  val bootstrapActions: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_Args]]] = js.native
  val clusterState: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * List of configurations supplied for the EMR cluster you are creating
    */
  val configurations: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A JSON string for supplying list of configurations for the EMR cluster.
    */
  val configurationsJson: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Use the `core_instance_group` configuration block `instance_count` argument instead. Number of Amazon EC2 instances used to execute the job flow. EMR will use one node as the cluster's master node and use the remainder of the nodes (`core_instance_count`-1) as core nodes. Cannot be specified if `core_instance_group` or `instance_group` configuration blocks are set. Default `1`
    */
  val coreInstanceCount: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [core node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-core). Cannot be specified if `core_instance_count` argument, `core_instance_type` argument, or `instance_group` configuration blocks are set. Detailed below.
    */
  val coreInstanceGroup: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_AutoscalingPolicy] = js.native
  /**
    * Use the `core_instance_group` configuration block `instance_type` argument instead. The EC2 instance type of the slave nodes. Cannot be specified if `core_instance_group` or `instance_group` configuration blocks are set.
    */
  val coreInstanceType: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A custom Amazon Linux AMI for the cluster (instead of an EMR-owned AMI). Available in Amazon EMR version 5.7.0 and later.
    */
  val customAmiId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Size in GiB of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in Amazon EMR version 4.x and later.
    */
  val ebsRootVolumeSize: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * Attributes for the EC2 instances running the job flow. Defined below
    */
  val ec2Attributes: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_AdditionalMasterSecurityGroups]] = js.native
  /**
    * Use the `master_instance_group` configuration block, `core_instance_group` configuration block and [`aws_emr_instance_group` resource(s)](https://www.terraform.io/docs/providers/aws/r/emr_instance_group.html) instead. A list of `instance_group` objects for each instance group in the cluster. Exactly one of `master_instance_type` and `instance_group` must be specified. If `instance_group` is set, then it must contain a configuration block for at least the `MASTER` instance group type (as well as any additional instance groups). Cannot be specified if `master_instance_group` or `core_instance_group` configuration blocks are set. Defined below
    */
  val instanceGroups: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_AutoscalingPolicyBidPrice]] = js.native
  /**
    * Switch on/off run cluster with no steps or when all steps are complete (default is on)
    */
  val keepJobFlowAliveWhenNoSteps: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * Kerberos configuration for the cluster. Defined below
    */
  val kerberosAttributes: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_AdDomainJoinPassword]] = js.native
  /**
    * S3 bucket to write the log files of the job flow. If a value is not provided, logs are not created
    */
  val logUri: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [master node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-master). Cannot be specified if `master_instance_type` argument or `instance_group` configuration blocks are set. Detailed below.
    */
  val masterInstanceGroup: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_BidPrice] = js.native
  /**
    * Use the `master_instance_group` configuration block `instance_type` argument instead. The EC2 instance type of the master node. Cannot be specified if `master_instance_group` or `instance_group` configuration blocks are set.
    */
  val masterInstanceType: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The public DNS name of the master EC2 instance.
    * * `core_instance_group.0.id` - Core node type Instance Group ID, if using Instance Group for this node type.
    */
  val masterPublicDns: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name of the job flow
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The release label for the Amazon EMR release
    */
  val releaseLabel: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an `instance group` is resized.
    */
  val scaleDownBehavior: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The security configuration name to attach to the EMR cluster. Only valid for EMR clusters with `release_label` 4.8.0 or greater
    */
  val securityConfiguration: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * IAM role that will be assumed by the Amazon EMR service to access AWS resources
    */
  val serviceRole: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val steps: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_ActionOnFailure]] = js.native
  /**
    * list of tags to apply to the EMR Cluster
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Switch on/off termination protection (default is `false`, except when using multiple master nodes). Before attempting to destroy the resource when termination protection is enabled, this configuration must be applied with its value set to `false`.
    */
  val terminationProtection: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * Whether the job flow is visible to all IAM users of the AWS account associated with the job flow. Default `true`
    */
  val visibleToAllUsers: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/emr/cluster", "Cluster")
@js.native
object Cluster extends js.Object {
  /**
    * Get an existing Cluster resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.emrClusterMod.Cluster = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.emrClusterMod.ClusterState
  ): atPulumiAwsLib.emrClusterMod.Cluster = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.emrClusterMod.ClusterState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.emrClusterMod.Cluster = js.native
  /**
    * Returns true if the given object is an instance of Cluster.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/cluster.Cluster */ scala.Boolean = js.native
}

