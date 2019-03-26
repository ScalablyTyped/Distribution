package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creeps are your units.
  * Creeps can move, harvest energy, construct structures, attack another creeps, and perform other actions.
  * Each creep consists of up to 50 body parts with the following possible types:
  */
@js.native
trait Creep extends RoomObject {
  /**
    * An array describing the creep's body.
    */
  var body: js.Array[BodyPartDefinition] = js.native
  /**
    * An object with the creep's cargo contents.
    */
  var carry: StoreDefinition = js.native
  /**
    * The total amount of resources the creep can carry.
    */
  var carryCapacity: scala.Double = js.native
  /**
    * The movement fatigue indicator. If it is greater than zero, the creep cannot move.
    */
  var fatigue: scala.Double = js.native
  /**
    * The current amount of hit points of the creep.
    */
  var hits: scala.Double = js.native
  /**
    * The maximum amount of hit points of the creep.
    */
  var hitsMax: scala.Double = js.native
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  var id: java.lang.String = js.native
  /**
    * A shorthand to `Memory.creeps[creep.name]`. You can use it for quick access the creep’s specific memory data object.
    */
  var memory: CreepMemory = js.native
  /**
    * Whether it is your creep or foe.
    */
  var my: scala.Boolean = js.native
  /**
    * Creep’s name. You can choose the name while creating a new creep, and it cannot be changed later. This name is a hash key to access the creep via the `Game.creeps` object.
    */
  var name: java.lang.String = js.native
  /**
    * An object with the creep’s owner info.
    */
  var owner: Owner = js.native
  /**
    * The link to the Room object. Always defined because creeps give visibility into the room they're in.
    */
  @JSName("room")
  var room_Creep: Room = js.native
  /**
    * The text message that the creep was saying at the last tick.
    */
  var saying: java.lang.String = js.native
  /**
    * Whether this creep is still being spawned.
    */
  var spawning: scala.Boolean = js.native
  /**
    * The remaining amount of game ticks after which the creep will die.
    *
    * Will be `undefined` if the creep is still spawning.
    */
  var ticksToLive: js.UndefOr[scala.Double] = js.native
  /**
    * Attack another creep or structure in a short-ranged attack. Needs the
    * ATTACK body part. If the target is inside a rampart, then the rampart is
    * attacked instead.
    *
    * The target has to be at adjacent square to the creep. If the target is a
    * creep with ATTACK body parts and is not inside a rampart, it will
    * automatically hit back at the attacker.
    *
    * @returns Result Code: OK, ERR_NOT_OWNER, ERR_BUSY, ERR_INVALID_TARGET, ERR_NOT_IN_RANGE, ERR_NO_BODYPART
    */
  def attack(target: Creep): CreepActionReturnCode = js.native
  def attack(target: Structure[StructureConstant]): CreepActionReturnCode = js.native
  /**
    * Decreases the controller's downgrade or reservation timer for 1 tick per
    * every 5 `CLAIM` body parts (so the creep must have at least 5x`CLAIM`).
    *
    * The controller under attack cannot be upgraded for the next 1,000 ticks.
    * The target has to be at adjacent square to the creep.
    *
    * @returns Result Code: OK, ERR_NOT_OWNER, ERR_BUSY, ERR_INVALID_TARGET, ERR_NOT_IN_RANGE, ERR_NO_BODYPART, ERR_TIRED
    */
  def attackController(target: StructureController): CreepActionReturnCode = js.native
  /**
    * Build a structure at the target construction site using carried energy.
    * Needs WORK and CARRY body parts.
    *
    * The target has to be within 3 squares range of the creep.
    *
    * @param target The target object to be attacked.
    * @returns Result Code: OK, ERR_NOT_OWNER, ERR_BUSY, ERR_NOT_ENOUGH_RESOURCES, ERR_INVALID_TARGET, ERR_NOT_IN_RANGE, ERR_NO_BODYPART, ERR_RCL_NOT_ENOUGH
    */
  def build(target: ConstructionSite[BuildableStructureConstant]): CreepActionReturnCode | ERR_NOT_ENOUGH_RESOURCES | ERR_RCL_NOT_ENOUGH = js.native
  /**
    * Cancel the order given during the current game tick.
    * @param methodName The name of a creep's method to be cancelled.
    * @returns Result Code: OK, ERR_NOT_FOUND
    */
  def cancelOrder(methodName: java.lang.String): OK | ERR_NOT_FOUND = js.native
  /**
    * Requires the CLAIM body part.
    *
    * If applied to a neutral controller, claims it under your control.
    * If applied to a hostile controller, decreases its downgrade or reservation timer depending on the CLAIM body parts count.
    *
    * The target has to be at adjacent square to the creep.
    * @param target The target controller object.
    * @returns Result Code: OK, ERR_NOT_OWNER, ERR_BUSY, ERR_INVALID_TARGET, ERR_FULL, ERR_NOT_IN_RANGE, ERR_NO_BODYPART, ERR_GCL_NOT_ENOUGH
    */
  def claimController(target: StructureController): CreepActionReturnCode | ERR_FULL | ERR_GCL_NOT_ENOUGH = js.native
  /**
    * Dismantles any (even hostile) structure returning 50% of the energy spent on its repair.
    *
    * Requires the WORK body part. If the creep has an empty CARRY body part, the energy is put into it; otherwise it is dropped on the ground.
    *
    * The target has to be at adjacent square to the creep.
    * @param target The target structure.
    */
  def dismantle(target: Structure[StructureConstant]): CreepActionReturnCode = js.native
  /**
    * Drop this resource on the ground.
    * @param resourceType One of the RESOURCE_* constants.
    * @param amount The amount of resource units to be dropped. If omitted, all the available carried amount is used.
    */
  def drop(resourceType: ResourceConstant): OK | ERR_NOT_OWNER | ERR_BUSY | ERR_NOT_ENOUGH_RESOURCES = js.native
  def drop(resourceType: ResourceConstant, amount: scala.Double): OK | ERR_NOT_OWNER | ERR_BUSY | ERR_NOT_ENOUGH_RESOURCES = js.native
  /**
    * Add one more available safe mode activation to a room controller. The creep has to be at adjacent square to the target room controller and have 1000 ghodium resource.
    * @param target The target room controller.
    * @returns Result Code: OK, ERR_NOT_OWNER, ERR_BUSY, ERR_NOT_ENOUGH_RESOURCES, ERR_INVALID_TARGET, ERR_NOT_IN_RANGE
    */
  def generateSafeMode(target: StructureController): CreepActionReturnCode = js.native
  /**
    * Get the quantity of live body parts of the given type. Fully damaged parts do not count.
    * @param type A body part type, one of the following body part constants: MOVE, WORK, CARRY, ATTACK, RANGED_ATTACK, HEAL, TOUGH, CLAIM
    */
  def getActiveBodyparts(`type`: BodyPartConstant): scala.Double = js.native
  def harvest(target: Mineral[MineralConstant]): CreepActionReturnCode | ERR_NOT_FOUND | ERR_NOT_ENOUGH_RESOURCES = js.native
  /**
    * Harvest energy from the source.
    *
    * Needs the WORK body part.
    *
    * If the creep has an empty CARRY body part, the harvested energy is put into it; otherwise it is dropped on the ground.
    *
    * The target has to be at an adjacent square to the creep.
    * @param target The source object to be harvested.
    */
  def harvest(target: Source): CreepActionReturnCode | ERR_NOT_FOUND | ERR_NOT_ENOUGH_RESOURCES = js.native
  /**
    * Heal self or another creep. It will restore the target creep’s damaged body parts function and increase the hits counter.
    *
    * Needs the HEAL body part.
    *
    * The target has to be at adjacent square to the creep.
    * @param target The target creep object.
    */
  def heal(target: Creep): CreepActionReturnCode = js.native
  /**
    * Move the creep one square in the specified direction. Needs the MOVE body part.
    * @param direction
    */
  def move(direction: DirectionConstant): CreepMoveReturnCode = js.native
  def moveByPath(path: java.lang.String): CreepMoveReturnCode | ERR_NOT_FOUND | ERR_INVALID_ARGS = js.native
  /**
    * Move the creep using the specified predefined path. Needs the MOVE body part.
    * @param path A path value as returned from Room.findPath or RoomPosition.findPathTo methods. Both array form and serialized string form are accepted.
    */
  def moveByPath(path: js.Array[PathStep | RoomPosition]): CreepMoveReturnCode | ERR_NOT_FOUND | ERR_INVALID_ARGS = js.native
  def moveTo(target: Anon_Pos): CreepMoveReturnCode | ERR_NO_PATH | ERR_INVALID_TARGET | ERR_NOT_FOUND = js.native
  def moveTo(target: Anon_Pos, opts: MoveToOpts): CreepMoveReturnCode | ERR_NO_PATH | ERR_INVALID_TARGET | ERR_NOT_FOUND = js.native
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
  def moveTo(x: scala.Double, y: scala.Double): CreepMoveReturnCode | ERR_NO_PATH | ERR_INVALID_TARGET = js.native
  def moveTo(x: scala.Double, y: scala.Double, opts: MoveToOpts): CreepMoveReturnCode | ERR_NO_PATH | ERR_INVALID_TARGET = js.native
  /**
    * Toggle auto notification when the creep is under attack. The notification will be sent to your account email. Turned on by default.
    * @param enabled Whether to enable notification or disable.
    */
  def notifyWhenAttacked(enabled: scala.Boolean): OK | ERR_NOT_OWNER | ERR_BUSY | ERR_INVALID_ARGS = js.native
  /**
    * Pick up an item (a dropped piece of energy). Needs the CARRY body part. The target has to be at adjacent square to the creep or at the same square.
    * @param target The target object to be picked up.
    */
  def pickup(target: Resource[ResourceConstant]): CreepActionReturnCode | ERR_FULL = js.native
  /**
    * A ranged attack against another creep or structure.
    *
    * Needs the RANGED_ATTACK body part. If the target is inside a rampart, the rampart is attacked instead.
    *
    * The target has to be within 3 squares range of the creep.
    * @param target The target object to be attacked.
    */
  def rangedAttack(target: Creep): CreepActionReturnCode = js.native
  def rangedAttack(target: Structure[StructureConstant]): CreepActionReturnCode = js.native
  /**
    * Heal another creep at a distance.
    *
    * It will restore the target creep’s damaged body parts function and increase the hits counter.
    *
    * Needs the HEAL body part. The target has to be within 3 squares range of the creep.
    * @param target The target creep object.
    */
  def rangedHeal(target: Creep): CreepActionReturnCode = js.native
  /**
    * A ranged attack against all hostile creeps or structures within 3 squares range.
    *
    * Needs the RANGED_ATTACK body part.
    *
    * The attack power depends on the range to each target. Friendly units are not affected.
    */
  def rangedMassAttack(): OK | ERR_NOT_OWNER | ERR_BUSY | ERR_NO_BODYPART = js.native
  /**
    * Repair a damaged structure using carried energy. Needs the WORK and CARRY body parts. The target has to be within 3 squares range of the creep.
    * @param target he target structure to be repaired.
    */
  def repair(target: Structure[StructureConstant]): CreepActionReturnCode | ERR_NOT_ENOUGH_RESOURCES = js.native
  /**
    * Temporarily block a neutral controller from claiming by other players.
    *
    * Each tick, this command increases the counter of the period during which the controller is unavailable by 1 tick per each CLAIM body part.
    *
    * The maximum reservation period to maintain is 5,000 ticks.
    *
    * The target has to be at adjacent square to the creep....
    * @param target The target controller object to be reserved.
    * @return Result code: OK, ERR_NOT_OWNER, ERR_BUSY, ERR_INVALID_TARGET, ERR_NOT_IN_RANGE, ERR_NO_BODYPART
    */
  def reserveController(target: StructureController): CreepActionReturnCode = js.native
  /**
    * Display a visual speech balloon above the creep with the specified message.
    *
    * The message will disappear after a few seconds. Useful for debugging purposes.
    *
    * Only the creep's owner can see the speech message unless toPublic is true.
    * @param message The message to be displayed. Maximum length is 10 characters.
    * @param set to 'true' to allow other players to see this message. Default is 'false'.
    */
  def say(message: java.lang.String): OK | ERR_NOT_OWNER | ERR_BUSY = js.native
  def say(message: java.lang.String, toPublic: scala.Boolean): OK | ERR_NOT_OWNER | ERR_BUSY = js.native
  /**
    * Sign a controller with a random text visible to all players. This text will appear in the room UI, in the world map, and can be accessed via the API.
    * You can sign unowned and hostile controllers. The target has to be at adjacent square to the creep. Pass an empty string to remove the sign.
    * @param target The target controller object to be signed.
    * @param text The sign text. The maximum text length is 100 characters.
    * @returns Result Code: OK, ERR_BUSY, ERR_INVALID_TARGET, ERR_NOT_IN_RANGE
    */
  def signController(target: StructureController, text: java.lang.String): OK | ERR_BUSY | ERR_INVALID_TARGET | ERR_NOT_IN_RANGE = js.native
  /**
    * Kill the creep immediately.
    */
  def suicide(): OK | ERR_NOT_OWNER | ERR_BUSY = js.native
  /**
    * Transfer resource from the creep to another object. The target has to be at adjacent square to the creep.
    * @param target The target object.
    * @param resourceType One of the RESOURCE_* constants
    * @param amount The amount of resources to be transferred. If omitted, all the available carried amount is used.
    */
  def transfer(target: Creep, resourceType: ResourceConstant): ScreepsReturnCode = js.native
  def transfer(target: Creep, resourceType: ResourceConstant, amount: scala.Double): ScreepsReturnCode = js.native
  def transfer(target: Structure[StructureConstant], resourceType: ResourceConstant): ScreepsReturnCode = js.native
  def transfer(target: Structure[StructureConstant], resourceType: ResourceConstant, amount: scala.Double): ScreepsReturnCode = js.native
  /**
    * Upgrade your controller to the next level using carried energy.
    *
    * Upgrading controllers raises your Global Control Level in parallel.
    *
    * Needs WORK and CARRY body parts.
    *
    * The target has to be at adjacent square to the creep.
    *
    * A fully upgraded level 8 controller can't be upgraded with the power over 15 energy units per tick regardless of creeps power.
    *
    * The cumulative effect of all the creeps performing upgradeController in the current tick is taken into account.
    * @param target The target controller object to be upgraded.
    */
  def upgradeController(target: StructureController): ScreepsReturnCode = js.native
  /**
    * Withdraw resources from a structure.
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
  def withdraw(target: Structure[StructureConstant], resourceType: ResourceConstant, amount: scala.Double): ScreepsReturnCode = js.native
  def withdraw(target: Tombstone, resourceType: ResourceConstant): ScreepsReturnCode = js.native
  def withdraw(target: Tombstone, resourceType: ResourceConstant, amount: scala.Double): ScreepsReturnCode = js.native
}

@JSGlobal("Creep")
@js.native
class CreepCls protected () extends Creep {
  def this(id: java.lang.String) = this()
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
}

