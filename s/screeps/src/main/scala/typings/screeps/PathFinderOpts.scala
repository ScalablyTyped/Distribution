package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing additional pathfinding flags.
  */
@js.native
trait PathFinderOpts extends js.Object {
  /**
    * Instead of searching for a path to the goals this will search for a path away from the goals.
    * The cheapest path that is out of range of every goal will be returned. The default is false.
    */
  var flee: js.UndefOr[Boolean] = js.native
  /**
    * Weight to apply to the heuristic in the A* formula F = G + weight * H. Use this option only if you understand
    * the underlying A* algorithm mechanics! The default value is 1.
    */
  var heuristicWeight: js.UndefOr[Double] = js.native
  /**
    * The maximum allowed cost of the path returned. If at any point the pathfinder detects that it is impossible to find
    * a path with a cost less than or equal to maxCost it will immediately halt the search. The default is Infinity.
    */
  var maxCost: js.UndefOr[Double] = js.native
  /**
    * The maximum allowed pathfinding operations. You can limit CPU time used for the search based on ratio 1 op ~ 0.001 CPU. The default value is 2000.
    */
  var maxOps: js.UndefOr[Double] = js.native
  /**
    * The maximum allowed rooms to search. The default (and maximum) is 16.
    */
  var maxRooms: js.UndefOr[Double] = js.native
  /**
    * Cost for walking on plain positions. The default is 1.
    */
  var plainCost: js.UndefOr[Double] = js.native
  /**
    * Request from the pathfinder to generate a CostMatrix for a certain room. The callback accepts one argument, roomName.
    * This callback will only be called once per room per search. If you are running multiple pathfinding operations in a
    * single room and in a single tick you may consider caching your CostMatrix to speed up your code. Please read the
    * CostMatrix documentation below for more information on CostMatrix.
    *
    * @param roomName The name of the room the pathfinder needs a cost matrix for.
    */
  var roomCallback: js.UndefOr[js.Function1[/* roomName */ String, Boolean | CostMatrix]] = js.native
  /**
    * Cost for walking on swamp positions. The default is 5.
    */
  var swampCost: js.UndefOr[Double] = js.native
}

object PathFinderOpts {
  @scala.inline
  def apply(): PathFinderOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathFinderOpts]
  }
  @scala.inline
  implicit class PathFinderOptsOps[Self <: PathFinderOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFlee(value: Boolean): Self = this.set("flee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlee: Self = this.set("flee", js.undefined)
    @scala.inline
    def setHeuristicWeight(value: Double): Self = this.set("heuristicWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeuristicWeight: Self = this.set("heuristicWeight", js.undefined)
    @scala.inline
    def setMaxCost(value: Double): Self = this.set("maxCost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCost: Self = this.set("maxCost", js.undefined)
    @scala.inline
    def setMaxOps(value: Double): Self = this.set("maxOps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxOps: Self = this.set("maxOps", js.undefined)
    @scala.inline
    def setMaxRooms(value: Double): Self = this.set("maxRooms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRooms: Self = this.set("maxRooms", js.undefined)
    @scala.inline
    def setPlainCost(value: Double): Self = this.set("plainCost", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlainCost: Self = this.set("plainCost", js.undefined)
    @scala.inline
    def setRoomCallback(value: /* roomName */ String => Boolean | CostMatrix): Self = this.set("roomCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRoomCallback: Self = this.set("roomCallback", js.undefined)
    @scala.inline
    def setSwampCost(value: Double): Self = this.set("swampCost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwampCost: Self = this.set("swampCost", js.undefined)
  }
  
}

