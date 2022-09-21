package typings.screeps

import typings.screeps.anon.StoreRESOURCEENERGYMinera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Produces mineral compounds from base minerals and boosts creeps.
  */
@js.native
trait StructureLab
  extends StObject
     with OwnedStructure[STRUCTURE_LAB]
     with AnyOwnedStructure
     with AnyStoreStructure
     with ConcreteStructure[Any] {
  
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
  def boostCreep(creep: Creep, bodyPartsCount: Double): ScreepsReturnCode = js.native
  
  /**
    * The amount of game ticks the lab has to wait until the next reaction is possible.
    */
  var cooldown: Double = js.native
  
  /**
    * The amount of energy containing in the lab. Energy is used for boosting creeps.
    * @deprecated An alias for .store[RESOURCE_ENERGY].
    */
  var energy: Double = js.native
  
  /**
    * The total amount of energy the lab can contain.
    * @deprecated An alias for .store.getCapacity(RESOURCE_ENERGY).
    */
  var energyCapacity: Double = js.native
  
  /**
    * The amount of mineral resources containing in the lab.
    * @deprecated An alias for lab.store[lab.mineralType].
    */
  var mineralAmount: Double = js.native
  
  /**
    * The total amount of minerals the lab can contain.
    * @deprecated An alias for lab.store.getCapacity(lab.mineralType || yourMineral).
    */
  var mineralCapacity: Double = js.native
  
  /**
    * The type of minerals containing in the lab. Labs can contain only one mineral type at the same time.
    * Null in case there is no mineral resource in the lab.
    */
  var mineralType: MineralConstant | MineralCompoundConstant | Null = js.native
  
  /**
    * Breaks mineral compounds back into reagents. The same output labs can be used by many source labs.
    * @param lab1 The first result lab.
    * @param lab2 The second result lab.
    */
  def reverseReaction(lab1: StructureLab, lab2: StructureLab): ScreepsReturnCode = js.native
  
  /**
    * Produce mineral compounds using reagents from two another labs. Each lab has to be within 2 squares range. The same input labs can be used by many output labs
    * @param lab1 The first source lab.
    * @param lab2 The second source lab.
    */
  def runReaction(lab1: StructureLab, lab2: StructureLab): ScreepsReturnCode = js.native
  
  /**
    * A Store object that contains cargo of this structure.
    */
  var store: StoreRESOURCEENERGYMinera = js.native
  
  /**
    * Immediately remove boosts from the creep and drop 50% of the mineral compounds used to boost it onto the ground regardless of the creep's remaining time to live.
    * The creep has to be at adjacent square to the lab.
    * Unboosting requires cooldown time equal to the total sum of the reactions needed to produce all the compounds applied to the creep.
    * @param creep The target creep.
    */
  def unboostCreep(creep: Creep): ScreepsReturnCode = js.native
}
