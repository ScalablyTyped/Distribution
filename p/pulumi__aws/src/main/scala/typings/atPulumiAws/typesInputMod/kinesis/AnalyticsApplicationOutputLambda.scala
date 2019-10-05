package typings.atPulumiAws.typesInputMod.kinesis

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationOutputLambda extends js.Object {
  var resourceArn: Input[String]
  var roleArn: Input[String]
}

object AnalyticsApplicationOutputLambda {
  @scala.inline
  def apply(resourceArn: Input[String], roleArn: Input[String]): AnalyticsApplicationOutputLambda = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnalyticsApplicationOutputLambda]
  }
}

