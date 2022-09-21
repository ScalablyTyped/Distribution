package typings.rockset.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryLambdaTagResponse extends StObject {
  
  /**
    * updated Query Lambda tag
    * @type {QueryLambdaTag}
    * @memberof QueryLambdaTagResponse
    */
  var data: js.UndefOr[QueryLambdaTag] = js.undefined
}
object QueryLambdaTagResponse {
  
  inline def apply(): QueryLambdaTagResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryLambdaTagResponse]
  }
  
  extension [Self <: QueryLambdaTagResponse](x: Self) {
    
    inline def setData(value: QueryLambdaTag): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
