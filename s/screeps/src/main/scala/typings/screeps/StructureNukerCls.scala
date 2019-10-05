package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StructureNuker")
@js.native
class StructureNukerCls protected () extends StructureNuker {
  def this(id: String) = this()
  /**
    * The amount of game ticks the link has to wait until the next transfer is possible.
    */
  /* CompleteClass */
  override var cooldown: Double = js.native
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  override var effects: js.Array[RoomObjectEffect] = js.native
  /**
    * The amount of energy contained in this structure.
    */
  /* CompleteClass */
  override var energy: Double = js.native
  /**
    * The total amount of energy this structure can contain.
    */
  /* CompleteClass */
  override var energyCapacity: Double = js.native
  /**
    * The amount of energy contained in this structure.
    */
  /* CompleteClass */
  override var ghodium: Double = js.native
  /**
    * The total amount of energy this structure can contain.
    */
  /* CompleteClass */
  override var ghodiumCapacity: Double = js.native
  /**
    * The current amount of hit points of the structure.
    */
  /* CompleteClass */
  override var hits: Double = js.native
  /**
    * The total amount of hit points of the structure.
    */
  /* CompleteClass */
  override var hitsMax: Double = js.native
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  /* CompleteClass */
  override var id: String = js.native
  /**
    * Whether this is your own structure. Walls and roads don't have this property as they are considered neutral structures.
    */
  /* CompleteClass */
  override var my: Boolean = js.native
  /**
    * An object with the structure’s owner info (if present) containing the following properties: username
    */
  /* CompleteClass */
  override var owner: Owner = js.native
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: RoomPosition = js.native
  /**
    * If you can get an instance of a Structure, you can see it.
    * If you can see the Structure, you can see the room it's in.
    */
  /* CompleteClass */
  @JSName("room")
  override var room_Structure: Room = js.native
  /**
    * One of the STRUCTURE_* constants.
    */
  /* CompleteClass */
  override var structureType: STRUCTURE_NUKER = js.native
  /**
    * Destroy this structure immediately.
    */
  /* CompleteClass */
  override def destroy(): ScreepsReturnCode = js.native
  /**
    * Check whether this structure can be used. If the room controller level is not enough, then this method will return false, and the structure will be highlighted with red in the game.
    */
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  /**
    * Launch a nuke to the specified position.
    * @param pos The target room position.
    */
  /* CompleteClass */
  override def launchNuke(pos: RoomPosition): ScreepsReturnCode = js.native
  /**
    * Toggle auto notification when the structure is under attack. The notification will be sent to your account email. Turned on by default.
    * @param enabled Whether to enable notification or disable.
    */
  /* CompleteClass */
  override def notifyWhenAttacked(enabled: Boolean): ScreepsReturnCode = js.native
}

