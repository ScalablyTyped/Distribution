package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubtypeOp extends Op {
  
  var o: js.Any = js.native
  
  var p: Path = js.native
  
  var t: String = js.native
}
object SubtypeOp {
  
  @scala.inline
  def apply(o: js.Any, p: Path, t: String): SubtypeOp = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtypeOp]
  }
  
  @scala.inline
  implicit class SubtypeOpMutableBuilder[Self <: SubtypeOp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setO(value: js.Any): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value :_*))
    
    @scala.inline
    def setT(value: String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
