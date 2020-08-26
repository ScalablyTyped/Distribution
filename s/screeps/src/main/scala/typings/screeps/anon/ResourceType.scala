package typings.screeps.anon

import typings.screeps.ResourceConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceType extends js.Object {
  var amount: Double = js.native
  var resourceType: ResourceConstant = js.native
  var targetId: String = js.native
}

object ResourceType {
  @scala.inline
  def apply(amount: Double, resourceType: ResourceConstant, targetId: String): ResourceType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceType]
  }
  @scala.inline
  implicit class ResourceTypeOps[Self <: ResourceType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: ResourceConstant): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetId(value: String): Self = this.set("targetId", value.asInstanceOf[js.Any])
  }
  
}

