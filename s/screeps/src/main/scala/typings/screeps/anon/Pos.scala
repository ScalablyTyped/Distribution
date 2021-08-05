package typings.screeps.anon

import typings.screeps.RoomPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pos extends StObject {
  
  var pos: RoomPosition
}
object Pos {
  
  inline def apply(pos: RoomPosition): Pos = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pos]
  }
  
  extension [Self <: Pos](x: Self) {
    
    inline def setPos(value: RoomPosition): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}
