package typings.atPulumiAws.typesOutputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicePlacementConstraint extends js.Object {
  var expression: js.UndefOr[String] = js.undefined
  var `type`: String
}

object ServicePlacementConstraint {
  @scala.inline
  def apply(`type`: String, expression: String = null): ServicePlacementConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    __obj.asInstanceOf[ServicePlacementConstraint]
  }
}

