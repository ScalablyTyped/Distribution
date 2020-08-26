package typings.screeps

import typings.screeps.anon.StoreRESOURCEENERGYfalse
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
     with AnyOwnedStructure
     with AnyStoreStructure
     with ConcreteStructure[js.Any] {
  /**
    * The amount of energy containing in the spawn.
    * @deprecated An alias for .store[RESOURCE_ENERGY].
    */
  var energy: Double = js.native
  /**
    * The total amount of energy the spawn can contain
    * @deprecated An alias for .store.getCapacity(RESOURCE_ENERGY).
    */
  var energyCapacity: Double = js.native
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
  var name: String = js.native
  /**
    * If the spawn is in process of spawning a new creep, this object will contain the new creep’s information, or null otherwise.
    */
  var spawning: Spawning | Null = js.native
  /**
    * A Store object that contains cargo of this structure.
    */
  var store: StoreRESOURCEENERGYfalse = js.native
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
  def canCreateCreep(body: js.Array[BodyPartConstant], name: String): ScreepsReturnCode = js.native
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
  def createCreep(body: js.Array[BodyPartConstant]): ScreepsReturnCode | String = js.native
  def createCreep(body: js.Array[BodyPartConstant], name: js.UndefOr[scala.Nothing], memory: CreepMemory): ScreepsReturnCode | String = js.native
  def createCreep(body: js.Array[BodyPartConstant], name: String): ScreepsReturnCode | String = js.native
  def createCreep(body: js.Array[BodyPartConstant], name: String, memory: CreepMemory): ScreepsReturnCode | String = js.native
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
    * Each execution increases the creep's timer by amount of ticks according to this formula: floor(600/body_size).
    *
    * Energy required for each execution is determined using this formula: ceil(creep_cost/2.5/body_size).
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
  def spawnCreep(body: js.Array[BodyPartConstant], name: String): ScreepsReturnCode = js.native
  def spawnCreep(body: js.Array[BodyPartConstant], name: String, opts: SpawnOptions): ScreepsReturnCode = js.native
}

