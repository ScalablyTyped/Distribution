package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CheckNumberOrExpressionResult width extend ExpressionResult
  */
@js.native
trait ICheckNumberOrExpressionResult extends IExpressionResult {
  
  var qErrorMsg: String = js.native
}
object ICheckNumberOrExpressionResult {
  
  @scala.inline
  def apply(qBadFieldNames: js.Array[INxRange], qErrorMsg: String): ICheckNumberOrExpressionResult = {
    val __obj = js.Dynamic.literal(qBadFieldNames = qBadFieldNames.asInstanceOf[js.Any], qErrorMsg = qErrorMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckNumberOrExpressionResult]
  }
  
  @scala.inline
  implicit class ICheckNumberOrExpressionResultOps[Self <: ICheckNumberOrExpressionResult] (val x: Self) extends AnyVal {
    
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
    def setQErrorMsg(value: String): Self = this.set("qErrorMsg", value.asInstanceOf[js.Any])
  }
}
