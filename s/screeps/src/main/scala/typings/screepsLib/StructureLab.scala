package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Produces mineral compounds from base minerals and boosts creeps.
  */
@js.native
trait StructureLab
  extends OwnedStructure[STRUCTURE_LAB]
     with AnyOwnedStructure {
  /**
    * The amount of game ticks the lab has to wait until the next reaction is possible.
    */
  var cooldown: scala.Double = js.native
  /**
    * The amount of energy containing in the lab. Energy is used for boosting creeps.
    */
  var energy: scala.Double = js.native
  /**
    * The total amount of energy the lab can contain.
    */
  var energyCapacity: scala.Double = js.native
  /**
    * The amount of mineral resources containing in the lab.
    */
  var mineralAmount: scala.Double = js.native
  /**
    * The total amount of minerals the lab can contain.
    */
  var mineralCapacity: scala.Double = js.native
  /**
    * The type of minerals containing in the lab. Labs can contain only one mineral type at the same time.
    * Null in case there is no mineral resource in the lab.
    */
  var mineralType: _ResourceConstantSansEnergy | scala.Null = js.native
  /**
    * Boosts creep body part using the containing mineral compound. The creep has to be at adjacent square to the lab. Boosting one body part consumes 30 mineral units and 20 energy units.
    * @param creep The target creep.
    * @param bodyPartsCount The number of body parts of the corresponding type to be boosted.
    *
    * Body parts are always counted left-to-right for TOUGH, and right-to-left for other types.
    *
    * If undefined, all the eligible body parts are boosted.
    */
  def boostCreep(creep: Creep): ScreepsReturnCode = js.native
  def boostCreep(creep: Creep, bodyPartsCount: scala.Double): ScreepsReturnCode = js.native
  /**
    * Produce mineral compounds using reagents from two another labs. Each lab has to be within 2 squares range. The same input labs can be used by many output labs
    * @param lab1 The first source lab.
    * @param lab2 The second source lab.
    */
  def runReaction(lab1: StructureLab, lab2: StructureLab): ScreepsReturnCode = js.native
}

@JSGlobal("StructureLab")
@js.native
class StructureLabCls protected () extends StructureLab {
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
    * The link to the Room object. May be undefined in case if an object is a
    * flag or a construction site and is placed in a room that is not visible
    * to you.
    */
  /* CompleteClass */
  override var room: js.UndefOr[Room] = js.native
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
  override var structureType: STRUCTURE_LAB = js.native
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

