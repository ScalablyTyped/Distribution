package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Conditional type for all concrete implementations of Structure.
  * Unlike Structure<T>, ConcreteStructure<T> gives you the actual concrete class that extends Structure<T>.
  */
/* Rewritten from type alias, can be one of: 
  - typings.screeps.StructureInvaderCore
  - typings.screeps.StructurePortal
  - typings.screeps.StructurePowerBank
  - typings.screeps.StructureController
  - typings.screeps.StructureKeeperLair
  - typings.screeps.StructureFactory
  - typings.screeps.StructureNuker
  - typings.screeps.StructureContainer
  - typings.screeps.StructureTerminal
  - typings.screeps.StructureLab
  - typings.screeps.StructureExtractor
  - typings.screeps.StructurePowerSpawn
  - typings.screeps.StructureObserver
  - typings.screeps.StructureTower
  - typings.screeps.StructureStorage
  - typings.screeps.StructureWall
  - typings.screeps.StructureLink
  - typings.screeps.StructureSpawn
  - typings.screeps.StructureRoad
  - typings.screeps.StructureRampart
  - typings.screeps.StructureExtension
*/
trait ConcreteStructure[T /* <: StructureConstant */] extends js.Object

