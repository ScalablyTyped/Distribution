package typings.rockset.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryLambdaStats extends StObject {
  
  /**
    * ISO-8601 date
    * @type {string}
    * @memberof QueryLambdaStats
    */
  var last_executed: js.UndefOr[String] = js.undefined
  
  /**
    * user who last executed Query Lambda
    * @type {string}
    * @memberof QueryLambdaStats
    */
  var last_executed_by: js.UndefOr[String] = js.undefined
  
  /**
    * ISO-8601 date of last execution failure
    * @type {string}
    * @memberof QueryLambdaStats
    */
  var last_execution_error: js.UndefOr[String] = js.undefined
  
  /**
    * error message associated with last failed execution
    * @type {string}
    * @memberof QueryLambdaStats
    */
  var last_execution_error_message: js.UndefOr[String] = js.undefined
}
object QueryLambdaStats {
  
  inline def apply(): QueryLambdaStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryLambdaStats]
  }
  
  extension [Self <: QueryLambdaStats](x: Self) {
    
    inline def setLast_executed(value: String): Self = StObject.set(x, "last_executed", value.asInstanceOf[js.Any])
    
    inline def setLast_executedUndefined: Self = StObject.set(x, "last_executed", js.undefined)
    
    inline def setLast_executed_by(value: String): Self = StObject.set(x, "last_executed_by", value.asInstanceOf[js.Any])
    
    inline def setLast_executed_byUndefined: Self = StObject.set(x, "last_executed_by", js.undefined)
    
    inline def setLast_execution_error(value: String): Self = StObject.set(x, "last_execution_error", value.asInstanceOf[js.Any])
    
    inline def setLast_execution_errorUndefined: Self = StObject.set(x, "last_execution_error", js.undefined)
    
    inline def setLast_execution_error_message(value: String): Self = StObject.set(x, "last_execution_error_message", value.asInstanceOf[js.Any])
    
    inline def setLast_execution_error_messageUndefined: Self = StObject.set(x, "last_execution_error_message", js.undefined)
  }
}
