package typings.screeps.global

import org.scalablytyped.runtime.Shortcut
import typings.screeps.RoomConstructor
import typings.screeps.RoomTerrain
import typings.screeps.screepsNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Room")
@js.native
open class Room protected ()
  extends StObject
     with typings.screeps.Room {
  def this(id: String) = this()
}
object Room extends Shortcut {
  
  @JSGlobal("Room")
  @js.native
  val ^ : js.Object & RoomConstructor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Room.Terrain")
  @js.native
  open class Terrain protected ()
    extends StObject
       with RoomTerrain {
    /**
      * Get room terrain for the specified room. This method works for any room in the world even if you have no access to it.
      * @param roomName String name of the room.
      */
    def this(roomName: String) = this()
    
    /**
      * Get terrain type at the specified room position. This method works for any room in the world even if you have no access to it.
      * @param x X position in the room.
      * @param y Y position in the room.
      * @return number Number of terrain mask like: TERRAIN_MASK_SWAMP | TERRAIN_MASK_WALL
      */
    /* CompleteClass */
    override def get(x: Double, y: Double): `0` | typings.screeps.TERRAIN_MASK_WALL | typings.screeps.TERRAIN_MASK_SWAMP = js.native
  }
  
  type _To = js.Object & RoomConstructor
  
  /* This means you don't have to write `^`, but can instead just say `Room.foo` */
  override def _to: js.Object & RoomConstructor = ^
}
