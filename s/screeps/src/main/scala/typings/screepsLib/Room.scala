package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /**
    * Total amount of energy available in all spawns and extensions in the room.
    */
  var energyAvailable: scala.Double = js.native
  /**
    * Total amount of energyCapacity of all spawns and extensions in the room.
    */
  var energyCapacityAvailable: scala.Double = js.native
  /**
    * A shorthand to `Memory.rooms[room.name]`. You can use it for quick access the room’s specific memory data object.
    */
  var memory: RoomMemory = js.native
  /**
    * One of the `MODE_*` constants.
    */
  var mode: java.lang.String = js.native
  /**
    * The name of the room.
    */
  var name: java.lang.String = js.native
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
  /**
    * Create new ConstructionSite at the specified location.
    * @param pos Can be a RoomPosition object or any object containing RoomPosition.
    * @param structureType One of the following constants: STRUCTURE_EXTENSION, STRUCTURE_RAMPART, STRUCTURE_ROAD, STRUCTURE_SPAWN, STRUCTURE_WALL, STRUCTURE_LINK
    * @param name The name of the structure, for structures that support it (currently only spawns).
    * @returns Result Code: OK, ERR_INVALID_TARGET, ERR_INVALID_ARGS, ERR_RCL_NOT_ENOUGH
    */
  def createConstructionSite(pos: RoomPosition, structureType: STRUCTURE_SPAWN): ScreepsReturnCode = js.native
  def createConstructionSite(pos: RoomPosition, structureType: STRUCTURE_SPAWN, name: java.lang.String): ScreepsReturnCode = js.native
  /**
    * Create new ConstructionSite at the specified location.
    * @param pos Can be a RoomPosition object or any object containing RoomPosition.
    * @param structureType One of the following constants: STRUCTURE_EXTENSION, STRUCTURE_RAMPART, STRUCTURE_ROAD, STRUCTURE_SPAWN, STRUCTURE_WALL, STRUCTURE_LINK
    * @returns Result Code: OK, ERR_INVALID_TARGET, ERR_INVALID_ARGS, ERR_RCL_NOT_ENOUGH
    */
  def createConstructionSite(pos: RoomPosition, structureType: StructureConstant): ScreepsReturnCode = js.native
  def createConstructionSite(pos: _HasRoomPosition, structureType: STRUCTURE_SPAWN): ScreepsReturnCode = js.native
  def createConstructionSite(pos: _HasRoomPosition, structureType: STRUCTURE_SPAWN, name: java.lang.String): ScreepsReturnCode = js.native
  def createConstructionSite(pos: _HasRoomPosition, structureType: StructureConstant): ScreepsReturnCode = js.native
  /**
    * Create new ConstructionSite at the specified location.
    * @param x The X position.
    * @param y The Y position.
    * @param structureType One of the following constants: STRUCTURE_EXTENSION, STRUCTURE_RAMPART, STRUCTURE_ROAD, STRUCTURE_SPAWN, STRUCTURE_WALL, STRUCTURE_LINK
    * @returns Result Code: OK, ERR_INVALID_TARGET, ERR_INVALID_ARGS, ERR_RCL_NOT_ENOUGH
    */
  def createConstructionSite(x: scala.Double, y: scala.Double, structureType: BuildableStructureConstant): ScreepsReturnCode = js.native
  /**
    * Create new ConstructionSite at the specified location.
    * @param x The X position.
    * @param y The Y position.
    * @param structureType One of the following constants: STRUCTURE_EXTENSION, STRUCTURE_RAMPART, STRUCTURE_ROAD, STRUCTURE_SPAWN, STRUCTURE_WALL, STRUCTURE_LINK
    * @param name The name of the structure, for structures that support it (currently only spawns).
    * @returns Result Code: OK, ERR_INVALID_TARGET, ERR_INVALID_ARGS, ERR_RCL_NOT_ENOUGH
    */
  def createConstructionSite(x: scala.Double, y: scala.Double, structureType: STRUCTURE_SPAWN): ScreepsReturnCode = js.native
  def createConstructionSite(x: scala.Double, y: scala.Double, structureType: STRUCTURE_SPAWN, name: java.lang.String): ScreepsReturnCode = js.native
  def createFlag(pos: Anon_Pos): ERR_NAME_EXISTS | ERR_INVALID_ARGS | java.lang.String = js.native
  def createFlag(pos: Anon_Pos, name: java.lang.String): ERR_NAME_EXISTS | ERR_INVALID_ARGS | java.lang.String = js.native
  def createFlag(pos: Anon_Pos, name: java.lang.String, color: ColorConstant): ERR_NAME_EXISTS | ERR_INVALID_ARGS | java.lang.String = js.native
  def createFlag(pos: Anon_Pos, name: java.lang.String, color: ColorConstant, secondaryColor: ColorConstant): ERR_NAME_EXISTS | ERR_INVALID_ARGS | java.lang.String = js.native
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
  def createFlag(pos: RoomPosition): ERR_NAME_EXISTS | ERR_INVALID_ARGS | java.lang.String = js.native
  def createFlag(pos: RoomPosition, name: java.lang.String): ERR_NAME_EXISTS | ERR_INVALID_ARGS | java.lang.String = js.native
  def createFlag(pos: RoomPosition, name: java.lang.String, color: ColorConstant): ERR_NAME_EXISTS | ERR_INVALID_ARGS | java.lang.String = js.native
  def createFlag(pos: RoomPosition, name: java.lang.String, color: ColorConstant, secondaryColor: ColorConstant): ERR_NAME_EXISTS | ERR_INVALID_ARGS | java.lang.String = js.native
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
  def createFlag(x: scala.Double, y: scala.Double): ERR_NAME_EXISTS | ERR_INVALID_ARGS | java.lang.String = js.native
  def createFlag(x: scala.Double, y: scala.Double, name: java.lang.String): ERR_NAME_EXISTS | ERR_INVALID_ARGS | java.lang.String = js.native
  def createFlag(x: scala.Double, y: scala.Double, name: java.lang.String, color: ColorConstant): ERR_NAME_EXISTS | ERR_INVALID_ARGS | java.lang.String = js.native
  def createFlag(
    x: scala.Double,
    y: scala.Double,
    name: java.lang.String,
    color: ColorConstant,
    secondaryColor: ColorConstant
  ): ERR_NAME_EXISTS | ERR_INVALID_ARGS | java.lang.String = js.native
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
    *  * FIND_DROPPED_ENERGY
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
    /* import warning: ImportType.apply Failed type conversion: screeps.FindTypes[K] */ js.Any
  ] = js.native
  def find[K /* <: FindConstant */](`type`: K, opts: FilterOptions[K]): js.Array[
    /* import warning: ImportType.apply Failed type conversion: screeps.FindTypes[K] */ js.Any
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
  def findExitTo(room: java.lang.String): ExitConstant | ERR_NO_PATH | ERR_INVALID_ARGS = js.native
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
  def getEventLog(): js.Array[EventItem[EventConstant]] = js.native
  def getEventLog(raw: scala.Boolean): js.Array[EventItem[EventConstant]] = js.native
  /**
    * Creates a RoomPosition object at the specified location.
    * @param x The X position.
    * @param y The Y position.
    * @returns A RoomPosition object or null if it cannot be obtained.
    */
  def getPositionAt(x: scala.Double, y: scala.Double): RoomPosition | scala.Null = js.native
  /**
    * Get a Room.Terrain object which provides fast access to static terrain data.
    * This method works for any room in the world even if you have no access to it.
    */
  def getTerrain(): RoomTerrain = js.native
  def lookAt(target: Anon_Pos): js.Array[LookAtResult[LookConstant]] = js.native
  /**
    * Get the list of objects at the specified room position.
    * @param target Can be a RoomPosition object or any object containing RoomPosition.
    * @returns An array with objects at the specified position
    */
  def lookAt(target: RoomPosition): js.Array[LookAtResult[LookConstant]] = js.native
  /**
    * Get the list of objects at the specified room position.
    * @param x The X position.
    * @param y The Y position.
    * @returns An array with objects at the specified position
    */
  def lookAt(x: scala.Double, y: scala.Double): js.Array[LookAtResult[LookConstant]] = js.native
  /**
    * Get the list of objects at the specified room area. This method is more CPU efficient in comparison to multiple lookAt calls.
    * @param top The top Y boundary of the area.
    * @param left The left X boundary of the area.
    * @param bottom The bottom Y boundary of the area.
    * @param right The right X boundary of the area.
    * @param asArray Set to true if you want to get the result as a plain array.
    * @returns An object with all the objects in the specified area
    */
  def lookAtArea(top: scala.Double, left: scala.Double, bottom: scala.Double, right: scala.Double): LookAtResultMatrix[LookConstant] = js.native
  def lookAtArea(
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`false`
  ): LookAtResultMatrix[LookConstant] = js.native
  /**
    * Get the list of objects at the specified room area. This method is more CPU efficient in comparison to multiple lookAt calls.
    * @param top The top Y boundary of the area.
    * @param left The left X boundary of the area.
    * @param bottom The bottom Y boundary of the area.
    * @param right The right X boundary of the area.
    * @param asArray Set to true if you want to get the result as a plain array.
    * @returns An object with all the objects in the specified area
    */
  def lookAtArea(
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`true`
  ): js.Array[LookAtResultWithPos[LookConstant]] = js.native
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
  def lookForAtArea_constructionSite(
    `type`: screepsLib.screepsLibStrings.constructionSite,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double
  ): LookForAtAreaResultMatrix[
    ConstructionSite[BuildableStructureConstant], 
    screepsLib.screepsLibStrings.constructionSite
  ] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_constructionSite(
    `type`: screepsLib.screepsLibStrings.constructionSite,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`false`
  ): LookForAtAreaResultMatrix[
    ConstructionSite[BuildableStructureConstant], 
    screepsLib.screepsLibStrings.constructionSite
  ] = js.native
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
  @JSName("lookForAtArea")
  def lookForAtArea_constructionSite(
    `type`: screepsLib.screepsLibStrings.constructionSite,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`true`
  ): LookForAtAreaResultArray[
    ConstructionSite[BuildableStructureConstant], 
    screepsLib.screepsLibStrings.constructionSite
  ] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_creep(
    `type`: screepsLib.screepsLibStrings.creep,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double
  ): LookForAtAreaResultMatrix[Creep, screepsLib.screepsLibStrings.creep] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_creep(
    `type`: screepsLib.screepsLibStrings.creep,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`false`
  ): LookForAtAreaResultMatrix[Creep, screepsLib.screepsLibStrings.creep] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_creep(
    `type`: screepsLib.screepsLibStrings.creep,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`true`
  ): LookForAtAreaResultArray[Creep, screepsLib.screepsLibStrings.creep] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_energy(
    `type`: screepsLib.screepsLibStrings.energy,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double
  ): LookForAtAreaResultMatrix[Resource[RESOURCE_ENERGY], screepsLib.screepsLibStrings.energy] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_energy(
    `type`: screepsLib.screepsLibStrings.energy,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`false`
  ): LookForAtAreaResultMatrix[Resource[RESOURCE_ENERGY], screepsLib.screepsLibStrings.energy] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_energy(
    `type`: screepsLib.screepsLibStrings.energy,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`true`
  ): LookForAtAreaResultArray[Resource[RESOURCE_ENERGY], screepsLib.screepsLibStrings.energy] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_exit(
    `type`: screepsLib.screepsLibStrings.exit,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double
  ): LookForAtAreaResultMatrix[_, screepsLib.screepsLibStrings.exit] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_exit(
    `type`: screepsLib.screepsLibStrings.exit,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`false`
  ): LookForAtAreaResultMatrix[_, screepsLib.screepsLibStrings.exit] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_exit(
    `type`: screepsLib.screepsLibStrings.exit,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`true`
  ): LookForAtAreaResultArray[_, screepsLib.screepsLibStrings.exit] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_flag(
    `type`: screepsLib.screepsLibStrings.flag,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double
  ): LookForAtAreaResultMatrix[Flag, screepsLib.screepsLibStrings.flag] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_flag(
    `type`: screepsLib.screepsLibStrings.flag,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`false`
  ): LookForAtAreaResultMatrix[Flag, screepsLib.screepsLibStrings.flag] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_flag(
    `type`: screepsLib.screepsLibStrings.flag,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`true`
  ): LookForAtAreaResultArray[Flag, screepsLib.screepsLibStrings.flag] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_mineral(
    `type`: screepsLib.screepsLibStrings.mineral,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double
  ): LookForAtAreaResultMatrix[Mineral[MineralConstant], screepsLib.screepsLibStrings.mineral] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_mineral(
    `type`: screepsLib.screepsLibStrings.mineral,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`false`
  ): LookForAtAreaResultMatrix[Mineral[MineralConstant], screepsLib.screepsLibStrings.mineral] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_mineral(
    `type`: screepsLib.screepsLibStrings.mineral,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`true`
  ): LookForAtAreaResultArray[Mineral[MineralConstant], screepsLib.screepsLibStrings.mineral] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_nuke(
    `type`: screepsLib.screepsLibStrings.nuke,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double
  ): LookForAtAreaResultMatrix[Nuke, screepsLib.screepsLibStrings.nuke] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_nuke(
    `type`: screepsLib.screepsLibStrings.nuke,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`false`
  ): LookForAtAreaResultMatrix[Nuke, screepsLib.screepsLibStrings.nuke] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_nuke(
    `type`: screepsLib.screepsLibStrings.nuke,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`true`
  ): LookForAtAreaResultArray[Nuke, screepsLib.screepsLibStrings.nuke] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_resource(
    `type`: screepsLib.screepsLibStrings.resource,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double
  ): LookForAtAreaResultMatrix[Resource[ResourceConstant], screepsLib.screepsLibStrings.resource] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_resource(
    `type`: screepsLib.screepsLibStrings.resource,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`false`
  ): LookForAtAreaResultMatrix[Resource[ResourceConstant], screepsLib.screepsLibStrings.resource] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_resource(
    `type`: screepsLib.screepsLibStrings.resource,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`true`
  ): LookForAtAreaResultArray[Resource[ResourceConstant], screepsLib.screepsLibStrings.resource] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_source(
    `type`: screepsLib.screepsLibStrings.source,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double
  ): LookForAtAreaResultMatrix[Source, screepsLib.screepsLibStrings.source] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_source(
    `type`: screepsLib.screepsLibStrings.source,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`false`
  ): LookForAtAreaResultMatrix[Source, screepsLib.screepsLibStrings.source] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_source(
    `type`: screepsLib.screepsLibStrings.source,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`true`
  ): LookForAtAreaResultArray[Source, screepsLib.screepsLibStrings.source] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_structure(
    `type`: screepsLib.screepsLibStrings.structure,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double
  ): LookForAtAreaResultMatrix[Structure[StructureConstant], screepsLib.screepsLibStrings.structure] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_structure(
    `type`: screepsLib.screepsLibStrings.structure,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`false`
  ): LookForAtAreaResultMatrix[Structure[StructureConstant], screepsLib.screepsLibStrings.structure] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_structure(
    `type`: screepsLib.screepsLibStrings.structure,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`true`
  ): LookForAtAreaResultArray[Structure[StructureConstant], screepsLib.screepsLibStrings.structure] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_terrain(
    `type`: screepsLib.screepsLibStrings.terrain,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double
  ): LookForAtAreaResultMatrix[Terrain, screepsLib.screepsLibStrings.terrain] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_terrain(
    `type`: screepsLib.screepsLibStrings.terrain,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`false`
  ): LookForAtAreaResultMatrix[Terrain, screepsLib.screepsLibStrings.terrain] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_terrain(
    `type`: screepsLib.screepsLibStrings.terrain,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`true`
  ): LookForAtAreaResultArray[Terrain, screepsLib.screepsLibStrings.terrain] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_tombstone(
    `type`: screepsLib.screepsLibStrings.tombstone,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double
  ): LookForAtAreaResultMatrix[Tombstone, screepsLib.screepsLibStrings.tombstone] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_tombstone(
    `type`: screepsLib.screepsLibStrings.tombstone,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`false`
  ): LookForAtAreaResultMatrix[Tombstone, screepsLib.screepsLibStrings.tombstone] = js.native
  @JSName("lookForAtArea")
  def lookForAtArea_tombstone(
    `type`: screepsLib.screepsLibStrings.tombstone,
    top: scala.Double,
    left: scala.Double,
    bottom: scala.Double,
    right: scala.Double,
    asArray: screepsLib.screepsLibNumbers.`true`
  ): LookForAtAreaResultArray[Tombstone, screepsLib.screepsLibStrings.tombstone] = js.native
  /**
    * Get the objects at the given RoomPosition.
    * @param type One of the LOOK_* constants.
    * @param target Can be a RoomPosition object or any object containing RoomPosition.
    * @returns An array of Creeps at the specified position if found.
    */
  @JSName("lookForAt")
  def lookForAt_constructionSite(`type`: screepsLib.screepsLibStrings.constructionSite, target: RoomPosition): js.Array[ConstructionSite[BuildableStructureConstant]] = js.native
  @JSName("lookForAt")
  def lookForAt_constructionSite(`type`: screepsLib.screepsLibStrings.constructionSite, target: _HasRoomPosition): js.Array[ConstructionSite[BuildableStructureConstant]] = js.native
  /**
    * Get the objects at the given position.
    * @param type One of the LOOK_* constants.
    * @param x The X position.
    * @param y The Y position.
    * @returns An array of Creep at the given position.
    */
  @JSName("lookForAt")
  def lookForAt_constructionSite(`type`: screepsLib.screepsLibStrings.constructionSite, x: scala.Double, y: scala.Double): js.Array[ConstructionSite[BuildableStructureConstant]] = js.native
  @JSName("lookForAt")
  def lookForAt_creep(`type`: screepsLib.screepsLibStrings.creep, target: RoomPosition): js.Array[Creep] = js.native
  @JSName("lookForAt")
  def lookForAt_creep(`type`: screepsLib.screepsLibStrings.creep, target: _HasRoomPosition): js.Array[Creep] = js.native
  @JSName("lookForAt")
  def lookForAt_creep(`type`: screepsLib.screepsLibStrings.creep, x: scala.Double, y: scala.Double): js.Array[Creep] = js.native
  @JSName("lookForAt")
  def lookForAt_energy(`type`: screepsLib.screepsLibStrings.energy, target: RoomPosition): js.Array[Resource[RESOURCE_ENERGY]] = js.native
  @JSName("lookForAt")
  def lookForAt_energy(`type`: screepsLib.screepsLibStrings.energy, target: _HasRoomPosition): js.Array[Resource[RESOURCE_ENERGY]] = js.native
  @JSName("lookForAt")
  def lookForAt_energy(`type`: screepsLib.screepsLibStrings.energy, x: scala.Double, y: scala.Double): js.Array[Resource[RESOURCE_ENERGY]] = js.native
  @JSName("lookForAt")
  def lookForAt_exit(`type`: screepsLib.screepsLibStrings.exit, target: RoomPosition): js.Array[_] = js.native
  @JSName("lookForAt")
  def lookForAt_exit(`type`: screepsLib.screepsLibStrings.exit, target: _HasRoomPosition): js.Array[_] = js.native
  @JSName("lookForAt")
  def lookForAt_exit(`type`: screepsLib.screepsLibStrings.exit, x: scala.Double, y: scala.Double): js.Array[_] = js.native
  @JSName("lookForAt")
  def lookForAt_flag(`type`: screepsLib.screepsLibStrings.flag, target: RoomPosition): js.Array[Flag] = js.native
  @JSName("lookForAt")
  def lookForAt_flag(`type`: screepsLib.screepsLibStrings.flag, target: _HasRoomPosition): js.Array[Flag] = js.native
  @JSName("lookForAt")
  def lookForAt_flag(`type`: screepsLib.screepsLibStrings.flag, x: scala.Double, y: scala.Double): js.Array[Flag] = js.native
  @JSName("lookForAt")
  def lookForAt_mineral(`type`: screepsLib.screepsLibStrings.mineral, target: RoomPosition): js.Array[Mineral[MineralConstant]] = js.native
  @JSName("lookForAt")
  def lookForAt_mineral(`type`: screepsLib.screepsLibStrings.mineral, target: _HasRoomPosition): js.Array[Mineral[MineralConstant]] = js.native
  @JSName("lookForAt")
  def lookForAt_mineral(`type`: screepsLib.screepsLibStrings.mineral, x: scala.Double, y: scala.Double): js.Array[Mineral[MineralConstant]] = js.native
  @JSName("lookForAt")
  def lookForAt_nuke(`type`: screepsLib.screepsLibStrings.nuke, target: RoomPosition): js.Array[Nuke] = js.native
  @JSName("lookForAt")
  def lookForAt_nuke(`type`: screepsLib.screepsLibStrings.nuke, target: _HasRoomPosition): js.Array[Nuke] = js.native
  @JSName("lookForAt")
  def lookForAt_nuke(`type`: screepsLib.screepsLibStrings.nuke, x: scala.Double, y: scala.Double): js.Array[Nuke] = js.native
  @JSName("lookForAt")
  def lookForAt_resource(`type`: screepsLib.screepsLibStrings.resource, target: RoomPosition): js.Array[Resource[ResourceConstant]] = js.native
  @JSName("lookForAt")
  def lookForAt_resource(`type`: screepsLib.screepsLibStrings.resource, target: _HasRoomPosition): js.Array[Resource[ResourceConstant]] = js.native
  @JSName("lookForAt")
  def lookForAt_resource(`type`: screepsLib.screepsLibStrings.resource, x: scala.Double, y: scala.Double): js.Array[Resource[ResourceConstant]] = js.native
  @JSName("lookForAt")
  def lookForAt_source(`type`: screepsLib.screepsLibStrings.source, target: RoomPosition): js.Array[Source] = js.native
  @JSName("lookForAt")
  def lookForAt_source(`type`: screepsLib.screepsLibStrings.source, target: _HasRoomPosition): js.Array[Source] = js.native
  @JSName("lookForAt")
  def lookForAt_source(`type`: screepsLib.screepsLibStrings.source, x: scala.Double, y: scala.Double): js.Array[Source] = js.native
  @JSName("lookForAt")
  def lookForAt_structure(`type`: screepsLib.screepsLibStrings.structure, target: RoomPosition): js.Array[Structure[StructureConstant]] = js.native
  @JSName("lookForAt")
  def lookForAt_structure(`type`: screepsLib.screepsLibStrings.structure, target: _HasRoomPosition): js.Array[Structure[StructureConstant]] = js.native
  @JSName("lookForAt")
  def lookForAt_structure(`type`: screepsLib.screepsLibStrings.structure, x: scala.Double, y: scala.Double): js.Array[Structure[StructureConstant]] = js.native
  @JSName("lookForAt")
  def lookForAt_terrain(`type`: screepsLib.screepsLibStrings.terrain, target: RoomPosition): js.Array[Terrain] = js.native
  @JSName("lookForAt")
  def lookForAt_terrain(`type`: screepsLib.screepsLibStrings.terrain, target: _HasRoomPosition): js.Array[Terrain] = js.native
  @JSName("lookForAt")
  def lookForAt_terrain(`type`: screepsLib.screepsLibStrings.terrain, x: scala.Double, y: scala.Double): js.Array[Terrain] = js.native
  @JSName("lookForAt")
  def lookForAt_tombstone(`type`: screepsLib.screepsLibStrings.tombstone, target: RoomPosition): js.Array[Tombstone] = js.native
  @JSName("lookForAt")
  def lookForAt_tombstone(`type`: screepsLib.screepsLibStrings.tombstone, target: _HasRoomPosition): js.Array[Tombstone] = js.native
  @JSName("lookForAt")
  def lookForAt_tombstone(`type`: screepsLib.screepsLibStrings.tombstone, x: scala.Double, y: scala.Double): js.Array[Tombstone] = js.native
}

@JSGlobal("Room")
@js.native
class RoomCls protected () extends Room {
  def this(id: java.lang.String) = this()
}

