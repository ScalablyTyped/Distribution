package typings.rockset.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryLambdaVersionResponse extends StObject {
  
  /**
    * Query Lambda version details
    * @type {QueryLambdaVersion}
    * @memberof QueryLambdaVersionResponse
    */
  var data: js.UndefOr[QueryLambdaVersion] = js.undefined
}
object QueryLambdaVersionResponse {
  
  inline def apply(): QueryLambdaVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryLambdaVersionResponse]
  }
  
  extension [Self <: QueryLambdaVersionResponse](x: Self) {
    
    inline def setData(value: QueryLambdaVersion): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
