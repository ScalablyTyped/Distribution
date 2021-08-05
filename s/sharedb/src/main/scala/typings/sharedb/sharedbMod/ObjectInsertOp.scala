package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectInsertOp
  extends StObject
     with Op {
  
  var oi: js.Any
  
  var p: Path
}
object ObjectInsertOp {
  
  inline def apply(oi: js.Any, p: Path): ObjectInsertOp = {
    val __obj = js.Dynamic.literal(oi = oi.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectInsertOp]
  }
  
  extension [Self <: ObjectInsertOp](x: Self) {
    
    inline def setOi(value: js.Any): Self = StObject.set(x, "oi", value.asInstanceOf[js.Any])
    
    inline def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value :_*))
  }
}
