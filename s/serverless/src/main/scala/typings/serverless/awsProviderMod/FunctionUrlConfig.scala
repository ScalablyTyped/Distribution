package typings.serverless.awsProviderMod

import typings.serverless.serverlessStrings.aws_iam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionUrlConfig extends StObject {
  
  var authorizer: js.UndefOr[aws_iam] = js.undefined
  
  var cors: js.UndefOr[Boolean | FunctionUrlConfigCors] = js.undefined
}
object FunctionUrlConfig {
  
  inline def apply(): FunctionUrlConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionUrlConfig]
  }
  
  extension [Self <: FunctionUrlConfig](x: Self) {
    
    inline def setAuthorizer(value: aws_iam): Self = StObject.set(x, "authorizer", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerUndefined: Self = StObject.set(x, "authorizer", js.undefined)
    
    inline def setCors(value: Boolean | FunctionUrlConfigCors): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
  }
}
