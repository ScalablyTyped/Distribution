package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CheckExpressionResult width extend ExpressionResult
  */
@js.native
trait ICheckExpressionResult extends IExpressionResult {
  
  var qDangerousFieldNames: js.Array[INxRange] = js.native
  
  var qErrorMsg: String = js.native
}
object ICheckExpressionResult {
  
  @scala.inline
  def apply(qBadFieldNames: js.Array[INxRange], qDangerousFieldNames: js.Array[INxRange], qErrorMsg: String): ICheckExpressionResult = {
    val __obj = js.Dynamic.literal(qBadFieldNames = qBadFieldNames.asInstanceOf[js.Any], qDangerousFieldNames = qDangerousFieldNames.asInstanceOf[js.Any], qErrorMsg = qErrorMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckExpressionResult]
  }
  
  @scala.inline
  implicit class ICheckExpressionResultOps[Self <: ICheckExpressionResult] (val x: Self) extends AnyVal {
    
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
    def setQDangerousFieldNamesVarargs(value: INxRange*): Self = this.set("qDangerousFieldNames", js.Array(value :_*))
    
    @scala.inline
    def setQDangerousFieldNames(value: js.Array[INxRange]): Self = this.set("qDangerousFieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQErrorMsg(value: String): Self = this.set("qErrorMsg", value.asInstanceOf[js.Any])
  }
}
