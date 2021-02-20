package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ValueExpression... Where <expression> is a string.
  */
@js.native
trait IValueExpr extends StObject {
  
  var qv: String = js.native
}
object IValueExpr {
  
  @scala.inline
  def apply(qv: String): IValueExpr = {
    val __obj = js.Dynamic.literal(qv = qv.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValueExpr]
  }
  
  @scala.inline
  implicit class IValueExprMutableBuilder[Self <: IValueExpr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQv(value: String): Self = StObject.set(x, "qv", value.asInstanceOf[js.Any])
  }
}
