package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectDeleteOp
  extends StObject
     with Op {
  
  var od: js.Any
  
  var p: Path
}
object ObjectDeleteOp {
  
  @scala.inline
  def apply(od: js.Any, p: Path): ObjectDeleteOp = {
    val __obj = js.Dynamic.literal(od = od.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectDeleteOp]
  }
  
  @scala.inline
  implicit class ObjectDeleteOpMutableBuilder[Self <: ObjectDeleteOp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOd(value: js.Any): Self = StObject.set(x, "od", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value :_*))
  }
}
