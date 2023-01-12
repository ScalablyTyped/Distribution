package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQueryLambdaVersionsResponse extends StObject {
  
  /**
    * list of all versions for a particular Query Lambda
    * @type {Array<QueryLambdaVersion>}
    * @memberof ListQueryLambdaVersionsResponse
    */
  var data: js.UndefOr[js.Array[QueryLambdaVersion]] = js.undefined
}
object ListQueryLambdaVersionsResponse {
  
  inline def apply(): ListQueryLambdaVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueryLambdaVersionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListQueryLambdaVersionsResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[QueryLambdaVersion]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: QueryLambdaVersion*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
