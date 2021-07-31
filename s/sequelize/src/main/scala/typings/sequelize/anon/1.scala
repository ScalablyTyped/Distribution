package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var args: js.Tuple2[Double, Double]
  
  var msg: String
}
object `1` {
  
  @scala.inline
  def apply(args: js.Tuple2[Double, Double], msg: String): `1` = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
  }
}
