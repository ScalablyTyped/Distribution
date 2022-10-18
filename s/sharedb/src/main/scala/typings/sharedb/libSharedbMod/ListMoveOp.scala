package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMoveOp
  extends StObject
     with Op {
  
  var lm: Any
  
  var p: Path
}
object ListMoveOp {
  
  inline def apply(lm: Any, p: Path): ListMoveOp = {
    val __obj = js.Dynamic.literal(lm = lm.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMoveOp]
  }
  
  extension [Self <: ListMoveOp](x: Self) {
    
    inline def setLm(value: Any): Self = StObject.set(x, "lm", value.asInstanceOf[js.Any])
    
    inline def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value*))
  }
}
