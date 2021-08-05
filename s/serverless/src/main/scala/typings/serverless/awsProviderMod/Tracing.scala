package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tracing extends StObject {
  
  var apiGateway: Boolean
  
  var lambda: js.UndefOr[Boolean] = js.undefined
}
object Tracing {
  
  inline def apply(apiGateway: Boolean): Tracing = {
    val __obj = js.Dynamic.literal(apiGateway = apiGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tracing]
  }
  
  extension [Self <: Tracing](x: Self) {
    
    inline def setApiGateway(value: Boolean): Self = StObject.set(x, "apiGateway", value.asInstanceOf[js.Any])
    
    inline def setLambda(value: Boolean): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    inline def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
  }
}
