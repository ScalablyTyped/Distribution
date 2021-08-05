package typings.screeps.global

import typings.screeps.RoomObjectConstructor
import typings.screeps.RoomObjectEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RoomObject")
@js.native
class RoomObject protected ()
  extends StObject
     with typings.screeps.RoomObject {
  def this(x: Double, y: Double, roomName: String) = this()
  
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  var effects: js.Array[RoomObjectEffect] = js.native
  
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  var pos: typings.screeps.RoomPosition = js.native
}
object RoomObject {
  
  inline def apply: RoomObjectConstructor = js.Dynamic.global.selectDynamic("RoomObject").asInstanceOf[RoomObjectConstructor]
}
