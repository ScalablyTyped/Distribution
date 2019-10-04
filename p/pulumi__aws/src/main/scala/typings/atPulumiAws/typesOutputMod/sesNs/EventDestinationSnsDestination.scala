package typings.atPulumiAws.typesOutputMod.sesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDestinationSnsDestination extends js.Object {
  /**
    * The ARN of the SNS topic
    */
  var topicArn: String
}

object EventDestinationSnsDestination {
  @scala.inline
  def apply(topicArn: String): EventDestinationSnsDestination = {
    val __obj = js.Dynamic.literal(topicArn = topicArn)
  
    __obj.asInstanceOf[EventDestinationSnsDestination]
  }
}

