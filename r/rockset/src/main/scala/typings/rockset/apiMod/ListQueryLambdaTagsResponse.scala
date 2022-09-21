package typings.rockset.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQueryLambdaTagsResponse extends StObject {
  
  /**
    * list of all tags associated with a Query Lambda
    * @type {Array<QueryLambdaTag>}
    * @memberof ListQueryLambdaTagsResponse
    */
  var data: js.UndefOr[js.Array[QueryLambdaTag]] = js.undefined
}
object ListQueryLambdaTagsResponse {
  
  inline def apply(): ListQueryLambdaTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueryLambdaTagsResponse]
  }
  
  extension [Self <: ListQueryLambdaTagsResponse](x: Self) {
    
    inline def setData(value: js.Array[QueryLambdaTag]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: QueryLambdaTag*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
