package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateQueryLambdaRequest extends StObject {
  
  /**
    * optional description
    * @type {string}
    * @memberof UpdateQueryLambdaRequest
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Query Lambda SQL query
    * @type {QueryLambdaSql}
    * @memberof UpdateQueryLambdaRequest
    */
  var sql: js.UndefOr[QueryLambdaSql] = js.undefined
}
object UpdateQueryLambdaRequest {
  
  inline def apply(): UpdateQueryLambdaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateQueryLambdaRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateQueryLambdaRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setSql(value: QueryLambdaSql): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    inline def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
  }
}
