package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringInsertOp
  extends StObject
     with Op {
  
  var p: Path
  
  var si: String
}
object StringInsertOp {
  
  inline def apply(p: Path, si: String): StringInsertOp = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], si = si.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringInsertOp]
  }
  
  extension [Self <: StringInsertOp](x: Self) {
    
    inline def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value :_*))
    
    inline def setSi(value: String): Self = StObject.set(x, "si", value.asInstanceOf[js.Any])
  }
}
