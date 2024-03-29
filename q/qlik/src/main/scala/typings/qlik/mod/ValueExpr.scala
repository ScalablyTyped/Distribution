package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueExpr extends StObject {
  
  var qv: String
}
object ValueExpr {
  
  inline def apply(qv: String): ValueExpr = {
    val __obj = js.Dynamic.literal(qv = qv.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueExpr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueExpr] (val x: Self) extends AnyVal {
    
    inline def setQv(value: String): Self = StObject.set(x, "qv", value.asInstanceOf[js.Any])
  }
}
