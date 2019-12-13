package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ConstructionSite")
@js.native
class ConstructionSiteCls protected () extends ConstructionSite[BuildableStructureConstant] {
  def this(id: Id[ConstructionSite[BuildableStructureConstant]]) = this()
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  override var effects: js.Array[RoomObjectEffect] = js.native
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  /* CompleteClass */
  override var id: Id[this.type] = js.native
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

