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
  var id: String
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

@JSGlobal("ConstructionSite")
@js.native
class ConstructionSiteCls protected () extends ConstructionSite[BuildableStructureConstant] {
  def this(id: String) = this()
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  override var effects: js.Array[RoomObjectEffect] = js.native
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  /* CompleteClass */
  override var id: String = js.native
  /**
    * Whether this is your own construction site.
    */
  /* CompleteClass */
  override var my: Boolean = js.native
  /**
    * An object with the structure’s owner info.
    */
  /* CompleteClass */
  override var owner: Owner = js.native
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: RoomPosition = js.native
  /**
    * The current construction progress.
    */
  /* CompleteClass */
  override var progress: Double = js.native
  /**
    * The total construction progress needed for the structure to be built.
    */
  /* CompleteClass */
  override var progressTotal: Double = js.native
  /**
    * One of the `STRUCTURE_*` constants.
    */
  /* CompleteClass */
  override var structureType: BuildableStructureConstant = js.native
  /**
    * Remove the construction site.
    * @returns Result Code: OK, ERR_NOT_OWNER
    */
  /* CompleteClass */
  override def remove(): Double = js.native
}

object ConstructionSite {
  @scala.inline
  def apply[T /* <: BuildableStructureConstant */](
    effects: js.Array[RoomObjectEffect],
    id: String,
    my: Boolean,
    owner: Owner,
    pos: RoomPosition,
    progress: Double,
    progressTotal: Double,
    remove: () => Double,
    structureType: T,
    room: Room = null
  ): ConstructionSite[T] = {
    val __obj = js.Dynamic.literal(effects = effects, id = id, my = my, owner = owner, pos = pos, progress = progress, progressTotal = progressTotal, remove = js.Any.fromFunction0(remove), structureType = structureType.asInstanceOf[js.Any])
    if (room != null) __obj.updateDynamic("room")(room)
    __obj.asInstanceOf[ConstructionSite[T]]
  }
}

