package typings.screeps.global

import org.scalablytyped.runtime.Shortcut
import typings.screeps.RoomConstructor
import typings.screeps.RoomTerrain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Room")
@js.native
class Room protected ()
  extends typings.screeps.Room {
  def this(id: String) = this()
}
object Room extends Shortcut {
  
  @JSGlobal("Room")
  @js.native
  val ^ : RoomConstructor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Room.Terrain")
  @js.native
  class Terrain protected () extends RoomTerrain {
    /**
      * Get room terrain for the specified room. This method works for any room in the world even if you have no access to it.
      * @param roomName String name of the room.
      */
    def this(roomName: String) = this()
  }
  
  type _To = RoomConstructor
  
  /* This means you don't have to write `^`, but can instead just say `Room.foo` */
  override def _to: RoomConstructor = ^
}
