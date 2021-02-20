package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgsMsg extends StObject {
  
  var args: js.Array[js.Array[String]] = js.native
  
  var msg: String = js.native
}
object ArgsMsg {
  
  @scala.inline
  def apply(args: js.Array[js.Array[String]], msg: String): ArgsMsg = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsMsg]
  }
  
  @scala.inline
  implicit class ArgsMsgMutableBuilder[Self <: ArgsMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[js.Array[String]]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: js.Array[String]*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
  }
}
