package typings.atPulumiAws.typesInputMod.ses

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDestinationKinesisDestination extends js.Object {
  /**
    * The ARN of the role that has permissions to access the Kinesis Stream
    */
  var roleArn: Input[String]
  /**
    * The ARN of the Kinesis Stream
    */
  var streamArn: Input[String]
}

object EventDestinationKinesisDestination {
  @scala.inline
  def apply(roleArn: Input[String], streamArn: Input[String]): EventDestinationKinesisDestination = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], streamArn = streamArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventDestinationKinesisDestination]
  }
}

