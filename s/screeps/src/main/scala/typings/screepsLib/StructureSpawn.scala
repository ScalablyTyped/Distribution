package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Spawns are your colony centers. This structure can create, renew, and recycle
  * creeps. All your spawns are accessible through `Game.spawns` hash list.
  * Spawns auto-regenerate a little amount of energy each tick, so that you can
  * easily recover even if all your creeps died.
  */
@js.native
trait StructureSpawn
  extends OwnedStructure[STRUCTURE_SPAWN]
     with AnyOwnedStructure {
  /**
    * The amount of energy containing in the spawn.
    */
  var energy: scala.Double = js.native
  /**
    * The total amount of energy the spawn can contain
    */
  var energyCapacity: scala.Double = js.native
  /**
    * A shorthand to `Memory.spawns[spawn.name]`. You can use it for quick access
    * the spawn’s specific memory data object.
    *
    * @see http://docs.screeps.com/global-objects.html#Memory-object
    */
  var memory: SpawnMemory = js.native
  /**
    * Spawn's name. You choose the name upon creating a new spawn, and it cannot
    * be changed later. This name is a hash key to access the spawn via the
    * `Game.spawns` object.
    */
  var name: java.lang.String = js.native
  /**
    * If the spawn is in process of spawning a new creep, this object will contain the new creep’s information, or null otherwise.
    */
  var spawning: Spawning | scala.Null = js.native
  /**
    * Check if a creep can be created.
    *
    * @deprecated This method is deprecated and will be removed soon. Please use `StructureSpawn.spawnCreep` with `dryRun` flag instead.
    * @param body An array describing the new creep’s body. Should contain 1 to 50 elements with one of these constants: WORK, MOVE, CARRY, ATTACK, RANGED_ATTACK, HEAL, TOUGH, CLAIM
    * @param name The name of a new creep.
    *
    * It should be unique creep name, i.e. the Game.creeps object should not contain another creep with the same name (hash key).
    *
    * If not defined, a random name will be generated.
    */
  def canCreateCreep(body: js.Array[BodyPartConstant]): ScreepsReturnCode = js.native
  def canCreateCreep(body: js.Array[BodyPartConstant], name: java.lang.String): ScreepsReturnCode = js.native
  /**
    * Start the creep spawning process.
    *
    * @deprecated This method is deprecated and will be removed soon. Please use `StructureSpawn.spawnCreep` instead.
    * @param body An array describing the new creep’s body. Should contain 1 to 50 elements with one of these constants: WORK, MOVE, CARRY, ATTACK, RANGED_ATTACK, HEAL, TOUGH, CLAIM
    * @param name The name of a new creep.
    *
    * It should be unique creep name, i.e. the Game.creeps object should not contain another creep with the same name (hash key).
    *
    * If not defined, a random name will be generated.
    * @param memory The memory of a new creep. If provided, it will be immediately stored into Memory.creeps[name].
    * @returns The name of a new creep or one of these error codes:
    * ```
    * ERR_NOT_OWNER            -1  You are not the owner of this spawn.
    * ERR_NAME_EXISTS          -3  There is a creep with the same name already.
    * ERR_BUSY                 -4  The spawn is already in process of spawning another creep.
    * ERR_NOT_ENOUGH_ENERGY    -6  The spawn and its extensions contain not enough energy to create a creep with the given body.
    * ERR_INVALID_ARGS         -10 Body is not properly described.
    * ERR_RCL_NOT_ENOUGH       -14 Your Room Controller level is not enough to use this spawn.
    * ```
    */
  def createCreep(body: js.Array[BodyPartConstant]): ScreepsReturnCode | java.lang.String = js.native
  def createCreep(body: js.Array[BodyPartConstant], name: java.lang.String): ScreepsReturnCode | java.lang.String = js.native
  def createCreep(body: js.Array[BodyPartConstant], name: java.lang.String, memory: CreepMemory): ScreepsReturnCode | java.lang.String = js.native
  /**
    * Kill the creep and drop up to 100% of resources spent on its spawning and boosting depending on remaining life time. The target should be at adjacent square.
    * @param target The target creep object.
    */
  def recycleCreep(target: Creep): ScreepsReturnCode = js.native
  /**
    * Increase the remaining time to live of the target creep.
    *
    * The target should be at adjacent square.
    *
    * The spawn should not be busy with the spawning process.
    *
    * Each execution increases the creep's timer by amount of ticks according to this formula: floor(500/body_size).
    *
    * Energy required for each execution is determined using this formula: ceil(creep_cost/3/body_size).
    * @param target The target creep object.
    */
  def renewCreep(target: Creep): ScreepsReturnCode = js.native
  /**
    * Start the creep spawning process. The required energy amount can be withdrawn from all spawns and extensions in the room.
    *
    * @param body An array describing the new creep’s body. Should contain 1 to 50 elements with one of these constants:
    *  * WORK
    *  * MOVE
    *  * CARRY
    *  * ATTACK
    *  * RANGED_ATTACK
    *  * HEAL
    *  * TOUGH
    *  * CLAIM
    * @param name The name of a new creep. It must be a unique creep name, i.e. the Game.creeps object should not contain another creep with the same name (hash key).
    * @param opts An object with additional options for the spawning process.
    * @returns One of the following codes:
    * ```
    * OK                       0   The operation has been scheduled successfully.
    * ERR_NOT_OWNER            -1  You are not the owner of this spawn.
    * ERR_NAME_EXISTS          -3  There is a creep with the same name already.
    * ERR_BUSY                 -4  The spawn is already in process of spawning another creep.
    * ERR_NOT_ENOUGH_ENERGY    -6  The spawn and its extensions contain not enough energy to create a creep with the given body.
    * ERR_INVALID_ARGS         -10 Body is not properly described or name was not provided.
    * ERR_RCL_NOT_ENOUGH       -14 Your Room Controller level is insufficient to use this spawn.
    * ```
    */
  def spawnCreep(body: js.Array[BodyPartConstant], name: java.lang.String): ScreepsReturnCode = js.native
  def spawnCreep(body: js.Array[BodyPartConstant], name: java.lang.String, opts: SpawnOptions): ScreepsReturnCode = js.native
}

@JSGlobal("StructureSpawn")
@js.native
class StructureSpawnCls protected () extends StructureSpawn {
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
  override var structureType: STRUCTURE_SPAWN = js.native
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

