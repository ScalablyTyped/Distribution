package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A site of a structure which is currently under construction.
  */
trait ConstructionSite[T /* <: BuildableStructureConstant */] extends RoomObject {
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  var id: Id[this.type]
  /**
    * Whether this is your own construction site.
    */
  var my: Boolean
  /**
    * An object with the structure’s owner info.
    */
  var owner: Owner
  /**
    * The current construction progress.
    */
  var progress: Double
  /**
    * The total construction progress needed for the structure to be built.
    */
  var progressTotal: Double
  /**
    * One of the `STRUCTURE_*` constants.
    */
  var structureType: T
  /**
    * Remove the construction site.
    * @returns Result Code: OK, ERR_NOT_OWNER
    */
  def remove(): Double
}

object ConstructionSite {
  @scala.inline
  def apply[/* <: typings.screeps.BuildableStructureConstant */ T](
    effects: js.Array[RoomObjectEffect],
    id: Id[ConstructionSite[T]],
    my: Boolean,
    owner: Owner,
    pos: RoomPosition,
    progress: Double,
    progressTotal: Double,
    remove: () => Double,
    structureType: T,
    room: Room = null
  ): ConstructionSite[T] = {
    val __obj = js.Dynamic.literal(effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], my = my.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], progressTotal = progressTotal.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), structureType = structureType.asInstanceOf[js.Any])
    if (room != null) __obj.updateDynamic("room")(room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructionSite[T]]
  }
}

