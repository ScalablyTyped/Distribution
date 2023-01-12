package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteQueryLambdaResponse extends StObject {
  
  /**
    * Query Lambda details
    * @type {QueryLambda}
    * @memberof DeleteQueryLambdaResponse
    */
  var data: js.UndefOr[QueryLambda] = js.undefined
}
object DeleteQueryLambdaResponse {
  
  inline def apply(): DeleteQueryLambdaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteQueryLambdaResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteQueryLambdaResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: QueryLambda): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
