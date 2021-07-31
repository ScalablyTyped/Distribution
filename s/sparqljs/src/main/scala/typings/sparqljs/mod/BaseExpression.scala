package typings.sparqljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseExpression extends StObject {
  
  var distinct: js.UndefOr[Boolean] = js.undefined
  
  var `type`: String
}
object BaseExpression {
  
  @scala.inline
  def apply(`type`: String): BaseExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseExpression]
  }
  
  @scala.inline
  implicit class BaseExpressionMutableBuilder[Self <: BaseExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistinct(value: Boolean): Self = StObject.set(x, "distinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistinctUndefined: Self = StObject.set(x, "distinct", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
