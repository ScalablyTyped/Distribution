package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationOutputKinesisFirehose extends StObject {
  
  /**
    * The ARN of the Kinesis Firehose delivery stream.
    */
  var resourceArn: String
  
  /**
    * The ARN of the IAM Role used to access the stream.
    */
  var roleArn: String
}
object AnalyticsApplicationOutputKinesisFirehose {
  
  inline def apply(resourceArn: String, roleArn: String): AnalyticsApplicationOutputKinesisFirehose = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationOutputKinesisFirehose]
  }
  
  extension [Self <: AnalyticsApplicationOutputKinesisFirehose](x: Self) {
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
