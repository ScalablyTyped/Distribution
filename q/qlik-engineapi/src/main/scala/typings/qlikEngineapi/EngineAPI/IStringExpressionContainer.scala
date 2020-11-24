package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Some properties are also expression containers (ExpressionContainers).
  * Expression containers can handle both normal strings and expressions.
  *
  * - StringExpressionContainer
  */
@js.native
trait IStringExpressionContainer extends js.Object {
  
  /**
    * Expression for Example (Non-calculated string expression container):
    *
    * myTable.Properties.Title = "My Table Title";
    *
    * Result is:  stringValue = myTable.Title;
    */
  var qStringExpression: String = js.native
}
object IStringExpressionContainer {
  
  @scala.inline
  def apply(qStringExpression: String): IStringExpressionContainer = {
    val __obj = js.Dynamic.literal(qStringExpression = qStringExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStringExpressionContainer]
  }
  
  @scala.inline
  implicit class IStringExpressionContainerOps[Self <: IStringExpressionContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQStringExpression(value: String): Self = this.set("qStringExpression", value.asInstanceOf[js.Any])
  }
}
