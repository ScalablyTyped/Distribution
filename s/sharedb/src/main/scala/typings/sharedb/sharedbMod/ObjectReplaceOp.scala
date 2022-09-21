package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectReplaceOp
  extends StObject
     with Op {
  
  var od: Any
  
  var oi: Any
  
  var p: Path
}
object ObjectReplaceOp {
  
  inline def apply(od: Any, oi: Any, p: Path): ObjectReplaceOp = {
    val __obj = js.Dynamic.literal(od = od.asInstanceOf[js.Any], oi = oi.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectReplaceOp]
  }
  
  extension [Self <: ObjectReplaceOp](x: Self) {
    
    inline def setOd(value: Any): Self = StObject.set(x, "od", value.asInstanceOf[js.Any])
    
    inline def setOi(value: Any): Self = StObject.set(x, "oi", value.asInstanceOf[js.Any])
    
    inline def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value*))
  }
}
