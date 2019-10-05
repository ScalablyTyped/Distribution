package typings.atPulumiAws.typesInputMod.neptune

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterParameterGroupParameter extends js.Object {
  /**
    * Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
    */
  var applyMethod: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the neptune parameter.
    */
  var name: Input[String]
  /**
    * The value of the neptune parameter.
    */
  var value: Input[String]
}

object ClusterParameterGroupParameter {
  @scala.inline
  def apply(name: Input[String], value: Input[String], applyMethod: Input[String] = null): ClusterParameterGroupParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (applyMethod != null) __obj.updateDynamic("applyMethod")(applyMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterParameterGroupParameter]
  }
}

