package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindowTaskTaskInvocationParametersLambdaParameters extends StObject {
  
  /**
    * Pass client-specific information to the Lambda function that you are invoking.
    */
  var clientContext: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * JSON to provide to your Lambda function as input.
    */
  var payload: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Specify a Lambda function version or alias name.
    */
  var qualifier: js.UndefOr[Input[String]] = js.undefined
}
object MaintenanceWindowTaskTaskInvocationParametersLambdaParameters {
  
  inline def apply(): MaintenanceWindowTaskTaskInvocationParametersLambdaParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersLambdaParameters]
  }
  
  extension [Self <: MaintenanceWindowTaskTaskInvocationParametersLambdaParameters](x: Self) {
    
    inline def setClientContext(value: Input[String]): Self = StObject.set(x, "clientContext", value.asInstanceOf[js.Any])
    
    inline def setClientContextUndefined: Self = StObject.set(x, "clientContext", js.undefined)
    
    inline def setPayload(value: Input[String]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setQualifier(value: Input[String]): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
    
    inline def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
  }
}
