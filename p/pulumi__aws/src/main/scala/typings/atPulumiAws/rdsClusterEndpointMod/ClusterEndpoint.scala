package typings.atPulumiAws.rdsClusterEndpointMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds/clusterEndpoint", "ClusterEndpoint")
@js.native
class ClusterEndpoint protected () extends CustomResource {
  /**
    * Create a ClusterEndpoint resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ClusterEndpointArgs) = this()
  def this(name: String, args: ClusterEndpointArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of cluster
    */
  val arn: Output[String] = js.native
  /**
    * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
    */
  val clusterEndpointIdentifier: Output[String] = js.native
  /**
    * The cluster identifier.
    */
  val clusterIdentifier: Output[String] = js.native
  /**
    * The type of the endpoint. One of: READER , ANY .
    */
  val customEndpointType: Output[String] = js.native
  /**
    * A custom endpoint for the Aurora cluster
    */
  val endpoint: Output[String] = js.native
  /**
    * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `static_members`.
    */
  val excludedMembers: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excluded_members`.
    */
  val staticMembers: Output[js.UndefOr[js.Array[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/rds/clusterEndpoint", "ClusterEndpoint")
@js.native
object ClusterEndpoint extends js.Object {
  /**
    * Get an existing ClusterEndpoint resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ClusterEndpoint = js.native
  def get(name: String, id: Input[ID], state: ClusterEndpointState): ClusterEndpoint = js.native
  def get(name: String, id: Input[ID], state: ClusterEndpointState, opts: CustomResourceOptions): ClusterEndpoint = js.native
  /**
    * Returns true if the given object is an instance of ClusterEndpoint.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterEndpoint.ClusterEndpoint */ Boolean = js.native
}

