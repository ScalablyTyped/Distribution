package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectDeleteOp
  extends StObject
     with Op {
  
  var od: Any
  
  var p: Path
}
object ObjectDeleteOp {
  
  inline def apply(od: Any, p: Path): ObjectDeleteOp = {
    val __obj = js.Dynamic.literal(od = od.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectDeleteOp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectDeleteOp] (val x: Self) extends AnyVal {
    
    inline def setOd(value: Any): Self = StObject.set(x, "od", value.asInstanceOf[js.Any])
    
    inline def setP(value: Path): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPVarargs(value: (String | Double)*): Self = StObject.set(x, "p", js.Array(value*))
  }
}
