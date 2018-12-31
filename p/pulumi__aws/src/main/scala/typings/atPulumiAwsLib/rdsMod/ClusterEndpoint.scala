package typings
package atPulumiAwsLib.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds", "ClusterEndpoint")
@js.native
class ClusterEndpoint protected ()
  extends atPulumiAwsLib.rdsClusterEndpointMod.ClusterEndpoint {
  /**
    * Create a ClusterEndpoint resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.rdsClusterEndpointMod.ClusterEndpointArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.rdsClusterEndpointMod.ClusterEndpointArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

@JSImport("@pulumi/aws/rds", "ClusterEndpoint")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsClusterEndpointMod.ClusterEndpoint = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.rdsClusterEndpointMod.ClusterEndpointState
  ): atPulumiAwsLib.rdsClusterEndpointMod.ClusterEndpoint = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.rdsClusterEndpointMod.ClusterEndpointState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.rdsClusterEndpointMod.ClusterEndpoint = js.native
}

