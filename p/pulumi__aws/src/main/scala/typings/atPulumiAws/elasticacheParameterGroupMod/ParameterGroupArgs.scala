package typings.atPulumiAws.elasticacheParameterGroupMod

import typings.atPulumiAws.typesInputMod.elasticache.ParameterGroupParameter
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterGroupArgs extends js.Object {
  /**
    * The description of the ElastiCache parameter group. Defaults to "Managed by Pulumi".
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The family of the ElastiCache parameter group.
    */
  val family: Input[String]
  /**
    * The name of the ElastiCache parameter.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of ElastiCache parameters to apply.
    */
  val parameters: js.UndefOr[Input[js.Array[Input[ParameterGroupParameter]]]] = js.undefined
}

object ParameterGroupArgs {
  @scala.inline
  def apply(
    family: Input[String],
    description: Input[String] = null,
    name: Input[String] = null,
    parameters: Input[js.Array[Input[ParameterGroupParameter]]] = null
  ): ParameterGroupArgs = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterGroupArgs]
  }
}

