package typings.screeps

import typings.screeps.anon.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains powerful methods for pathfinding in the game world. Support exists for custom navigation costs and paths which span multiple rooms.
  * Additionally PathFinder can search for paths through rooms you can't see, although you won't be able to detect any dynamic obstacles like creeps or buildings.
  */
@js.native
trait PathFinder extends StObject {
  
  /**
    * Container for custom navigation cost data.
    */
  var CostMatrix: typings.screeps.CostMatrix = js.native
  
  def search(origin: RoomPosition, goal: js.Array[RoomPosition | Range]): PathFinderPath = js.native
  def search(origin: RoomPosition, goal: js.Array[RoomPosition | Range], opts: PathFinderOpts): PathFinderPath = js.native
  /**
    * Find an optimal path between origin and goal.
    *
    * @param origin The start position.
    * @param goal goal A RoomPosition, an object containing a RoomPosition and range or an array of either.
    * @param opts An object containing additional pathfinding flags.
    */
  def search(origin: RoomPosition, goal: RoomPosition): PathFinderPath = js.native
  def search(origin: RoomPosition, goal: RoomPosition, opts: PathFinderOpts): PathFinderPath = js.native
  def search(origin: RoomPosition, goal: Range): PathFinderPath = js.native
  def search(origin: RoomPosition, goal: Range, opts: PathFinderOpts): PathFinderPath = js.native
  
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
