package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Room extends StObject {
  
  var room: String
  
  var x: Double
  
  var y: Double
}
object Room {
  
  @scala.inline
  def apply(room: String, x: Double, y: Double): Room = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Room]
  }
  
  @scala.inline
  implicit class RoomMutableBuilder[Self <: Room] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
