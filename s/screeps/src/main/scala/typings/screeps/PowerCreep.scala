package typings.screeps

import typings.screeps.anon.Pos
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Power Creeps are immortal "heroes" that are tied to your account and can be respawned in any PowerSpawn after death.
  * You can upgrade their abilities ("powers") up to your account Global Power Level (see `Game.gpl`).
  */
@js.native
trait PowerCreep
  extends RoomObject
     with AnyCreep {
  
  /**
    *
    * @param methodName Cancel the order given during the current game tick.
    */
  def cancelOrder(methodName: String): OK | ERR_NOT_OWNER | ERR_BUSY | ERR_NOT_FOUND = js.native
  
  /**
    * An object with the creep's cargo contents.
    * @deprecated An alias for Creep.store.
    */
  var carry: StoreDefinition = js.native
  
  /**
    * The total amount of resources the creep can carry.
    * @deprecated An alias for Creep.store.getCapacity().
    */
  var carryCapacity: Double = js.native
  
  /**
    * The power creep's class, one of the `POWER_CLASS` constants.
    */
  var className: PowerClassConstant = js.native
  
  /**
    * Delete the power creep permanently from your account.
    * It should NOT be spawned in the world. The creep is not deleted immediately, but a 24-hour delete time is started (see `deleteTime`).
    * You can cancel deletion by calling `delete(true)`.
    */
  def delete(): OK | ERR_NOT_OWNER | ERR_BUSY = js.native
  def delete(cancel: Boolean): OK | ERR_NOT_OWNER | ERR_BUSY = js.native
  
  /**
    * A timestamp when this creeep is marked to be permanently deleted from the account, or undefined otherwise.
    */
  var deleteTime: js.UndefOr[Double] = js.native
  
  /**
    * Drop this resource on the ground.
    * @param resourceType One of the RESOURCE_* constants.
    * @param amount The amount of resource units to be dropped. If omitted, all the available carried amount is used.
    */
  def drop(resourceType: ResourceConstant): OK | ERR_NOT_OWNER | ERR_BUSY | ERR_NOT_ENOUGH_RESOURCES = js.native
  def drop(resourceType: ResourceConstant, amount: Double): OK | ERR_NOT_OWNER | ERR_BUSY | ERR_NOT_ENOUGH_RESOURCES = js.native
  
  /**
    * Enable power usage in this room. The room controller should be at adjacent tile.
    * @param controller The room controller
    */
  def enableRoom(controller: StructureController): OK | ERR_NOT_OWNER | ERR_INVALID_TARGET | ERR_NOT_IN_RANGE = js.native
  
  /**
    * The current amount of hit points of the creep.
    */
  var hits: Double = js.native
  
  /**
    * The maximum amount of hit points of the creep.
    */
  var hitsMax: Double = js.native
  
  /**
    * A unique identifier. You can use `Game.getObjectById` method to retrieve an object instance by its id.
    */
  var id: Id[this.type] = js.native
  
  /**
    * The power creep's level.
    */
  var level: Double = js.native
  
  /**
    * A shorthand to `Memory.powerCreeps[creep.name]`. You can use it for quick access to the creep's specific memory data object.
    */
  var memory: PowerCreepMemory = js.native
  
  /**
    * Move the creep one square in the specified direction or towards a creep that is pulling it.
    *
    * Requires the MOVE body part if not being pulled.
    * @param direction The direction to move in (`TOP`, `TOP_LEFT`...)
    */
  def move(direction: DirectionConstant): CreepMoveReturnCode = js.native
  def move(target: Creep): OK | ERR_NOT_OWNER | ERR_BUSY | ERR_NOT_IN_RANGE | ERR_INVALID_ARGS = js.native
  
  def moveByPath(path: String): CreepMoveReturnCode | ERR_NOT_FOUND | ERR_INVALID_ARGS = js.native
  /**
    * Move the creep using the specified predefined path. Needs the MOVE body part.
    * @param path A path value as returned from Room.findPath or RoomPosition.findPathTo methods. Both array form and serialized string form are accepted.
    */
  def moveByPath(path: js.Array[PathStep | RoomPosition]): CreepMoveReturnCode | ERR_NOT_FOUND | ERR_INVALID_ARGS = js.native
  
  /**
    * Find the optimal path to the target within the same room and move to it.
    * A shorthand to consequent calls of pos.findPathTo() and move() methods.
    * If the target is in another room, then the corresponding exit will be used as a target.
    *
    * Needs the MOVE body part.
    * @param target Can be a RoomPosition object or any object containing RoomPosition.
    * @param opts An object containing pathfinding options flags (see Room.findPath for more info) or one of the following: reusePath, serializeMemory, noPathFinding
    */
  def moveTo(target: RoomPosition): CreepMoveReturnCode | ERR_NO_PATH | ERR_INVALID_TARGET | ERR_NOT_FOUND = js.native
  def moveTo(target: RoomPosition, opts: MoveToOpts): CreepMoveReturnCode | ERR_NO_PATH | ERR_INVALID_TARGET | ERR_NOT_FOUND = js.native
  def moveTo(target: Pos): CreepMoveReturnCode | ERR_NO_PATH | ERR_INVALID_TARGET | ERR_NOT_FOUND = js.native
  def moveTo(target: Pos, opts: MoveToOpts): CreepMoveReturnCode | ERR_NO_PATH | ERR_INVALID_TARGET | ERR_NOT_FOUND = js.native
  /**
    * Find the optimal path to the target within the same room and move to it.
    * A shorthand to consequent calls of pos.findPathTo() and move() methods.
    * If the target is in another room, then the corresponding exit will be used as a target.
    *
    * Needs the MOVE body part.
    * @param x X position of the target in the room.
    * @param y Y position of the target in the room.
    * @param opts An object containing pathfinding options flags (see Room.findPath for more info) or one of the following: reusePath, serializeMemory, noPathFinding
    */
  def moveTo(x: Double, y: Double): CreepMoveReturnCode | ERR_NO_PATH | ERR_INVALID_TARGET = js.native
  def moveTo(x: Double, y: Double, opts: MoveToOpts): CreepMoveReturnCode | ERR_NO_PATH | ERR_INVALID_TARGET = js.native
  
  /**
    * Whether it is your creep or foe.
    */
  var my: Boolean = js.native
  
  /**
    * Power creep name. You can choose the name while creating a new power creep, and `rename` it while unspawned. This name is a hash key to access the creep via the `Game.powerCreeps` object.
    */
  var name: String = js.native
  
  /**
    * Toggle auto notification when the creep is under attack. The notification will be sent to your account email. Turned on by default.
    * @param enabled Whether to enable notification or disable.
    */
  def notifyWhenAttacked(enabled: Boolean): OK | ERR_NOT_OWNER | ERR_BUSY | ERR_INVALID_ARGS = js.native
  
  /**
    * An object with the creep's owner information.
    */
  var owner: Owner = js.native
  
  /**
    * Pick up an item (a dropped piece of energy). Needs the CARRY body part. The target has to be at adjacent square to the creep or at the same square.
    * @param target The target object to be picked up.
    */
  def pickup(target: Resource[ResourceConstant]): CreepActionReturnCode | ERR_FULL = js.native
  
  /**
    * An object with the creep's available powers.
    */
  var powers: PowerCreepPowers = js.native
  
  /**
    * Rename the power creep. It must not be spawned in the world.
    */
  def rename(name: String): OK | ERR_NOT_OWNER | ERR_NAME_EXISTS | ERR_BUSY = js.native
  
  /**
    * Instantly restore time to live to the maximum using a Power Spawn or a Power Bank nearby. It has to be at adjacent tile.
    * @param target The target structure
    */
  def renew(target: StructurePowerBank): OK | ERR_NOT_OWNER | ERR_BUSY | ERR_INVALID_TARGET | ERR_NOT_IN_RANGE = js.native
  def renew(target: StructurePowerSpawn): OK | ERR_NOT_OWNER | ERR_BUSY | ERR_INVALID_TARGET | ERR_NOT_IN_RANGE = js.native
  
  /**
    * Display a visual speech balloon above the creep with the specified message.
    *
    * The message will disappear after a few seconds. Useful for debugging purposes.
    *
    * Only the creep's owner can see the speech message unless toPublic is true.
    * @param message The message to be displayed. Maximum length is 10 characters.
    * @param set to 'true' to allow other players to see this message. Default is 'false'.
    */
  def say(message: String): OK | ERR_NOT_OWNER | ERR_BUSY = js.native
  def say(message: String, toPublic: Boolean): OK | ERR_NOT_OWNER | ERR_BUSY = js.native
  
  /**
    * The text message that the creep was saying at the last tick.
    */
  var saying: String = js.native
  
  /**
    * The name of the shard where the power creeps is spawned, or undefined.
    */
  var shard: js.UndefOr[String] = js.native
  
  /**
    * Spawn this power creep in the specified Power Spawn.
    * @param powerSpawn Your Power Spawn structure
    */
  def spawn(powerSpawn: StructurePowerSpawn): OK | ERR_NOT_OWNER | ERR_BUSY | ERR_INVALID_TARGET | ERR_TIRED | ERR_RCL_NOT_ENOUGH = js.native
  
  /**
    * The timestamp when spawning or deleting this creep will become available. Undefined if the power creep is spawned in the world.
    * Note: This is a timestamp, not ticks as powerCreeps are not shard dependent.
    */
  var spawnCooldownTime: js.UndefOr[Double] = js.native
  
  /**
    * A Store object that contains cargo of this creep.
    */
  var store: StoreDefinition = js.native
  
  /**
    * Kill the power creep immediately. It will not be destroyed permanently, but will become unspawned, so that you can `spawn` it again.
    */
  def suicide(): OK | ERR_NOT_OWNER | ERR_BUSY = js.native
  
  /**
    * The remaining amount of game ticks after which the creep will die and become unspawned. Undefined if the creep is not spawned in the world.
    */
  var ticksToLive: js.UndefOr[Double] = js.native
  
  /**
    * Transfer resource from the creep to another object. The target has to be at adjacent square to the creep.
    * @param target The target object.
    * @param resourceType One of the RESOURCE_* constants
    * @param amount The amount of resources to be transferred. If omitted, all the available carried amount is used.
    */
  def transfer(target: AnyCreep, resourceType: ResourceConstant): ScreepsReturnCode = js.native
  def transfer(target: AnyCreep, resourceType: ResourceConstant, amount: Double): ScreepsReturnCode = js.native
  def transfer(target: Structure[StructureConstant], resourceType: ResourceConstant): ScreepsReturnCode = js.native
  def transfer(target: Structure[StructureConstant], resourceType: ResourceConstant, amount: Double): ScreepsReturnCode = js.native
  
  /**
    * Upgrade the creep, adding a new power ability to it or increasing the level of the existing power. You need one free Power Level in your account to perform this action.
    */
  def upgrade(power: PowerConstant): OK | ERR_NOT_OWNER | ERR_NOT_ENOUGH_RESOURCES | ERR_FULL | ERR_INVALID_ARGS = js.native
  
  /**
    * Apply one of the creep's powers on the specified target.
    */
  def usePower(power: PowerConstant): ScreepsReturnCode = js.native
  def usePower(power: PowerConstant, target: RoomObject): ScreepsReturnCode = js.native
  
  def withdraw(target: Ruin, resourceType: ResourceConstant): ScreepsReturnCode = js.native
  def withdraw(target: Ruin, resourceType: ResourceConstant, amount: Double): ScreepsReturnCode = js.native
  /**
    * Withdraw resources from a structure, tombstone, or ruin.
    *
    * The target has to be at adjacent square to the creep.
    *
    * Multiple creeps can withdraw from the same structure in the same tick.
    *
    * Your creeps can withdraw resources from hostile structures as well, in case if there is no hostile rampart on top of it.
    * @param target The target object.
    * @param resourceType The target One of the RESOURCE_* constants..
    * @param amount The amount of resources to be transferred. If omitted, all the available amount is used.
    */
  def withdraw(target: Structure[StructureConstant], resourceType: ResourceConstant): ScreepsReturnCode = js.native
  def withdraw(target: Structure[StructureConstant], resourceType: ResourceConstant, amount: Double): ScreepsReturnCode = js.native
  def withdraw(target: Tombstone, resourceType: ResourceConstant): ScreepsReturnCode = js.native
  def withdraw(target: Tombstone, resourceType: ResourceConstant, amount: Double): ScreepsReturnCode = js.native
}
