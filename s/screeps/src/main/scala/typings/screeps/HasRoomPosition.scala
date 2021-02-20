package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasRoomPosition extends StObject {
  
  var pos: RoomPosition = js.native
}
object HasRoomPosition {
  
  @scala.inline
  def apply(pos: RoomPosition): HasRoomPosition = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasRoomPosition]
  }
  
  @scala.inline
  implicit class HasRoomPositionMutableBuilder[Self <: HasRoomPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPos(value: RoomPosition): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}
