package typings.atPulumiAws.elasticacheParameterGroupMod

import typings.atPulumiAws.Anon_NameValue
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterGroupState extends js.Object {
  /**
    * The description of the ElastiCache parameter group. Defaults to "Managed by Pulumi".
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The family of the ElastiCache parameter group.
    */
  val family: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the ElastiCache parameter.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of ElastiCache parameters to apply.
    */
  val parameters: js.UndefOr[Input[js.Array[Input[Anon_NameValue]]]] = js.undefined
}

object ParameterGroupState {
  @scala.inline
  def apply(
    description: Input[String] = null,
    family: Input[String] = null,
    name: Input[String] = null,
    parameters: Input[js.Array[Input[Anon_NameValue]]] = null
  ): ParameterGroupState = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterGroupState]
  }
}

