package typings.pulumiAws.outputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceOrderedPlacementStrategy extends js.Object {
  var field: js.UndefOr[String] = js.native
  var `type`: String = js.native
}

object ServiceOrderedPlacementStrategy {
  @scala.inline
  def apply(`type`: String, field: String = null): ServiceOrderedPlacementStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceOrderedPlacementStrategy]
  }
}

