package typings.pulumiAws.outputMod.rds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterGroupParameter extends js.Object {
  /**
    * "immediate" (default), or "pending-reboot". Some
    * engines can't apply some parameters without a reboot, and you will need to
    * specify "pending-reboot" here.
    */
  var applyMethod: js.UndefOr[String] = js.native
  /**
    * The name of the DB parameter.
    */
  var name: String = js.native
  /**
    * The value of the DB parameter.
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

