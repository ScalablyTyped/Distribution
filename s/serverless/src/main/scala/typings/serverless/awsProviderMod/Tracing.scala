package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tracing extends StObject {
  
  var apiGateway: Boolean
  
  var lambda: js.UndefOr[Boolean] = js.undefined
}
object Tracing {
  
  @scala.inline
  def apply(apiGateway: Boolean): Tracing = {
    val __obj = js.Dynamic.literal(apiGateway = apiGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tracing]
  }
  
  @scala.inline
  implicit class TracingMutableBuilder[Self <: Tracing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiGateway(value: Boolean): Self = StObject.set(x, "apiGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambda(value: Boolean): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
  }
}
