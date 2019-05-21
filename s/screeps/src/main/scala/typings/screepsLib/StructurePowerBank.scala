package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Non-player structure. Contains power resource which can be obtained by destroying the structure. Hits the attacker creep back on each attack.
  */
trait StructurePowerBank
  extends OwnedStructure[STRUCTURE_POWER_BANK]
     with AnyOwnedStructure {
  /**
    * The amount of power containing.
    */
  var power: scala.Double
  /**
    * The amount of game ticks when this structure will disappear.
    */
  var ticksToDecay: scala.Double
}

@JSGlobal("StructurePowerBank")
@js.native
class StructurePowerBankCls protected () extends StructurePowerBank {
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
    * The amount of power containing.
    */
  /* CompleteClass */
  override var power: scala.Double = js.native
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
  override var structureType: STRUCTURE_POWER_BANK = js.native
  /**
    * The amount of game ticks when this structure will disappear.
    */
  /* CompleteClass */
  override var ticksToDecay: scala.Double = js.native
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

object StructurePowerBank {
  @scala.inline
  def apply(
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: () => scala.Boolean,
    my: scala.Boolean,
    notifyWhenAttacked: scala.Boolean => ScreepsReturnCode,
    owner: Owner,
    pos: RoomPosition,
    power: scala.Double,
    room: Room,
    structureType: STRUCTURE_POWER_BANK,
    ticksToDecay: scala.Double
  ): StructurePowerBank = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), effects = effects, hits = hits, hitsMax = hitsMax, id = id, isActive = js.Any.fromFunction0(isActive), my = my, notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), owner = owner, pos = pos, power = power, room = room, structureType = structureType, ticksToDecay = ticksToDecay)
  
    __obj.asInstanceOf[StructurePowerBank]
  }
}

