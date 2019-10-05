package typings.atPulumiAws.typesOutputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceOrderedPlacementStrategy extends js.Object {
  var field: js.UndefOr[String] = js.undefined
  var `type`: String
}

object ServiceOrderedPlacementStrategy {
  @scala.inline
  def apply(`type`: String, field: String = null): ServiceOrderedPlacementStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[ServiceOrderedPlacementStrategy]
  }
}

