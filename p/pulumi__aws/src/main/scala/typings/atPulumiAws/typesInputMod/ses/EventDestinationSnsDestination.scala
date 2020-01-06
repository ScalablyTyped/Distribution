package typings.atPulumiAws.typesInputMod.ses

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDestinationSnsDestination extends js.Object {
  /**
    * The ARN of the SNS topic
    */
  var topicArn: Input[String] = js.native
}

object EventDestinationSnsDestination {
  @scala.inline
  def apply(topicArn: Input[String]): EventDestinationSnsDestination = {
    val __obj = js.Dynamic.literal(topicArn = topicArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventDestinationSnsDestination]
  }
}

