package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmountResourceType extends js.Object {
  var amount: Double
  var resourceType: ResourceConstant
  var targetId: String
}

object Anon_AmountResourceType {
  @scala.inline
  def apply(amount: Double, resourceType: ResourceConstant, targetId: String): Anon_AmountResourceType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AmountResourceType]
  }
}

