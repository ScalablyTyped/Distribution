package typings.atPulumiAws.typesInputMod.neptune

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterGroupParameter extends js.Object {
  /**
    * The apply method of the Neptune parameter. Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
    */
  var applyMethod: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the Neptune parameter.
    */
  var name: Input[String]
  /**
    * The value of the Neptune parameter.
    */
  var value: Input[String]
}

object ParameterGroupParameter {
  @scala.inline
  def apply(name: Input[String], value: Input[String], applyMethod: Input[String] = null): ParameterGroupParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (applyMethod != null) __obj.updateDynamic("applyMethod")(applyMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterGroupParameter]
  }
}

