package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object screeps {
  type ACCESS_KEY = typings.screeps.screepsStrings.accessKey
  type ATTACK = typings.screeps.screepsStrings.attack
  type BOTTOM = typings.screeps.screepsNumbers.`5`
  type BOTTOM_LEFT = typings.screeps.screepsNumbers.`6`
  type BOTTOM_RIGHT = typings.screeps.screepsNumbers.`4`
  // Body Part Constants
  type BodyPartConstant = typings.screeps.MOVE | typings.screeps.WORK | typings.screeps.CARRY | typings.screeps.ATTACK | typings.screeps.RANGED_ATTACK | typings.screeps.TOUGH | typings.screeps.HEAL | typings.screeps.CLAIM
  /**
    * Describes one part of a creep’s body.
    */
  type BodyPartDefinition[T /* <: typings.screeps.BodyPartConstant */] = typings.screeps.anon.Boost[T]
  // Structure Constants
  type BuildableStructureConstant = typings.screeps.STRUCTURE_EXTENSION | typings.screeps.STRUCTURE_RAMPART | typings.screeps.STRUCTURE_ROAD | typings.screeps.STRUCTURE_SPAWN | typings.screeps.STRUCTURE_LINK | typings.screeps.STRUCTURE_WALL | typings.screeps.STRUCTURE_STORAGE | typings.screeps.STRUCTURE_TOWER | typings.screeps.STRUCTURE_OBSERVER | typings.screeps.STRUCTURE_POWER_SPAWN | typings.screeps.STRUCTURE_EXTRACTOR | typings.screeps.STRUCTURE_LAB | typings.screeps.STRUCTURE_TERMINAL | typings.screeps.STRUCTURE_CONTAINER | typings.screeps.STRUCTURE_NUKER | typings.screeps.STRUCTURE_FACTORY
  type CARRY = typings.screeps.screepsStrings.carry
  type CLAIM = typings.screeps.screepsStrings.claim
  type COLOR_BLUE = typings.screeps.screepsNumbers.`3`
  type COLOR_BROWN = typings.screeps.screepsNumbers.`8`
  type COLOR_CYAN = typings.screeps.screepsNumbers.`4`
  type COLOR_GREEN = typings.screeps.screepsNumbers.`5`
  type COLOR_GREY = typings.screeps.screepsNumbers.`9`
  type COLOR_ORANGE = typings.screeps.screepsNumbers.`7`
  type COLOR_PURPLE = typings.screeps.screepsNumbers.`2`
  type COLOR_RED = typings.screeps.screepsNumbers.`1`
  type COLOR_WHITE = typings.screeps.screepsNumbers.`10`
  type COLOR_YELLOW = typings.screeps.screepsNumbers.`6`
  type CPUShardLimits = org.scalablytyped.runtime.StringDictionary[scala.Double]
  type CPU_UNLOCK = typings.screeps.screepsStrings.cpuUnlock
  // Color Constants
  type ColorConstant = typings.screeps.COLOR_RED | typings.screeps.COLOR_PURPLE | typings.screeps.COLOR_BLUE | typings.screeps.COLOR_CYAN | typings.screeps.COLOR_GREEN | typings.screeps.COLOR_YELLOW | typings.screeps.COLOR_ORANGE | typings.screeps.COLOR_BROWN | typings.screeps.COLOR_GREY | typings.screeps.COLOR_WHITE
  /** The commodities, produced by the Factory */
  type CommodityConstant = typings.screeps.RESOURCE_UTRIUM_BAR | typings.screeps.RESOURCE_LEMERGIUM_BAR | typings.screeps.RESOURCE_ZYNTHIUM_BAR | typings.screeps.RESOURCE_KEANIUM_BAR | typings.screeps.RESOURCE_GHODIUM_MELT | typings.screeps.RESOURCE_OXIDANT | typings.screeps.RESOURCE_REDUCTANT | typings.screeps.RESOURCE_PURIFIER | typings.screeps.RESOURCE_BATTERY | typings.screeps.RESOURCE_COMPOSITE | typings.screeps.RESOURCE_CRYSTAL | typings.screeps.RESOURCE_LIQUID | typings.screeps.RESOURCE_WIRE | typings.screeps.RESOURCE_SWITCH | typings.screeps.RESOURCE_TRANSISTOR | typings.screeps.RESOURCE_MICROCHIP | typings.screeps.RESOURCE_CIRCUIT | typings.screeps.RESOURCE_DEVICE | typings.screeps.RESOURCE_CELL | typings.screeps.RESOURCE_PHLEGM | typings.screeps.RESOURCE_TISSUE | typings.screeps.RESOURCE_MUSCLE | typings.screeps.RESOURCE_ORGANOID | typings.screeps.RESOURCE_ORGANISM | typings.screeps.RESOURCE_ALLOY | typings.screeps.RESOURCE_TUBE | typings.screeps.RESOURCE_FIXTURES | typings.screeps.RESOURCE_FRAME | typings.screeps.RESOURCE_HYDRAULICS | typings.screeps.RESOURCE_MACHINE | typings.screeps.RESOURCE_CONDENSATE | typings.screeps.RESOURCE_CONCENTRATE | typings.screeps.RESOURCE_EXTRACT | typings.screeps.RESOURCE_SPIRIT | typings.screeps.RESOURCE_EMANATION | typings.screeps.RESOURCE_ESSENCE
  type CreepActionReturnCode = typings.screeps.OK | typings.screeps.ERR_NOT_OWNER | typings.screeps.ERR_BUSY | typings.screeps.ERR_INVALID_TARGET | typings.screeps.ERR_NOT_IN_RANGE | typings.screeps.ERR_NO_BODYPART | typings.screeps.ERR_TIRED
  type CreepMoveReturnCode = typings.screeps.OK | typings.screeps.ERR_NOT_OWNER | typings.screeps.ERR_BUSY | typings.screeps.ERR_TIRED | typings.screeps.ERR_NO_BODYPART
  /** The raw deposits */
  type DepositConstant = typings.screeps.RESOURCE_MIST | typings.screeps.RESOURCE_BIOMASS | typings.screeps.RESOURCE_METAL | typings.screeps.RESOURCE_SILICON
  // Direction Constants
  type DirectionConstant = typings.screeps.TOP | typings.screeps.TOP_RIGHT | typings.screeps.RIGHT | typings.screeps.BOTTOM_RIGHT | typings.screeps.BOTTOM | typings.screeps.BOTTOM_LEFT | typings.screeps.LEFT | typings.screeps.TOP_LEFT
  type EFFECT_COLLAPSE_TIMER = typings.screeps.screepsNumbers.`1002`
  type EFFECT_INVULNERABILITY = typings.screeps.screepsNumbers.`1001`
  type ERR_BUSY = typings.screeps.screepsNumbers.`-4`
  type ERR_FULL = typings.screeps.screepsNumbers.`-8`
  type ERR_GCL_NOT_ENOUGH = typings.screeps.screepsNumbers.`-15`
  type ERR_INVALID_ARGS = typings.screeps.screepsNumbers.`-10`
  type ERR_INVALID_TARGET = typings.screeps.screepsNumbers.`-7`
  type ERR_NAME_EXISTS = typings.screeps.screepsNumbers.`-3`
  type ERR_NOT_ENOUGH_ENERGY = typings.screeps.screepsNumbers.`-6`
  type ERR_NOT_ENOUGH_EXTENSIONS = typings.screeps.screepsNumbers.`-6`
  type ERR_NOT_ENOUGH_RESOURCES = typings.screeps.screepsNumbers.`-6`
  type ERR_NOT_FOUND = typings.screeps.screepsNumbers.`-5`
  type ERR_NOT_IN_RANGE = typings.screeps.screepsNumbers.`-9`
  type ERR_NOT_OWNER = typings.screeps.screepsNumbers.`-1`
  type ERR_NO_BODYPART = typings.screeps.screepsNumbers.`-12`
  type ERR_NO_PATH = typings.screeps.screepsNumbers.`-2`
  type ERR_RCL_NOT_ENOUGH = typings.screeps.screepsNumbers.`-14`
  type ERR_TIRED = typings.screeps.screepsNumbers.`-11`
  type EVENT_ATTACK = typings.screeps.screepsNumbers.`1`
  type EVENT_ATTACK_CONTROLLER = typings.screeps.screepsNumbers.`3`
  type EVENT_ATTACK_TYPE_DISMANTLE = typings.screeps.screepsNumbers.`4`
  type EVENT_ATTACK_TYPE_HIT_BACK = typings.screeps.screepsNumbers.`5`
  type EVENT_ATTACK_TYPE_MELEE = typings.screeps.screepsNumbers.`1`
  type EVENT_ATTACK_TYPE_NUKE = typings.screeps.screepsNumbers.`6`
  type EVENT_ATTACK_TYPE_RANGED = typings.screeps.screepsNumbers.`2`
  type EVENT_ATTACK_TYPE_RANGED_MASS = typings.screeps.screepsNumbers.`3`
  type EVENT_BUILD = typings.screeps.screepsNumbers.`4`
  type EVENT_EXIT = typings.screeps.screepsNumbers.`10`
  type EVENT_HARVEST = typings.screeps.screepsNumbers.`5`
  type EVENT_HEAL = typings.screeps.screepsNumbers.`6`
  type EVENT_HEAL_TYPE_MELEE = typings.screeps.screepsNumbers.`1`
  type EVENT_HEAL_TYPE_RANGED = typings.screeps.screepsNumbers.`2`
  type EVENT_OBJECT_DESTROYED = typings.screeps.screepsNumbers.`2`
  type EVENT_POWER = typings.screeps.screepsNumbers.`11`
  type EVENT_REPAIR = typings.screeps.screepsNumbers.`7`
  type EVENT_RESERVE_CONTROLLER = typings.screeps.screepsNumbers.`8`
  type EVENT_TRANSFER = typings.screeps.screepsNumbers.`12`
  type EVENT_UPGRADE_CONTROLLER = typings.screeps.screepsNumbers.`9`
  type EffectConstant = typings.screeps.EFFECT_INVULNERABILITY | typings.screeps.EFFECT_COLLAPSE_TIMER
  type EventAttackType = typings.screeps.EVENT_ATTACK_TYPE_MELEE | typings.screeps.EVENT_ATTACK_TYPE_RANGED | typings.screeps.EVENT_ATTACK_TYPE_RANGED_MASS | typings.screeps.EVENT_ATTACK_TYPE_DISMANTLE | typings.screeps.EVENT_ATTACK_TYPE_HIT_BACK | typings.screeps.EVENT_ATTACK_TYPE_NUKE
  type EventConstant = typings.screeps.EVENT_ATTACK | typings.screeps.EVENT_OBJECT_DESTROYED | typings.screeps.EVENT_ATTACK_CONTROLLER | typings.screeps.EVENT_BUILD | typings.screeps.EVENT_HARVEST | typings.screeps.EVENT_HEAL | typings.screeps.EVENT_REPAIR | typings.screeps.EVENT_RESERVE_CONTROLLER | typings.screeps.EVENT_UPGRADE_CONTROLLER | typings.screeps.EVENT_EXIT | typings.screeps.EVENT_POWER | typings.screeps.EVENT_TRANSFER
  type EventDestroyType = typings.screeps.screepsStrings.creep | typings.screeps.StructureConstant
  type EventHealType = typings.screeps.EVENT_HEAL_TYPE_MELEE | typings.screeps.EVENT_HEAL_TYPE_RANGED
  // Find Constants
  type ExitConstant = typings.screeps.FIND_EXIT_TOP | typings.screeps.FIND_EXIT_RIGHT | typings.screeps.FIND_EXIT_BOTTOM | typings.screeps.FIND_EXIT_LEFT
  type FIND_CONSTRUCTION_SITES = typings.screeps.screepsNumbers.`111`
  type FIND_CREEPS = typings.screeps.screepsNumbers.`101`
  type FIND_DEPOSITS = typings.screeps.screepsNumbers.`122`
  type FIND_DROPPED_RESOURCES = typings.screeps.screepsNumbers.`106`
  type FIND_EXIT = typings.screeps.screepsNumbers.`10`
  type FIND_EXIT_BOTTOM = typings.screeps.screepsNumbers.`5`
  type FIND_EXIT_LEFT = typings.screeps.screepsNumbers.`7`
  type FIND_EXIT_RIGHT = typings.screeps.screepsNumbers.`3`
  type FIND_EXIT_TOP = typings.screeps.screepsNumbers.`1`
  type FIND_FLAGS = typings.screeps.screepsNumbers.`110`
  type FIND_HOSTILE_CONSTRUCTION_SITES = typings.screeps.screepsNumbers.`115`
  type FIND_HOSTILE_CREEPS = typings.screeps.screepsNumbers.`103`
  type FIND_HOSTILE_POWER_CREEPS = typings.screeps.screepsNumbers.`121`
  type FIND_HOSTILE_SPAWNS = typings.screeps.screepsNumbers.`113`
  type FIND_HOSTILE_STRUCTURES = typings.screeps.screepsNumbers.`109`
  type FIND_MINERALS = typings.screeps.screepsNumbers.`116`
  type FIND_MY_CONSTRUCTION_SITES = typings.screeps.screepsNumbers.`114`
  type FIND_MY_CREEPS = typings.screeps.screepsNumbers.`102`
  type FIND_MY_POWER_CREEPS = typings.screeps.screepsNumbers.`120`
  type FIND_MY_SPAWNS = typings.screeps.screepsNumbers.`112`
  type FIND_MY_STRUCTURES = typings.screeps.screepsNumbers.`108`
  type FIND_NUKES = typings.screeps.screepsNumbers.`117`
  type FIND_POWER_CREEPS = typings.screeps.screepsNumbers.`119`
  type FIND_RUINS = typings.screeps.screepsNumbers.`123`
  type FIND_SOURCES = typings.screeps.screepsNumbers.`105`
  type FIND_SOURCES_ACTIVE = typings.screeps.screepsNumbers.`104`
  type FIND_STRUCTURES = typings.screeps.screepsNumbers.`107`
  type FIND_TOMBSTONES = typings.screeps.screepsNumbers.`118`
  type FilterFunction[T /* <: typings.screeps.FindConstant */] = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[T] */ /* object */ js.Any, 
    scala.Boolean
  ]
  type FilterObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type FindConstant = typings.screeps.FIND_EXIT_TOP | typings.screeps.FIND_EXIT_RIGHT | typings.screeps.FIND_EXIT_BOTTOM | typings.screeps.FIND_EXIT_LEFT | typings.screeps.FIND_EXIT | typings.screeps.FIND_CREEPS | typings.screeps.FIND_MY_CREEPS | typings.screeps.FIND_HOSTILE_CREEPS | typings.screeps.FIND_SOURCES_ACTIVE | typings.screeps.FIND_SOURCES | typings.screeps.FIND_DROPPED_RESOURCES | typings.screeps.FIND_STRUCTURES | typings.screeps.FIND_MY_STRUCTURES | typings.screeps.FIND_HOSTILE_STRUCTURES | typings.screeps.FIND_FLAGS | typings.screeps.FIND_CONSTRUCTION_SITES | typings.screeps.FIND_MY_SPAWNS | typings.screeps.FIND_HOSTILE_SPAWNS | typings.screeps.FIND_MY_CONSTRUCTION_SITES | typings.screeps.FIND_HOSTILE_CONSTRUCTION_SITES | typings.screeps.FIND_MINERALS | typings.screeps.FIND_NUKES | typings.screeps.FIND_TOMBSTONES | typings.screeps.FIND_POWER_CREEPS | typings.screeps.FIND_MY_POWER_CREEPS | typings.screeps.FIND_HOSTILE_POWER_CREEPS | typings.screeps.FIND_DEPOSITS | typings.screeps.FIND_RUINS
  type HEAL = typings.screeps.screepsStrings.heal
  type Id[T] = java.lang.String with typings.screeps.Tag.OpaqueTag[T]
  type LEFT = typings.screeps.screepsNumbers.`7`
  type LOOK_CONSTRUCTION_SITES = typings.screeps.screepsStrings.constructionSite
  type LOOK_CREEPS = typings.screeps.screepsStrings.creep
  type LOOK_DEPOSITS = typings.screeps.screepsStrings.deposit
  type LOOK_ENERGY = typings.screeps.screepsStrings.energy
  type LOOK_FLAGS = typings.screeps.screepsStrings.flag
  type LOOK_MINERALS = typings.screeps.screepsStrings.mineral
  type LOOK_NUKES = typings.screeps.screepsStrings.nuke
  type LOOK_POWER_CREEPS = typings.screeps.screepsStrings.powerCreep
  type LOOK_RESOURCES = typings.screeps.screepsStrings.resource
  type LOOK_RUINS = typings.screeps.screepsStrings.ruin
  type LOOK_SOURCES = typings.screeps.screepsStrings.source
  type LOOK_STRUCTURES = typings.screeps.screepsStrings.structure
  type LOOK_TERRAIN = typings.screeps.screepsStrings.terrain
  type LOOK_TOMBSTONES = typings.screeps.screepsStrings.tombstone
  type LookAtResult[K /* <: typings.screeps.LookConstant */] = (typings.std.Pick[typings.screeps.LookAtTypes, K]) with typings.screeps.anon.Type[K]
  type LookAtResultMatrix[K /* <: typings.screeps.LookConstant */] = org.scalablytyped.runtime.NumberDictionary[
    org.scalablytyped.runtime.NumberDictionary[js.Array[typings.screeps.LookAtResult[K]]]
  ]
  type LookAtResultWithPos[K /* <: typings.screeps.LookConstant */] = typings.screeps.LookAtResult[K] with typings.screeps.anon.X
  // Look Constants
  type LookConstant = typings.screeps.LOOK_CREEPS | typings.screeps.LOOK_ENERGY | typings.screeps.LOOK_RESOURCES | typings.screeps.LOOK_SOURCES | typings.screeps.LOOK_MINERALS | typings.screeps.LOOK_DEPOSITS | typings.screeps.LOOK_STRUCTURES | typings.screeps.LOOK_FLAGS | typings.screeps.LOOK_CONSTRUCTION_SITES | typings.screeps.LOOK_NUKES | typings.screeps.LOOK_TERRAIN | typings.screeps.LOOK_TOMBSTONES | typings.screeps.LOOK_POWER_CREEPS | typings.screeps.LOOK_RUINS
  type LookForAtAreaResultArray[T, K /* <: typings.screeps.screepsStrings.exit | typings.screeps.screepsStrings.structure | typings.screeps.screepsStrings.source | typings.screeps.screepsStrings.nuke | typings.screeps.screepsStrings.deposit | typings.screeps.screepsStrings.powerCreep | typings.screeps.screepsStrings.terrain | typings.screeps.screepsStrings.tombstone | typings.screeps.screepsStrings.resource | typings.screeps.screepsStrings.flag | typings.screeps.screepsStrings.mineral | typings.screeps.screepsStrings.ruin | typings.screeps.screepsStrings.constructionSite | typings.screeps.screepsStrings.creep | typings.screeps.screepsStrings.energy */] = js.Array[typings.screeps.LookForAtAreaResultWithPos[T, K]]
  type LookForAtAreaResultMatrix[T, K /* <: typings.screeps.screepsStrings.exit | typings.screeps.screepsStrings.structure | typings.screeps.screepsStrings.source | typings.screeps.screepsStrings.nuke | typings.screeps.screepsStrings.deposit | typings.screeps.screepsStrings.powerCreep | typings.screeps.screepsStrings.terrain | typings.screeps.screepsStrings.tombstone | typings.screeps.screepsStrings.resource | typings.screeps.screepsStrings.flag | typings.screeps.screepsStrings.mineral | typings.screeps.screepsStrings.ruin | typings.screeps.screepsStrings.constructionSite | typings.screeps.screepsStrings.creep | typings.screeps.screepsStrings.energy */] = org.scalablytyped.runtime.NumberDictionary[
    org.scalablytyped.runtime.NumberDictionary[js.Array[typings.screeps.LookForAtAreaResult[T, K]]]
  ]
  type LookForAtAreaResultWithPos[T, K /* <: typings.screeps.screepsStrings.exit | typings.screeps.screepsStrings.structure | typings.screeps.screepsStrings.source | typings.screeps.screepsStrings.nuke | typings.screeps.screepsStrings.deposit | typings.screeps.screepsStrings.powerCreep | typings.screeps.screepsStrings.terrain | typings.screeps.screepsStrings.tombstone | typings.screeps.screepsStrings.resource | typings.screeps.screepsStrings.flag | typings.screeps.screepsStrings.mineral | typings.screeps.screepsStrings.ruin | typings.screeps.screepsStrings.constructionSite | typings.screeps.screepsStrings.creep | typings.screeps.screepsStrings.energy */] = (typings.screeps.LookForAtAreaResult[T, K]) with typings.screeps.anon.X
  type MOVE = typings.screeps.screepsStrings.move
  type MarketResourceConstant = typings.screeps.ResourceConstant | typings.screeps.SUBSCRIPTION_TOKEN
  /** The compounds which can't boost */
  type MineralBaseCompoundsConstant = typings.screeps.RESOURCE_HYDROXIDE | typings.screeps.RESOURCE_ZYNTHIUM_KEANITE | typings.screeps.RESOURCE_UTRIUM_LEMERGITE | typings.screeps.RESOURCE_GHODIUM
  /** The boosts (from tier 1 to tier 3) */
  type MineralBoostConstant = typings.screeps.RESOURCE_UTRIUM_HYDRIDE | typings.screeps.RESOURCE_UTRIUM_OXIDE | typings.screeps.RESOURCE_KEANIUM_HYDRIDE | typings.screeps.RESOURCE_KEANIUM_OXIDE | typings.screeps.RESOURCE_LEMERGIUM_HYDRIDE | typings.screeps.RESOURCE_LEMERGIUM_OXIDE | typings.screeps.RESOURCE_ZYNTHIUM_HYDRIDE | typings.screeps.RESOURCE_ZYNTHIUM_OXIDE | typings.screeps.RESOURCE_GHODIUM_HYDRIDE | typings.screeps.RESOURCE_GHODIUM_OXIDE | typings.screeps.RESOURCE_UTRIUM_ACID | typings.screeps.RESOURCE_UTRIUM_ALKALIDE | typings.screeps.RESOURCE_KEANIUM_ACID | typings.screeps.RESOURCE_KEANIUM_ALKALIDE | typings.screeps.RESOURCE_LEMERGIUM_ACID | typings.screeps.RESOURCE_LEMERGIUM_ALKALIDE | typings.screeps.RESOURCE_ZYNTHIUM_ACID | typings.screeps.RESOURCE_ZYNTHIUM_ALKALIDE | typings.screeps.RESOURCE_GHODIUM_ACID | typings.screeps.RESOURCE_GHODIUM_ALKALIDE | typings.screeps.RESOURCE_CATALYZED_UTRIUM_ACID | typings.screeps.RESOURCE_CATALYZED_UTRIUM_ALKALIDE | typings.screeps.RESOURCE_CATALYZED_KEANIUM_ACID | typings.screeps.RESOURCE_CATALYZED_KEANIUM_ALKALIDE | typings.screeps.RESOURCE_CATALYZED_LEMERGIUM_ACID | typings.screeps.RESOURCE_CATALYZED_LEMERGIUM_ALKALIDE | typings.screeps.RESOURCE_CATALYZED_ZYNTHIUM_ACID | typings.screeps.RESOURCE_CATALYZED_ZYNTHIUM_ALKALIDE | typings.screeps.RESOURCE_CATALYZED_GHODIUM_ACID | typings.screeps.RESOURCE_CATALYZED_GHODIUM_ALKALIDE
  /** All the mineral compounds */
  type MineralCompoundConstant = typings.screeps.MineralBaseCompoundsConstant | typings.screeps.MineralBoostConstant
  /** The raw harvestable minerals */
  type MineralConstant = typings.screeps.RESOURCE_UTRIUM | typings.screeps.RESOURCE_LEMERGIUM | typings.screeps.RESOURCE_KEANIUM | typings.screeps.RESOURCE_ZYNTHIUM | typings.screeps.RESOURCE_OXYGEN | typings.screeps.RESOURCE_HYDROGEN | typings.screeps.RESOURCE_CATALYST
  type OK = typings.screeps.screepsNumbers.`0`
  type ORDER_BUY = typings.screeps.screepsStrings.buy
  type ORDER_SELL = typings.screeps.screepsStrings.sell
  type PIXEL = typings.screeps.screepsStrings.pixel
  type PWR_DISRUPT_SOURCE = typings.screeps.screepsNumbers.`11`
  type PWR_DISRUPT_SPAWN = typings.screeps.screepsNumbers.`9`
  type PWR_DISRUPT_TERMINAL = typings.screeps.screepsNumbers.`15`
  type PWR_DISRUPT_TOWER = typings.screeps.screepsNumbers.`10`
  type PWR_FORTIFY = typings.screeps.screepsNumbers.`17`
  type PWR_GENERATE_OPS = typings.screeps.screepsNumbers.`1`
  type PWR_OPERATE_CONTROLLER = typings.screeps.screepsNumbers.`18`
  type PWR_OPERATE_EXTENSION = typings.screeps.screepsNumbers.`6`
  type PWR_OPERATE_FACTORY = typings.screeps.screepsNumbers.`19`
  type PWR_OPERATE_LAB = typings.screeps.screepsNumbers.`5`
  type PWR_OPERATE_OBSERVER = typings.screeps.screepsNumbers.`7`
  type PWR_OPERATE_POWER = typings.screeps.screepsNumbers.`16`
  type PWR_OPERATE_SPAWN = typings.screeps.screepsNumbers.`2`
  type PWR_OPERATE_STORAGE = typings.screeps.screepsNumbers.`4`
  type PWR_OPERATE_TERMINAL = typings.screeps.screepsNumbers.`8`
  type PWR_OPERATE_TOWER = typings.screeps.screepsNumbers.`3`
  type PWR_REGEN_MINERAL = typings.screeps.screepsNumbers.`14`
  type PWR_REGEN_SOURCE = typings.screeps.screepsNumbers.`13`
  type PWR_SHIELD = typings.screeps.screepsNumbers.`12`
  /* Inlined screeps.POWER_CLASS['OPERATOR'] */
  type PowerClassConstant = typings.screeps.screepsStrings.operator
  type PowerConstant = typings.screeps.PWR_GENERATE_OPS | typings.screeps.PWR_OPERATE_SPAWN | typings.screeps.PWR_OPERATE_TOWER | typings.screeps.PWR_OPERATE_STORAGE | typings.screeps.PWR_OPERATE_LAB | typings.screeps.PWR_OPERATE_EXTENSION | typings.screeps.PWR_OPERATE_OBSERVER | typings.screeps.PWR_OPERATE_TERMINAL | typings.screeps.PWR_DISRUPT_SPAWN | typings.screeps.PWR_DISRUPT_TOWER | typings.screeps.PWR_DISRUPT_SOURCE | typings.screeps.PWR_SHIELD | typings.screeps.PWR_REGEN_SOURCE | typings.screeps.PWR_REGEN_MINERAL | typings.screeps.PWR_DISRUPT_TERMINAL | typings.screeps.PWR_OPERATE_POWER | typings.screeps.PWR_FORTIFY | typings.screeps.PWR_OPERATE_CONTROLLER | typings.screeps.PWR_OPERATE_FACTORY
  /**
    * Available powers, an object with power ID as a key, and the following properties
    */
  type PowerCreepPowers = org.scalablytyped.runtime.NumberDictionary[typings.screeps.anon.Cooldown]
  type RANGED_ATTACK = typings.screeps.screepsStrings.ranged_attack
  type RESOURCE_ALLOY = typings.screeps.screepsStrings.alloy
  type RESOURCE_BATTERY = typings.screeps.screepsStrings.battery
  type RESOURCE_BIOMASS = typings.screeps.screepsStrings.biomass
  type RESOURCE_CATALYST = typings.screeps.screepsStrings.X
  type RESOURCE_CATALYZED_GHODIUM_ACID = typings.screeps.screepsStrings.XGH2O
  type RESOURCE_CATALYZED_GHODIUM_ALKALIDE = typings.screeps.screepsStrings.XGHO2
  type RESOURCE_CATALYZED_KEANIUM_ACID = typings.screeps.screepsStrings.XKH2O
  type RESOURCE_CATALYZED_KEANIUM_ALKALIDE = typings.screeps.screepsStrings.XKHO2
  type RESOURCE_CATALYZED_LEMERGIUM_ACID = typings.screeps.screepsStrings.XLH2O
  type RESOURCE_CATALYZED_LEMERGIUM_ALKALIDE = typings.screeps.screepsStrings.XLHO2
  type RESOURCE_CATALYZED_UTRIUM_ACID = typings.screeps.screepsStrings.XUH2O
  type RESOURCE_CATALYZED_UTRIUM_ALKALIDE = typings.screeps.screepsStrings.XUHO2
  type RESOURCE_CATALYZED_ZYNTHIUM_ACID = typings.screeps.screepsStrings.XZH2O
  type RESOURCE_CATALYZED_ZYNTHIUM_ALKALIDE = typings.screeps.screepsStrings.XZHO2
  type RESOURCE_CELL = typings.screeps.screepsStrings.cell
  type RESOURCE_CIRCUIT = typings.screeps.screepsStrings.circuit
  type RESOURCE_COMPOSITE = typings.screeps.screepsStrings.composite
  type RESOURCE_CONCENTRATE = typings.screeps.screepsStrings.concentrate
  type RESOURCE_CONDENSATE = typings.screeps.screepsStrings.condensate
  type RESOURCE_CRYSTAL = typings.screeps.screepsStrings.crystal
  type RESOURCE_DEVICE = typings.screeps.screepsStrings.device
  type RESOURCE_EMANATION = typings.screeps.screepsStrings.emanation
  type RESOURCE_ENERGY = typings.screeps.screepsStrings.energy
  type RESOURCE_ESSENCE = typings.screeps.screepsStrings.essence
  type RESOURCE_EXTRACT = typings.screeps.screepsStrings.extract
  type RESOURCE_FIXTURES = typings.screeps.screepsStrings.fixtures
  type RESOURCE_FRAME = typings.screeps.screepsStrings.frame
  type RESOURCE_GHODIUM = typings.screeps.screepsStrings.G
  type RESOURCE_GHODIUM_ACID = typings.screeps.screepsStrings.GH2O
  type RESOURCE_GHODIUM_ALKALIDE = typings.screeps.screepsStrings.GHO2
  type RESOURCE_GHODIUM_HYDRIDE = typings.screeps.screepsStrings.GH
  type RESOURCE_GHODIUM_MELT = typings.screeps.screepsStrings.ghodium_melt
  type RESOURCE_GHODIUM_OXIDE = typings.screeps.screepsStrings.GO
  type RESOURCE_HYDRAULICS = typings.screeps.screepsStrings.hydraulics
  type RESOURCE_HYDROGEN = typings.screeps.screepsStrings.H
  type RESOURCE_HYDROXIDE = typings.screeps.screepsStrings.OH
  type RESOURCE_KEANIUM = typings.screeps.screepsStrings.K
  type RESOURCE_KEANIUM_ACID = typings.screeps.screepsStrings.KH2O
  type RESOURCE_KEANIUM_ALKALIDE = typings.screeps.screepsStrings.KHO2
  type RESOURCE_KEANIUM_BAR = typings.screeps.screepsStrings.keanium_bar
  type RESOURCE_KEANIUM_HYDRIDE = typings.screeps.screepsStrings.KH
  type RESOURCE_KEANIUM_OXIDE = typings.screeps.screepsStrings.KO
  type RESOURCE_LEMERGIUM = typings.screeps.screepsStrings.L
  type RESOURCE_LEMERGIUM_ACID = typings.screeps.screepsStrings.LH2O
  type RESOURCE_LEMERGIUM_ALKALIDE = typings.screeps.screepsStrings.LHO2
  type RESOURCE_LEMERGIUM_BAR = typings.screeps.screepsStrings.lemergium_bar
  type RESOURCE_LEMERGIUM_HYDRIDE = typings.screeps.screepsStrings.LH
  type RESOURCE_LEMERGIUM_OXIDE = typings.screeps.screepsStrings.LO
  type RESOURCE_LIQUID = typings.screeps.screepsStrings.liquid
  type RESOURCE_MACHINE = typings.screeps.screepsStrings.machine
  type RESOURCE_METAL = typings.screeps.screepsStrings.metal
  type RESOURCE_MICROCHIP = typings.screeps.screepsStrings.microchip
  type RESOURCE_MIST = typings.screeps.screepsStrings.mist
  type RESOURCE_MUSCLE = typings.screeps.screepsStrings.muscle
  type RESOURCE_OPS = typings.screeps.screepsStrings.ops
  type RESOURCE_ORGANISM = typings.screeps.screepsStrings.organism
  type RESOURCE_ORGANOID = typings.screeps.screepsStrings.organoid
  type RESOURCE_OXIDANT = typings.screeps.screepsStrings.oxidant
  type RESOURCE_OXYGEN = typings.screeps.screepsStrings.O
  type RESOURCE_PHLEGM = typings.screeps.screepsStrings.phlegm
  type RESOURCE_POWER = typings.screeps.screepsStrings.power
  type RESOURCE_PURIFIER = typings.screeps.screepsStrings.purifier
  type RESOURCE_REDUCTANT = typings.screeps.screepsStrings.reductant
  type RESOURCE_SILICON = typings.screeps.screepsStrings.silicon
  type RESOURCE_SPIRIT = typings.screeps.screepsStrings.spirit
  type RESOURCE_SWITCH = typings.screeps.screepsStrings.switch
  type RESOURCE_TISSUE = typings.screeps.screepsStrings.tissue
  type RESOURCE_TRANSISTOR = typings.screeps.screepsStrings.transistor
  type RESOURCE_TUBE = typings.screeps.screepsStrings.tube
  type RESOURCE_UTRIUM = typings.screeps.screepsStrings.U
  type RESOURCE_UTRIUM_ACID = typings.screeps.screepsStrings.UH2O
  type RESOURCE_UTRIUM_ALKALIDE = typings.screeps.screepsStrings.UHO2
  type RESOURCE_UTRIUM_BAR = typings.screeps.screepsStrings.utrium_bar
  type RESOURCE_UTRIUM_HYDRIDE = typings.screeps.screepsStrings.UH
  type RESOURCE_UTRIUM_LEMERGITE = typings.screeps.screepsStrings.UL
  type RESOURCE_UTRIUM_OXIDE = typings.screeps.screepsStrings.UO
  type RESOURCE_WIRE = typings.screeps.screepsStrings.wire
  type RESOURCE_ZYNTHIUM = typings.screeps.screepsStrings.Z
  type RESOURCE_ZYNTHIUM_ACID = typings.screeps.screepsStrings.ZH2O
  type RESOURCE_ZYNTHIUM_ALKALIDE = typings.screeps.screepsStrings.ZHO2
  type RESOURCE_ZYNTHIUM_BAR = typings.screeps.screepsStrings.zynthium_bar
  type RESOURCE_ZYNTHIUM_HYDRIDE = typings.screeps.screepsStrings.ZH
  type RESOURCE_ZYNTHIUM_KEANITE = typings.screeps.screepsStrings.ZK
  type RESOURCE_ZYNTHIUM_OXIDE = typings.screeps.screepsStrings.ZO
  type RIGHT = typings.screeps.screepsNumbers.`3`
  // Resource Constants
  type ResourceConstant = typings.screeps.RESOURCE_ENERGY | typings.screeps.RESOURCE_POWER | typings.screeps.RESOURCE_OPS | typings.screeps.MineralConstant | typings.screeps.MineralCompoundConstant | typings.screeps.DepositConstant | typings.screeps.CommodityConstant
  type STRUCTURE_CONTAINER = typings.screeps.screepsStrings.container
  type STRUCTURE_CONTROLLER = typings.screeps.screepsStrings.controller
  type STRUCTURE_EXTENSION = typings.screeps.screepsStrings.extension
  type STRUCTURE_EXTRACTOR = typings.screeps.screepsStrings.extractor
  type STRUCTURE_FACTORY = typings.screeps.screepsStrings.factory
  type STRUCTURE_INVADER_CORE = typings.screeps.screepsStrings.invaderCore
  type STRUCTURE_KEEPER_LAIR = typings.screeps.screepsStrings.keeperLair
  type STRUCTURE_LAB = typings.screeps.screepsStrings.lab
  type STRUCTURE_LINK = typings.screeps.screepsStrings.link
  type STRUCTURE_NUKER = typings.screeps.screepsStrings.nuker
  type STRUCTURE_OBSERVER = typings.screeps.screepsStrings.observer
  type STRUCTURE_PORTAL = typings.screeps.screepsStrings.portal
  type STRUCTURE_POWER_BANK = typings.screeps.screepsStrings.powerBank
  type STRUCTURE_POWER_SPAWN = typings.screeps.screepsStrings.powerSpawn
  type STRUCTURE_RAMPART = typings.screeps.screepsStrings.rampart
  type STRUCTURE_ROAD = typings.screeps.screepsStrings.road
  type STRUCTURE_SPAWN = typings.screeps.screepsStrings.spawn
  type STRUCTURE_STORAGE = typings.screeps.screepsStrings.storage
  type STRUCTURE_TERMINAL = typings.screeps.screepsStrings.terminal
  type STRUCTURE_TOWER = typings.screeps.screepsStrings.tower
  type STRUCTURE_WALL = typings.screeps.screepsStrings.constructedWall
  type SUBSCRIPTION_TOKEN = typings.screeps.screepsStrings.token
  // Return Codes
  type ScreepsReturnCode = typings.screeps.OK | typings.screeps.ERR_NOT_OWNER | typings.screeps.ERR_NO_PATH | typings.screeps.ERR_BUSY | typings.screeps.ERR_NAME_EXISTS | typings.screeps.ERR_NOT_FOUND | typings.screeps.ERR_NOT_ENOUGH_RESOURCES | typings.screeps.ERR_NOT_ENOUGH_ENERGY | typings.screeps.ERR_INVALID_TARGET | typings.screeps.ERR_FULL | typings.screeps.ERR_NOT_IN_RANGE | typings.screeps.ERR_INVALID_ARGS | typings.screeps.ERR_TIRED | typings.screeps.ERR_NO_BODYPART | typings.screeps.ERR_NOT_ENOUGH_EXTENSIONS | typings.screeps.ERR_RCL_NOT_ENOUGH | typings.screeps.ERR_GCL_NOT_ENOUGH
  type Store[POSSIBLE_RESOURCES /* <: typings.screeps.ResourceConstant */, UNLIMITED_STORE /* <: scala.Boolean */] = (typings.screeps.StoreBase[POSSIBLE_RESOURCES, UNLIMITED_STORE]) with typings.screeps.screepsStrings.Store with org.scalablytyped.runtime.TopLevel[js.Any]
  type StructureConstant = typings.screeps.BuildableStructureConstant | typings.screeps.STRUCTURE_KEEPER_LAIR | typings.screeps.STRUCTURE_CONTROLLER | typings.screeps.STRUCTURE_POWER_BANK | typings.screeps.STRUCTURE_PORTAL | typings.screeps.STRUCTURE_INVADER_CORE
  type TERRAIN_MASK_LAVA = typings.screeps.screepsNumbers.`4`
  type TERRAIN_MASK_SWAMP = typings.screeps.screepsNumbers.`2`
  // Terrain mask constants
  type TERRAIN_MASK_WALL = typings.screeps.screepsNumbers.`1`
  type TOMBSTONE_DECAY_PER_PART = typings.screeps.screepsNumbers.`5`
  type TOP = typings.screeps.screepsNumbers.`1`
  type TOP_LEFT = typings.screeps.screepsNumbers.`8`
  type TOP_RIGHT = typings.screeps.screepsNumbers.`2`
  type TOUGH = typings.screeps.screepsStrings.tough
  type WORK = typings.screeps.screepsStrings.work
}
