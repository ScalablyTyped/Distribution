package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpAuthorizer extends StObject {
  
  var arn: js.UndefOr[String] = js.native
  
  var identitySource: js.UndefOr[String] = js.native
  
  var identityValidationExpression: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var resultTtlInSeconds: js.UndefOr[Double | String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object HttpAuthorizer {
  
  @scala.inline
  def apply(): HttpAuthorizer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpAuthorizer]
  }
  
  @scala.inline
  implicit class HttpAuthorizerMutableBuilder[Self <: HttpAuthorizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setIdentitySource(value: String): Self = StObject.set(x, "identitySource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentitySourceUndefined: Self = StObject.set(x, "identitySource", js.undefined)
    
    @scala.inline
    def setIdentityValidationExpression(value: String): Self = StObject.set(x, "identityValidationExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityValidationExpressionUndefined: Self = StObject.set(x, "identityValidationExpression", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResultTtlInSeconds(value: Double | String): Self = StObject.set(x, "resultTtlInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultTtlInSecondsUndefined: Self = StObject.set(x, "resultTtlInSeconds", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
