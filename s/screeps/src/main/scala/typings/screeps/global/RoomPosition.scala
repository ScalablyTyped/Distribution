package typings.screeps.global

import typings.screeps.RoomPositionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RoomPosition")
@js.native
class RoomPosition protected ()
  extends StObject
     with typings.screeps.RoomPosition {
  /**
    * You can create new RoomPosition object using its constructor.
    * @param x X position in the room.
    * @param y Y position in the room.
    * @param roomName The room name.
    */
  def this(x: Double, y: Double, roomName: String) = this()
}
object RoomPosition {
  
  inline def apply: RoomPositionConstructor = js.Dynamic.global.selectDynamic("RoomPosition").asInstanceOf[RoomPositionConstructor]
}
