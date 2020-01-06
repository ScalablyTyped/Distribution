package typings.atPulumiAws.typesInputMod.ecs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceOrderedPlacementStrategy extends js.Object {
  var field: js.UndefOr[Input[String]] = js.native
  var `type`: Input[String] = js.native
}

object ServiceOrderedPlacementStrategy {
  @scala.inline
  def apply(`type`: Input[String], field: Input[String] = null): ServiceOrderedPlacementStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceOrderedPlacementStrategy]
  }
}

