package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Remotely transfers energy to another Link in the same room.
  */
@js.native
trait StructureLink
  extends OwnedStructure[STRUCTURE_LINK]
     with AnyOwnedStructure {
  /**
    * The amount of game ticks the link has to wait until the next transfer is possible.
    */
  var cooldown: scala.Double = js.native
  /**
    * The amount of energy containing in the link.
    */
  var energy: scala.Double = js.native
  /**
    * The total amount of energy the link can contain.
    */
  var energyCapacity: scala.Double = js.native
  /**
    * Transfer energy from the link to another link or a creep.
    *
    * If the target is a creep, it has to be at adjacent square to the link.
    *
    * If the target is a link, it can be at any location in the same room.
    *
    * Remote transfer process implies 3% energy loss and cooldown delay depending on the distance.
    * @param target The target object.
    * @param amount The amount of energy to be transferred. If omitted, all the available energy is used.
    */
  def transferEnergy(target: Creep): ScreepsReturnCode = js.native
  def transferEnergy(target: Creep, amount: scala.Double): ScreepsReturnCode = js.native
  def transferEnergy(target: StructureLink): ScreepsReturnCode = js.native
  def transferEnergy(target: StructureLink, amount: scala.Double): ScreepsReturnCode = js.native
}

@JSGlobal("StructureLink")
@js.native
class StructureLinkCls protected () extends StructureLink {
  def this(id: java.lang.String) = this()
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  override var effects: js.Array[RoomObjectEffect] = js.native
  /**
    * The current amount of hit points of the structure.
    */
  /* CompleteClass */
  override var hits: scala.Double = js.native
  /**
    * The total amount of hit points of the structure.
    */
  /* CompleteClass */
  override var hitsMax: scala.Double = js.native
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /**
    * Whether this is your own structure. Walls and roads don't have this property as they are considered neutral structures.
    */
  /* CompleteClass */
  override var my: scala.Boolean = js.native
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
  override var structureType: STRUCTURE_LINK = js.native
  /**
    * Destroy this structure immediately.
    */
  /* CompleteClass */
  override def destroy(): ScreepsReturnCode = js.native
  /**
    * Check whether this structure can be used. If the room controller level is not enough, then this method will return false, and the structure will be highlighted with red in the game.
    */
  /* CompleteClass */
  override def isActive(): scala.Boolean = js.native
  /**
    * Toggle auto notification when the structure is under attack. The notification will be sent to your account email. Turned on by default.
    * @param enabled Whether to enable notification or disable.
    */
  /* CompleteClass */
  override def notifyWhenAttacked(enabled: scala.Boolean): ScreepsReturnCode = js.native
}

