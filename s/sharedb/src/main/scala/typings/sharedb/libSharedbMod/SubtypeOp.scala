package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtypeOp
  extends StObject
     with Op {
  
  var o: Any
  
  var p: Path
  
  var t: String
}
object SubtypeOp {
  
  inline def apply(o: Any, p: Path, t: String): SubtypeOp = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtypeOp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubtypeOp] (val x: Self) extends AnyVal {
    
    inline def setO(value: Any): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
    
    inline def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value*))
    
    inline def setT(value: String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
