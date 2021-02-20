package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ExpressionResult...
  */
@js.native
trait IExpressionResult extends StObject {
  
  var qBadFieldNames: js.Array[INxRange] = js.native
}
object IExpressionResult {
  
  @scala.inline
  def apply(qBadFieldNames: js.Array[INxRange]): IExpressionResult = {
    val __obj = js.Dynamic.literal(qBadFieldNames = qBadFieldNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExpressionResult]
  }
  
  @scala.inline
  implicit class IExpressionResultMutableBuilder[Self <: IExpressionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQBadFieldNames(value: js.Array[INxRange]): Self = StObject.set(x, "qBadFieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQBadFieldNamesVarargs(value: INxRange*): Self = StObject.set(x, "qBadFieldNames", js.Array(value :_*))
  }
}
