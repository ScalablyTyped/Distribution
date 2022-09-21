package typings.rockset.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteQueryLambdaRequest extends StObject {
  
  /**
    * Row limit to use if no limit specified in the SQL query text
    * @type {number}
    * @memberof ExecuteQueryLambdaRequest
    */
  var default_row_limit: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to generate warnings
    * @type {boolean}
    * @memberof ExecuteQueryLambdaRequest
    */
  var generate_warnings: js.UndefOr[Boolean] = js.undefined
  
  /**
    * list of named parameters
    * @type {Array<QueryParameter>}
    * @memberof ExecuteQueryLambdaRequest
    */
  var parameters: js.UndefOr[js.Array[QueryParameter]] = js.undefined
}
object ExecuteQueryLambdaRequest {
  
  inline def apply(): ExecuteQueryLambdaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteQueryLambdaRequest]
  }
  
  extension [Self <: ExecuteQueryLambdaRequest](x: Self) {
    
    inline def setDefault_row_limit(value: Double): Self = StObject.set(x, "default_row_limit", value.asInstanceOf[js.Any])
    
    inline def setDefault_row_limitUndefined: Self = StObject.set(x, "default_row_limit", js.undefined)
    
    inline def setGenerate_warnings(value: Boolean): Self = StObject.set(x, "generate_warnings", value.asInstanceOf[js.Any])
    
    inline def setGenerate_warningsUndefined: Self = StObject.set(x, "generate_warnings", js.undefined)
    
    inline def setParameters(value: js.Array[QueryParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: QueryParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
