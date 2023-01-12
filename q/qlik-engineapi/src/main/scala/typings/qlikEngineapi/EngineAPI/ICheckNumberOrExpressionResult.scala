package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CheckNumberOrExpressionResult width extend ExpressionResult
  */
trait ICheckNumberOrExpressionResult
  extends StObject
     with IExpressionResult {
  
  var qErrorMsg: String
}
object ICheckNumberOrExpressionResult {
  
  inline def apply(qBadFieldNames: js.Array[INxRange], qErrorMsg: String): ICheckNumberOrExpressionResult = {
    val __obj = js.Dynamic.literal(qBadFieldNames = qBadFieldNames.asInstanceOf[js.Any], qErrorMsg = qErrorMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckNumberOrExpressionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICheckNumberOrExpressionResult] (val x: Self) extends AnyVal {
    
    inline def setQErrorMsg(value: String): Self = StObject.set(x, "qErrorMsg", value.asInstanceOf[js.Any])
  }
}
