package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgsBoolean extends StObject {
  
  var args: Boolean
  
  var msg: String
}
object ArgsBoolean {
  
  inline def apply(args: Boolean, msg: String): ArgsBoolean = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsBoolean]
  }
  
  extension [Self <: ArgsBoolean](x: Self) {
    
    inline def setArgs(value: Boolean): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
  }
}
