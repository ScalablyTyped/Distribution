package typings
package atPulumiAwsLib.eksClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/eks/cluster", "Cluster")
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
  /**
    * The Amazon Resource Name (ARN) of the cluster.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Nested attribute containing `certificate-authority-data` for your cluster.
    */
  val certificateAuthority: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.Anon_DataString] = js.native
  val createdAt: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The endpoint for your Kubernetes API server.
    */
  val endpoint: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Name of the cluster.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The platform version for the cluster.
    */
  val platformVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
    */
  val roleArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Desired Kubernetes master version. If you do not specify a value, the latest available version is used.
    */
  val version: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Nested argument for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Configuration detailed below.
    */
  val vpcConfig: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.Anon_SecurityGroupIdsSubnetIds] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.eksClusterMod.Cluster = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.eksClusterMod.ClusterState
  ): atPulumiAwsLib.eksClusterMod.Cluster = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.eksClusterMod.ClusterState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.eksClusterMod.Cluster = js.native
}

