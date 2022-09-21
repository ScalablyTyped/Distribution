package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsFunctionHandler
  extends StObject
     with AwsFunction {
  
  var handler: String
}
object AwsFunctionHandler {
  
  inline def apply(handler: String): AwsFunctionHandler = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsFunctionHandler]
  }
  
  extension [Self <: AwsFunctionHandler](x: Self) {
    
    inline def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
  }
}
