package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateQueryLambdaRequest extends StObject {
  
  /**
    * optional description
    * @type {string}
    * @memberof CreateQueryLambdaRequest
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Query Lambda name
    * @type {string}
    * @memberof CreateQueryLambdaRequest
    */
  var name: String
  
  /**
    * Query Lambda SQL query
    * @type {QueryLambdaSql}
    * @memberof CreateQueryLambdaRequest
    */
  var sql: QueryLambdaSql
}
object CreateQueryLambdaRequest {
  
  inline def apply(name: String, sql: QueryLambdaSql): CreateQueryLambdaRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQueryLambdaRequest]
  }
  
  extension [Self <: CreateQueryLambdaRequest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSql(value: QueryLambdaSql): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
  }
}
