package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResourceType extends js.Object {
  var amount: Double
  var resourceType: ResourceConstant
  var targetId: String
}

object AnonResourceType {
  @scala.inline
  def apply(amount: Double, resourceType: ResourceConstant, targetId: String): AnonResourceType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResourceType]
  }
}

