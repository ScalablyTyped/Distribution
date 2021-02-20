package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
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
  implicit class ICheckExpressionResultMutableBuilder[Self <: ICheckExpressionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDangerousFieldNames(value: js.Array[INxRange]): Self = StObject.set(x, "qDangerousFieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDangerousFieldNamesVarargs(value: INxRange*): Self = StObject.set(x, "qDangerousFieldNames", js.Array(value :_*))
    
    @scala.inline
    def setQErrorMsg(value: String): Self = StObject.set(x, "qErrorMsg", value.asInstanceOf[js.Any])
  }
}
