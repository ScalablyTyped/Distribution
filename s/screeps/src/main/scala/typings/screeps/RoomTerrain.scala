package typings.screeps

import typings.screeps.screepsNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of Object that contains all terrain for a room
  */
@js.native
trait RoomTerrain extends js.Object {
  /**
    * Get terrain type at the specified room position. This method works for any room in the world even if you have no access to it.
    * @param x X position in the room.
    * @param y Y position in the room.
    * @return number Number of terrain mask like: TERRAIN_MASK_SWAMP | TERRAIN_MASK_WALL
    */
  def get(x: Double, y: Double): `0` | TERRAIN_MASK_WALL | TERRAIN_MASK_SWAMP = js.native
}

object RoomTerrain {
  @scala.inline
  def apply(get: (Double, Double) => `0` | TERRAIN_MASK_WALL | TERRAIN_MASK_SWAMP): RoomTerrain = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[RoomTerrain]
  }
  @scala.inline
  implicit class RoomTerrainOps[Self <: RoomTerrain] (val x: Self) extends AnyVal {
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
    def setGet(value: (Double, Double) => `0` | TERRAIN_MASK_WALL | TERRAIN_MASK_SWAMP): Self = this.set("get", js.Any.fromFunction2(value))
  }
  
}

