package typings.rockset.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQueryLambdasResponse extends StObject {
  
  /**
    * list of all Query Lambdas
    * @type {Array<QueryLambda>}
    * @memberof ListQueryLambdasResponse
    */
  var data: js.UndefOr[js.Array[QueryLambda]] = js.undefined
}
object ListQueryLambdasResponse {
  
  inline def apply(): ListQueryLambdasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueryLambdasResponse]
  }
  
  extension [Self <: ListQueryLambdasResponse](x: Self) {
    
    inline def setData(value: js.Array[QueryLambda]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: QueryLambda*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
