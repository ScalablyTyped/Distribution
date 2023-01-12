package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInsertOp
  extends StObject
     with Op {
  
  var li: Any
  
  var p: Path
}
object ListInsertOp {
  
  inline def apply(li: Any, p: Path): ListInsertOp = {
    val __obj = js.Dynamic.literal(li = li.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInsertOp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInsertOp] (val x: Self) extends AnyVal {
    
    inline def setLi(value: Any): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
    
    inline def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value*))
  }
}
