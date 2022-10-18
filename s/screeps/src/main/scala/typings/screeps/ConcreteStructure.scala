package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Conditional type for all concrete implementations of Structure.
  * Unlike Structure<T>, ConcreteStructure<T> gives you the actual concrete class that extends Structure<T>.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends screeps.STRUCTURE_EXTENSION ? screeps.StructureExtension : T extends screeps.STRUCTURE_RAMPART ? screeps.StructureRampart : T extends screeps.STRUCTURE_ROAD ? screeps.StructureRoad : T extends screeps.STRUCTURE_SPAWN ? screeps.StructureSpawn : T extends screeps.STRUCTURE_LINK ? screeps.StructureLink : T extends screeps.STRUCTURE_WALL ? screeps.StructureWall : T extends screeps.STRUCTURE_STORAGE ? screeps.StructureStorage : T extends screeps.STRUCTURE_TOWER ? screeps.StructureTower : T extends screeps.STRUCTURE_OBSERVER ? screeps.StructureObserver : T extends screeps.STRUCTURE_POWER_SPAWN ? screeps.StructurePowerSpawn : T extends screeps.STRUCTURE_EXTRACTOR ? screeps.StructureExtractor : T extends screeps.STRUCTURE_LAB ? screeps.StructureLab : T extends screeps.STRUCTURE_TERMINAL ? screeps.StructureTerminal : T extends screeps.STRUCTURE_CONTAINER ? screeps.StructureContainer : T extends screeps.STRUCTURE_NUKER ? screeps.StructureNuker : T extends screeps.STRUCTURE_FACTORY ? screeps.StructureFactory : T extends screeps.STRUCTURE_KEEPER_LAIR ? screeps.StructureKeeperLair : T extends screeps.STRUCTURE_CONTROLLER ? screeps.StructureController : T extends screeps.STRUCTURE_POWER_BANK ? screeps.StructurePowerBank : T extends screeps.STRUCTURE_PORTAL ? screeps.StructurePortal : T extends screeps.STRUCTURE_INVADER_CORE ? screeps.StructureInvaderCore : never
  }}}
  */
@js.native
trait ConcreteStructure[T /* <: StructureConstant */] extends StObject
