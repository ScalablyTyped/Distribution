package typings
package atPulumiAwsLib.neptuneClusterParameterGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/neptune/clusterParameterGroup", "ClusterParameterGroup")
@js.native
class ClusterParameterGroup protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
    * The ARN of the neptune cluster parameter group.
    */
  val arn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The description of the neptune cluster parameter group. Defaults to "Managed by Terraform".
    */
  val description: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The family of the neptune cluster parameter group.
    */
  val family: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The name of the neptune parameter.
    */
  val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * A list of neptune parameters to apply.
    */
  val parameters: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_ValueNameApplyMethod]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
}

@JSImport("@pulumi/aws/neptune/clusterParameterGroup", "ClusterParameterGroup")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.neptuneClusterParameterGroupMod.ClusterParameterGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.neptuneClusterParameterGroupMod.ClusterParameterGroupState
  ): atPulumiAwsLib.neptuneClusterParameterGroupMod.ClusterParameterGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.neptuneClusterParameterGroupMod.ClusterParameterGroupState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.neptuneClusterParameterGroupMod.ClusterParameterGroup = js.native
}

