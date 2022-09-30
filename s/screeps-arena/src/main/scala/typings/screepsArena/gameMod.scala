package typings.screepsArena

import typings.screepsArena.anon.Error
import typings.screepsArena.anon.Object
import typings.screepsArena.anon.Pos
import typings.screepsArena.constantsMod.BuildableStructure
import typings.screepsArena.constantsMod.DirectionConstant
import typings.screepsArena.constantsMod.TERRAIN_SWAMP
import typings.screepsArena.constantsMod.TERRAIN_WALL
import typings.screepsArena.gamePrototypesMod.ConstructionSiteConstructor
import typings.screepsArena.gamePrototypesMod.Constructor
import typings.screepsArena.gamePrototypesMod.CreepConstructor
import typings.screepsArena.gamePrototypesMod.GameObject
import typings.screepsArena.gamePrototypesMod.Id
import typings.screepsArena.gamePrototypesMod.RoomPosition
import typings.screepsArena.gamePrototypesMod.STRUCTURE_CONTAINER
import typings.screepsArena.gamePrototypesMod.STRUCTURE_EXTENSION
import typings.screepsArena.gamePrototypesMod.STRUCTURE_RAMPART
import typings.screepsArena.gamePrototypesMod.STRUCTURE_ROAD
import typings.screepsArena.gamePrototypesMod.STRUCTURE_SPAWN
import typings.screepsArena.gamePrototypesMod.STRUCTURE_TOWER
import typings.screepsArena.gamePrototypesMod.STRUCTURE_WALL
import typings.screepsArena.gamePrototypesMod.StructureConstant
import typings.screepsArena.gamePrototypesMod.StructureContainerConstructor
import typings.screepsArena.gamePrototypesMod.StructureExtensionConstructor
import typings.screepsArena.gamePrototypesMod.StructureRampartConstructor
import typings.screepsArena.gamePrototypesMod.StructureRoadConstructor
import typings.screepsArena.gamePrototypesMod.StructureSpawnConstructor
import typings.screepsArena.gamePrototypesMod.StructureTowerConstructor
import typings.screepsArena.gamePrototypesMod.StructureWallConstructor
import typings.screepsArena.pathFinderMod.CostMatrixConstructor
import typings.screepsArena.pathFinderMod.FindPathOpts
import typings.screepsArena.pathFinderMod.FindPathResult
import typings.screepsArena.pathFinderMod.PathStep
import typings.screepsArena.screepsArenaInts.`0`
import typings.screepsArena.screepsArenaStrings.energy
import typings.screepsArena.utilsMod.HeapStatistics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gameMod {
  
  @JSImport("game", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object arenaInfo {
    
    @JSImport("game", "arenaInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("game", "arenaInfo.level")
    @js.native
    def level: Double = js.native
    inline def level_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("level")(x.asInstanceOf[js.Any])
    
    /**
      * "Capture the Flag"
      */
    @JSImport("game", "arenaInfo.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    /**
      * "alpha"
      */
    @JSImport("game", "arenaInfo.season")
    @js.native
    def season: String = js.native
    inline def season_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("season")(x.asInstanceOf[js.Any])
  }
  
  object constants {
    
    @JSImport("game", "constants.ATTACK")
    @js.native
    val ATTACK: typings.screepsArena.constantsMod.ATTACK = js.native
    
    @JSImport("game", "constants.ATTACK_POWER")
    @js.native
    val ATTACK_POWER: Double = js.native
    
    /* Inlined {[ index in screeps-arena.game/constants.BodyPartConstant ]: number} */
    object BODYPART_COST {
      
      @JSImport("game", "constants.BODYPART_COST")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("game", "constants.BODYPART_COST.attack")
      @js.native
      def attack: Double = js.native
      inline def attack_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attack")(x.asInstanceOf[js.Any])
      
      @JSImport("game", "constants.BODYPART_COST.carry")
      @js.native
      def carry: Double = js.native
      inline def carry_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("carry")(x.asInstanceOf[js.Any])
      
      @JSImport("game", "constants.BODYPART_COST.claim")
      @js.native
      def claim: Double = js.native
      inline def claim_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("claim")(x.asInstanceOf[js.Any])
      
      @JSImport("game", "constants.BODYPART_COST.heal")
      @js.native
      def heal: Double = js.native
      inline def heal_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heal")(x.asInstanceOf[js.Any])
      
      @JSImport("game", "constants.BODYPART_COST.move")
      @js.native
      def move: Double = js.native
      inline def move_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("move")(x.asInstanceOf[js.Any])
      
      @JSImport("game", "constants.BODYPART_COST.ranged_attack")
      @js.native
      def rangedAttack: Double = js.native
      
      inline def rangedAttack_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ranged_attack")(x.asInstanceOf[js.Any])
      
      @JSImport("game", "constants.BODYPART_COST.tough")
      @js.native
      def tough: Double = js.native
      inline def tough_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tough")(x.asInstanceOf[js.Any])
      
      @JSImport("game", "constants.BODYPART_COST.work")
      @js.native
      def work: Double = js.native
      inline def work_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("work")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("game", "constants.BODYPART_HITS")
    @js.native
    val BODYPART_HITS: Double = js.native
    
    @JSImport("game", "constants.BOTTOM")
    @js.native
    val BOTTOM: typings.screepsArena.constantsMod.BOTTOM = js.native
    
    @JSImport("game", "constants.BOTTOM_LEFT")
    @js.native
    val BOTTOM_LEFT: typings.screepsArena.constantsMod.BOTTOM_LEFT = js.native
    
    @JSImport("game", "constants.BOTTOM_RIGHT")
    @js.native
    val BOTTOM_RIGHT: typings.screepsArena.constantsMod.BOTTOM_RIGHT = js.native
    
    @JSImport("game", "constants.BUILD_POWER")
    @js.native
    val BUILD_POWER: Double = js.native
    
    @JSImport("game", "constants.CARRY")
    @js.native
    val CARRY: typings.screepsArena.constantsMod.CARRY = js.native
    
    @JSImport("game", "constants.CARRY_CAPACITY")
    @js.native
    val CARRY_CAPACITY: Double = js.native
    
    @JSImport("game", "constants.CLAIM")
    @js.native
    val CLAIM: typings.screepsArena.constantsMod.CLAIM = js.native
    
    object CONSTRUCTION_COST {
      
      @JSImport("game", "constants.CONSTRUCTION_COST")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("game", "constants.CONSTRUCTION_COST.StructureContainer")
      @js.native
      def StructureContainer: Double = js.native
      inline def StructureContainer_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureContainer")(x.asInstanceOf[js.Any])
      
      @JSImport("game", "constants.CONSTRUCTION_COST.StructureExtension")
      @js.native
      def StructureExtension: Double = js.native
      inline def StructureExtension_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureExtension")(x.asInstanceOf[js.Any])
      
      @JSImport("game", "constants.CONSTRUCTION_COST.StructureRampart")
      @js.native
      def StructureRampart: Double = js.native
      inline def StructureRampart_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureRampart")(x.asInstanceOf[js.Any])
      
      @JSImport("game", "constants.CONSTRUCTION_COST.StructureRoad")
      @js.native
      def StructureRoad: Double = js.native
      inline def StructureRoad_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureRoad")(x.asInstanceOf[js.Any])
      
      @JSImport("game", "constants.CONSTRUCTION_COST.StructureSpawnt")
      @js.native
      def StructureSpawnt: Double = js.native
      inline def StructureSpawnt_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureSpawnt")(x.asInstanceOf[js.Any])
      
      @JSImport("game", "constants.CONSTRUCTION_COST.StructureTower")
      @js.native
      def StructureTower: Double = js.native
      inline def StructureTower_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureTower")(x.asInstanceOf[js.Any])
      
      @JSImport("game", "constants.CONSTRUCTION_COST.StructureWall")
      @js.native
      def StructureWall: Double = js.native
      inline def StructureWall_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureWall")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("game", "constants.CONSTRUCTION_COST_ROAD_SWAMP_RATIO")
    @js.native
    val CONSTRUCTION_COST_ROAD_SWAMP_RATIO: Double = js.native
    
    @JSImport("game", "constants.CONSTRUCTION_COST_ROAD_WALL_RATIO")
    @js.native
    val CONSTRUCTION_COST_ROAD_WALL_RATIO: Double = js.native
    
    @JSImport("game", "constants.CONTAINER_CAPACITY")
    @js.native
    val CONTAINER_CAPACITY: Double = js.native
    
    @JSImport("game", "constants.CONTAINER_HITS")
    @js.native
    val CONTAINER_HITS: Double = js.native
    
    @JSImport("game", "constants.CREEP_SPAWN_TIME")
    @js.native
    val CREEP_SPAWN_TIME: Double = js.native
    
    @JSImport("game", "constants.DISMANTLE_COST")
    @js.native
    val DISMANTLE_COST: Double = js.native
    
    @JSImport("game", "constants.DISMANTLE_POWER")
    @js.native
    val DISMANTLE_POWER: Double = js.native
    
    @JSImport("game", "constants.ERR_BUSY")
    @js.native
    val ERR_BUSY: typings.screepsArena.constantsMod.ERR_BUSY = js.native
    
    @JSImport("game", "constants.ERR_FULL")
    @js.native
    val ERR_FULL: typings.screepsArena.constantsMod.ERR_FULL = js.native
    
    @JSImport("game", "constants.ERR_INVALID_ARGS")
    @js.native
    val ERR_INVALID_ARGS: typings.screepsArena.constantsMod.ERR_INVALID_ARGS = js.native
    
    @JSImport("game", "constants.ERR_INVALID_TARGET")
    @js.native
    val ERR_INVALID_TARGET: typings.screepsArena.constantsMod.ERR_INVALID_TARGET = js.native
    
    @JSImport("game", "constants.ERR_NAME_EXISTS")
    @js.native
    val ERR_NAME_EXISTS: typings.screepsArena.constantsMod.ERR_NAME_EXISTS = js.native
    
    @JSImport("game", "constants.ERR_NOT_ENOUGH_ENERGY")
    @js.native
    val ERR_NOT_ENOUGH_ENERGY: typings.screepsArena.constantsMod.ERR_NOT_ENOUGH_ENERGY = js.native
    
    @JSImport("game", "constants.ERR_NOT_ENOUGH_EXTENSIONS")
    @js.native
    val ERR_NOT_ENOUGH_EXTENSIONS: typings.screepsArena.constantsMod.ERR_NOT_ENOUGH_EXTENSIONS = js.native
    
    @JSImport("game", "constants.ERR_NOT_ENOUGH_RESOURCES")
    @js.native
    val ERR_NOT_ENOUGH_RESOURCES: typings.screepsArena.constantsMod.ERR_NOT_ENOUGH_RESOURCES = js.native
    
    @JSImport("game", "constants.ERR_NOT_FOUND")
    @js.native
    val ERR_NOT_FOUND: typings.screepsArena.constantsMod.ERR_NOT_FOUND = js.native
    
    @JSImport("game", "constants.ERR_NOT_IN_RANGE")
    @js.native
    val ERR_NOT_IN_RANGE: typings.screepsArena.constantsMod.ERR_NOT_IN_RANGE = js.native
    
    @JSImport("game", "constants.ERR_NOT_OWNER")
    @js.native
    val ERR_NOT_OWNER: typings.screepsArena.constantsMod.ERR_NOT_OWNER = js.native
    
    @JSImport("game", "constants.ERR_NO_BODYPART")
    @js.native
    val ERR_NO_BODYPART: typings.screepsArena.constantsMod.ERR_NO_BODYPART = js.native
    
    @JSImport("game", "constants.ERR_NO_PATH")
    @js.native
    val ERR_NO_PATH: typings.screepsArena.constantsMod.ERR_NO_PATH = js.native
    
    @JSImport("game", "constants.ERR_TIRED")
    @js.native
    val ERR_TIRED: typings.screepsArena.constantsMod.ERR_TIRED = js.native
    
    @JSImport("game", "constants.EXTENSION_ENERGY_CAPACITY")
    @js.native
    val EXTENSION_ENERGY_CAPACITY: Double = js.native
    
    @JSImport("game", "constants.EXTENSION_HITS")
    @js.native
    val EXTENSION_HITS: Double = js.native
    
    @JSImport("game", "constants.HARVEST_POWER")
    @js.native
    val HARVEST_POWER: Double = js.native
    
    @JSImport("game", "constants.HEAL")
    @js.native
    val HEAL: typings.screepsArena.constantsMod.HEAL = js.native
    
    @JSImport("game", "constants.HEAL_POWER")
    @js.native
    val HEAL_POWER: Double = js.native
    
    @JSImport("game", "constants.LEFT")
    @js.native
    val LEFT: typings.screepsArena.constantsMod.LEFT = js.native
    
    @JSImport("game", "constants.MAX_CONSTRUCTION_SITES")
    @js.native
    val MAX_CONSTRUCTION_SITES: Double = js.native
    
    @JSImport("game", "constants.MAX_CREEP_SIZE")
    @js.native
    val MAX_CREEP_SIZE: Double = js.native
    
    @JSImport("game", "constants.MOVE")
    @js.native
    val MOVE: typings.screepsArena.constantsMod.MOVE = js.native
    
    @JSImport("game", "constants.OBSTACLE_OBJECT_TYPES")
    @js.native
    val OBSTACLE_OBJECT_TYPES: typings.screepsArena.constantsMod.OBSTACLE_OBJECT_TYPES = js.native
    
    @JSImport("game", "constants.OK")
    @js.native
    val OK: typings.screepsArena.constantsMod.OK = js.native
    
    @JSImport("game", "constants.RAMPART_HITS")
    @js.native
    val RAMPART_HITS: Double = js.native
    
    @JSImport("game", "constants.RAMPART_HITS_MAX")
    @js.native
    val RAMPART_HITS_MAX: Double = js.native
    
    @JSImport("game", "constants.RANGED_ATTACK")
    @js.native
    val RANGED_ATTACK: typings.screepsArena.constantsMod.RANGED_ATTACK = js.native
    
    @JSImport("game", "constants.RANGED_ATTACK_DISTANCE_RATE")
    @js.native
    val RANGED_ATTACK_DISTANCE_RATE: js.Array[Any] = js.native
    
    @JSImport("game", "constants.RANGED_ATTACK_POWER")
    @js.native
    val RANGED_ATTACK_POWER: Double = js.native
    
    @JSImport("game", "constants.RANGED_HEAL_POWER")
    @js.native
    val RANGED_HEAL_POWER: Double = js.native
    
    @JSImport("game", "constants.REPAIR_COST")
    @js.native
    val REPAIR_COST: Double = js.native
    
    @JSImport("game", "constants.REPAIR_POWER")
    @js.native
    val REPAIR_POWER: Double = js.native
    
    @JSImport("game", "constants.RESOURCE_DECAY")
    @js.native
    val RESOURCE_DECAY: Double = js.native
    
    @JSImport("game", "constants.RESOURCE_ENERGY")
    @js.native
    val RESOURCE_ENERGY: energy = js.native
    
    @JSImport("game", "constants.RIGHT")
    @js.native
    val RIGHT: typings.screepsArena.constantsMod.RIGHT = js.native
    
    @JSImport("game", "constants.ROAD_HITS")
    @js.native
    val ROAD_HITS: Double = js.native
    
    @JSImport("game", "constants.ROAD_WEAROUT")
    @js.native
    val ROAD_WEAROUT: Double = js.native
    
    @JSImport("game", "constants.SOURCE_ENERGY_REGEN")
    @js.native
    val SOURCE_ENERGY_REGEN: Double = js.native
    
    @JSImport("game", "constants.SPAWN_ENERGY_CAPACITY")
    @js.native
    val SPAWN_ENERGY_CAPACITY: Double = js.native
    
    @JSImport("game", "constants.SPAWN_HITS")
    @js.native
    val SPAWN_HITS: Double = js.native
    
    object STRUCTURE_PROTOTYPES {
      
      @JSImport("game", "constants.STRUCTURE_PROTOTYPES")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("game", "constants.STRUCTURE_PROTOTYPES.StructureContainer")
      @js.native
      def StructureContainer: STRUCTURE_CONTAINER = js.native
      inline def StructureContainer_=(x: STRUCTURE_CONTAINER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureContainer")(x.asInstanceOf[js.Any])
      
      @JSImport("game", "constants.STRUCTURE_PROTOTYPES.StructureExtension")
      @js.native
      def StructureExtension: STRUCTURE_EXTENSION = js.native
      inline def StructureExtension_=(x: STRUCTURE_EXTENSION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureExtension")(x.asInstanceOf[js.Any])
      
      @JSImport("game", "constants.STRUCTURE_PROTOTYPES.StructureRampart")
      @js.native
      def StructureRampart: STRUCTURE_RAMPART = js.native
      inline def StructureRampart_=(x: STRUCTURE_RAMPART): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureRampart")(x.asInstanceOf[js.Any])
      
      @JSImport("game", "constants.STRUCTURE_PROTOTYPES.StructureRoad")
      @js.native
      def StructureRoad: STRUCTURE_ROAD = js.native
      inline def StructureRoad_=(x: STRUCTURE_ROAD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureRoad")(x.asInstanceOf[js.Any])
      
      @JSImport("game", "constants.STRUCTURE_PROTOTYPES.StructureSpawn")
      @js.native
      def StructureSpawn: STRUCTURE_SPAWN = js.native
      inline def StructureSpawn_=(x: STRUCTURE_SPAWN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureSpawn")(x.asInstanceOf[js.Any])
      
      @JSImport("game", "constants.STRUCTURE_PROTOTYPES.StructureTower")
      @js.native
      def StructureTower: STRUCTURE_TOWER = js.native
      inline def StructureTower_=(x: STRUCTURE_TOWER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureTower")(x.asInstanceOf[js.Any])
      
      @JSImport("game", "constants.STRUCTURE_PROTOTYPES.StructureWall")
      @js.native
      def StructureWall: STRUCTURE_WALL = js.native
      inline def StructureWall_=(x: STRUCTURE_WALL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StructureWall")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("game", "constants.TERRAIN_SWAMP")
    @js.native
    val TERRAIN_SWAMP: typings.screepsArena.constantsMod.TERRAIN_SWAMP = js.native
    
    @JSImport("game", "constants.TERRAIN_WALL")
    @js.native
    val TERRAIN_WALL: typings.screepsArena.constantsMod.TERRAIN_WALL = js.native
    
    @JSImport("game", "constants.TOP")
    @js.native
    val TOP: typings.screepsArena.constantsMod.TOP = js.native
    
    @JSImport("game", "constants.TOP_LEFT")
    @js.native
    val TOP_LEFT: typings.screepsArena.constantsMod.TOP_LEFT = js.native
    
    @JSImport("game", "constants.TOP_RIGHT")
    @js.native
    val TOP_RIGHT: typings.screepsArena.constantsMod.TOP_RIGHT = js.native
    
    @JSImport("game", "constants.TOUGH")
    @js.native
    val TOUGH: typings.screepsArena.constantsMod.TOUGH = js.native
    
    @JSImport("game", "constants.TOWER_CAPACITY")
    @js.native
    val TOWER_CAPACITY: Double = js.native
    
    @JSImport("game", "constants.TOWER_COOLDOWN")
    @js.native
    val TOWER_COOLDOWN: Double = js.native
    
    @JSImport("game", "constants.TOWER_ENERGY_COST")
    @js.native
    val TOWER_ENERGY_COST: Double = js.native
    
    @JSImport("game", "constants.TOWER_FALLOFF")
    @js.native
    val TOWER_FALLOFF: Double = js.native
    
    @JSImport("game", "constants.TOWER_FALLOFF_RANGE")
    @js.native
    val TOWER_FALLOFF_RANGE: Double = js.native
    
    @JSImport("game", "constants.TOWER_HITS")
    @js.native
    val TOWER_HITS: Double = js.native
    
    @JSImport("game", "constants.TOWER_OPTIMAL_RANGE")
    @js.native
    val TOWER_OPTIMAL_RANGE: Double = js.native
    
    @JSImport("game", "constants.TOWER_POWER_ATTACK")
    @js.native
    val TOWER_POWER_ATTACK: Double = js.native
    
    @JSImport("game", "constants.TOWER_POWER_HEAL")
    @js.native
    val TOWER_POWER_HEAL: Double = js.native
    
    @JSImport("game", "constants.TOWER_POWER_REPAIR")
    @js.native
    val TOWER_POWER_REPAIR: Double = js.native
    
    @JSImport("game", "constants.TOWER_RANGE")
    @js.native
    val TOWER_RANGE: Double = js.native
    
    @JSImport("game", "constants.WALL_HITS")
    @js.native
    val WALL_HITS: Double = js.native
    
    @JSImport("game", "constants.WALL_HITS_MAX")
    @js.native
    val WALL_HITS_MAX: Double = js.native
    
    @JSImport("game", "constants.WORK")
    @js.native
    val WORK: typings.screepsArena.constantsMod.WORK = js.native
  }
  
  inline def createConstructionSite(x: Double, y: Double, structurePrototype: String): Object = (^.asInstanceOf[js.Dynamic].applyDynamic("createConstructionSite")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], structurePrototype.asInstanceOf[js.Any])).asInstanceOf[Object]
  
  object pathFinder {
    
    @JSImport("game", "pathFinder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("game", "pathFinder.CostMatrix")
    @js.native
    val CostMatrix: CostMatrixConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("game", "pathFinder.CostMatrix")
    @js.native
    open class CostMatrixCls ()
      extends StObject
         with typings.screepsArena.pathFinderMod.CostMatrix {
      
      // /**
      //  * Creates a new CostMatrix containing 0's for all positions.
      //  */
      // new (): CostMatrix;
      /* CompleteClass */
      var _bits: js.typedarray.Uint8Array = js.native
      
      /**
        * Static method which deserializes a new CostMatrix using the return value of serialize.
        * @param val Whatever serialize returned
        */
      /* CompleteClass */
      override def deserialize(`val`: js.Array[Double]): typings.screepsArena.pathFinderMod.CostMatrix = js.native
      
      /**
        * Get the cost of a position in this CostMatrix.
        * @param x X position in the room.
        * @param y Y position in the room.
        */
      /* CompleteClass */
      override def get(x: Double, y: Double): Double = js.native
      
      /**
        * Returns a compact representation of this CostMatrix which can be stored via JSON.stringify.
        */
      /* CompleteClass */
      override def serialize(): js.Array[Double] = js.native
      
      /**
        * Set the cost of a position in this CostMatrix.
        * @param x X position in the room.
        * @param y Y position in the room.
        * @param cost Cost of this position. Must be a whole number. A cost of 0 will use the terrain cost for that tile. A cost greater than or equal to 255 will be treated as unwalkable.
        */
      /* CompleteClass */
      override def set(x: Double, y: Double, cost: Double): Unit = js.native
    }
    
    inline def searchPath(origin: RoomPosition, goal: js.Array[RoomPosition | Pos]): FindPathResult = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPath")(origin.asInstanceOf[js.Any], goal.asInstanceOf[js.Any])).asInstanceOf[FindPathResult]
    inline def searchPath(origin: RoomPosition, goal: js.Array[RoomPosition | Pos], opts: FindPathOpts): FindPathResult = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPath")(origin.asInstanceOf[js.Any], goal.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[FindPathResult]
    inline def searchPath(origin: RoomPosition, goal: Pos): FindPathResult = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPath")(origin.asInstanceOf[js.Any], goal.asInstanceOf[js.Any])).asInstanceOf[FindPathResult]
    inline def searchPath(origin: RoomPosition, goal: Pos, opts: FindPathOpts): FindPathResult = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPath")(origin.asInstanceOf[js.Any], goal.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[FindPathResult]
    inline def searchPath(origin: RoomPosition, goal: RoomPosition): FindPathResult = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPath")(origin.asInstanceOf[js.Any], goal.asInstanceOf[js.Any])).asInstanceOf[FindPathResult]
    inline def searchPath(origin: RoomPosition, goal: RoomPosition, opts: FindPathOpts): FindPathResult = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPath")(origin.asInstanceOf[js.Any], goal.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[FindPathResult]
  }
  
  object prototypes {
    
    @JSImport("game", "prototypes.ConstructionSite")
    @js.native
    val ConstructionSite: ConstructionSiteConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("game", "prototypes.ConstructionSite")
    @js.native
    open class ConstructionSiteCls ()
      extends StObject
         with typings.screepsArena.gamePrototypesMod.ConstructionSite {
      def this(id: Id[typings.screepsArena.gamePrototypesMod.ConstructionSite]) = this()
      
      /**
        * X position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var x: Double = js.native
      
      /**
        * Y position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var y: Double = js.native
    }
    
    @JSImport("game", "prototypes.Creep")
    @js.native
    val Creep: CreepConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("game", "prototypes.Creep")
    @js.native
    open class CreepCls ()
      extends StObject
         with typings.screepsArena.gamePrototypesMod.Creep {
      def this(id: Id[typings.screepsArena.gamePrototypesMod.Creep]) = this()
      
      /**
        * X position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var x: Double = js.native
      
      /**
        * Y position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var y: Double = js.native
    }
    
    @JSImport("game", "prototypes.OwnedStructure")
    @js.native
    val OwnedStructure: Constructor[typings.screepsArena.gamePrototypesMod.OwnedStructure[StructureConstant]] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("game", "prototypes.OwnedStructure")
    @js.native
    open class OwnedStructureCls ()
      extends StObject
         with typings.screepsArena.gamePrototypesMod.OwnedStructure[StructureConstant] {
      
      /**
        * X position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var x: Double = js.native
      
      /**
        * Y position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var y: Double = js.native
    }
    
    @JSImport("game", "prototypes.Resource")
    @js.native
    val Resource: Constructor[typings.screepsArena.gamePrototypesMod.Resource] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("game", "prototypes.Resource")
    @js.native
    open class ResourceCls ()
      extends StObject
         with typings.screepsArena.gamePrototypesMod.Resource {
      
      /**
        * X position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var x: Double = js.native
      
      /**
        * Y position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var y: Double = js.native
    }
    
    @JSImport("game", "prototypes.Source")
    @js.native
    val Source: Constructor[typings.screepsArena.gamePrototypesMod.Source] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("game", "prototypes.Source")
    @js.native
    open class SourceCls ()
      extends StObject
         with typings.screepsArena.gamePrototypesMod.Source {
      
      /**
        * X position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var x: Double = js.native
      
      /**
        * Y position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var y: Double = js.native
    }
    
    @JSImport("game", "prototypes.Structure")
    @js.native
    val Structure: Constructor[typings.screepsArena.gamePrototypesMod.Structure[StructureConstant]] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("game", "prototypes.Structure")
    @js.native
    open class StructureCls ()
      extends StObject
         with typings.screepsArena.gamePrototypesMod.Structure[StructureConstant] {
      
      /**
        * X position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var x: Double = js.native
      
      /**
        * Y position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var y: Double = js.native
    }
    
    @JSImport("game", "prototypes.StructureContainer")
    @js.native
    val StructureContainer: StructureContainerConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("game", "prototypes.StructureContainer")
    @js.native
    open class StructureContainerCls ()
      extends StObject
         with typings.screepsArena.gamePrototypesMod.StructureContainer {
      def this(id: Id[typings.screepsArena.gamePrototypesMod.StructureContainer]) = this()
      
      /**
        * X position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var x: Double = js.native
      
      /**
        * Y position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var y: Double = js.native
    }
    
    @JSImport("game", "prototypes.StructureExtension")
    @js.native
    val StructureExtension: StructureExtensionConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("game", "prototypes.StructureExtension")
    @js.native
    open class StructureExtensionCls ()
      extends StObject
         with typings.screepsArena.gamePrototypesMod.StructureExtension {
      def this(id: Id[typings.screepsArena.gamePrototypesMod.StructureExtension]) = this()
      
      /**
        * X position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var x: Double = js.native
      
      /**
        * Y position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var y: Double = js.native
    }
    
    @JSImport("game", "prototypes.StructureRampart")
    @js.native
    val StructureRampart: StructureRampartConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("game", "prototypes.StructureRampart")
    @js.native
    open class StructureRampartCls ()
      extends StObject
         with typings.screepsArena.gamePrototypesMod.OwnedStructure[STRUCTURE_RAMPART] {
      def this(id: Id[typings.screepsArena.gamePrototypesMod.StructureRampart]) = this()
      
      /**
        * X position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var x: Double = js.native
      
      /**
        * Y position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var y: Double = js.native
    }
    
    @JSImport("game", "prototypes.StructureRoad")
    @js.native
    val StructureRoad: StructureRoadConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("game", "prototypes.StructureRoad")
    @js.native
    open class StructureRoadCls ()
      extends StObject
         with typings.screepsArena.gamePrototypesMod.Structure[STRUCTURE_ROAD] {
      def this(id: Id[typings.screepsArena.gamePrototypesMod.StructureRoad]) = this()
      
      /**
        * X position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var x: Double = js.native
      
      /**
        * Y position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var y: Double = js.native
    }
    
    @JSImport("game", "prototypes.StructureSpawn")
    @js.native
    val StructureSpawn: StructureSpawnConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("game", "prototypes.StructureSpawn")
    @js.native
    open class StructureSpawnCls ()
      extends StObject
         with typings.screepsArena.gamePrototypesMod.StructureSpawn {
      def this(id: Id[typings.screepsArena.gamePrototypesMod.StructureSpawn]) = this()
      
      /**
        * X position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var x: Double = js.native
      
      /**
        * Y position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var y: Double = js.native
    }
    
    @JSImport("game", "prototypes.StructureTower")
    @js.native
    val StructureTower: StructureTowerConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("game", "prototypes.StructureTower")
    @js.native
    open class StructureTowerCls ()
      extends StObject
         with typings.screepsArena.gamePrototypesMod.StructureTower {
      def this(id: Id[typings.screepsArena.gamePrototypesMod.StructureTower]) = this()
      
      /**
        * X position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var x: Double = js.native
      
      /**
        * Y position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var y: Double = js.native
    }
    
    @JSImport("game", "prototypes.StructureWall")
    @js.native
    val StructureWall: StructureWallConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("game", "prototypes.StructureWall")
    @js.native
    open class StructureWallCls ()
      extends StObject
         with typings.screepsArena.gamePrototypesMod.Structure[STRUCTURE_WALL] {
      def this(id: Id[typings.screepsArena.gamePrototypesMod.StructureWall]) = this()
      
      /**
        * X position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var x: Double = js.native
      
      /**
        * Y position in the room. Can be undefined if `.exists` is false
        */
      /* CompleteClass */
      var y: Double = js.native
    }
    
    object Tag {
      
      @JSImport("game", "prototypes.Tag.OpaqueTag")
      @js.native
      open class OpaqueTag[T] ()
        extends typings.screepsArena.gamePrototypesMod.Tag.OpaqueTag[T]
      
      @JSImport("game", "prototypes.Tag.OpaqueTagSymbol")
      @js.native
      val OpaqueTagSymbol: js.Symbol = js.native
    }
  }
  
  object utils {
    
    @JSImport("game", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createConstructionSite(x: Double, y: Double, structureType: Constructor[BuildableStructure]): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("createConstructionSite")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], structureType.asInstanceOf[js.Any])).asInstanceOf[Error]
    
    inline def findClosestByPath[T /* <: RoomPosition */](fromPos: RoomPosition, positions: js.Array[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("findClosestByPath")(fromPos.asInstanceOf[js.Any], positions.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def findClosestByPath[T /* <: RoomPosition */](fromPos: RoomPosition, positions: js.Array[T], opts: FindPathOpts): T = (^.asInstanceOf[js.Dynamic].applyDynamic("findClosestByPath")(fromPos.asInstanceOf[js.Any], positions.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def findClosestByRange[T /* <: RoomPosition */](fromPos: RoomPosition, positions: js.Array[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("findClosestByRange")(fromPos.asInstanceOf[js.Any], positions.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def findInRange[T /* <: RoomPosition */](fromPos: RoomPosition, positions: js.Array[T], range: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findInRange")(fromPos.asInstanceOf[js.Any], positions.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    inline def findPath(fromPos: RoomPosition, toPos: RoomPosition): js.Array[PathStep] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPath")(fromPos.asInstanceOf[js.Any], toPos.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathStep]]
    inline def findPath(fromPos: RoomPosition, toPos: RoomPosition, opts: FindPathOpts): js.Array[PathStep] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPath")(fromPos.asInstanceOf[js.Any], toPos.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathStep]]
    
    inline def getDirection(dx: Double, dy: Double): DirectionConstant = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirection")(dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any])).asInstanceOf[DirectionConstant]
    
    inline def getDistance(a: RoomPosition, b: RoomPosition): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getHeapStatistics(): HeapStatistics = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeapStatistics")().asInstanceOf[HeapStatistics]
    
    inline def getObjectById[T](id: Id[T]): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjectById")(id.asInstanceOf[js.Any]).asInstanceOf[T | Null]
    
    inline def getObjects(): js.Array[GameObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjects")().asInstanceOf[js.Array[GameObject]]
    
    inline def getObjectsByPrototype[T](prototype: Constructor[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjectsByPrototype")(prototype.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    
    inline def getRange(a: RoomPosition, b: RoomPosition): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getTerrainAt(pos: RoomPosition): TERRAIN_WALL | TERRAIN_SWAMP | `0` = ^.asInstanceOf[js.Dynamic].applyDynamic("getTerrainAt")(pos.asInstanceOf[js.Any]).asInstanceOf[TERRAIN_WALL | TERRAIN_SWAMP | `0`]
    
    inline def getTime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTime")().asInstanceOf[Double]
  }
}
