package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringDeleteOp
  extends StObject
     with Op {
  
  var p: Path
  
  var sd: String
}
object StringDeleteOp {
  
  inline def apply(p: Path, sd: String): StringDeleteOp = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], sd = sd.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringDeleteOp]
  }
  
  extension [Self <: StringDeleteOp](x: Self) {
    
    inline def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value*))
    
    inline def setSd(value: String): Self = StObject.set(x, "sd", value.asInstanceOf[js.Any])
  }
}
