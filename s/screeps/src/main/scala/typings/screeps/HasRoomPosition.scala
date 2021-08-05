package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasRoomPosition extends StObject {
  
  var pos: RoomPosition
}
object HasRoomPosition {
  
  inline def apply(pos: RoomPosition): HasRoomPosition = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasRoomPosition]
  }
  
  extension [Self <: HasRoomPosition](x: Self) {
    
    inline def setPos(value: RoomPosition): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}
