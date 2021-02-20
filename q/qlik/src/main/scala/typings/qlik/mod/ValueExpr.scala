package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueExpr extends StObject {
  
  var qv: String = js.native
}
object ValueExpr {
  
  @scala.inline
  def apply(qv: String): ValueExpr = {
    val __obj = js.Dynamic.literal(qv = qv.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueExpr]
  }
  
  @scala.inline
  implicit class ValueExprMutableBuilder[Self <: ValueExpr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQv(value: String): Self = StObject.set(x, "qv", value.asInstanceOf[js.Any])
  }
}
