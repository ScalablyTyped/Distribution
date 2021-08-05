package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtypeOp
  extends StObject
     with Op {
  
  var o: js.Any
  
  var p: Path
  
  var t: String
}
object SubtypeOp {
  
  inline def apply(o: js.Any, p: Path, t: String): SubtypeOp = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtypeOp]
  }
  
  extension [Self <: SubtypeOp](x: Self) {
    
    inline def setO(value: js.Any): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
    
    inline def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value :_*))
    
    inline def setT(value: String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
