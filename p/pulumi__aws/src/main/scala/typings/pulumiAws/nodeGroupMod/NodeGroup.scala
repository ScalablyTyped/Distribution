package typings.pulumiAws.nodeGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.eks.NodeGroupLaunchTemplate
import typings.pulumiAws.outputMod.eks.NodeGroupRemoteAccess
import typings.pulumiAws.outputMod.eks.NodeGroupResource
import typings.pulumiAws.outputMod.eks.NodeGroupScalingConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/eks/nodeGroup", "NodeGroup")
@js.native
class NodeGroup protected () extends CustomResource {
  /**
    * Create a NodeGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NodeGroupArgs) = this()
  def this(name: String, args: NodeGroupArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Type of Amazon Machine Image (AMI) associated with the EKS Node Group. Defaults to `AL2_x86_64`. Valid values: `AL2_x86_64`, `AL2_x86_64_GPU`, `AL2_ARM_64`. This provider will only perform drift detection if a configuration value is provided.
    */
  val amiType: Output_[String] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the EKS Node Group.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Name of the EKS Cluster.
    */
  val clusterName: Output_[String] = js.native
  
  /**
    * Disk size in GiB for worker nodes. Defaults to `20`. This provider will only perform drift detection if a configuration value is provided.
    */
  val diskSize: Output_[Double] = js.native
  
  /**
    * Force version update if existing pods are unable to be drained due to a pod disruption budget issue.
    */
  val forceUpdateVersion: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * Set of instance types associated with the EKS Node Group. Defaults to `["t3.medium"]`. This provider will only perform drift detection if a configuration value is provided. Currently, the EKS API only accepts a single value in the set.
    */
  val instanceTypes: Output_[String] = js.native
  
  /**
    * Key-value map of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
    */
  val labels: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * Configuration block with Launch Template settings. Detailed below.
    */
  val launchTemplate: Output_[js.UndefOr[NodeGroupLaunchTemplate]] = js.native
  
  /**
    * Name of the EKS Node Group.
    */
  val nodeGroupName: Output_[String] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Node Group.
    */
  val nodeRoleArn: Output_[String] = js.native
  
  /**
    * AMI version of the EKS Node Group. Defaults to latest version for Kubernetes version.
    */
  val releaseVersion: Output_[String] = js.native
  
  /**
    * Configuration block with remote access settings. Detailed below.
    */
  val remoteAccess: Output_[js.UndefOr[NodeGroupRemoteAccess]] = js.native
  
  /**
    * List of objects containing information about underlying resources.
    */
  val resources: Output_[js.Array[NodeGroupResource]] = js.native
  
  /**
    * Configuration block with scaling settings. Detailed below.
    */
  val scalingConfig: Output_[NodeGroupScalingConfig] = js.native
  
  /**
    * Status of the EKS Node Group.
    */
  val status: Output_[String] = js.native
  
  /**
    * Identifiers of EC2 Subnets to associate with the EKS Node Group. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
    */
  val subnetIds: Output_[js.Array[String]] = js.native
  
  /**
    * Key-value mapping of resource tags.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  val version: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/eks/nodeGroup", "NodeGroup")
@js.native
object NodeGroup extends js.Object {
  
  /**
    * Get an existing NodeGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): NodeGroup = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): NodeGroup = js.native
  def get(name: String, id: Input[ID], state: NodeGroupState): NodeGroup = js.native
  def get(name: String, id: Input[ID], state: NodeGroupState, opts: CustomResourceOptions): NodeGroup = js.native
  
  /**
    * Returns true if the given object is an instance of NodeGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/eks/nodeGroup.NodeGroup */ Boolean = js.native
}
