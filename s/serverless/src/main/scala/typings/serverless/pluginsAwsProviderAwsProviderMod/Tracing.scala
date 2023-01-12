package typings.serverless.pluginsAwsProviderAwsProviderMod

import typings.serverless.serverlessStrings.Active
import typings.serverless.serverlessStrings.PassThrough
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tracing extends StObject {
  
  var apiGateway: Boolean
  
  var lambda: js.UndefOr[Active | PassThrough | Boolean] = js.undefined
}
object Tracing {
  
  inline def apply(apiGateway: Boolean): Tracing = {
    val __obj = js.Dynamic.literal(apiGateway = apiGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tracing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tracing] (val x: Self) extends AnyVal {
    
    inline def setApiGateway(value: Boolean): Self = StObject.set(x, "apiGateway", value.asInstanceOf[js.Any])
    
    inline def setLambda(value: Active | PassThrough | Boolean): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    inline def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
  }
}
