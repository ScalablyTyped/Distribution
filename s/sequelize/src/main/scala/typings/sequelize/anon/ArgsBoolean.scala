package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgsBoolean extends StObject {
  
  var args: Boolean = js.native
  
  var msg: String = js.native
}
object ArgsBoolean {
  
  @scala.inline
  def apply(args: Boolean, msg: String): ArgsBoolean = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsBoolean]
  }
  
  @scala.inline
  implicit class ArgsBooleanMutableBuilder[Self <: ArgsBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: Boolean): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
  }
}
