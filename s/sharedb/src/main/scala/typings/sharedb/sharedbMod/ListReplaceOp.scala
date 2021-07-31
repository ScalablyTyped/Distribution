package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReplaceOp
  extends StObject
     with Op {
  
  var ld: js.Any
  
  var li: js.Any
  
  var p: Path
}
object ListReplaceOp {
  
  @scala.inline
  def apply(ld: js.Any, li: js.Any, p: Path): ListReplaceOp = {
    val __obj = js.Dynamic.literal(ld = ld.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReplaceOp]
  }
  
  @scala.inline
  implicit class ListReplaceOpMutableBuilder[Self <: ListReplaceOp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLd(value: js.Any): Self = StObject.set(x, "ld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLi(value: js.Any): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value :_*))
  }
}
