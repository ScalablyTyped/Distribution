package typings.screeps.anon

import typings.screeps.ExitConstant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exit extends StObject {
  
  var exit: ExitConstant = js.native
  
  var room: String = js.native
}
object Exit {
  
  @scala.inline
  def apply(exit: ExitConstant, room: String): Exit = {
    val __obj = js.Dynamic.literal(exit = exit.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exit]
  }
  
  @scala.inline
  implicit class ExitMutableBuilder[Self <: Exit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExit(value: ExitConstant): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}
