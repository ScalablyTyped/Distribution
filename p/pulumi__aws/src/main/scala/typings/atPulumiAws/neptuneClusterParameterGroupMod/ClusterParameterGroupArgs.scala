package typings.atPulumiAws.neptuneClusterParameterGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.neptuneNs.ClusterParameterGroupParameter
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterParameterGroupArgs extends js.Object {
  /**
    * The description of the neptune cluster parameter group. Defaults to "Managed by Pulumi".
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The family of the neptune cluster parameter group.
    */
  val family: Input[String]
  /**
    * The name of the neptune parameter.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of neptune parameters to apply.
    */
  val parameters: js.UndefOr[Input[js.Array[Input[ClusterParameterGroupParameter]]]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object ClusterParameterGroupArgs {
  @scala.inline
  def apply(
    family: Input[String],
    description: Input[String] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    parameters: Input[js.Array[Input[ClusterParameterGroupParameter]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): ClusterParameterGroupArgs = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterParameterGroupArgs]
  }
}

