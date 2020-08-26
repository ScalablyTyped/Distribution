package typings.pulumiAws.emrClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.emr.ClusterBootstrapAction
import typings.pulumiAws.inputMod.emr.ClusterCoreInstanceGroup
import typings.pulumiAws.inputMod.emr.ClusterEc2Attributes
import typings.pulumiAws.inputMod.emr.ClusterInstanceGroup
import typings.pulumiAws.inputMod.emr.ClusterKerberosAttributes
import typings.pulumiAws.inputMod.emr.ClusterMasterInstanceGroup
import typings.pulumiAws.inputMod.emr.ClusterStep
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterState extends js.Object {
  /**
    * A JSON string for selecting additional features such as adding proxy information. Note: Currently there is no API to retrieve the value of this argument after EMR cluster creation from provider, therefore this provider cannot detect drift from the actual EMR cluster if its value is changed outside this provider.
    */
  val additionalInfo: js.UndefOr[Input[String]] = js.native
  /**
    * A list of applications for the cluster. Valid values are: `Flink`, `Hadoop`, `Hive`, `Mahout`, `Pig`, `Spark`, and `JupyterHub` (as of EMR 5.14.0). Case insensitive
    */
  val applications: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * An IAM role for automatic scaling policies. The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an instance group.
    */
  val autoscalingRole: js.UndefOr[Input[String]] = js.native
  /**
    * Ordered list of bootstrap actions that will be run before Hadoop is started on the cluster nodes. Defined below.
    */
  val bootstrapActions: js.UndefOr[Input[js.Array[Input[ClusterBootstrapAction]]]] = js.native
  val clusterState: js.UndefOr[Input[String]] = js.native
  /**
    * List of configurations supplied for the EMR cluster you are creating
    */
  val configurations: js.UndefOr[Input[String]] = js.native
  /**
    * A JSON string for supplying list of configurations for the EMR cluster.
    */
  val configurationsJson: js.UndefOr[Input[String]] = js.native
  /**
    * Use the `coreInstanceGroup` configuration block `instanceCount` argument instead. Number of Amazon EC2 instances used to execute the job flow. EMR will use one node as the cluster's master node and use the remainder of the nodes (`coreInstanceCount`-1) as core nodes. Cannot be specified if `coreInstanceGroup` or `instanceGroup` configuration blocks are set. Default `1`
    *
    * @deprecated use `core_instance_group` configuration block `instance_count` argument instead
    */
  val coreInstanceCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [core node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-core). Cannot be specified if `coreInstanceCount` argument, `coreInstanceType` argument, or `instanceGroup` configuration blocks are set. Detailed below.
    */
  val coreInstanceGroup: js.UndefOr[Input[ClusterCoreInstanceGroup]] = js.native
  /**
    * Use the `coreInstanceGroup` configuration block `instanceType` argument instead. The EC2 instance type of the slave nodes. Cannot be specified if `coreInstanceGroup` or `instanceGroup` configuration blocks are set.
    *
    * @deprecated use `core_instance_group` configuration block `instance_type` argument instead
    */
  val coreInstanceType: js.UndefOr[Input[String]] = js.native
  /**
    * A custom Amazon Linux AMI for the cluster (instead of an EMR-owned AMI). Available in Amazon EMR version 5.7.0 and later.
    */
  val customAmiId: js.UndefOr[Input[String]] = js.native
  /**
    * Size in GiB of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in Amazon EMR version 4.x and later.
    */
  val ebsRootVolumeSize: js.UndefOr[Input[Double]] = js.native
  /**
    * Attributes for the EC2 instances running the job flow. Defined below
    */
  val ec2Attributes: js.UndefOr[Input[ClusterEc2Attributes]] = js.native
  /**
    * Use the `masterInstanceGroup` configuration block, `coreInstanceGroup` configuration block and `aws.emr.InstanceGroup` resource(s) instead. A list of `instanceGroup` objects for each instance group in the cluster. Exactly one of `masterInstanceType` and `instanceGroup` must be specified. If `instanceGroup` is set, then it must contain a configuration block for at least the `MASTER` instance group type (as well as any additional instance groups). Cannot be specified if `masterInstanceGroup` or `coreInstanceGroup` configuration blocks are set. Defined below
    *
    * @deprecated use `master_instance_group` configuration block, `core_instance_group` configuration block, and `aws_emr_instance_group` resource(s) instead
    */
  val instanceGroups: js.UndefOr[Input[js.Array[Input[ClusterInstanceGroup]]]] = js.native
  /**
    * Switch on/off run cluster with no steps or when all steps are complete (default is on)
    */
  val keepJobFlowAliveWhenNoSteps: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Kerberos configuration for the cluster. Defined below
    */
  val kerberosAttributes: js.UndefOr[Input[ClusterKerberosAttributes]] = js.native
  /**
    * S3 bucket to write the log files of the job flow. If a value is not provided, logs are not created
    */
  val logUri: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [master node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-master). Cannot be specified if `masterInstanceType` argument or `instanceGroup` configuration blocks are set. Detailed below.
    */
  val masterInstanceGroup: js.UndefOr[Input[ClusterMasterInstanceGroup]] = js.native
  /**
    * Use the `masterInstanceGroup` configuration block `instanceType` argument instead. The EC2 instance type of the master node. Cannot be specified if `masterInstanceGroup` or `instanceGroup` configuration blocks are set.
    *
    * @deprecated use `master_instance_group` configuration block `instance_type` argument instead
    */
  val masterInstanceType: js.UndefOr[Input[String]] = js.native
  /**
    * The public DNS name of the master EC2 instance.
    * * `core_instance_group.0.id` - Core node type Instance Group ID, if using Instance Group for this node type.
    */
  val masterPublicDns: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the step.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The release label for the Amazon EMR release
    */
  val releaseLabel: js.UndefOr[Input[String]] = js.native
  /**
    * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an `instance group` is resized.
    */
  val scaleDownBehavior: js.UndefOr[Input[String]] = js.native
  /**
    * The security configuration name to attach to the EMR cluster. Only valid for EMR clusters with `releaseLabel` 4.8.0 or greater
    */
  val securityConfiguration: js.UndefOr[Input[String]] = js.native
  /**
    * IAM role that will be assumed by the Amazon EMR service to access AWS resources
    */
  val serviceRole: js.UndefOr[Input[String]] = js.native
  /**
    * The number of steps that can be executed concurrently. You can specify a maximum of 256 steps. Only valid for EMR clusters with `releaseLabel` 5.28.0 or greater. (default is 1)
    */
  val stepConcurrencyLevel: js.UndefOr[Input[Double]] = js.native
  /**
    * List of steps to run when creating the cluster. Defined below. It is highly recommended to utilize [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) if other steps are being managed outside of this provider.
    */
  val steps: js.UndefOr[Input[js.Array[Input[ClusterStep]]]] = js.native
  /**
    * list of tags to apply to the EMR Cluster
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Switch on/off termination protection (default is `false`, except when using multiple master nodes). Before attempting to destroy the resource when termination protection is enabled, this configuration must be applied with its value set to `false`.
    */
  val terminationProtection: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether the job flow is visible to all IAM users of the AWS account associated with the job flow. Default `true`
    */
  val visibleToAllUsers: js.UndefOr[Input[Boolean]] = js.native
}

object ClusterState {
  @scala.inline
  def apply(): ClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterState]
  }
  @scala.inline
  implicit class ClusterStateOps[Self <: ClusterState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdditionalInfo(value: Input[String]): Self = this.set("additionalInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalInfo: Self = this.set("additionalInfo", js.undefined)
    @scala.inline
    def setApplicationsVarargs(value: Input[String]*): Self = this.set("applications", js.Array(value :_*))
    @scala.inline
    def setApplications(value: Input[js.Array[Input[String]]]): Self = this.set("applications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplications: Self = this.set("applications", js.undefined)
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setAutoscalingRole(value: Input[String]): Self = this.set("autoscalingRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoscalingRole: Self = this.set("autoscalingRole", js.undefined)
    @scala.inline
    def setBootstrapActionsVarargs(value: Input[ClusterBootstrapAction]*): Self = this.set("bootstrapActions", js.Array(value :_*))
    @scala.inline
    def setBootstrapActions(value: Input[js.Array[Input[ClusterBootstrapAction]]]): Self = this.set("bootstrapActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBootstrapActions: Self = this.set("bootstrapActions", js.undefined)
    @scala.inline
    def setClusterState(value: Input[String]): Self = this.set("clusterState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterState: Self = this.set("clusterState", js.undefined)
    @scala.inline
    def setConfigurations(value: Input[String]): Self = this.set("configurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurations: Self = this.set("configurations", js.undefined)
    @scala.inline
    def setConfigurationsJson(value: Input[String]): Self = this.set("configurationsJson", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationsJson: Self = this.set("configurationsJson", js.undefined)
    @scala.inline
    def setCoreInstanceCount(value: Input[Double]): Self = this.set("coreInstanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoreInstanceCount: Self = this.set("coreInstanceCount", js.undefined)
    @scala.inline
    def setCoreInstanceGroup(value: Input[ClusterCoreInstanceGroup]): Self = this.set("coreInstanceGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoreInstanceGroup: Self = this.set("coreInstanceGroup", js.undefined)
    @scala.inline
    def setCoreInstanceType(value: Input[String]): Self = this.set("coreInstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoreInstanceType: Self = this.set("coreInstanceType", js.undefined)
    @scala.inline
    def setCustomAmiId(value: Input[String]): Self = this.set("customAmiId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomAmiId: Self = this.set("customAmiId", js.undefined)
    @scala.inline
    def setEbsRootVolumeSize(value: Input[Double]): Self = this.set("ebsRootVolumeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsRootVolumeSize: Self = this.set("ebsRootVolumeSize", js.undefined)
    @scala.inline
    def setEc2Attributes(value: Input[ClusterEc2Attributes]): Self = this.set("ec2Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc2Attributes: Self = this.set("ec2Attributes", js.undefined)
    @scala.inline
    def setInstanceGroupsVarargs(value: Input[ClusterInstanceGroup]*): Self = this.set("instanceGroups", js.Array(value :_*))
    @scala.inline
    def setInstanceGroups(value: Input[js.Array[Input[ClusterInstanceGroup]]]): Self = this.set("instanceGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceGroups: Self = this.set("instanceGroups", js.undefined)
    @scala.inline
    def setKeepJobFlowAliveWhenNoSteps(value: Input[Boolean]): Self = this.set("keepJobFlowAliveWhenNoSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepJobFlowAliveWhenNoSteps: Self = this.set("keepJobFlowAliveWhenNoSteps", js.undefined)
    @scala.inline
    def setKerberosAttributes(value: Input[ClusterKerberosAttributes]): Self = this.set("kerberosAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKerberosAttributes: Self = this.set("kerberosAttributes", js.undefined)
    @scala.inline
    def setLogUri(value: Input[String]): Self = this.set("logUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogUri: Self = this.set("logUri", js.undefined)
    @scala.inline
    def setMasterInstanceGroup(value: Input[ClusterMasterInstanceGroup]): Self = this.set("masterInstanceGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterInstanceGroup: Self = this.set("masterInstanceGroup", js.undefined)
    @scala.inline
    def setMasterInstanceType(value: Input[String]): Self = this.set("masterInstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterInstanceType: Self = this.set("masterInstanceType", js.undefined)
    @scala.inline
    def setMasterPublicDns(value: Input[String]): Self = this.set("masterPublicDns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterPublicDns: Self = this.set("masterPublicDns", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setReleaseLabel(value: Input[String]): Self = this.set("releaseLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseLabel: Self = this.set("releaseLabel", js.undefined)
    @scala.inline
    def setScaleDownBehavior(value: Input[String]): Self = this.set("scaleDownBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleDownBehavior: Self = this.set("scaleDownBehavior", js.undefined)
    @scala.inline
    def setSecurityConfiguration(value: Input[String]): Self = this.set("securityConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityConfiguration: Self = this.set("securityConfiguration", js.undefined)
    @scala.inline
    def setServiceRole(value: Input[String]): Self = this.set("serviceRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceRole: Self = this.set("serviceRole", js.undefined)
    @scala.inline
    def setStepConcurrencyLevel(value: Input[Double]): Self = this.set("stepConcurrencyLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepConcurrencyLevel: Self = this.set("stepConcurrencyLevel", js.undefined)
    @scala.inline
    def setStepsVarargs(value: Input[ClusterStep]*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: Input[js.Array[Input[ClusterStep]]]): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTerminationProtection(value: Input[Boolean]): Self = this.set("terminationProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminationProtection: Self = this.set("terminationProtection", js.undefined)
    @scala.inline
    def setVisibleToAllUsers(value: Input[Boolean]): Self = this.set("visibleToAllUsers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleToAllUsers: Self = this.set("visibleToAllUsers", js.undefined)
  }
  
}

