package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationOutputLambda extends StObject {
  
  /**
    * The ARN of the Lambda function.
    */
  var resourceArn: Input[String] = js.native
  
  /**
    * The ARN of the IAM Role used to access the Lambda function.
    */
  var roleArn: Input[String] = js.native
}
object AnalyticsApplicationOutputLambda {
  
  @scala.inline
  def apply(resourceArn: Input[String], roleArn: Input[String]): AnalyticsApplicationOutputLambda = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationOutputLambda]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationOutputLambdaMutableBuilder[Self <: AnalyticsApplicationOutputLambda] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
