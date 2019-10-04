package typings.atPulumiAws.neptuneClusterParameterGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.neptuneNs.ClusterParameterGroupParameter
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/neptune/clusterParameterGroup", "ClusterParameterGroup")
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
    * The ARN of the neptune cluster parameter group.
    */
  val arn: Output[String] = js.native
  /**
    * The description of the neptune cluster parameter group. Defaults to "Managed by Pulumi".
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * The family of the neptune cluster parameter group.
    */
  val family: Output[String] = js.native
  /**
    * The name of the neptune parameter.
    */
  val name: Output[String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: Output[String] = js.native
  /**
    * A list of neptune parameters to apply.
    */
  val parameters: Output[js.UndefOr[js.Array[ClusterParameterGroupParameter]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
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
  def get(name: String, id: Input[ID]): ClusterParameterGroup = js.native
  def get(name: String, id: Input[ID], state: ClusterParameterGroupState): ClusterParameterGroup = js.native
  def get(name: String, id: Input[ID], state: ClusterParameterGroupState, opts: CustomResourceOptions): ClusterParameterGroup = js.native
  /**
    * Returns true if the given object is an instance of ClusterParameterGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/clusterParameterGroup.ClusterParameterGroup */ Boolean = js.native
}

