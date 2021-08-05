package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationCloudwatchLoggingOptions extends StObject {
  
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: String
  
  /**
    * The ARN of the CloudWatch Log Stream.
    */
  var logStreamArn: String
  
  /**
    * The ARN of the IAM Role used to send application messages.
    */
  var roleArn: String
}
object AnalyticsApplicationCloudwatchLoggingOptions {
  
  inline def apply(id: String, logStreamArn: String, roleArn: String): AnalyticsApplicationCloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], logStreamArn = logStreamArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationCloudwatchLoggingOptions]
  }
  
  extension [Self <: AnalyticsApplicationCloudwatchLoggingOptions](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLogStreamArn(value: String): Self = StObject.set(x, "logStreamArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
