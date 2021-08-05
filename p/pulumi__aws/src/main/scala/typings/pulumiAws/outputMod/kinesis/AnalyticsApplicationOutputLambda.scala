package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationOutputLambda extends StObject {
  
  /**
    * The ARN of the Lambda function.
    */
  var resourceArn: String
  
  /**
    * The ARN of the IAM Role used to access the Lambda function.
    */
  var roleArn: String
}
object AnalyticsApplicationOutputLambda {
  
  inline def apply(resourceArn: String, roleArn: String): AnalyticsApplicationOutputLambda = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationOutputLambda]
  }
  
  extension [Self <: AnalyticsApplicationOutputLambda](x: Self) {
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
