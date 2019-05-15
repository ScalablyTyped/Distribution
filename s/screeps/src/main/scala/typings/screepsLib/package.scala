package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object screepsLib {
  type ATTACK = screepsLib.screepsLibStrings.attack
  type BOTTOM = screepsLib.screepsLibNumbers.`5`
  type BOTTOM_LEFT = screepsLib.screepsLibNumbers.`6`
  type BOTTOM_RIGHT = screepsLib.screepsLibNumbers.`4`
  // Body Part Constants
  type BodyPartConstant = MOVE | WORK | CARRY | ATTACK | RANGED_ATTACK | TOUGH | HEAL | CLAIM
  // Structure Constants
  type BuildableStructureConstant = STRUCTURE_EXTENSION | STRUCTURE_RAMPART | STRUCTURE_ROAD | STRUCTURE_SPAWN | STRUCTURE_LINK | STRUCTURE_WALL | STRUCTURE_STORAGE | STRUCTURE_TOWER | STRUCTURE_OBSERVER | STRUCTURE_POWER_SPAWN | STRUCTURE_EXTRACTOR | STRUCTURE_LAB | STRUCTURE_TERMINAL | STRUCTURE_CONTAINER | STRUCTURE_NUKER
  type CARRY = screepsLib.screepsLibStrings.carry
  type CLAIM = screepsLib.screepsLibStrings.claim
  type COLOR_BLUE = screepsLib.screepsLibNumbers.`3`
  type COLOR_BROWN = screepsLib.screepsLibNumbers.`8`
  type COLOR_CYAN = screepsLib.screepsLibNumbers.`4`
  type COLOR_GREEN = screepsLib.screepsLibNumbers.`5`
  type COLOR_GREY = screepsLib.screepsLibNumbers.`9`
  type COLOR_ORANGE = screepsLib.screepsLibNumbers.`7`
  type COLOR_PURPLE = screepsLib.screepsLibNumbers.`2`
  type COLOR_RED = screepsLib.screepsLibNumbers.`1`
  type COLOR_WHITE = screepsLib.screepsLibNumbers.`10`
  type COLOR_YELLOW = screepsLib.screepsLibNumbers.`6`
  type CPUShardLimits = org.scalablytyped.runtime.StringDictionary[scala.Double]
  // Color Constants
  type ColorConstant = COLOR_RED | COLOR_PURPLE | COLOR_BLUE | COLOR_CYAN | COLOR_GREEN | COLOR_YELLOW | COLOR_ORANGE | COLOR_BROWN | COLOR_GREY | COLOR_WHITE
  type CreepActionReturnCode = OK | ERR_NOT_OWNER | ERR_BUSY | ERR_INVALID_TARGET | ERR_NOT_IN_RANGE | ERR_NO_BODYPART | ERR_TIRED
  type CreepMoveReturnCode = OK | ERR_NOT_OWNER | ERR_BUSY | ERR_TIRED | ERR_NO_BODYPART
  // Direction Constants
  type DirectionConstant = TOP | TOP_RIGHT | RIGHT | BOTTOM_RIGHT | BOTTOM | BOTTOM_LEFT | LEFT | TOP_LEFT
  type ERR_BUSY = screepsLib.screepsLibNumbers.`-4`
  type ERR_FULL = screepsLib.screepsLibNumbers.`-8`
  type ERR_GCL_NOT_ENOUGH = screepsLib.screepsLibNumbers.`-15`
  type ERR_INVALID_ARGS = screepsLib.screepsLibNumbers.`-10`
  type ERR_INVALID_TARGET = screepsLib.screepsLibNumbers.`-7`
  type ERR_NAME_EXISTS = screepsLib.screepsLibNumbers.`-3`
  type ERR_NOT_ENOUGH_ENERGY = screepsLib.screepsLibNumbers.`-6`
  type ERR_NOT_ENOUGH_EXTENSIONS = screepsLib.screepsLibNumbers.`-6`
  type ERR_NOT_ENOUGH_RESOURCES = screepsLib.screepsLibNumbers.`-6`
  type ERR_NOT_FOUND = screepsLib.screepsLibNumbers.`-5`
  type ERR_NOT_IN_RANGE = screepsLib.screepsLibNumbers.`-9`
  type ERR_NOT_OWNER = screepsLib.screepsLibNumbers.`-1`
  type ERR_NO_BODYPART = screepsLib.screepsLibNumbers.`-12`
  type ERR_NO_PATH = screepsLib.screepsLibNumbers.`-2`
  type ERR_RCL_NOT_ENOUGH = screepsLib.screepsLibNumbers.`-14`
  type ERR_TIRED = screepsLib.screepsLibNumbers.`-11`
  type EVENT_ATTACK = screepsLib.screepsLibNumbers.`1`
  type EVENT_ATTACK_CONTROLLER = screepsLib.screepsLibNumbers.`3`
  type EVENT_ATTACK_TYPE_DISMANTLE = screepsLib.screepsLibNumbers.`4`
  type EVENT_ATTACK_TYPE_HIT_BACK = screepsLib.screepsLibNumbers.`5`
  type EVENT_ATTACK_TYPE_MELEE = screepsLib.screepsLibNumbers.`1`
  type EVENT_ATTACK_TYPE_NUKE = screepsLib.screepsLibNumbers.`6`
  type EVENT_ATTACK_TYPE_RANGED = screepsLib.screepsLibNumbers.`2`
  type EVENT_ATTACK_TYPE_RANGED_MASS = screepsLib.screepsLibNumbers.`3`
  type EVENT_BUILD = screepsLib.screepsLibNumbers.`4`
  type EVENT_EXIT = screepsLib.screepsLibNumbers.`10`
  type EVENT_HARVEST = screepsLib.screepsLibNumbers.`5`
  type EVENT_HEAL = screepsLib.screepsLibNumbers.`6`
  type EVENT_HEAL_TYPE_MELEE = screepsLib.screepsLibNumbers.`1`
  type EVENT_HEAL_TYPE_RANGED = screepsLib.screepsLibNumbers.`2`
  type EVENT_OBJECT_DESTROYED = screepsLib.screepsLibNumbers.`2`
  type EVENT_REPAIR = screepsLib.screepsLibNumbers.`7`
  type EVENT_RESERVE_CONTROLLER = screepsLib.screepsLibNumbers.`8`
  type EVENT_UPGRADE_CONTROLLER = screepsLib.screepsLibNumbers.`9`
  type EventAttackType = EVENT_ATTACK_TYPE_MELEE | EVENT_ATTACK_TYPE_RANGED | EVENT_ATTACK_TYPE_RANGED_MASS | EVENT_ATTACK_TYPE_DISMANTLE | EVENT_ATTACK_TYPE_HIT_BACK | EVENT_ATTACK_TYPE_NUKE
  type EventConstant = EVENT_ATTACK | EVENT_OBJECT_DESTROYED | EVENT_ATTACK_CONTROLLER | EVENT_BUILD | EVENT_HARVEST | EVENT_HEAL | EVENT_REPAIR | EVENT_RESERVE_CONTROLLER | EVENT_UPGRADE_CONTROLLER | EVENT_EXIT
  type EventDestroyType = screepsLib.screepsLibStrings.creep | StructureConstant
  type EventHealType = EVENT_HEAL_TYPE_MELEE | EVENT_HEAL_TYPE_RANGED
  // Find Constants
  type ExitConstant = FIND_EXIT_TOP | FIND_EXIT_RIGHT | FIND_EXIT_BOTTOM | FIND_EXIT_LEFT
  // type SD<K extends ResourceConstant> = {
  //   [P in K]: number;
  //   energy: number;
  // }
  type ExitsInformation = stdLib.Partial[stdLib.Record[ExitKey, java.lang.String]]
  type FIND_CONSTRUCTION_SITES = screepsLib.screepsLibNumbers.`111`
  type FIND_CREEPS = screepsLib.screepsLibNumbers.`101`
  type FIND_DROPPED_ENERGY = screepsLib.screepsLibNumbers.`-106`
  type FIND_DROPPED_RESOURCES = screepsLib.screepsLibNumbers.`106`
  type FIND_EXIT = screepsLib.screepsLibNumbers.`10`
  type FIND_EXIT_BOTTOM = screepsLib.screepsLibNumbers.`5`
  type FIND_EXIT_LEFT = screepsLib.screepsLibNumbers.`7`
  type FIND_EXIT_RIGHT = screepsLib.screepsLibNumbers.`3`
  type FIND_EXIT_TOP = screepsLib.screepsLibNumbers.`1`
  type FIND_FLAGS = screepsLib.screepsLibNumbers.`110`
  type FIND_HOSTILE_CONSTRUCTION_SITES = screepsLib.screepsLibNumbers.`115`
  type FIND_HOSTILE_CREEPS = screepsLib.screepsLibNumbers.`103`
  type FIND_HOSTILE_POWER_CREEPS = screepsLib.screepsLibNumbers.`121`
  type FIND_HOSTILE_SPAWNS = screepsLib.screepsLibNumbers.`113`
  type FIND_HOSTILE_STRUCTURES = screepsLib.screepsLibNumbers.`109`
  type FIND_MINERALS = screepsLib.screepsLibNumbers.`116`
  type FIND_MY_CONSTRUCTION_SITES = screepsLib.screepsLibNumbers.`114`
  type FIND_MY_CREEPS = screepsLib.screepsLibNumbers.`102`
  type FIND_MY_POWER_CREEPS = screepsLib.screepsLibNumbers.`120`
  type FIND_MY_SPAWNS = screepsLib.screepsLibNumbers.`112`
  type FIND_MY_STRUCTURES = screepsLib.screepsLibNumbers.`108`
  type FIND_NUKES = screepsLib.screepsLibNumbers.`117`
  type FIND_POWER_CREEPS = screepsLib.screepsLibNumbers.`119`
  type FIND_SOURCES = screepsLib.screepsLibNumbers.`105`
  type FIND_SOURCES_ACTIVE = screepsLib.screepsLibNumbers.`104`
  type FIND_STRUCTURES = screepsLib.screepsLibNumbers.`107`
  type FIND_TOMBSTONES = screepsLib.screepsLibNumbers.`118`
  type FilterFunction[T /* <: FindConstant */] = js.Function1[
    /* import warning: ImportType.apply Failed type conversion: screeps.FindTypes[T] */ /* object */ js.Any, 
    scala.Boolean
  ]
  type FilterObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type FindConstant = FIND_EXIT_TOP | FIND_EXIT_RIGHT | FIND_EXIT_BOTTOM | FIND_EXIT_LEFT | FIND_EXIT | FIND_CREEPS | FIND_MY_CREEPS | FIND_HOSTILE_CREEPS | FIND_SOURCES_ACTIVE | FIND_SOURCES | FIND_DROPPED_RESOURCES | FIND_STRUCTURES | FIND_MY_STRUCTURES | FIND_HOSTILE_STRUCTURES | FIND_FLAGS | FIND_CONSTRUCTION_SITES | FIND_MY_SPAWNS | FIND_HOSTILE_SPAWNS | FIND_MY_CONSTRUCTION_SITES | FIND_HOSTILE_CONSTRUCTION_SITES | FIND_MINERALS | FIND_NUKES | FIND_TOMBSTONES | FIND_POWER_CREEPS | FIND_MY_POWER_CREEPS | FIND_HOSTILE_POWER_CREEPS
  type HEAL = screepsLib.screepsLibStrings.heal
  type LEFT = screepsLib.screepsLibNumbers.`7`
  type LOOK_CONSTRUCTION_SITES = screepsLib.screepsLibStrings.constructionSite
  type LOOK_CREEPS = screepsLib.screepsLibStrings.creep
  type LOOK_ENERGY = screepsLib.screepsLibStrings.energy
  type LOOK_FLAGS = screepsLib.screepsLibStrings.flag
  type LOOK_MINERALS = screepsLib.screepsLibStrings.mineral
  type LOOK_NUKES = screepsLib.screepsLibStrings.nuke
  type LOOK_POWER_CREEPS = screepsLib.screepsLibStrings.powerCreep
  type LOOK_RESOURCES = screepsLib.screepsLibStrings.resource
  type LOOK_SOURCES = screepsLib.screepsLibStrings.source
  type LOOK_STRUCTURES = screepsLib.screepsLibStrings.structure
  type LOOK_TERRAIN = screepsLib.screepsLibStrings.terrain
  type LOOK_TOMBSTONES = screepsLib.screepsLibStrings.tombstone
  type LookAtResult[K /* <: LookConstant */] = (stdLib.Pick[LookAtTypes, K]) with Anon_Type[K]
  type LookAtResultMatrix[K /* <: LookConstant */] = org.scalablytyped.runtime.NumberDictionary[org.scalablytyped.runtime.NumberDictionary[js.Array[LookAtResult[K]]]]
  type LookAtResultWithPos[K /* <: LookConstant */] = LookAtResult[K] with Anon_XY
  type LookAtTypes = stdLib.Partial[AllLookAtTypes]
  // Look Constants
  type LookConstant = LOOK_CREEPS | LOOK_ENERGY | LOOK_RESOURCES | LOOK_SOURCES | LOOK_MINERALS | LOOK_STRUCTURES | LOOK_FLAGS | LOOK_CONSTRUCTION_SITES | LOOK_NUKES | LOOK_TERRAIN | LOOK_TOMBSTONES | LOOK_POWER_CREEPS
  type LookForAtAreaResultArray[T, K /* <: java.lang.String */] = js.Array[LookForAtAreaResultWithPos[T, K]]
  type LookForAtAreaResultMatrix[T, K /* <: java.lang.String */] = org.scalablytyped.runtime.NumberDictionary[org.scalablytyped.runtime.NumberDictionary[js.Array[LookForAtAreaResult[T, K]]]]
  type LookForAtAreaResultWithPos[T, K /* <: java.lang.String */] = (LookForAtAreaResult[T, K]) with Anon_XY
  type MOVE = screepsLib.screepsLibStrings.move
  type MarketResourceConstant = ResourceConstant | SUBSCRIPTION_TOKEN
  type MineralConstant = RESOURCE_UTRIUM | RESOURCE_LEMERGIUM | RESOURCE_KEANIUM | RESOURCE_GHODIUM | RESOURCE_ZYNTHIUM | RESOURCE_OXYGEN | RESOURCE_HYDROGEN | RESOURCE_CATALYST
  type OK = screepsLib.screepsLibNumbers.`0`
  type PWR_DISRUPT_SOURCE = screepsLib.screepsLibNumbers.`11`
  type PWR_DISRUPT_SPAWN = screepsLib.screepsLibNumbers.`9`
  type PWR_DISRUPT_TERMINAL = screepsLib.screepsLibNumbers.`15`
  type PWR_DISRUPT_TOWER = screepsLib.screepsLibNumbers.`10`
  type PWR_FORTIFY = screepsLib.screepsLibNumbers.`17`
  type PWR_GENERATE_OPS = screepsLib.screepsLibNumbers.`1`
  type PWR_OPERATE_CONTROLLER = screepsLib.screepsLibNumbers.`18`
  type PWR_OPERATE_EXTENSION = screepsLib.screepsLibNumbers.`6`
  type PWR_OPERATE_LAB = screepsLib.screepsLibNumbers.`5`
  type PWR_OPERATE_OBSERVER = screepsLib.screepsLibNumbers.`7`
  type PWR_OPERATE_POWER = screepsLib.screepsLibNumbers.`16`
  type PWR_OPERATE_SPAWN = screepsLib.screepsLibNumbers.`2`
  type PWR_OPERATE_STORAGE = screepsLib.screepsLibNumbers.`4`
  type PWR_OPERATE_TERMINAL = screepsLib.screepsLibNumbers.`8`
  type PWR_OPERATE_TOWER = screepsLib.screepsLibNumbers.`3`
  type PWR_REGEN_MINERAL = screepsLib.screepsLibNumbers.`14`
  type PWR_REGEN_SOURCE = screepsLib.screepsLibNumbers.`13`
  type PWR_SHIELD = screepsLib.screepsLibNumbers.`12`
  type PowerClassConstant = screepsLib.screepsLibStrings.operator
  type PowerConstant = PWR_GENERATE_OPS | PWR_OPERATE_SPAWN | PWR_OPERATE_TOWER | PWR_OPERATE_STORAGE | PWR_OPERATE_LAB | PWR_OPERATE_EXTENSION | PWR_OPERATE_OBSERVER | PWR_OPERATE_TERMINAL | PWR_DISRUPT_SPAWN | PWR_DISRUPT_TOWER | PWR_DISRUPT_SOURCE | PWR_SHIELD | PWR_REGEN_SOURCE | PWR_REGEN_MINERAL | PWR_DISRUPT_TERMINAL | PWR_OPERATE_POWER | PWR_FORTIFY | PWR_OPERATE_CONTROLLER
  /**
    * Available powers, an object with power ID as a key, and the following properties
    */
  type PowerCreepPowers = org.scalablytyped.runtime.NumberDictionary[Anon_Cooldown]
  type RANGED_ATTACK = screepsLib.screepsLibStrings.ranged_attack
  type RESOURCE_CATALYST = screepsLib.screepsLibStrings.X
  type RESOURCE_CATALYZED_GHODIUM_ACID = screepsLib.screepsLibStrings.XGH2O
  type RESOURCE_CATALYZED_GHODIUM_ALKALIDE = screepsLib.screepsLibStrings.XGHO2
  type RESOURCE_CATALYZED_KEANIUM_ACID = screepsLib.screepsLibStrings.XKH2O
  type RESOURCE_CATALYZED_KEANIUM_ALKALIDE = screepsLib.screepsLibStrings.XKHO2
  type RESOURCE_CATALYZED_LEMERGIUM_ACID = screepsLib.screepsLibStrings.XLH2O
  type RESOURCE_CATALYZED_LEMERGIUM_ALKALIDE = screepsLib.screepsLibStrings.XLHO2
  type RESOURCE_CATALYZED_UTRIUM_ACID = screepsLib.screepsLibStrings.XUH2O
  type RESOURCE_CATALYZED_UTRIUM_ALKALIDE = screepsLib.screepsLibStrings.XUHO2
  type RESOURCE_CATALYZED_ZYNTHIUM_ACID = screepsLib.screepsLibStrings.XZH2O
  type RESOURCE_CATALYZED_ZYNTHIUM_ALKALIDE = screepsLib.screepsLibStrings.XZHO2
  type RESOURCE_ENERGY = screepsLib.screepsLibStrings.energy
  type RESOURCE_GHODIUM = screepsLib.screepsLibStrings.G
  type RESOURCE_GHODIUM_ACID = screepsLib.screepsLibStrings.GH2O
  type RESOURCE_GHODIUM_ALKALIDE = screepsLib.screepsLibStrings.GHO2
  type RESOURCE_GHODIUM_HYDRIDE = screepsLib.screepsLibStrings.GH
  type RESOURCE_GHODIUM_OXIDE = screepsLib.screepsLibStrings.GO
  type RESOURCE_HYDROGEN = screepsLib.screepsLibStrings.H
  type RESOURCE_HYDROXIDE = screepsLib.screepsLibStrings.OH
  type RESOURCE_KEANIUM = screepsLib.screepsLibStrings.K
  type RESOURCE_KEANIUM_ACID = screepsLib.screepsLibStrings.KH2O
  type RESOURCE_KEANIUM_ALKALIDE = screepsLib.screepsLibStrings.KHO2
  type RESOURCE_KEANIUM_HYDRIDE = screepsLib.screepsLibStrings.KH
  type RESOURCE_KEANIUM_OXIDE = screepsLib.screepsLibStrings.KO
  type RESOURCE_LEMERGIUM = screepsLib.screepsLibStrings.L
  type RESOURCE_LEMERGIUM_ACID = screepsLib.screepsLibStrings.LH2O
  type RESOURCE_LEMERGIUM_ALKALIDE = screepsLib.screepsLibStrings.LHO2
  type RESOURCE_LEMERGIUM_HYDRIDE = screepsLib.screepsLibStrings.LH
  type RESOURCE_LEMERGIUM_OXIDE = screepsLib.screepsLibStrings.LO
  type RESOURCE_OPS = screepsLib.screepsLibStrings.ops
  type RESOURCE_OXYGEN = screepsLib.screepsLibStrings.O
  type RESOURCE_POWER = screepsLib.screepsLibStrings.power
  type RESOURCE_UTRIUM = screepsLib.screepsLibStrings.U
  type RESOURCE_UTRIUM_ACID = screepsLib.screepsLibStrings.UH2O
  type RESOURCE_UTRIUM_ALKALIDE = screepsLib.screepsLibStrings.UHO2
  type RESOURCE_UTRIUM_HYDRIDE = screepsLib.screepsLibStrings.UH
  type RESOURCE_UTRIUM_LEMERGITE = screepsLib.screepsLibStrings.UL
  type RESOURCE_UTRIUM_OXIDE = screepsLib.screepsLibStrings.UO
  type RESOURCE_ZYNTHIUM = screepsLib.screepsLibStrings.Z
  type RESOURCE_ZYNTHIUM_ACID = screepsLib.screepsLibStrings.ZH2O
  type RESOURCE_ZYNTHIUM_ALKALIDE = screepsLib.screepsLibStrings.ZHO2
  type RESOURCE_ZYNTHIUM_HYDRIDE = screepsLib.screepsLibStrings.ZH
  type RESOURCE_ZYNTHIUM_KEANITE = screepsLib.screepsLibStrings.ZK
  type RESOURCE_ZYNTHIUM_OXIDE = screepsLib.screepsLibStrings.ZO
  type RIGHT = screepsLib.screepsLibNumbers.`3`
  // Resource Constants
  type ResourceConstant = RESOURCE_ENERGY | RESOURCE_POWER | RESOURCE_UTRIUM | RESOURCE_LEMERGIUM | RESOURCE_KEANIUM | RESOURCE_GHODIUM | RESOURCE_ZYNTHIUM | RESOURCE_OXYGEN | RESOURCE_HYDROGEN | RESOURCE_CATALYST | RESOURCE_HYDROXIDE | RESOURCE_ZYNTHIUM_KEANITE | RESOURCE_UTRIUM_LEMERGITE | RESOURCE_UTRIUM_HYDRIDE | RESOURCE_UTRIUM_OXIDE | RESOURCE_KEANIUM_HYDRIDE | RESOURCE_KEANIUM_OXIDE | RESOURCE_LEMERGIUM_HYDRIDE | RESOURCE_LEMERGIUM_OXIDE | RESOURCE_ZYNTHIUM_HYDRIDE | RESOURCE_ZYNTHIUM_OXIDE | RESOURCE_GHODIUM_HYDRIDE | RESOURCE_GHODIUM_OXIDE | RESOURCE_UTRIUM_ACID | RESOURCE_UTRIUM_ALKALIDE | RESOURCE_KEANIUM_ACID | RESOURCE_KEANIUM_ALKALIDE | RESOURCE_LEMERGIUM_ACID | RESOURCE_LEMERGIUM_ALKALIDE | RESOURCE_ZYNTHIUM_ACID | RESOURCE_ZYNTHIUM_ALKALIDE | RESOURCE_GHODIUM_ACID | RESOURCE_GHODIUM_ALKALIDE | RESOURCE_CATALYZED_UTRIUM_ACID | RESOURCE_CATALYZED_UTRIUM_ALKALIDE | RESOURCE_CATALYZED_KEANIUM_ACID | RESOURCE_CATALYZED_KEANIUM_ALKALIDE | RESOURCE_CATALYZED_LEMERGIUM_ACID | RESOURCE_CATALYZED_LEMERGIUM_ALKALIDE | RESOURCE_CATALYZED_ZYNTHIUM_ACID | RESOURCE_CATALYZED_ZYNTHIUM_ALKALIDE | RESOURCE_CATALYZED_GHODIUM_ACID | RESOURCE_CATALYZED_GHODIUM_ALKALIDE | RESOURCE_OPS
  type STRUCTURE_CONTAINER = screepsLib.screepsLibStrings.container
  type STRUCTURE_CONTROLLER = screepsLib.screepsLibStrings.controller
  type STRUCTURE_EXTENSION = screepsLib.screepsLibStrings.extension
  type STRUCTURE_EXTRACTOR = screepsLib.screepsLibStrings.extractor
  type STRUCTURE_KEEPER_LAIR = screepsLib.screepsLibStrings.keeperLair
  type STRUCTURE_LAB = screepsLib.screepsLibStrings.lab
  type STRUCTURE_LINK = screepsLib.screepsLibStrings.link
  type STRUCTURE_NUKER = screepsLib.screepsLibStrings.nuker
  type STRUCTURE_OBSERVER = screepsLib.screepsLibStrings.observer
  type STRUCTURE_PORTAL = screepsLib.screepsLibStrings.portal
  type STRUCTURE_POWER_BANK = screepsLib.screepsLibStrings.powerBank
  type STRUCTURE_POWER_SPAWN = screepsLib.screepsLibStrings.powerSpawn
  type STRUCTURE_RAMPART = screepsLib.screepsLibStrings.rampart
  type STRUCTURE_ROAD = screepsLib.screepsLibStrings.road
  type STRUCTURE_SPAWN = screepsLib.screepsLibStrings.spawn
  type STRUCTURE_STORAGE = screepsLib.screepsLibStrings.storage
  type STRUCTURE_TERMINAL = screepsLib.screepsLibStrings.terminal
  type STRUCTURE_TOWER = screepsLib.screepsLibStrings.tower
  type STRUCTURE_WALL = screepsLib.screepsLibStrings.constructedWall
  type SUBSCRIPTION_TOKEN = screepsLib.screepsLibStrings.token
  // Return Codes
  type ScreepsReturnCode = OK | ERR_NOT_OWNER | ERR_NO_PATH | ERR_BUSY | ERR_NAME_EXISTS | ERR_NOT_FOUND | ERR_NOT_ENOUGH_RESOURCES | ERR_NOT_ENOUGH_ENERGY | ERR_INVALID_TARGET | ERR_FULL | ERR_NOT_IN_RANGE | ERR_INVALID_ARGS | ERR_TIRED | ERR_NO_BODYPART | ERR_NOT_ENOUGH_EXTENSIONS | ERR_RCL_NOT_ENOUGH | ERR_GCL_NOT_ENOUGH
  type StoreDefinition = (stdLib.Partial[stdLib.Record[_ResourceConstantSansEnergy, scala.Double]]) with Anon_Energy
  type StructureConstant = BuildableStructureConstant | STRUCTURE_KEEPER_LAIR | STRUCTURE_CONTROLLER | STRUCTURE_POWER_BANK | STRUCTURE_PORTAL
  type TERRAIN_MASK_LAVA = screepsLib.screepsLibNumbers.`4`
  type TERRAIN_MASK_SWAMP = screepsLib.screepsLibNumbers.`2`
  // Terrain mask constants
  type TERRAIN_MASK_WALL = screepsLib.screepsLibNumbers.`1`
  type TOMBSTONE_DECAY_PER_PART = screepsLib.screepsLibNumbers.`5`
  type TOP = screepsLib.screepsLibNumbers.`1`
  type TOP_LEFT = screepsLib.screepsLibNumbers.`8`
  type TOP_RIGHT = screepsLib.screepsLibNumbers.`2`
  type TOUGH = screepsLib.screepsLibStrings.tough
  type WORK = screepsLib.screepsLibStrings.work
  type _ResourceConstantSansEnergy = RESOURCE_POWER | RESOURCE_UTRIUM | RESOURCE_LEMERGIUM | RESOURCE_KEANIUM | RESOURCE_GHODIUM | RESOURCE_ZYNTHIUM | RESOURCE_OXYGEN | RESOURCE_HYDROGEN | RESOURCE_CATALYST | RESOURCE_HYDROXIDE | RESOURCE_ZYNTHIUM_KEANITE | RESOURCE_UTRIUM_LEMERGITE | RESOURCE_UTRIUM_HYDRIDE | RESOURCE_UTRIUM_OXIDE | RESOURCE_KEANIUM_HYDRIDE | RESOURCE_KEANIUM_OXIDE | RESOURCE_LEMERGIUM_HYDRIDE | RESOURCE_LEMERGIUM_OXIDE | RESOURCE_ZYNTHIUM_HYDRIDE | RESOURCE_ZYNTHIUM_OXIDE | RESOURCE_GHODIUM_HYDRIDE | RESOURCE_GHODIUM_OXIDE | RESOURCE_UTRIUM_ACID | RESOURCE_UTRIUM_ALKALIDE | RESOURCE_KEANIUM_ACID | RESOURCE_KEANIUM_ALKALIDE | RESOURCE_LEMERGIUM_ACID | RESOURCE_LEMERGIUM_ALKALIDE | RESOURCE_ZYNTHIUM_ACID | RESOURCE_ZYNTHIUM_ALKALIDE | RESOURCE_GHODIUM_ACID | RESOURCE_GHODIUM_ALKALIDE | RESOURCE_CATALYZED_UTRIUM_ACID | RESOURCE_CATALYZED_UTRIUM_ALKALIDE | RESOURCE_CATALYZED_KEANIUM_ACID | RESOURCE_CATALYZED_KEANIUM_ALKALIDE | RESOURCE_CATALYZED_LEMERGIUM_ACID | RESOURCE_CATALYZED_LEMERGIUM_ALKALIDE | RESOURCE_CATALYZED_ZYNTHIUM_ACID | RESOURCE_CATALYZED_ZYNTHIUM_ALKALIDE | RESOURCE_CATALYZED_GHODIUM_ACID | RESOURCE_CATALYZED_GHODIUM_ALKALIDE | RESOURCE_OPS
}
