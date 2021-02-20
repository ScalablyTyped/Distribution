package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectInsertOp extends Op {
  
  var oi: js.Any = js.native
  
  var p: Path = js.native
}
object ObjectInsertOp {
  
  @scala.inline
  def apply(oi: js.Any, p: Path): ObjectInsertOp = {
    val __obj = js.Dynamic.literal(oi = oi.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectInsertOp]
  }
  
  @scala.inline
  implicit class ObjectInsertOpMutableBuilder[Self <: ObjectInsertOp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOi(value: js.Any): Self = StObject.set(x, "oi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value :_*))
  }
}
