package typings.atPulumiAws.emrClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_ActionOnFailure
import typings.atPulumiAws.Anon_AdDomainJoinPassword
import typings.atPulumiAws.Anon_AdditionalMasterSecurityGroups
import typings.atPulumiAws.Anon_Args
import typings.atPulumiAws.Anon_AutoscalingPolicy
import typings.atPulumiAws.Anon_AutoscalingPolicyBidPrice
import typings.atPulumiAws.Anon_BidPrice
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val additionalInfo: Output[js.UndefOr[String]] = js.native
  /**
    * A list of applications for the cluster. Valid values are: `Flink`, `Hadoop`, `Hive`, `Mahout`, `Pig`, `Spark`, and `JupyterHub` (as of EMR 5.14.0). Case insensitive
    */
  val applications: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * An IAM role for automatic scaling policies. The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an instance group.
    */
  val autoscalingRole: Output[js.UndefOr[String]] = js.native
  /**
    * List of bootstrap actions that will be run before Hadoop is started on the cluster nodes. Defined below
    */
  val bootstrapActions: Output[js.UndefOr[js.Array[Anon_Args]]] = js.native
  val clusterState: Output[String] = js.native
  /**
    * List of configurations supplied for the EMR cluster you are creating
    */
  val configurations: Output[js.UndefOr[String]] = js.native
  /**
    * A JSON string for supplying list of configurations for the EMR cluster.
    */
  val configurationsJson: Output[js.UndefOr[String]] = js.native
  /**
    * Use the `coreInstanceGroup` configuration block `instanceCount` argument instead. Number of Amazon EC2 instances used to execute the job flow. EMR will use one node as the cluster's master node and use the remainder of the nodes (`coreInstanceCount`-1) as core nodes. Cannot be specified if `coreInstanceGroup` or `instanceGroup` configuration blocks are set. Default `1`
    */
  val coreInstanceCount: Output[Double] = js.native
  /**
    * Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [core node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-core). Cannot be specified if `coreInstanceCount` argument, `coreInstanceType` argument, or `instanceGroup` configuration blocks are set. Detailed below.
    */
  val coreInstanceGroup: Output[Anon_AutoscalingPolicy] = js.native
  /**
    * Use the `coreInstanceGroup` configuration block `instanceType` argument instead. The EC2 instance type of the slave nodes. Cannot be specified if `coreInstanceGroup` or `instanceGroup` configuration blocks are set.
    */
  val coreInstanceType: Output[String] = js.native
  /**
    * A custom Amazon Linux AMI for the cluster (instead of an EMR-owned AMI). Available in Amazon EMR version 5.7.0 and later.
    */
  val customAmiId: Output[js.UndefOr[String]] = js.native
  /**
    * Size in GiB of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in Amazon EMR version 4.x and later.
    */
  val ebsRootVolumeSize: Output[js.UndefOr[Double]] = js.native
  /**
    * Attributes for the EC2 instances running the job flow. Defined below
    */
  val ec2Attributes: Output[js.UndefOr[Anon_AdditionalMasterSecurityGroups]] = js.native
  /**
    * Use the `masterInstanceGroup` configuration block, `coreInstanceGroup` configuration block and [`aws.emr.InstanceGroup` resource(s)](https://www.terraform.io/docs/providers/aws/r/emr_instance_group.html) instead. A list of `instanceGroup` objects for each instance group in the cluster. Exactly one of `masterInstanceType` and `instanceGroup` must be specified. If `instanceGroup` is set, then it must contain a configuration block for at least the `MASTER` instance group type (as well as any additional instance groups). Cannot be specified if `masterInstanceGroup` or `coreInstanceGroup` configuration blocks are set. Defined below
    */
  val instanceGroups: Output[js.Array[Anon_AutoscalingPolicyBidPrice]] = js.native
  /**
    * Switch on/off run cluster with no steps or when all steps are complete (default is on)
    */
  val keepJobFlowAliveWhenNoSteps: Output[Boolean] = js.native
  /**
    * Kerberos configuration for the cluster. Defined below
    */
  val kerberosAttributes: Output[js.UndefOr[Anon_AdDomainJoinPassword]] = js.native
  /**
    * S3 bucket to write the log files of the job flow. If a value is not provided, logs are not created
    */
  val logUri: Output[js.UndefOr[String]] = js.native
  /**
    * Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [master node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-master). Cannot be specified if `masterInstanceType` argument or `instanceGroup` configuration blocks are set. Detailed below.
    */
  val masterInstanceGroup: Output[Anon_BidPrice] = js.native
  /**
    * Use the `masterInstanceGroup` configuration block `instanceType` argument instead. The EC2 instance type of the master node. Cannot be specified if `masterInstanceGroup` or `instanceGroup` configuration blocks are set.
    */
  val masterInstanceType: Output[String] = js.native
  /**
    * The public DNS name of the master EC2 instance.
    * * `core_instance_group.0.id` - Core node type Instance Group ID, if using Instance Group for this node type.
    */
  val masterPublicDns: Output[String] = js.native
  /**
    * The name of the job flow
    */
  val name: Output[String] = js.native
  /**
    * The release label for the Amazon EMR release
    */
  val releaseLabel: Output[String] = js.native
  /**
    * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an `instance group` is resized.
    */
  val scaleDownBehavior: Output[String] = js.native
  /**
    * The security configuration name to attach to the EMR cluster. Only valid for EMR clusters with `releaseLabel` 4.8.0 or greater
    */
  val securityConfiguration: Output[js.UndefOr[String]] = js.native
  /**
    * IAM role that will be assumed by the Amazon EMR service to access AWS resources
    */
  val serviceRole: Output[String] = js.native
  /**
    * List of steps to run when creating the cluster. Defined below. It is highly recommended to utilize the [lifecycle configuration block](https://www.terraform.io/docs/configuration/resources.html) with `ignoreChanges` if other steps are being managed outside of this provider. This argument is processed in [attribute-as-blocks mode](https://www.terraform.io/docs/configuration/attr-as-blocks.html).
    */
  val steps: Output[js.Array[Anon_ActionOnFailure]] = js.native
  /**
    * list of tags to apply to the EMR Cluster
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Switch on/off termination protection (default is `false`, except when using multiple master nodes). Before attempting to destroy the resource when termination protection is enabled, this configuration must be applied with its value set to `false`.
    */
  val terminationProtection: Output[Boolean] = js.native
  /**
    * Whether the job flow is visible to all IAM users of the AWS account associated with the job flow. Default `true`
    */
  val visibleToAllUsers: Output[js.UndefOr[Boolean]] = js.native
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
  def get(name: String, id: Input[ID]): Cluster = js.native
  def get(name: String, id: Input[ID], state: ClusterState): Cluster = js.native
  def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): Cluster = js.native
  /**
    * Returns true if the given object is an instance of Cluster.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/cluster.Cluster */ Boolean = js.native
}

