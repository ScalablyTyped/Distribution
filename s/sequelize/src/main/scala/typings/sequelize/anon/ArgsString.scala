package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgsString extends StObject {
  
  var args: String
  
  var msg: String
}
object ArgsString {
  
  inline def apply(args: String, msg: String): ArgsString = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsString]
  }
  
  extension [Self <: ArgsString](x: Self) {
    
    inline def setArgs(value: String): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
  }
}
