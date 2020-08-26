package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mineral deposit object. Can be harvested by creeps with a WORK body part using the extractor structure.
  * @see http://docs.screeps.com/api/#Mineral
  */
@js.native
trait Mineral[T /* <: MineralConstant */] extends RoomObject {
  /**
    * The density of this mineral deposit, one of the `DENSITY_*` constants.
    */
  var density: Double = js.native
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  var id: Id[this.type] = js.native
  /**
    * The remaining amount of resources.
    */
  var mineralAmount: Double = js.native
  /**
    * The resource type, one of the `RESOURCE_*` constants.
    */
  var mineralType: T = js.native
  /**
    * The remaining time after which the deposit will be refilled.
    */
  var ticksToRegeneration: Double = js.native
}

object Mineral {
  @scala.inline
  def apply[/* <: typings.screeps.MineralConstant */ T](
    density: Double,
    effects: js.Array[RoomObjectEffect],
    id: Id[Mineral[T]],
    mineralAmount: Double,
    mineralType: T,
    pos: RoomPosition,
    ticksToRegeneration: Double
  ): Mineral[T] = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mineralAmount = mineralAmount.asInstanceOf[js.Any], mineralType = mineralType.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], ticksToRegeneration = ticksToRegeneration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mineral[T]]
  }
  @scala.inline
  implicit class MineralOps[Self <: Mineral[_], /* <: typings.screeps.MineralConstant */ T] (val x: Self with Mineral[T]) extends AnyVal {
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
    def setDensity(value: Double): Self = this.set("density", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Id[Mineral[T]]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMineralAmount(value: Double): Self = this.set("mineralAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMineralType(value: T): Self = this.set("mineralType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTicksToRegeneration(value: Double): Self = this.set("ticksToRegeneration", value.asInstanceOf[js.Any])
  }
  
}

