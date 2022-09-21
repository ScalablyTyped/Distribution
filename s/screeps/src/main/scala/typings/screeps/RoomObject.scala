package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Any object with a position in a room. Almost all game objects prototypes
  * are derived from RoomObject.
  */
trait RoomObject extends StObject {
  
  /**
    * Applied effects, an array of objects with the following properties:
    */
  var effects: js.Array[RoomObjectEffect]
  
  /**
    * An object representing the position of this object in the room.
    */
  var pos: RoomPosition
  
  /**
    * The link to the Room object. May be undefined in case if an object is a
    * flag or a construction site and is placed in a room that is not visible
    * to you.
    */
  var room: js.UndefOr[Room] = js.undefined
}
object RoomObject {
  
  inline def apply(effects: js.Array[RoomObjectEffect], pos: RoomPosition): RoomObject = {
    val __obj = js.Dynamic.literal(effects = effects.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomObject]
  }
  
  extension [Self <: RoomObject](x: Self) {
    
    inline def setEffects(value: js.Array[RoomObjectEffect]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsVarargs(value: RoomObjectEffect*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setPos(value: RoomPosition): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setRoom(value: Room): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    inline def setRoomUndefined: Self = StObject.set(x, "room", js.undefined)
  }
}
