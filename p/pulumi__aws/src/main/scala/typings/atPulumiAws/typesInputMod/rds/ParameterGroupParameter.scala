package typings.atPulumiAws.typesInputMod.rds

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterGroupParameter extends js.Object {
  /**
    * "immediate" (default), or "pending-reboot". Some
    * engines can't apply some parameters without a reboot, and you will need to
    * specify "pending-reboot" here.
    */
  var applyMethod: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the DB parameter.
    */
  var name: Input[String]
  /**
    * The value of the DB parameter.
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

