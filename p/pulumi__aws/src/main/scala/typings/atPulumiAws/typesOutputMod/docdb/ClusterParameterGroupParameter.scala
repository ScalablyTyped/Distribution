package typings.atPulumiAws.typesOutputMod.docdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterParameterGroupParameter extends js.Object {
  /**
    * Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
    */
  var applyMethod: js.UndefOr[String] = js.undefined
  /**
    * The name of the documentDB parameter.
    */
  var name: String
  /**
    * The value of the documentDB parameter.
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

