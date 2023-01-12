package typings.smartFoxServer.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEXTENSION_RESPONSE extends StObject {
  
  var cmd: String
  
  var params: js.Object
  
  var sourceRoom: Double
}
object IEXTENSION_RESPONSE {
  
  inline def apply(cmd: String, params: js.Object, sourceRoom: Double): IEXTENSION_RESPONSE = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], sourceRoom = sourceRoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEXTENSION_RESPONSE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEXTENSION_RESPONSE] (val x: Self) extends AnyVal {
    
    inline def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setSourceRoom(value: Double): Self = StObject.set(x, "sourceRoom", value.asInstanceOf[js.Any])
  }
}
