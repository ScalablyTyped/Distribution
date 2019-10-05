package typings.atPulumiAws.daxParameterGroupMod

import typings.atPulumiAws.typesInputMod.dax.ParameterGroupParameter
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterGroupArgs extends js.Object {
  /**
    * A description of the parameter group.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the parameter group.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The parameters of the parameter group.
    */
  val parameters: js.UndefOr[Input[js.Array[Input[ParameterGroupParameter]]]] = js.undefined
}

object ParameterGroupArgs {
  @scala.inline
  def apply(
    description: Input[String] = null,
    name: Input[String] = null,
    parameters: Input[js.Array[Input[ParameterGroupParameter]]] = null
  ): ParameterGroupArgs = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterGroupArgs]
  }
}

