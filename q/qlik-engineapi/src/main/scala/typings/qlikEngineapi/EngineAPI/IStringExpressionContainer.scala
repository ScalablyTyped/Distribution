package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Some properties are also expression containers (ExpressionContainers).
  * Expression containers can handle both normal strings and expressions.
  *
  * - StringExpressionContainer
  */
trait IStringExpressionContainer extends StObject {
  
  /**
    * Expression for Example (Non-calculated string expression container):
    *
    * myTable.Properties.Title = "My Table Title";
    *
    * Result is:  stringValue = myTable.Title;
    */
  var qStringExpression: String
}
object IStringExpressionContainer {
  
  inline def apply(qStringExpression: String): IStringExpressionContainer = {
    val __obj = js.Dynamic.literal(qStringExpression = qStringExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStringExpressionContainer]
  }
  
  extension [Self <: IStringExpressionContainer](x: Self) {
    
    inline def setQStringExpression(value: String): Self = StObject.set(x, "qStringExpression", value.asInstanceOf[js.Any])
  }
}
