package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectReplaceOp extends Op {
  
  var od: js.Any = js.native
  
  var oi: js.Any = js.native
  
  var p: Path = js.native
}
object ObjectReplaceOp {
  
  @scala.inline
  def apply(od: js.Any, oi: js.Any, p: Path): ObjectReplaceOp = {
    val __obj = js.Dynamic.literal(od = od.asInstanceOf[js.Any], oi = oi.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectReplaceOp]
  }
  
  @scala.inline
  implicit class ObjectReplaceOpMutableBuilder[Self <: ObjectReplaceOp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOd(value: js.Any): Self = StObject.set(x, "od", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOi(value: js.Any): Self = StObject.set(x, "oi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value :_*))
  }
}
