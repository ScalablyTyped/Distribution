package typings.atPulumiAws.typesOutputMod.neptune

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterGroupParameter extends js.Object {
  /**
    * The apply method of the Neptune parameter. Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
    */
  var applyMethod: js.UndefOr[String] = js.undefined
  /**
    * The name of the Neptune parameter.
    */
  var name: String
  /**
    * The value of the Neptune parameter.
    */
  var value: String
}

object ParameterGroupParameter {
  @scala.inline
  def apply(name: String, value: String, applyMethod: String = null): ParameterGroupParameter = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (applyMethod != null) __obj.updateDynamic("applyMethod")(applyMethod)
    __obj.asInstanceOf[ParameterGroupParameter]
  }
}

