package typings.screepsArena.gamePrototypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomPosition extends StObject {
  
  /**
    * X position in the room. Can be undefined if `.exists` is false
    */
  var x: Double
  
  /**
    * Y position in the room. Can be undefined if `.exists` is false
    */
  var y: Double
}
object RoomPosition {
  
  inline def apply(x: Double, y: Double): RoomPosition = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomPosition]
  }
  
  extension [Self <: RoomPosition](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
