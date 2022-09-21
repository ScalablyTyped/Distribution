package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ExpressionResult...
  */
trait IExpressionResult extends StObject {
  
  var qBadFieldNames: js.Array[INxRange]
}
object IExpressionResult {
  
  inline def apply(qBadFieldNames: js.Array[INxRange]): IExpressionResult = {
    val __obj = js.Dynamic.literal(qBadFieldNames = qBadFieldNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExpressionResult]
  }
  
  extension [Self <: IExpressionResult](x: Self) {
    
    inline def setQBadFieldNames(value: js.Array[INxRange]): Self = StObject.set(x, "qBadFieldNames", value.asInstanceOf[js.Any])
    
    inline def setQBadFieldNamesVarargs(value: INxRange*): Self = StObject.set(x, "qBadFieldNames", js.Array(value*))
  }
}
