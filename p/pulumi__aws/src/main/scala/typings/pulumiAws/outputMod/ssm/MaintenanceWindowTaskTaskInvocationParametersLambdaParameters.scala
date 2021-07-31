package typings.pulumiAws.outputMod.ssm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindowTaskTaskInvocationParametersLambdaParameters extends StObject {
  
  /**
    * Pass client-specific information to the Lambda function that you are invoking.
    */
  var clientContext: js.UndefOr[String] = js.undefined
  
  /**
    * JSON to provide to your Lambda function as input.
    */
  var payload: js.UndefOr[String] = js.undefined
  
  /**
    * Specify a Lambda function version or alias name.
    */
  var qualifier: js.UndefOr[String] = js.undefined
}
object MaintenanceWindowTaskTaskInvocationParametersLambdaParameters {
  
  @scala.inline
  def apply(): MaintenanceWindowTaskTaskInvocationParametersLambdaParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersLambdaParameters]
  }
  
  @scala.inline
  implicit class MaintenanceWindowTaskTaskInvocationParametersLambdaParametersMutableBuilder[Self <: MaintenanceWindowTaskTaskInvocationParametersLambdaParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientContext(value: String): Self = StObject.set(x, "clientContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientContextUndefined: Self = StObject.set(x, "clientContext", js.undefined)
    
    @scala.inline
    def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setQualifier(value: String): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
  }
}
