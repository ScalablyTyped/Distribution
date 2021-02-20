package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInsertOp extends Op {
  
  var li: js.Any = js.native
  
  var p: Path = js.native
}
object ListInsertOp {
  
  @scala.inline
  def apply(li: js.Any, p: Path): ListInsertOp = {
    val __obj = js.Dynamic.literal(li = li.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInsertOp]
  }
  
  @scala.inline
  implicit class ListInsertOpMutableBuilder[Self <: ListInsertOp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLi(value: js.Any): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value :_*))
  }
}
