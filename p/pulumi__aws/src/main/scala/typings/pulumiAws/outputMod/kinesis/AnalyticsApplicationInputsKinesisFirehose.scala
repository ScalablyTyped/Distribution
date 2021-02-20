package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationInputsKinesisFirehose extends StObject {
  
  /**
    * The ARN of the Kinesis Firehose delivery stream.
    */
  var resourceArn: String = js.native
  
  /**
    * The ARN of the IAM Role used to access the stream.
    */
  var roleArn: String = js.native
}
object AnalyticsApplicationInputsKinesisFirehose {
  
  @scala.inline
  def apply(resourceArn: String, roleArn: String): AnalyticsApplicationInputsKinesisFirehose = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsKinesisFirehose]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationInputsKinesisFirehoseMutableBuilder[Self <: AnalyticsApplicationInputsKinesisFirehose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
