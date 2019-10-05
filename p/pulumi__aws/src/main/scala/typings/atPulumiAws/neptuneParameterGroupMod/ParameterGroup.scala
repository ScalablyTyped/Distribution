package typings.atPulumiAws.neptuneParameterGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.neptune.ParameterGroupParameter
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/neptune/parameterGroup", "ParameterGroup")
@js.native
class ParameterGroup protected () extends CustomResource {
  /**
    * Create a ParameterGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ParameterGroupArgs) = this()
  def this(name: String, args: ParameterGroupArgs, opts: CustomResourceOptions) = this()
  /**
    * The Neptune parameter group Amazon Resource Name (ARN).
    */
  val arn: Output[String] = js.native
  /**
    * The description of the Neptune parameter group. Defaults to "Managed by Pulumi".
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * The family of the Neptune parameter group.
    */
  val family: Output[String] = js.native
  /**
    * The name of the Neptune parameter.
    */
  val name: Output[String] = js.native
  /**
    * A list of Neptune parameters to apply.
    */
  val parameters: Output[js.UndefOr[js.Array[ParameterGroupParameter]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/neptune/parameterGroup", "ParameterGroup")
@js.native
object ParameterGroup extends js.Object {
  /**
    * Get an existing ParameterGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ParameterGroup = js.native
  def get(name: String, id: Input[ID], state: ParameterGroupState): ParameterGroup = js.native
  def get(name: String, id: Input[ID], state: ParameterGroupState, opts: CustomResourceOptions): ParameterGroup = js.native
  /**
    * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/parameterGroup.ParameterGroup */ Boolean = js.native
}

