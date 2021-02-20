package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
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
  implicit class ICheckNumberOrExpressionResultMutableBuilder[Self <: ICheckNumberOrExpressionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQErrorMsg(value: String): Self = StObject.set(x, "qErrorMsg", value.asInstanceOf[js.Any])
  }
}
