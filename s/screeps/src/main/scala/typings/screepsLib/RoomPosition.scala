package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object representing the specified position in the room.
  *
  * Every object in the room contains RoomPosition as the pos property.
  *
  * The position object of a custom location can be obtained using the Room.getPositionAt() method or using the constructor.
  */
@js.native
trait RoomPosition extends js.Object {
  /**
    * The name of the room.
    */
  var roomName: java.lang.String = js.native
  /**
    * X position in the room.
    */
  var x: scala.Double = js.native
  /**
    * Y position in the room.
    */
  var y: scala.Double = js.native
  /**
    * Create new ConstructionSite at the specified location.
    * @param structureType One of the following constants:
    *  * STRUCTURE_EXTENSION
    *  * STRUCTURE_RAMPART
    *  * STRUCTURE_ROAD
    *  * STRUCTURE_SPAWN
    *  * STRUCTURE_WALL
    *  * STRUCTURE_LINK
    */
  def createConstructionSite(structureType: BuildableStructureConstant): ScreepsReturnCode = js.native
  /**
    * Create new ConstructionSite at the specified location.
    * @param structureType One of the following constants:
    *  * STRUCTURE_EXTENSION
    *  * STRUCTURE_RAMPART
    *  * STRUCTURE_ROAD
    *  * STRUCTURE_SPAWN
    *  * STRUCTURE_WALL
    *  * STRUCTURE_LINK
    * @param name The name of the structure, for structures that support it (currently only spawns).
    */
  def createConstructionSite(structureType: STRUCTURE_SPAWN): ScreepsReturnCode = js.native
  def createConstructionSite(structureType: STRUCTURE_SPAWN, name: java.lang.String): ScreepsReturnCode = js.native
  /**
    * Create new Flag at the specified location.
    * @param name The name of a new flag.
    * It should be unique, i.e. the Game.flags object should not contain another flag with the same name (hash key).
    * If not defined, a random name will be generated.
    * @param color The color of a new flag. Should be one of the COLOR_* constants
    * @param secondaryColor The secondary color of a new flag. Should be one of the COLOR_* constants. The default value is equal to color.
    */
  def createFlag(): ScreepsReturnCode = js.native
  def createFlag(name: java.lang.String): ScreepsReturnCode = js.native
  def createFlag(name: java.lang.String, color: ColorConstant): ScreepsReturnCode = js.native
  def createFlag(name: java.lang.String, color: ColorConstant, secondaryColor: ColorConstant): ScreepsReturnCode = js.native
  /**
    * Find the object with the shortest path from the given position. Uses A* search algorithm and Dijkstra's algorithm.
    * @param objects An array of RoomPositions or objects with a RoomPosition
    * @param opts An object containing pathfinding options (see Room.findPath), or one of the following: filter, algorithm
    * @returns One of the supplied objects
    */
  def findClosestByPath[T /* <: _HasRoomPosition | RoomPosition */](objects: js.Array[T]): T | scala.Null = js.native
  def findClosestByPath[T /* <: _HasRoomPosition | RoomPosition */](objects: js.Array[T], opts: FindPathOpts with Anon_AlgorithmFilter): T | scala.Null = js.native
  /**
    * Find the object with the shortest path from the given position. Uses A* search algorithm and Dijkstra's algorithm.
    * @param type Any of the FIND_* constants.
    * @param opts An object containing pathfinding options (see Room.findPath), or one of the following: filter, algorithm
    * @returns An instance of a RoomObject.
    */
  def findClosestByPath[K /* <: FindConstant */](`type`: K): (/* import warning: ImportType.apply Failed type conversion: screeps.FindTypes[K] */ js.Any) | scala.Null = js.native
  def findClosestByPath[K /* <: FindConstant */](`type`: K, opts: FindPathOpts with FilterOptions[K] with Anon_Algorithm): (/* import warning: ImportType.apply Failed type conversion: screeps.FindTypes[K] */ js.Any) | scala.Null = js.native
  def findClosestByPath[T /* <: Structure[StructureConstant] */](`type`: FIND_HOSTILE_STRUCTURES): T | scala.Null = js.native
  def findClosestByPath[T /* <: Structure[StructureConstant] */](
    `type`: FIND_HOSTILE_STRUCTURES,
    opts: FindPathOpts with FilterOptions[FIND_STRUCTURES] with Anon_Algorithm
  ): T | scala.Null = js.native
  def findClosestByPath[T /* <: Structure[StructureConstant] */](`type`: FIND_MY_STRUCTURES): T | scala.Null = js.native
  def findClosestByPath[T /* <: Structure[StructureConstant] */](
    `type`: FIND_MY_STRUCTURES,
    opts: FindPathOpts with FilterOptions[FIND_STRUCTURES] with Anon_Algorithm
  ): T | scala.Null = js.native
  def findClosestByPath[T /* <: Structure[StructureConstant] */](`type`: FIND_STRUCTURES): T | scala.Null = js.native
  def findClosestByPath[T /* <: Structure[StructureConstant] */](
    `type`: FIND_STRUCTURES,
    opts: FindPathOpts with FilterOptions[FIND_STRUCTURES] with Anon_Algorithm
  ): T | scala.Null = js.native
  /**
    * Find the object with the shortest linear distance from the given position.
    * @param objects An array of RoomPositions or objects with a RoomPosition.
    * @param opts An object containing pathfinding options (see Room.findPath), or one of the following: filter, algorithm
    */
  def findClosestByRange[T /* <: _HasRoomPosition | RoomPosition */](objects: js.Array[T]): T | scala.Null = js.native
  def findClosestByRange[T /* <: _HasRoomPosition | RoomPosition */](objects: js.Array[T], opts: Anon_Filter): T | scala.Null = js.native
  /**
    * Find the object with the shortest linear distance from the given position.
    * @param type Any of the FIND_* constants.
    * @param opts An object containing pathfinding options (see Room.findPath), or one of the following: filter, algorithm
    */
  def findClosestByRange[K /* <: FindConstant */](`type`: K): (/* import warning: ImportType.apply Failed type conversion: screeps.FindTypes[K] */ js.Any) | scala.Null = js.native
  def findClosestByRange[K /* <: FindConstant */](`type`: K, opts: FilterOptions[K]): (/* import warning: ImportType.apply Failed type conversion: screeps.FindTypes[K] */ js.Any) | scala.Null = js.native
  def findClosestByRange[T /* <: Structure[StructureConstant] */](`type`: FIND_HOSTILE_STRUCTURES): T | scala.Null = js.native
  def findClosestByRange[T /* <: Structure[StructureConstant] */](`type`: FIND_HOSTILE_STRUCTURES, opts: FilterOptions[FIND_STRUCTURES]): T | scala.Null = js.native
  def findClosestByRange[T /* <: Structure[StructureConstant] */](`type`: FIND_MY_STRUCTURES): T | scala.Null = js.native
  def findClosestByRange[T /* <: Structure[StructureConstant] */](`type`: FIND_MY_STRUCTURES, opts: FilterOptions[FIND_STRUCTURES]): T | scala.Null = js.native
  def findClosestByRange[T /* <: Structure[StructureConstant] */](`type`: FIND_STRUCTURES): T | scala.Null = js.native
  def findClosestByRange[T /* <: Structure[StructureConstant] */](`type`: FIND_STRUCTURES, opts: FilterOptions[FIND_STRUCTURES]): T | scala.Null = js.native
  /**
    * Find all objects in the specified linear range.
    * @param objects An array of room's objects or RoomPosition objects that the search should be executed against.
    * @param range The range distance.
    * @param opts See Room.find.
    */
  def findInRange[T /* <: _HasRoomPosition | RoomPosition */](objects: js.Array[T], range: scala.Double): js.Array[T] = js.native
  def findInRange[T /* <: _HasRoomPosition | RoomPosition */](objects: js.Array[T], range: scala.Double, opts: Anon_FilterAny): js.Array[T] = js.native
  /**
    * Find all objects in the specified linear range.
    * @param type Any of the FIND_* constants.
    * @param range The range distance.
    * @param opts See Room.find.
    */
  def findInRange[K /* <: FindConstant */](`type`: K, range: scala.Double): js.Array[
    /* import warning: ImportType.apply Failed type conversion: screeps.FindTypes[K] */ js.Any
  ] = js.native
  def findInRange[K /* <: FindConstant */](`type`: K, range: scala.Double, opts: FilterOptions[K]): js.Array[
    /* import warning: ImportType.apply Failed type conversion: screeps.FindTypes[K] */ js.Any
  ] = js.native
  def findInRange[T /* <: Structure[StructureConstant] */](`type`: FIND_HOSTILE_STRUCTURES, range: scala.Double): js.Array[T] = js.native
  def findInRange[T /* <: Structure[StructureConstant] */](`type`: FIND_HOSTILE_STRUCTURES, range: scala.Double, opts: FilterOptions[FIND_STRUCTURES]): js.Array[T] = js.native
  def findInRange[T /* <: Structure[StructureConstant] */](`type`: FIND_MY_STRUCTURES, range: scala.Double): js.Array[T] = js.native
  def findInRange[T /* <: Structure[StructureConstant] */](`type`: FIND_MY_STRUCTURES, range: scala.Double, opts: FilterOptions[FIND_STRUCTURES]): js.Array[T] = js.native
  def findInRange[T /* <: Structure[StructureConstant] */](`type`: FIND_STRUCTURES, range: scala.Double): js.Array[T] = js.native
  def findInRange[T /* <: Structure[StructureConstant] */](`type`: FIND_STRUCTURES, range: scala.Double, opts: FilterOptions[FIND_STRUCTURES]): js.Array[T] = js.native
  /**
    * Find an optimal path to the specified position using A* search algorithm.
    *
    * This method is a shorthand for Room.findPath. If the target is in another room, then the corresponding exit will be used as a target.
    * @param target Can be a RoomPosition object or any object containing RoomPosition.
    * @param opts An object containing pathfinding options flags (see Room.findPath for more details).
    */
  def findPathTo(target: RoomPosition): js.Array[PathStep] = js.native
  def findPathTo(target: RoomPosition, opts: FindPathOpts): js.Array[PathStep] = js.native
  def findPathTo(target: _HasRoomPosition): js.Array[PathStep] = js.native
  def findPathTo(target: _HasRoomPosition, opts: FindPathOpts): js.Array[PathStep] = js.native
  /**
    * Find an optimal path to the specified position using A* search algorithm.
    *
    * This method is a shorthand for Room.findPath. If the target is in another room, then the corresponding exit will be used as a target.
    * @param x X position in the room.
    * @param y Y position in the room.
    * @param opts An object containing pathfinding options flags (see Room.findPath for more details).
    */
  def findPathTo(x: scala.Double, y: scala.Double): js.Array[PathStep] = js.native
  def findPathTo(x: scala.Double, y: scala.Double, opts: FindPathOpts): js.Array[PathStep] = js.native
  /**
    * Get linear direction to the specified position.
    * @param target Can be a RoomPosition object or any object containing RoomPosition.
    */
  def getDirectionTo(target: RoomPosition): DirectionConstant = js.native
  def getDirectionTo(target: _HasRoomPosition): DirectionConstant = js.native
  /**
    * Get linear direction to the specified position.
    * @param x X position in the room.
    * @param y Y position in the room.
    */
  def getDirectionTo(x: scala.Double, y: scala.Double): DirectionConstant = js.native
  def getRangeTo(target: Anon_Pos): scala.Double = js.native
  /**
    * Get linear range to the specified position.
    * @param target Can be a RoomPosition object or any object containing RoomPosition.
    */
  def getRangeTo(target: RoomPosition): scala.Double = js.native
  /**
    * Get linear range to the specified position.
    * @param x X position in the room.
    * @param y Y position in the room.
    */
  def getRangeTo(x: scala.Double, y: scala.Double): scala.Double = js.native
  def inRangeTo(target: Anon_Pos, range: scala.Double): scala.Boolean = js.native
  /**
    * Check whether this position is in the given range of another position.
    * @param toPos The target position.
    * @param range The range distance.
    */
  def inRangeTo(target: RoomPosition, range: scala.Double): scala.Boolean = js.native
  /**
    * Check whether this position is in the given range of another position.
    * @param x X position in the room.
    * @param y Y position in the room.
    * @param range The range distance.
    */
  def inRangeTo(x: scala.Double, y: scala.Double, range: scala.Double): scala.Boolean = js.native
  def isEqualTo(target: Anon_Pos): scala.Boolean = js.native
  /**
    * Check whether this position is the same as the specified position.
    * @param target Can be a RoomPosition object or any object containing RoomPosition.
    */
  def isEqualTo(target: RoomPosition): scala.Boolean = js.native
  /**
    * Check whether this position is the same as the specified position.
    * @param x X position in the room.
    * @param y Y position in the room.
    */
  def isEqualTo(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def isNearTo(target: Anon_Pos): scala.Boolean = js.native
  /**
    * Check whether this position is on the adjacent square to the specified position. The same as inRangeTo(target, 1).
    * @param target Can be a RoomPosition object or any object containing RoomPosition.
    */
  def isNearTo(target: RoomPosition): scala.Boolean = js.native
  /**
    * Check whether this position is on the adjacent square to the specified position. The same as inRangeTo(target, 1).
    * @param x X position in the room.
    * @param y Y position in the room.
    */
  def isNearTo(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  /**
    * Get the list of objects at the specified room position.
    */
  def look(): js.Array[LookAtResult[LookConstant]] = js.native
  /**
    * Get an object with the given type at the specified room position.
    * @param type One of the following string constants: constructionSite, creep, exit, flag, resource, source, structure, terrain
    */
  @JSName("lookFor")
  def lookFor_constructionSite(`type`: screepsLib.screepsLibStrings.constructionSite): js.Array[ConstructionSite[BuildableStructureConstant]] = js.native
  @JSName("lookFor")
  def lookFor_creep(`type`: screepsLib.screepsLibStrings.creep): js.Array[Creep] = js.native
  @JSName("lookFor")
  def lookFor_energy(`type`: screepsLib.screepsLibStrings.energy): js.Array[Resource[RESOURCE_ENERGY]] = js.native
  @JSName("lookFor")
  def lookFor_exit(`type`: screepsLib.screepsLibStrings.exit): js.Array[_] = js.native
  @JSName("lookFor")
  def lookFor_flag(`type`: screepsLib.screepsLibStrings.flag): js.Array[Flag] = js.native
  @JSName("lookFor")
  def lookFor_mineral(`type`: screepsLib.screepsLibStrings.mineral): js.Array[Mineral[MineralConstant]] = js.native
  @JSName("lookFor")
  def lookFor_nuke(`type`: screepsLib.screepsLibStrings.nuke): js.Array[Nuke] = js.native
  @JSName("lookFor")
  def lookFor_powerCreep(`type`: screepsLib.screepsLibStrings.powerCreep): js.Array[PowerCreep] = js.native
  @JSName("lookFor")
  def lookFor_resource(`type`: screepsLib.screepsLibStrings.resource): js.Array[Resource[ResourceConstant]] = js.native
  @JSName("lookFor")
  def lookFor_source(`type`: screepsLib.screepsLibStrings.source): js.Array[Source] = js.native
  @JSName("lookFor")
  def lookFor_structure(`type`: screepsLib.screepsLibStrings.structure): js.Array[Structure[StructureConstant]] = js.native
  @JSName("lookFor")
  def lookFor_terrain(`type`: screepsLib.screepsLibStrings.terrain): js.Array[Terrain] = js.native
  @JSName("lookFor")
  def lookFor_tombstone(`type`: screepsLib.screepsLibStrings.tombstone): js.Array[Tombstone] = js.native
}

@JSGlobal("RoomPosition")
@js.native
class RoomPositionCls protected () extends RoomPosition {
  /**
    * You can create new RoomPosition object using its constructor.
    * @param x X position in the room.
    * @param y Y position in the room.
    * @param roomName The room name.
    */
  def this(x: scala.Double, y: scala.Double, roomName: java.lang.String) = this()
}

