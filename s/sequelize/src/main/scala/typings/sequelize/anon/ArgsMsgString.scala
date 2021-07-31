package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgsMsgString extends StObject {
  
  var args: js.Array[String] | String
  
  var msg: String
}
object ArgsMsgString {
  
  @scala.inline
  def apply(args: js.Array[String] | String, msg: String): ArgsMsgString = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsMsgString]
  }
  
  @scala.inline
  implicit class ArgsMsgStringMutableBuilder[Self <: ArgsMsgString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String] | String): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
  }
}
