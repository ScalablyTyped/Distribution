package typings.atPulumiAws.eksNodeGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.eks.NodeGroupRemoteAccess
import typings.atPulumiAws.typesInputMod.eks.NodeGroupResource
import typings.atPulumiAws.typesInputMod.eks.NodeGroupScalingConfig
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroupState extends js.Object {
  val amiType: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the EKS Node Group.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the EKS Cluster.
    */
  val clusterName: js.UndefOr[Input[String]] = js.native
  val diskSize: js.UndefOr[Input[Double]] = js.native
  val instanceTypes: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
    */
  val labels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Name of the EKS Node Group.
    */
  val nodeGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Node Group.
    */
  val nodeRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * AMI version of the EKS Node Group. Defaults to latest version for Kubernetes version.
    */
  val releaseVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block with remote access settings. Detailed below.
    */
  val remoteAccess: js.UndefOr[Input[NodeGroupRemoteAccess]] = js.native
  /**
    * List of objects containing information about underlying resources.
    */
  val resources: js.UndefOr[Input[js.Array[Input[NodeGroupResource]]]] = js.native
  /**
    * Configuration block with scaling settings. Detailed below.
    */
  val scalingConfig: js.UndefOr[Input[NodeGroupScalingConfig]] = js.native
  /**
    * Status of the EKS Node Group.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * Identifiers of EC2 Subnets to associate with the EKS Node Group. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  val version: js.UndefOr[Input[String]] = js.native
}

object NodeGroupState {
  @scala.inline
  def apply(
    amiType: Input[String] = null,
    arn: Input[String] = null,
    clusterName: Input[String] = null,
    diskSize: Input[Double] = null,
    instanceTypes: Input[String] = null,
    labels: Input[StringDictionary[Input[String]]] = null,
    nodeGroupName: Input[String] = null,
    nodeRoleArn: Input[String] = null,
    releaseVersion: Input[String] = null,
    remoteAccess: Input[NodeGroupRemoteAccess] = null,
    resources: Input[js.Array[Input[NodeGroupResource]]] = null,
    scalingConfig: Input[NodeGroupScalingConfig] = null,
    status: Input[String] = null,
    subnetIds: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null,
    version: Input[String] = null
  ): NodeGroupState = {
    val __obj = js.Dynamic.literal()
    if (amiType != null) __obj.updateDynamic("amiType")(amiType.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (clusterName != null) __obj.updateDynamic("clusterName")(clusterName.asInstanceOf[js.Any])
    if (diskSize != null) __obj.updateDynamic("diskSize")(diskSize.asInstanceOf[js.Any])
    if (instanceTypes != null) __obj.updateDynamic("instanceTypes")(instanceTypes.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (nodeGroupName != null) __obj.updateDynamic("nodeGroupName")(nodeGroupName.asInstanceOf[js.Any])
    if (nodeRoleArn != null) __obj.updateDynamic("nodeRoleArn")(nodeRoleArn.asInstanceOf[js.Any])
    if (releaseVersion != null) __obj.updateDynamic("releaseVersion")(releaseVersion.asInstanceOf[js.Any])
    if (remoteAccess != null) __obj.updateDynamic("remoteAccess")(remoteAccess.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (scalingConfig != null) __obj.updateDynamic("scalingConfig")(scalingConfig.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeGroupState]
  }
}

