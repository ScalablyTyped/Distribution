package typings
package screepsLib

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
  var id: java.lang.String
  /**
    * Whether this is your own construction site.
    */
  var my: scala.Boolean
  /**
    * An object with the structure’s owner info.
    */
  var owner: Owner
  /**
    * The current construction progress.
    */
  var progress: scala.Double
  /**
    * The total construction progress needed for the structure to be built.
    */
  var progressTotal: scala.Double
  /**
    * One of the `STRUCTURE_*` constants.
    */
  var structureType: T
  /**
    * Remove the construction site.
    * @returns Result Code: OK, ERR_NOT_OWNER
    */
  def remove(): scala.Double
}

@JSGlobal("ConstructionSite")
@js.native
class ConstructionSiteCls protected () extends ConstructionSite[BuildableStructureConstant] {
  def this(id: java.lang.String) = this()
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /**
    * Whether this is your own construction site.
    */
  /* CompleteClass */
  override var my: scala.Boolean = js.native
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
  override var progress: scala.Double = js.native
  /**
    * The total construction progress needed for the structure to be built.
    */
  /* CompleteClass */
  override var progressTotal: scala.Double = js.native
  /**
    * The link to the Room object. May be undefined in case if an object is a
    * flag or a construction site and is placed in a room that is not visible
    * to you.
    */
  /* CompleteClass */
  override var room: js.UndefOr[Room] = js.native
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
  override def remove(): scala.Double = js.native
}

object ConstructionSite {
  @scala.inline
  def apply[T /* <: BuildableStructureConstant */](
    id: java.lang.String,
    my: scala.Boolean,
    owner: Owner,
    pos: RoomPosition,
    progress: scala.Double,
    progressTotal: scala.Double,
    remove: () => scala.Double,
    structureType: T,
    room: Room = null
  ): ConstructionSite[T] = {
    val __obj = js.Dynamic.literal(id = id, my = my, owner = owner, pos = pos, progress = progress, progressTotal = progressTotal, remove = js.Any.fromFunction0(remove), structureType = structureType.asInstanceOf[js.Any])
    if (room != null) __obj.updateDynamic("room")(room)
    __obj.asInstanceOf[ConstructionSite[T]]
  }
}

