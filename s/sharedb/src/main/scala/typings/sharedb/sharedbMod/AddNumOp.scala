package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddNumOp
  extends StObject
     with Op {
  
  var na: Double
  
  var p: Path
}
object AddNumOp {
  
  inline def apply(na: Double, p: Path): AddNumOp = {
    val __obj = js.Dynamic.literal(na = na.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddNumOp]
  }
  
  extension [Self <: AddNumOp](x: Self) {
    
    inline def setNa(value: Double): Self = StObject.set(x, "na", value.asInstanceOf[js.Any])
    
    inline def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value :_*))
  }
}
