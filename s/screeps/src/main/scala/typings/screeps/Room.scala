package typings.screeps

import typings.screeps.anon.LookAtResultLookConstant
import typings.screeps.anon.LookAtResultWithPosLookCo
import typings.screeps.anon.Pos
import typings.screeps.screepsBooleans.`false`
import typings.screeps.screepsBooleans.`true`
import typings.screeps.screepsStrings.constructionSite
import typings.screeps.screepsStrings.creep
import typings.screeps.screepsStrings.deposit
import typings.screeps.screepsStrings.energy
import typings.screeps.screepsStrings.exit
import typings.screeps.screepsStrings.flag
import typings.screeps.screepsStrings.mineral
import typings.screeps.screepsStrings.nuke
import typings.screeps.screepsStrings.powerCreep
import typings.screeps.screepsStrings.resource
import typings.screeps.screepsStrings.ruin
import typings.screeps.screepsStrings.source
import typings.screeps.screepsStrings.structure
import typings.screeps.screepsStrings.terrain
import typings.screeps.screepsStrings.tombstone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object representing the room in which your units and structures are in.
  *
  * It can be used to look around, find paths, etc.
  *
  * Every object in the room contains its linked Room instance in the room property.
  */
@js.native
trait Room extends js.Object {
  
  /**
    * The Controller structure of this room, if present, otherwise undefined.
    */
  var controller: js.UndefOr[StructureController] = js.native
  
  def createConstructionSite(pos: HasRoomPosition, structureType: STRUCTURE_SPAWN): ScreepsReturnCode = js.native
  def createConstructionSite(pos: HasRoomPosition, structureType: STRUCTURE_SPAWN, name: String): ScreepsReturnCode = js.native
  def createConstructionSite(pos: HasRoomPosition, structureType: StructureConstant): ScreepsReturnCode = js.native
  /**
    * Create new ConstructionSite at the specified location.
    * @param pos Can be a RoomPosition object or any object containing RoomPosition.
    * @param structureType One of the following constants: STRUCTURE_EXTENSION, STRUCTURE_RAMPART, STRUCTURE_ROAD, STRUCTURE_SPAWN, STRUCTURE_WALL, STRUCTURE_LINK
    * @param name The name of the structure, for structures that support it (currently only spawns).
    * @returns Result Code: OK, ERR_INVALID_TARGET, ERR_INVALID_ARGS, ERR_RCL_NOT_ENOUGH
    */
  def createConstructionSite(pos: RoomPosition, structureType: STRUCTURE_SPAWN): ScreepsReturnCode = js.native
  def createConstructionSite(pos: RoomPosition, structureType: STRUCTURE_SPAWN, name: String): ScreepsReturnCode = js.native
  /**
    * Create new ConstructionSite at the specified location.
    * @param pos Can be a RoomPosition object or any object containing RoomPosition.
    * @param structureType One of the following constants: STRUCTURE_EXTENSION, STRUCTURE_RAMPART, STRUCTURE_ROAD, STRUCTURE_SPAWN, STRUCTURE_WALL, STRUCTURE_LINK
    * @returns Result Code: OK, ERR_INVALID_TARGET, ERR_INVALID_ARGS, ERR_RCL_NOT_ENOUGH
    */
  def createConstructionSite(pos: RoomPosition, structureType: StructureConstant): ScreepsReturnCode = js.native
  /**
    * Create new ConstructionSite at the specified location.
    * @param x The X position.
    * @param y The Y position.
    * @param structureType One of the following constants: STRUCTURE_EXTENSION, STRUCTURE_RAMPART, STRUCTURE_ROAD, STRUCTURE_SPAWN, STRUCTURE_WALL, STRUCTURE_LINK
    * @returns Result Code: OK, ERR_INVALID_TARGET, ERR_INVALID_ARGS, ERR_RCL_NOT_ENOUGH
    */
  def createConstructionSite(x: Double, y: Double, structureType: BuildableStructureConstant): ScreepsReturnCode = js.native
  /**
    * Create new ConstructionSite at the specified location.
    * @param x The X position.
    * @param y The Y position.
    * @param structureType One of the following constants: STRUCTURE_EXTENSION, STRUCTURE_RAMPART, STRUCTURE_ROAD, STRUCTURE_SPAWN, STRUCTURE_WALL, STRUCTURE_LINK
    * @param name The name of the structure, for structures that support it (currently only spawns).
    * @returns Result Code: OK, ERR_INVALID_TARGET, ERR_INVALID_ARGS, ERR_RCL_NOT_ENOUGH
    */
  def createConstructionSite(x: Double, y: Double, structureType: STRUCTURE_SPAWN): ScreepsReturnCode = js.native
  def createConstructionSite(x: Double, y: Double, structureType: STRUCTURE_SPAWN, name: String): ScreepsReturnCode = js.native
  
  /**
    * Create new Flag at the specified location.
    * @param pos Can be a RoomPosition object or any object containing RoomPosition.
    * @param name (optional) The name of a new flag.
    *
    * It should be unique, i.e. the Game.flags object should not contain another flag with the same name (hash key).
    *
    * If not defined, a random name will be generated.
    *
    * The maximum length is 60 characters.
    * @param color The color of a new flag. Should be one of the COLOR_* constants. The default value is COLOR_WHITE.
    * @param secondaryColor The secondary color of a new flag. Should be one of the COLOR_* constants. The default value is equal to color.
    * @returns The name of a new flag, or one of the following error codes: ERR_NAME_EXISTS, ERR_INVALID_ARGS
    */
  def createFlag(pos: RoomPosition): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(
    pos: RoomPosition,
    name: js.UndefOr[scala.Nothing],
    color: js.UndefOr[ColorConstant],
    secondaryColor: ColorConstant
  ): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(pos: RoomPosition, name: js.UndefOr[scala.Nothing], color: ColorConstant): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(pos: RoomPosition, name: String): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(pos: RoomPosition, name: String, color: js.UndefOr[ColorConstant], secondaryColor: ColorConstant): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(pos: RoomPosition, name: String, color: ColorConstant): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(pos: Pos): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(
    pos: Pos,
    name: js.UndefOr[scala.Nothing],
    color: js.UndefOr[ColorConstant],
    secondaryColor: ColorConstant
  ): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(pos: Pos, name: js.UndefOr[scala.Nothing], color: ColorConstant): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(pos: Pos, name: String): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(pos: Pos, name: String, color: js.UndefOr[ColorConstant], secondaryColor: ColorConstant): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(pos: Pos, name: String, color: ColorConstant): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  /**
    * Create new Flag at the specified location.
    * @param x The X position.
    * @param y The Y position.
    * @param name (optional) The name of a new flag.
    *
    * It should be unique, i.e. the Game.flags object should not contain another flag with the same name (hash key).
    *
    * If not defined, a random name will be generated.
    *
    * The maximum length is 60 characters.
    * @param color The color of a new flag. Should be one of the COLOR_* constants. The default value is COLOR_WHITE.
    * @param secondaryColor The secondary color of a new flag. Should be one of the COLOR_* constants. The default value is equal to color.
    * @returns The name of a new flag, or one of the following error codes: ERR_NAME_EXISTS, ERR_INVALID_ARGS
    */
  def createFlag(x: Double, y: Double): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(
    x: Double,
    y: Double,
    name: js.UndefOr[scala.Nothing],
    color: js.UndefOr[ColorConstant],
    secondaryColor: ColorConstant
  ): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(x: Double, y: Double, name: js.UndefOr[scala.Nothing], color: ColorConstant): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(x: Double, y: Double, name: String): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(
    x: Double,
    y: Double,
    name: String,
    color: js.UndefOr[ColorConstant],
    secondaryColor: ColorConstant
  ): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  def createFlag(x: Double, y: Double, name: String, color: ColorConstant): ERR_NAME_EXISTS | ERR_INVALID_ARGS | String = js.native
  
  /**
    * Total amount of energy available in all spawns and extensions in the room.
    */
  var energyAvailable: Double = js.native
  
  /**
    * Total amount of energyCapacity of all spawns and extensions in the room.
    */
  var energyCapacityAvailable: Double = js.native
  
  /**
    * Find all objects of the specified type in the room.
    * @param type One of the following constants:
    *  * FIND_CREEPS
    *  * FIND_MY_CREEPS
    *  * FIND_HOSTILE_CREEPS
    *  * FIND_MY_SPAWNS
    *  * FIND_HOSTILE_SPAWNS
    *  * FIND_SOURCES
    *  * FIND_SOURCES_ACTIVE
    *  * FIND_DROPPED_RESOURCES
    *  * FIND_STRUCTURES
    *  * FIND_MY_STRUCTURES
    *  * FIND_HOSTILE_STRUCTURES
    *  * FIND_FLAGS
    *  * FIND_CONSTRUCTION_SITES
    *  * FIND_EXIT_TOP
    *  * FIND_EXIT_RIGHT
    *  * FIND_EXIT_BOTTOM
    *  * FIND_EXIT_LEFT
    *  * FIND_EXIT
    * @param opts An object with additional options
    * @returns An array with the objects found.
    */
  def find[K /* <: FindConstant */](`type`: K): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[K] */ js.Any
  ] = js.native
  def find[K /* <: FindConstant */](`type`: K, opts: FilterOptions[K]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[K] */ js.Any
  ] = js.native
  def find[T /* <: Structure[StructureConstant] */](`type`: FIND_HOSTILE_STRUCTURES): js.Array[T] = js.native
  def find[T /* <: Structure[StructureConstant] */](`type`: FIND_HOSTILE_STRUCTURES, opts: FilterOptions[FIND_STRUCTURES]): js.Array[T] = js.native
  def find[T /* <: Structure[StructureConstant] */](`type`: FIND_MY_STRUCTURES): js.Array[T] = js.native
  def find[T /* <: Structure[StructureConstant] */](`type`: FIND_MY_STRUCTURES, opts: FilterOptions[FIND_STRUCTURES]): js.Array[T] = js.native
  def find[T /* <: Structure[StructureConstant] */](`type`: FIND_STRUCTURES): js.Array[T] = js.native
  def find[T /* <: Structure[StructureConstant] */](`type`: FIND_STRUCTURES, opts: FilterOptions[FIND_STRUCTURES]): js.Array[T] = js.native
  
  /**
    * Find the exit direction en route to another room.
    * @param room Another room name or room object.
    * @returns The room direction constant, one of the following: FIND_EXIT_TOP, FIND_EXIT_RIGHT, FIND_EXIT_BOTTOM, FIND_EXIT_LEFT
    * Or one of the following error codes: ERR_NO_PATH, ERR_INVALID_ARGS
    */
  def findExitTo(room: String): ExitConstant | ERR_NO_PATH | ERR_INVALID_ARGS = js.native
  def findExitTo(room: Room): ExitConstant | ERR_NO_PATH | ERR_INVALID_ARGS = js.native
  
  /**
    * Find an optimal path inside the room between fromPos and toPos using A* search algorithm.
    * @param fromPos The start position.
    * @param toPos The end position.
    * @param opts (optional) An object containing additonal pathfinding flags
    * @returns An array with path steps
    */
  def findPath(fromPos: RoomPosition, toPos: RoomPosition): js.Array[PathStep] = js.native
  def findPath(fromPos: RoomPosition, toPos: RoomPosition, opts: FindPathOpts): js.Array[PathStep] = js.native
  
  /**
    * Returns an array of events happened on the previous tick in this room.
    */
  def getEventLog(): js.Array[EventItem] = js.native
  def getEventLog(raw: Boolean): js.Array[EventItem] = js.native
  
  /**
    * Creates a RoomPosition object at the specified location.
    * @param x The X position.
    * @param y The Y position.
    * @returns A RoomPosition object or null if it cannot be obtained.
    */
  def getPositionAt(x: Double, y: Double): RoomPosition | Null = js.native
  
  /**
    * Get a Room.Terrain object which provides fast access to static terrain data.
    * This method works for any room in the world even if you have no access to it.
    */
  def getTerrain(): RoomTerrain = js.native
  
  /**
    * Get the list of objects at the specified room position.
    * @param target Can be a RoomPosition object or any object containing RoomPosition.
    * @returns An array with objects at the specified position
    */
  def lookAt(target: RoomPosition): js.Array[LookAtResultLookConstant] = js.native
  def lookAt(target: Pos): js.Array[LookAtResultLookConstant] = js.native
  /**
    * Get the list of objects at the specified room position.
    * @param x The X position.
    * @param y The Y position.
    * @returns An array with objects at the specified position
    */
  def lookAt(x: Double, y: Double): js.Array[LookAtResultLookConstant] = js.native
  
  /**
    * Get the list of objects at the specified room area. This method is more CPU efficient in comparison to multiple lookAt calls.
    * @param top The top Y boundary of the area.
    * @param left The left X boundary of the area.
    * @param bottom The bottom Y boundary of the area.
    * @param right The right X boundary of the area.
    * @param asArray Set to true if you want to get the result as a plain array.
    * @returns An object with all the objects in the specified area
    */
  def lookAtArea(top: Double, left: Double, bottom: Double, right: Double): LookAtResultMatrix[LookConstant] = js.native
  @JSName("lookAtArea")
  def lookAtArea_false(top: Double, left: Double, bottom: Double, right: Double, asArray: `false`): LookAtResultMatrix[LookConstant] = js.native
  /**
    * Get the list of objects at the specified room area. This method is more CPU efficient in comparison to multiple lookAt calls.
    * @param top The top Y boundary of the area.
    * @param left The left X boundary of the area.
    * @param bottom The bottom Y boundary of the area.
    * @param right The right X boundary of the area.
    * @param asArray Set to true if you want to get the result as a plain array.
    * @returns An object with all the objects in the specified area
    */
  @JSName("lookAtArea")
  def lookAtArea_true(top: Double, left: Double, bottom: Double, right: Double, asArray: `true`): js.Array[LookAtResultWithPosLookCo] = js.native
  
  def lookForAtArea(
    `type`: constructionSite,
    top: Double,
    left: Double,
    bottom: Double,
    right: Double,
    asArray: `false`
  ): LookForAtAreaResultMatrix[ConstructionSite[BuildableStructureConstant], constructionSite] = js.native
  /**
    * Get the given objets in the supplied area.
    * @param type One of the LOOK_* constants
    * @param top The top (Y) boundry of the area.
    * @param left The left (X) boundry of the area.
    * @param bottom The bottom (Y) boundry of the area.
    * @param right The right(X) boundry of the area.
    * @param asArray Flatten the results into an array?
    * @returns An array of found objects with an x & y property for their position
    */
  def lookForAtArea(
    `type`: constructionSite,
    top: Double,
    left: Double,
    bottom: Double,
    right: Double,
    asArray: `true`
  ): LookForAtAreaResultArray[ConstructionSite[BuildableStructureConstant], constructionSite] = js.native
  def lookForAtArea(`type`: creep, top: Double, left: Double, bottom: Double, right: Double, asArray: `false`): LookForAtAreaResultMatrix[Creep, creep] = js.native
  def lookForAtArea(`type`: creep, top: Double, left: Double, bottom: Double, right: Double, asArray: `true`): LookForAtAreaResultArray[Creep, creep] = js.native
  def lookForAtArea(`type`: deposit, top: Double, left: Double, bottom: Double, right: Double, asArray: `false`): LookForAtAreaResultMatrix[Deposit, deposit] = js.native
  def lookForAtArea(`type`: deposit, top: Double, left: Double, bottom: Double, right: Double, asArray: `true`): LookForAtAreaResultArray[Deposit, deposit] = js.native
  def lookForAtArea(`type`: energy, top: Double, left: Double, bottom: Double, right: Double, asArray: `false`): LookForAtAreaResultMatrix[Resource[RESOURCE_ENERGY], energy] = js.native
  def lookForAtArea(`type`: energy, top: Double, left: Double, bottom: Double, right: Double, asArray: `true`): LookForAtAreaResultArray[Resource[RESOURCE_ENERGY], energy] = js.native
  def lookForAtArea(`type`: exit, top: Double, left: Double, bottom: Double, right: Double, asArray: `false`): LookForAtAreaResultMatrix[_, exit] = js.native
  def lookForAtArea(`type`: exit, top: Double, left: Double, bottom: Double, right: Double, asArray: `true`): LookForAtAreaResultArray[_, exit] = js.native
  def lookForAtArea(`type`: flag, top: Double, left: Double, bottom: Double, right: Double, asArray: `false`): LookForAtAreaResultMatrix[Flag, flag] = js.native
  def lookForAtArea(`type`: flag, top: Double, left: Double, bottom: Double, right: Double, asArray: `true`): LookForAtAreaResultArray[Flag, flag] = js.native
  def lookForAtArea(`type`: mineral, top: Double, left: Double, bottom: Double, right: Double, asArray: `false`): LookForAtAreaResultMatrix[Mineral[MineralConstant], mineral] = js.native
  def lookForAtArea(`type`: mineral, top: Double, left: Double, bottom: Double, right: Double, asArray: `true`): LookForAtAreaResultArray[Mineral[MineralConstant], mineral] = js.native
  def lookForAtArea(`type`: nuke, top: Double, left: Double, bottom: Double, right: Double, asArray: `false`): LookForAtAreaResultMatrix[Nuke, nuke] = js.native
  def lookForAtArea(`type`: nuke, top: Double, left: Double, bottom: Double, right: Double, asArray: `true`): LookForAtAreaResultArray[Nuke, nuke] = js.native
  def lookForAtArea(`type`: powerCreep, top: Double, left: Double, bottom: Double, right: Double, asArray: `false`): LookForAtAreaResultMatrix[PowerCreep, powerCreep] = js.native
  def lookForAtArea(`type`: powerCreep, top: Double, left: Double, bottom: Double, right: Double, asArray: `true`): LookForAtAreaResultArray[PowerCreep, powerCreep] = js.native
  def lookForAtArea(`type`: resource, top: Double, left: Double, bottom: Double, right: Double, asArray: `false`): LookForAtAreaResultMatrix[Resource[ResourceConstant], resource] = js.native
  def lookForAtArea(`type`: resource, top: Double, left: Double, bottom: Double, right: Double, asArray: `true`): LookForAtAreaResultArray[Resource[ResourceConstant], resource] = js.native
  def lookForAtArea(`type`: ruin, top: Double, left: Double, bottom: Double, right: Double, asArray: `false`): LookForAtAreaResultMatrix[Ruin, ruin] = js.native
  def lookForAtArea(`type`: ruin, top: Double, left: Double, bottom: Double, right: Double, asArray: `true`): LookForAtAreaResultArray[Ruin, ruin] = js.native
  def lookForAtArea(`type`: source, top: Double, left: Double, bottom: Double, right: Double, asArray: `false`): LookForAtAreaResultMatrix[Source, source] = js.native
  def lookForAtArea(`type`: source, top: Double, left: Double, bottom: Double, right: Double, asArray: `true`): LookForAtAreaResultArray[Source, source] = js.native
  def lookForAtArea(`type`: structure, top: Double, left: Double, bottom: Double, right: Double, asArray: `false`): LookForAtAreaResultMatrix[Structure[StructureConstant], structure] = js.native
  def lookForAtArea(`type`: structure, top: Double, left: Double, bottom: Double, right: Double, asArray: `true`): LookForAtAreaResultArray[Structure[StructureConstant], structure] = js.native
  def lookForAtArea(`type`: terrain, top: Double, left: Double, bottom: Double, right: Double, asArray: `false`): LookForAtAreaResultMatrix[Terrain, terrain] = js.native
  def lookForAtArea(`type`: terrain, top: Double, left: Double, bottom: Double, right: Double, asArray: `true`): LookForAtAreaResultArray[Terrain, terrain] = js.native
  def lookForAtArea(`type`: tombstone, top: Double, left: Double, bottom: Double, right: Double, asArray: `false`): LookForAtAreaResultMatrix[Tombstone, tombstone] = js.native
  def lookForAtArea(`type`: tombstone, top: Double, left: Double, bottom: Double, right: Double, asArray: `true`): LookForAtAreaResultArray[Tombstone, tombstone] = js.native
  /**
    * Get the given objets in the supplied area.
    * @param type One of the LOOK_* constants
    * @param top The top (Y) boundry of the area.
    * @param left The left (X) boundry of the area.
    * @param bottom The bottom (Y) boundry of the area.
    * @param right The right(X) boundry of the area.
    * @param asArray Flatten the results into an array?
    * @returns An object with the sstructure object[X coord][y coord] as an array of found objects.
    */
  @JSName("lookForAtArea")
  def lookForAtArea_constructionSite(`type`: constructionSite, top: Double, left: Double, bottom: Double, right: Double): LookForAtAreaResultMatrix[ConstructionSite[BuildableStructureConstant], constructionSite] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_creep(`type`: creep, top: Double, left: Double, bottom: Double, right: Double): LookForAtAreaResultMatrix[Creep, creep] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_deposit(`type`: deposit, top: Double, left: Double, bottom: Double, right: Double): LookForAtAreaResultMatrix[Deposit, deposit] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_energy(`type`: energy, top: Double, left: Double, bottom: Double, right: Double): LookForAtAreaResultMatrix[Resource[RESOURCE_ENERGY], energy] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_exit(`type`: exit, top: Double, left: Double, bottom: Double, right: Double): LookForAtAreaResultMatrix[_, exit] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_flag(`type`: flag, top: Double, left: Double, bottom: Double, right: Double): LookForAtAreaResultMatrix[Flag, flag] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_mineral(`type`: mineral, top: Double, left: Double, bottom: Double, right: Double): LookForAtAreaResultMatrix[Mineral[MineralConstant], mineral] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_nuke(`type`: nuke, top: Double, left: Double, bottom: Double, right: Double): LookForAtAreaResultMatrix[Nuke, nuke] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_powerCreep(`type`: powerCreep, top: Double, left: Double, bottom: Double, right: Double): LookForAtAreaResultMatrix[PowerCreep, powerCreep] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_resource(`type`: resource, top: Double, left: Double, bottom: Double, right: Double): LookForAtAreaResultMatrix[Resource[ResourceConstant], resource] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_ruin(`type`: ruin, top: Double, left: Double, bottom: Double, right: Double): LookForAtAreaResultMatrix[Ruin, ruin] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_source(`type`: source, top: Double, left: Double, bottom: Double, right: Double): LookForAtAreaResultMatrix[Source, source] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_structure(`type`: structure, top: Double, left: Double, bottom: Double, right: Double): LookForAtAreaResultMatrix[Structure[StructureConstant], structure] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_terrain(`type`: terrain, top: Double, left: Double, bottom: Double, right: Double): LookForAtAreaResultMatrix[Terrain, terrain] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_tombstone(`type`: tombstone, top: Double, left: Double, bottom: Double, right: Double): LookForAtAreaResultMatrix[Tombstone, tombstone] = js.native
  
  @JSName("lookForAt")
  def lookForAt_constructionSite(`type`: constructionSite, target: HasRoomPosition): js.Array[ConstructionSite[BuildableStructureConstant]] = js.native
  /**
    * Get the objects at the given RoomPosition.
    * @param type One of the LOOK_* constants.
    * @param target Can be a RoomPosition object or any object containing RoomPosition.
    * @returns An array of Creeps at the specified position if found.
    */
  @JSName("lookForAt")
  def lookForAt_constructionSite(`type`: constructionSite, target: RoomPosition): js.Array[ConstructionSite[BuildableStructureConstant]] = js.native
  /**
    * Get the objects at the given position.
    * @param type One of the LOOK_* constants.
    * @param x The X position.
    * @param y The Y position.
    * @returns An array of Creep at the given position.
    */
  @JSName("lookForAt")
  def lookForAt_constructionSite(`type`: constructionSite, x: Double, y: Double): js.Array[ConstructionSite[BuildableStructureConstant]] = js.native
  @JSName("lookForAt")
  def lookForAt_creep(`type`: creep, target: HasRoomPosition): js.Array[Creep] = js.native
  @JSName("lookForAt")
  def lookForAt_creep(`type`: creep, target: RoomPosition): js.Array[Creep] = js.native
  @JSName("lookForAt")
  def lookForAt_creep(`type`: creep, x: Double, y: Double): js.Array[Creep] = js.native
  @JSName("lookForAt")
  def lookForAt_deposit(`type`: deposit, target: HasRoomPosition): js.Array[Deposit] = js.native
  @JSName("lookForAt")
  def lookForAt_deposit(`type`: deposit, target: RoomPosition): js.Array[Deposit] = js.native
  @JSName("lookForAt")
  def lookForAt_deposit(`type`: deposit, x: Double, y: Double): js.Array[Deposit] = js.native
  @JSName("lookForAt")
  def lookForAt_energy(`type`: energy, target: HasRoomPosition): js.Array[Resource[RESOURCE_ENERGY]] = js.native
  @JSName("lookForAt")
  def lookForAt_energy(`type`: energy, target: RoomPosition): js.Array[Resource[RESOURCE_ENERGY]] = js.native
  @JSName("lookForAt")
  def lookForAt_energy(`type`: energy, x: Double, y: Double): js.Array[Resource[RESOURCE_ENERGY]] = js.native
  @JSName("lookForAt")
  def lookForAt_exit(`type`: exit, target: HasRoomPosition): js.Array[_] = js.native
  @JSName("lookForAt")
  def lookForAt_exit(`type`: exit, target: RoomPosition): js.Array[_] = js.native
  @JSName("lookForAt")
  def lookForAt_exit(`type`: exit, x: Double, y: Double): js.Array[_] = js.native
  @JSName("lookForAt")
  def lookForAt_flag(`type`: flag, target: HasRoomPosition): js.Array[Flag] = js.native
  @JSName("lookForAt")
  def lookForAt_flag(`type`: flag, target: RoomPosition): js.Array[Flag] = js.native
  @JSName("lookForAt")
  def lookForAt_flag(`type`: flag, x: Double, y: Double): js.Array[Flag] = js.native
  @JSName("lookForAt")
  def lookForAt_mineral(`type`: mineral, target: HasRoomPosition): js.Array[Mineral[MineralConstant]] = js.native
  @JSName("lookForAt")
  def lookForAt_mineral(`type`: mineral, target: RoomPosition): js.Array[Mineral[MineralConstant]] = js.native
  @JSName("lookForAt")
  def lookForAt_mineral(`type`: mineral, x: Double, y: Double): js.Array[Mineral[MineralConstant]] = js.native
  @JSName("lookForAt")
  def lookForAt_nuke(`type`: nuke, target: HasRoomPosition): js.Array[Nuke] = js.native
  @JSName("lookForAt")
  def lookForAt_nuke(`type`: nuke, target: RoomPosition): js.Array[Nuke] = js.native
  @JSName("lookForAt")
  def lookForAt_nuke(`type`: nuke, x: Double, y: Double): js.Array[Nuke] = js.native
  @JSName("lookForAt")
  def lookForAt_powerCreep(`type`: powerCreep, target: HasRoomPosition): js.Array[PowerCreep] = js.native
  @JSName("lookForAt")
  def lookForAt_powerCreep(`type`: powerCreep, target: RoomPosition): js.Array[PowerCreep] = js.native
  @JSName("lookForAt")
  def lookForAt_powerCreep(`type`: powerCreep, x: Double, y: Double): js.Array[PowerCreep] = js.native
  @JSName("lookForAt")
  def lookForAt_resource(`type`: resource, target: HasRoomPosition): js.Array[Resource[ResourceConstant]] = js.native
  @JSName("lookForAt")
  def lookForAt_resource(`type`: resource, target: RoomPosition): js.Array[Resource[ResourceConstant]] = js.native
  @JSName("lookForAt")
  def lookForAt_resource(`type`: resource, x: Double, y: Double): js.Array[Resource[ResourceConstant]] = js.native
  @JSName("lookForAt")
  def lookForAt_ruin(`type`: ruin, target: HasRoomPosition): js.Array[Ruin] = js.native
  @JSName("lookForAt")
  def lookForAt_ruin(`type`: ruin, target: RoomPosition): js.Array[Ruin] = js.native
  @JSName("lookForAt")
  def lookForAt_ruin(`type`: ruin, x: Double, y: Double): js.Array[Ruin] = js.native
  @JSName("lookForAt")
  def lookForAt_source(`type`: source, target: HasRoomPosition): js.Array[Source] = js.native
  @JSName("lookForAt")
  def lookForAt_source(`type`: source, target: RoomPosition): js.Array[Source] = js.native
  @JSName("lookForAt")
  def lookForAt_source(`type`: source, x: Double, y: Double): js.Array[Source] = js.native
  @JSName("lookForAt")
  def lookForAt_structure(`type`: structure, target: HasRoomPosition): js.Array[Structure[StructureConstant]] = js.native
  @JSName("lookForAt")
  def lookForAt_structure(`type`: structure, target: RoomPosition): js.Array[Structure[StructureConstant]] = js.native
  @JSName("lookForAt")
  def lookForAt_structure(`type`: structure, x: Double, y: Double): js.Array[Structure[StructureConstant]] = js.native
  @JSName("lookForAt")
  def lookForAt_terrain(`type`: terrain, target: HasRoomPosition): js.Array[Terrain] = js.native
  @JSName("lookForAt")
  def lookForAt_terrain(`type`: terrain, target: RoomPosition): js.Array[Terrain] = js.native
  @JSName("lookForAt")
  def lookForAt_terrain(`type`: terrain, x: Double, y: Double): js.Array[Terrain] = js.native
  @JSName("lookForAt")
  def lookForAt_tombstone(`type`: tombstone, target: HasRoomPosition): js.Array[Tombstone] = js.native
  @JSName("lookForAt")
  def lookForAt_tombstone(`type`: tombstone, target: RoomPosition): js.Array[Tombstone] = js.native
  @JSName("lookForAt")
  def lookForAt_tombstone(`type`: tombstone, x: Double, y: Double): js.Array[Tombstone] = js.native
  
  /**
    * A shorthand to `Memory.rooms[room.name]`. You can use it for quick access the room’s specific memory data object.
    */
  var memory: RoomMemory = js.native
  
  /**
    * One of the `MODE_*` constants.
    */
  var mode: String = js.native
  
  /**
    * The name of the room.
    */
  val name: String = js.native
  
  /**
    * The Storage structure of this room, if present, otherwise undefined.
    */
  var storage: js.UndefOr[StructureStorage] = js.native
  
  /**
    * The Terminal structure of this room, if present, otherwise undefined.
    */
  var terminal: js.UndefOr[StructureTerminal] = js.native
  
  /**
    * A RoomVisual object for this room. You can use this object to draw simple shapes (lines, circles, text labels) in the room.
    */
  var visual: RoomVisual = js.native
}
