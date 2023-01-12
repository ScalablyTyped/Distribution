package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpAuthorizer extends StObject {
  
  var arn: js.UndefOr[String] = js.undefined
  
  var identitySource: js.UndefOr[String] = js.undefined
  
  var identityValidationExpression: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var resultTtlInSeconds: js.UndefOr[Double | String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object HttpAuthorizer {
  
  inline def apply(): HttpAuthorizer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpAuthorizer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpAuthorizer] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setIdentitySource(value: String): Self = StObject.set(x, "identitySource", value.asInstanceOf[js.Any])
    
    inline def setIdentitySourceUndefined: Self = StObject.set(x, "identitySource", js.undefined)
    
    inline def setIdentityValidationExpression(value: String): Self = StObject.set(x, "identityValidationExpression", value.asInstanceOf[js.Any])
    
    inline def setIdentityValidationExpressionUndefined: Self = StObject.set(x, "identityValidationExpression", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResultTtlInSeconds(value: Double | String): Self = StObject.set(x, "resultTtlInSeconds", value.asInstanceOf[js.Any])
    
    inline def setResultTtlInSecondsUndefined: Self = StObject.set(x, "resultTtlInSeconds", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
