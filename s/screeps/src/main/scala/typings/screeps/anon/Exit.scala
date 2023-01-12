package typings.screeps.anon

import typings.screeps.ExitConstant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exit extends StObject {
  
  var exit: ExitConstant
  
  var room: String
}
object Exit {
  
  inline def apply(exit: ExitConstant, room: String): Exit = {
    val __obj = js.Dynamic.literal(exit = exit.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Exit] (val x: Self) extends AnyVal {
    
    inline def setExit(value: ExitConstant): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
