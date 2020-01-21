package typings.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains powerful methods for pathfinding in the game world. Support exists for custom navigation costs and paths which span multiple rooms.
  * Additionally PathFinder can search for paths through rooms you can't see, although you won't be able to detect any dynamic obstacles like creeps or buildings.
  */
@js.native
trait PathFinder extends js.Object {
  /**
    * Container for custom navigation cost data.
    */
  var CostMatrix: typings.screeps.CostMatrix = js.native
  def search(origin: RoomPosition, goal: js.Array[RoomPosition | AnonPosRange]): PathFinderPath = js.native
  def search(origin: RoomPosition, goal: js.Array[RoomPosition | AnonPosRange], opts: PathFinderOpts): PathFinderPath = js.native
  def search(origin: RoomPosition, goal: AnonPosRange): PathFinderPath = js.native
  def search(origin: RoomPosition, goal: AnonPosRange, opts: PathFinderOpts): PathFinderPath = js.native
  /**
    * Find an optimal path between origin and goal.
    *
    * @param origin The start position.
    * @param goal goal A RoomPosition, an object containing a RoomPosition and range or an array of either.
    * @param opts An object containing additional pathfinding flags.
    */
  def search(origin: RoomPosition, goal: RoomPosition): PathFinderPath = js.native
  def search(origin: RoomPosition, goal: RoomPosition, opts: PathFinderOpts): PathFinderPath = js.native
  /**
    * Specify whether to use this new experimental pathfinder in game objects methods.
    * This method should be invoked every tick. It affects the following methods behavior:
    * * `Room.findPath`
    * * `RoomPosition.findPathTo`
    * * `RoomPosition.findClosestByPath`
    * * `Creep.moveTo`
    *
    * @deprecated This method is deprecated and will be removed soon.
    * @param isEnabled Whether to activate the new pathfinder or deactivate.
    */
  def use(isEnabled: Boolean): js.UndefOr[scala.Nothing] = js.native
}

@JSGlobal("PathFinder")
@js.native
object PathFinder extends TopLevel[PathFinder]

