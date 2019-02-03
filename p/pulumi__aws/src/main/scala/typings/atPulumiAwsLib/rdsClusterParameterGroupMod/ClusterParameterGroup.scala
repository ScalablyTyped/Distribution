package typings
package atPulumiAwsLib.rdsClusterParameterGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds/clusterParameterGroup", "ClusterParameterGroup")
@js.native
class ClusterParameterGroup protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a ClusterParameterGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ClusterParameterGroupArgs) = this()
  def this(name: java.lang.String, args: ClusterParameterGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the db cluster parameter group.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The description of the DB cluster parameter group. Defaults to "Managed by Terraform".
    */
  val description: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The family of the DB cluster parameter group.
    */
  val family: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The name of the DB parameter.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A list of DB parameters to apply. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-cluster-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-cluster-parameters.html) after initial creation of the group.
    */
  val parameters: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_ApplyMethod]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/rds/clusterParameterGroup", "ClusterParameterGroup")
@js.native
object ClusterParameterGroup extends js.Object {
  /**
    * Get an existing ClusterParameterGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsClusterParameterGroupMod.ClusterParameterGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.rdsClusterParameterGroupMod.ClusterParameterGroupState
  ): atPulumiAwsLib.rdsClusterParameterGroupMod.ClusterParameterGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.rdsClusterParameterGroupMod.ClusterParameterGroupState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.rdsClusterParameterGroupMod.ClusterParameterGroup = js.native
}

