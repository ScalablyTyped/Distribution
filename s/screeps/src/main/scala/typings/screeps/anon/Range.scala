package typings.screeps.anon

import typings.screeps.RoomPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range extends StObject {
  
  var pos: RoomPosition
  
  var range: Double
}
object Range {
  
  @scala.inline
  def apply(pos: RoomPosition, range: Double): Range = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPos(value: RoomPosition): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
