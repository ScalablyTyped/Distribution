package typings.pulumiAws.rdsClusterParameterGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.rds.ClusterParameterGroupParameter
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds/clusterParameterGroup", "ClusterParameterGroup")
@js.native
class ClusterParameterGroup protected () extends CustomResource {
  /**
    * Create a ClusterParameterGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ClusterParameterGroupArgs) = this()
  def this(name: String, args: ClusterParameterGroupArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the db cluster parameter group.
    */
  val arn: Output_[String] = js.native
  /**
    * The description of the DB cluster parameter group. Defaults to "Managed by Pulumi".
    */
  val description: Output_[String] = js.native
  /**
    * The family of the DB cluster parameter group.
    */
  val family: Output_[String] = js.native
  /**
    * The name of the DB parameter.
    */
  val name: Output_[String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: Output_[String] = js.native
  /**
    * A list of DB parameters to apply. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-cluster-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-cluster-parameters.html) after initial creation of the group.
    */
  val parameters: Output_[js.UndefOr[js.Array[ClusterParameterGroupParameter]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
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
  def get(name: String, id: Input[ID]): ClusterParameterGroup = js.native
  def get(name: String, id: Input[ID], state: ClusterParameterGroupState): ClusterParameterGroup = js.native
  def get(name: String, id: Input[ID], state: ClusterParameterGroupState, opts: CustomResourceOptions): ClusterParameterGroup = js.native
  /**
    * Returns true if the given object is an instance of ClusterParameterGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterParameterGroup.ClusterParameterGroup */ Boolean = js.native
}

