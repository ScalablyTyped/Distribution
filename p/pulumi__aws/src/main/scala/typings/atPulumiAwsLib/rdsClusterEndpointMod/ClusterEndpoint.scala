package typings
package atPulumiAwsLib.rdsClusterEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds/clusterEndpoint", "ClusterEndpoint")
@js.native
class ClusterEndpoint protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a ClusterEndpoint resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ClusterEndpointArgs) = this()
  def this(name: java.lang.String, args: ClusterEndpointArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of cluster
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
    */
  val clusterEndpointIdentifier: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The cluster identifier.
    */
  val clusterIdentifier: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The type of the endpoint. One of: READER , ANY .
    */
  val customEndpointType: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A custom endpoint for the Aurora cluster
    */
  val endpoint: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `static_members`.
    */
  val excludedMembers: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excluded_members`.
    */
  val staticMembers: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsClusterEndpointMod.ClusterEndpoint = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.rdsClusterEndpointMod.ClusterEndpointState
  ): atPulumiAwsLib.rdsClusterEndpointMod.ClusterEndpoint = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.rdsClusterEndpointMod.ClusterEndpointState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.rdsClusterEndpointMod.ClusterEndpoint = js.native
  /**
    * Returns true if the given object is an instance of ClusterEndpoint.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterEndpoint.ClusterEndpoint */ scala.Boolean = js.native
}

