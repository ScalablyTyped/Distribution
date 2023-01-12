package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CheckExpressionResult width extend ExpressionResult
  */
trait ICheckExpressionResult
  extends StObject
     with IExpressionResult {
  
  var qDangerousFieldNames: js.Array[INxRange]
  
  var qErrorMsg: String
}
object ICheckExpressionResult {
  
  inline def apply(qBadFieldNames: js.Array[INxRange], qDangerousFieldNames: js.Array[INxRange], qErrorMsg: String): ICheckExpressionResult = {
    val __obj = js.Dynamic.literal(qBadFieldNames = qBadFieldNames.asInstanceOf[js.Any], qDangerousFieldNames = qDangerousFieldNames.asInstanceOf[js.Any], qErrorMsg = qErrorMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckExpressionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICheckExpressionResult] (val x: Self) extends AnyVal {
    
    inline def setQDangerousFieldNames(value: js.Array[INxRange]): Self = StObject.set(x, "qDangerousFieldNames", value.asInstanceOf[js.Any])
    
    inline def setQDangerousFieldNamesVarargs(value: INxRange*): Self = StObject.set(x, "qDangerousFieldNames", js.Array(value*))
    
    inline def setQErrorMsg(value: String): Self = StObject.set(x, "qErrorMsg", value.asInstanceOf[js.Any])
  }
}
