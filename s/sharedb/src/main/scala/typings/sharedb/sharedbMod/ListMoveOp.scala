package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMoveOp
  extends StObject
     with Op {
  
  var lm: js.Any
  
  var p: Path
}
object ListMoveOp {
  
  @scala.inline
  def apply(lm: js.Any, p: Path): ListMoveOp = {
    val __obj = js.Dynamic.literal(lm = lm.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMoveOp]
  }
  
  @scala.inline
  implicit class ListMoveOpMutableBuilder[Self <: ListMoveOp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLm(value: js.Any): Self = StObject.set(x, "lm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value :_*))
  }
}
