package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServicePlacementConstraint extends js.Object {
  var expression: js.UndefOr[Input[String]] = js.native
  var `type`: Input[String] = js.native
}

object ServicePlacementConstraint {
  @scala.inline
  def apply(`type`: Input[String], expression: Input[String] = null): ServicePlacementConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicePlacementConstraint]
  }
}

