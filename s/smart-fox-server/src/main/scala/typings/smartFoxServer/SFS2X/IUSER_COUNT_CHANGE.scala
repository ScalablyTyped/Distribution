package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUSER_COUNT_CHANGE extends StObject {
  
  var room: SFSRoom
  
  var sCount: Double
  
  var uCount: Double
}
object IUSER_COUNT_CHANGE {
  
  inline def apply(room: SFSRoom, sCount: Double, uCount: Double): IUSER_COUNT_CHANGE = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], sCount = sCount.asInstanceOf[js.Any], uCount = uCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUSER_COUNT_CHANGE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUSER_COUNT_CHANGE] (val x: Self) extends AnyVal {
    
    inline def setRoom(value: SFSRoom): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    inline def setSCount(value: Double): Self = StObject.set(x, "sCount", value.asInstanceOf[js.Any])
    
    inline def setUCount(value: Double): Self = StObject.set(x, "uCount", value.asInstanceOf[js.Any])
  }
}
