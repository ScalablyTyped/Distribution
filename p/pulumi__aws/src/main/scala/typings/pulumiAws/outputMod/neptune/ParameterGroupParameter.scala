package typings.pulumiAws.outputMod.neptune

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterGroupParameter extends js.Object {
  /**
    * The apply method of the Neptune parameter. Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
    */
  var applyMethod: js.UndefOr[String] = js.native
  /**
    * The name of the Neptune parameter.
    */
  var name: String = js.native
  /**
    * The value of the Neptune parameter.
    */
  var value: String = js.native
}

object ParameterGroupParameter {
  @scala.inline
  def apply(name: String, value: String, applyMethod: String = null): ParameterGroupParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (applyMethod != null) __obj.updateDynamic("applyMethod")(applyMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterGroupParameter]
  }
}

