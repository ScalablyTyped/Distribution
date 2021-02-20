package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgsNumber extends StObject {
  
  var args: Double = js.native
  
  var msg: String = js.native
}
object ArgsNumber {
  
  @scala.inline
  def apply(args: Double, msg: String): ArgsNumber = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsNumber]
  }
  
  @scala.inline
  implicit class ArgsNumberMutableBuilder[Self <: ArgsNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: Double): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
  }
}
