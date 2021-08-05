package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationInputsKinesisStream extends StObject {
  
  /**
    * The ARN of the Kinesis Stream.
    */
  var resourceArn: Input[String]
  
  /**
    * The ARN of the IAM Role used to access the stream.
    */
  var roleArn: Input[String]
}
object AnalyticsApplicationInputsKinesisStream {
  
  inline def apply(resourceArn: Input[String], roleArn: Input[String]): AnalyticsApplicationInputsKinesisStream = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsKinesisStream]
  }
  
  extension [Self <: AnalyticsApplicationInputsKinesisStream](x: Self) {
    
    inline def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
