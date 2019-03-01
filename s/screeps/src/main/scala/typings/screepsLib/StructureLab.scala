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

