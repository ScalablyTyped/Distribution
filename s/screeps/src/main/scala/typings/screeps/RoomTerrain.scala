package typings.screeps

import typings.screeps.screepsNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of Object that contains all terrain for a room
  */
trait RoomTerrain extends StObject {
  
  /**
    * Get terrain type at the specified room position. This method works for any room in the world even if you have no access to it.
    * @param x X position in the room.
    * @param y Y position in the room.
    * @return number Number of terrain mask like: TERRAIN_MASK_SWAMP | TERRAIN_MASK_WALL
    */
  def get(x: Double, y: Double): `0` | TERRAIN_MASK_WALL | TERRAIN_MASK_SWAMP
}
object RoomTerrain {
  
  @scala.inline
  def apply(get: (Double, Double) => `0` | TERRAIN_MASK_WALL | TERRAIN_MASK_SWAMP): RoomTerrain = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[RoomTerrain]
  }
  
  @scala.inline
  implicit class RoomTerrainMutableBuilder[Self <: RoomTerrain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: (Double, Double) => `0` | TERRAIN_MASK_WALL | TERRAIN_MASK_SWAMP): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
  }
}
