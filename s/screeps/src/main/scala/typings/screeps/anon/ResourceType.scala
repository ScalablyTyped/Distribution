package typings.screeps.anon

import typings.screeps.ResourceConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceType extends js.Object {
  var amount: Double
  var resourceType: ResourceConstant
  var targetId: String
}

object ResourceType {
  @scala.inline
  def apply(amount: Double, resourceType: ResourceConstant, targetId: String): ResourceType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceType]
  }
}

