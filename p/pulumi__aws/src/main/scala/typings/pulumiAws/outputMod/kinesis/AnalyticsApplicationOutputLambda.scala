package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationOutputLambda extends js.Object {
  /**
    * The ARN of the Lambda function.
    */
  var resourceArn: String = js.native
  /**
    * The ARN of the IAM Role used to access the Lambda function.
    */
  var roleArn: String = js.native
}

object AnalyticsApplicationOutputLambda {
  @scala.inline
  def apply(resourceArn: String, roleArn: String): AnalyticsApplicationOutputLambda = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationOutputLambda]
  }
}

