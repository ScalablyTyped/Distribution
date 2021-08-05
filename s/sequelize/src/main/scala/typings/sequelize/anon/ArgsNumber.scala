package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgsNumber extends StObject {
  
  var args: Double
  
  var msg: String
}
object ArgsNumber {
  
  inline def apply(args: Double, msg: String): ArgsNumber = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsNumber]
  }
  
  extension [Self <: ArgsNumber](x: Self) {
    
    inline def setArgs(value: Double): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
  }
}
