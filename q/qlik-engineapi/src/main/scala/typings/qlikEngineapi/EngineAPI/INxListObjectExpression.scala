package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxListObjectExpression...
  */
@js.native
trait INxListObjectExpression extends js.Object {
  
  /**
    * Gives information on the error.
    * >> This parameter is optional.
    */
  var qError: js.UndefOr[INxLayoutErrors] = js.native
  
  /**
    * Value of the expression.
    */
  var qExpr: String = js.native
}
object INxListObjectExpression {
  
  @scala.inline
  def apply(qExpr: String): INxListObjectExpression = {
    val __obj = js.Dynamic.literal(qExpr = qExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxListObjectExpression]
  }
  
  @scala.inline
  implicit class INxListObjectExpressionOps[Self <: INxListObjectExpression] (val x: Self) extends AnyVal {
    
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
    def setQExpr(value: String): Self = this.set("qExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQError(value: INxLayoutErrors): Self = this.set("qError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQError: Self = this.set("qError", js.undefined)
  }
}
