package typings.atPulumiAws.eksClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.eks.ClusterCertificateAuthority
import typings.atPulumiAws.typesOutputMod.eks.ClusterIdentity
import typings.atPulumiAws.typesOutputMod.eks.ClusterVpcConfig
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/eks/cluster", "Cluster")
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
    * The Amazon Resource Name (ARN) of the cluster.
    */
  val arn: Output[String] = js.native
  /**
    * Nested attribute containing `certificate-authority-data` for your cluster.
    */
  val certificateAuthority: Output[ClusterCertificateAuthority] = js.native
  val createdAt: Output[String] = js.native
  /**
    * A list of the desired control plane logging to enable. For more information, see [Amazon EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html)
    */
  val enabledClusterLogTypes: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The endpoint for your Kubernetes API server.
    */
  val endpoint: Output[String] = js.native
  /**
    * Nested attribute containing identity provider information for your cluster. Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019.
    */
  val identities: Output[js.Array[ClusterIdentity]] = js.native
  /**
    * Name of the cluster.
    */
  val name: Output[String] = js.native
  /**
    * The platform version for the cluster.
    */
  val platformVersion: Output[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
    */
  val roleArn: Output[String] = js.native
  /**
    * The status of the EKS cluster. One of `CREATING`, `ACTIVE`, `DELETING`, `FAILED`.
    */
  val status: Output[String] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Desired Kubernetes master version. If you do not specify a value, the latest available version at resource creation is used and no upgrades will occur except those automatically triggered by EKS. The value must be configured and increased to upgrade the version when desired. Downgrades are not supported by EKS.
    */
  val version: Output[String] = js.native
  /**
    * Nested argument for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Configuration detailed below.
    */
  val vpcConfig: Output[ClusterVpcConfig] = js.native
}

/* static members */
@JSImport("@pulumi/aws/eks/cluster", "Cluster")
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
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/eks/cluster.Cluster */ Boolean = js.native
}

