package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReplaceOp
  extends StObject
     with Op {
  
  var ld: Any
  
  var li: Any
  
  var p: Path
}
object ListReplaceOp {
  
  inline def apply(ld: Any, li: Any, p: Path): ListReplaceOp = {
    val __obj = js.Dynamic.literal(ld = ld.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReplaceOp]
  }
  
  extension [Self <: ListReplaceOp](x: Self) {
    
    inline def setLd(value: Any): Self = StObject.set(x, "ld", value.asInstanceOf[js.Any])
    
    inline def setLi(value: Any): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
    
    inline def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value*))
  }
}
