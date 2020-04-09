package typings.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Remotely attacks or heals creeps, or repairs structures. Can be targeted to
  * any object in the room. However, its effectiveness highly depends on the
  * distance. Each action consumes energy.
  */
trait StructureTower
  extends OwnedStructure[STRUCTURE_TOWER]
     with AnyOwnedStructure
     with AnyStoreStructure
     with ConcreteStructure[js.Any] {
  /**
    * The amount of energy containing in this structure.
    * @deprecated An alias for .store[RESOURCE_ENERGY].
    */
  var energy: Double
  /**
    * The total amount of energy this structure can contain.
    * @deprecated An alias for .store.getCapacity(RESOURCE_ENERGY).
    */
  var energyCapacity: Double
  /**
    * A Store object that contains cargo of this structure.
    */
  var store: StoreRESOURCEENERGYfalse
  /**
    * Remotely attack any creep in the room. Consumes 10 energy units per tick. Attack power depends on the distance to the target: from 600 hits at range 10 to 300 hits at range 40.
    * @param target The target creep.
    */
  def attack(target: AnyCreep): ScreepsReturnCode
  /**
    * Remotely heal any creep in the room. Consumes 10 energy units per tick. Heal power depends on the distance to the target: from 400 hits at range 10 to 200 hits at range 40.
    * @param target The target creep.
    */
  def heal(target: AnyCreep): ScreepsReturnCode
  /**
    * Remotely repair any structure in the room. Consumes 10 energy units per tick. Repair power depends on the distance to the target: from 600 hits at range 10 to 300 hits at range 40.
    * @param target The target structure.
    */
  def repair(target: Structure[StructureConstant]): ScreepsReturnCode
}

@JSGlobal("StructureTower")
@js.native
object StructureTower extends TopLevel[StructureTowerConstructor]

