package typings.screepsArena.gamePrototypesMod

import typings.screepsArena.anon.Hits
import typings.screepsArena.anon.StoreResourceConstant
import typings.screepsArena.constantsMod.AnyCreep
import typings.screepsArena.constantsMod.CreepActionReturnCode
import typings.screepsArena.constantsMod.CreepMoveReturnCode
import typings.screepsArena.constantsMod.DirectionConstant
import typings.screepsArena.constantsMod.ERR_BUSY
import typings.screepsArena.constantsMod.ERR_FULL
import typings.screepsArena.constantsMod.ERR_INVALID_TARGET
import typings.screepsArena.constantsMod.ERR_NOT_ENOUGH_RESOURCES
import typings.screepsArena.constantsMod.ERR_NOT_FOUND
import typings.screepsArena.constantsMod.ERR_NOT_IN_RANGE
import typings.screepsArena.constantsMod.ERR_NOT_OWNER
import typings.screepsArena.constantsMod.ERR_NO_BODYPART
import typings.screepsArena.constantsMod.ERR_NO_PATH
import typings.screepsArena.constantsMod.OK
import typings.screepsArena.constantsMod.ResourceConstant
import typings.screepsArena.constantsMod.ScreepsReturnCode
import typings.screepsArena.gamePrototypesMod.^
import typings.screepsArena.pathFinderMod.MoveToOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Creep
  extends StObject
     with GameObject {
  
  /**
    * Attack another creep or structure in a short-ranged attack.
    * Requires the ATTACK body part.
    * The target has to be at an adjacent square to the creep.
    */
  def attack(target: AnyCreep): CreepActionReturnCode = js.native
  def attack(target: Structure[StructureConstant]): CreepActionReturnCode = js.native
  
  /**
    * An array describing the creep’s body. Each element contains the following properties:
    *     type: string (One of the body part types constants)
    *     hits: number (The remaining amount of hit points of this body part)
    */
  var body: js.Array[Hits] = js.native
  
  /**
    * Build a structure at the target construction site using carried energy.
    * Needs WORK and CARRY body parts.
    *
    * The target has to be within 3 squares range of the creep.
    *
    * @param target The target construction site to be built.
    * @returns Result Code: OK, ERR_NOT_OWNER, ERR_BUSY, ERR_NOT_ENOUGH_RESOURCES, ERR_INVALID_TARGET, ERR_NOT_IN_RANGE, ERR_NO_BODYPART, ERR_RCL_NOT_ENOUGH
    */
  def build(target: ConstructionSite): CreepActionReturnCode | ERR_NOT_ENOUGH_RESOURCES = js.native
  
  /**
    * Drop this resource on the ground.
    * @param resourceType One of the RESOURCE_* constants.
    * @param amount The amount of resource units to be dropped. If omitted, all the available carried amount is used.
    */
  def drop(resourceType: ResourceConstant): OK | ERR_NOT_OWNER | ERR_BUSY | ERR_NOT_ENOUGH_RESOURCES = js.native
  def drop(resourceType: ResourceConstant, amount: Double): OK | ERR_NOT_OWNER | ERR_BUSY | ERR_NOT_ENOUGH_RESOURCES = js.native
  
  /**
    * Fatigue indicator of the creep. It can move only when fatigue equals to 0.
    */
  var fatigue: Double = js.native
  
  /**
    * Harvest energy from the source or resource from minerals or deposits.
    *
    * Needs the WORK body part.
    *
    * If the creep has an empty CARRY body part, the harvested resource is put into it; otherwise it is dropped on the ground.
    *
    * The target has to be at an adjacent square to the creep.
    * @param target The source object to be harvested.
    */
  def harvest(target: Source): CreepActionReturnCode | ERR_NOT_FOUND | ERR_NOT_ENOUGH_RESOURCES = js.native
  
  /**
    * Heal self or another creep.
    * It will restore the target creep’s damaged body parts function and increase the hits counter.
    * Requires the HEAL body part.
    * The target has to be at an adjacent square to the creep.
    */
  def heal(target: AnyCreep): CreepActionReturnCode = js.native
  
  /**
    * The current amount of hit points of the creep.
    */
  var hits: Double = js.native
  
  /**
    * The maximum amount of hit points of the creep.
    */
  var hitsMax: Double = js.native
  
  /**
    * Move the creep one square in the specified direction. direction must be one of the following constants:
    */
  def move(direction: DirectionConstant): js.UndefOr[CreepMoveReturnCode] = js.native
  
  /**
    * Find the optimal path to the target within the same room and move to it.
    * A shorthand to consequent calls of findPathTo() and move() methods.
    * @param target target can be any object containing x and y properties.
    * @param opts opts is an optional object containing additional options. See /game/utils::findPath for details.
    */
  def moveTo(target: RoomPosition): js.UndefOr[CreepMoveReturnCode | ERR_NO_PATH | ERR_INVALID_TARGET] = js.native
  def moveTo(target: RoomPosition, opts: MoveToOpts): js.UndefOr[CreepMoveReturnCode | ERR_NO_PATH | ERR_INVALID_TARGET] = js.native
  
  /**
    * Whether it is your creep.
    */
  var my: Boolean = js.native
  
  /**
    * Pick up an item (a dropped piece of energy). Needs the CARRY body part. The target has to be at adjacent square to the creep or at the same square.
    * @param target The target object to be picked up.
    */
  def pickup(target: Resource): CreepActionReturnCode | ERR_FULL = js.native
  
  /**
    * Allow another creep to follow this creep. The fatigue generated for the target's move will be added to the creep instead of the target.
    *
    * Requires the MOVE body part. The target must be adjacent to the creep. The creep must move elsewhere, and the target must move towards the creep.
    * @param target The target creep to be pulled.
    */
  def pull(target: Creep): OK | ERR_NOT_OWNER | ERR_BUSY | ERR_INVALID_TARGET | ERR_NOT_IN_RANGE | ERR_NO_BODYPART = js.native
  
  /**
    * A ranged attack against another creep or structure. Requires the RANGED_ATTACK body part.
    * The target has to be within 3 squares range of the creep.
    */
  def rangedAttack(target: AnyCreep): CreepActionReturnCode = js.native
  def rangedAttack(target: Structure[StructureConstant]): CreepActionReturnCode = js.native
  
  /**
    * Heal another creep at a distance.
    * It will restore the target creep’s damaged body parts function and increase the hits counter.
    * Requires the HEAL body part.
    * The target has to be within 3 squares range of the creep.
    */
  def rangedHeal(target: AnyCreep): CreepActionReturnCode = js.native
  
  /**
    * A ranged attack against all hostile creeps or structures within 3 squares range.
    * Requires the RANGED_ATTACK body part.
    * The attack power depends on the range of each target.
    * Friendly units are not affected.
    */
  def rangedMassAttack(): OK | ERR_NOT_OWNER | ERR_BUSY | ERR_NO_BODYPART = js.native
  
  /**
    * A Store object that contains cargo of this creep.
    */
  var store: StoreResourceConstant = js.native
  
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
    * Withdraw resources from a structure, a tombstone or a ruin.
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
}
object Creep {
  
  inline def apply: CreepConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("Creep").asInstanceOf[CreepConstructor]
}
