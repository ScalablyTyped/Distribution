package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A dropped piece of resource. It will decay after a while if not picked up. Dropped resource pile decays for ceil(amount/1000) units per tick.
  */
@js.native
trait Resource[T /* <: ResourceConstant */] extends RoomObject {
  /**
    * The amount of resource units containing.
    */
  var amount: Double = js.native
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  var id: Id[this.type] = js.native
  /**
    * One of the `RESOURCE_*` constants.
    */
  var resourceType: T = js.native
}

object Resource {
  @scala.inline
  def apply[/* <: typings.screeps.ResourceConstant */ T](
    amount: Double,
    effects: js.Array[RoomObjectEffect],
    id: Id[Resource[T]],
    pos: RoomPosition,
    resourceType: T
  ): Resource[T] = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource[T]]
  }
  @scala.inline
  implicit class ResourceOps[Self <: Resource[_], /* <: typings.screeps.ResourceConstant */ T] (val x: Self with Resource[T]) extends AnyVal {
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
    def setId(value: Id[Resource[T]]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: T): Self = this.set("resourceType", value.asInstanceOf[js.Any])
  }
  
}

