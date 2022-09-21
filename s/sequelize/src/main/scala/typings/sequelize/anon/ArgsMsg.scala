package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgsMsg extends StObject {
  
  var args: js.Array[js.Array[String]]
  
  var msg: String
}
object ArgsMsg {
  
  inline def apply(args: js.Array[js.Array[String]], msg: String): ArgsMsg = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsMsg]
  }
  
  extension [Self <: ArgsMsg](x: Self) {
    
    inline def setArgs(value: js.Array[js.Array[String]]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: js.Array[String]*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
  }
}
