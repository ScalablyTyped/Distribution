package typings.atPulumiAws.typesOutputMod.rds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterParameterGroupParameter extends js.Object {
  /**
    * "immediate" (default), or "pending-reboot". Some
    * engines can't apply some parameters without a reboot, and you will need to
    * specify "pending-reboot" here.
    */
  var applyMethod: js.UndefOr[String] = js.undefined
  /**
    * The name of the DB parameter.
    */
  var name: String
  /**
    * The value of the DB parameter.
    */
  var value: String
}

object ClusterParameterGroupParameter {
  @scala.inline
  def apply(name: String, value: String, applyMethod: String = null): ClusterParameterGroupParameter = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (applyMethod != null) __obj.updateDynamic("applyMethod")(applyMethod)
    __obj.asInstanceOf[ClusterParameterGroupParameter]
  }
}

