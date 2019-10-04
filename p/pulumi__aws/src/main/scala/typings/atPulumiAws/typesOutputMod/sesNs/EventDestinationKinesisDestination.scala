package typings.atPulumiAws.typesOutputMod.sesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDestinationKinesisDestination extends js.Object {
  /**
    * The ARN of the role that has permissions to access the Kinesis Stream
    */
  var roleArn: String
  /**
    * The ARN of the Kinesis Stream
    */
  var streamArn: String
}

object EventDestinationKinesisDestination {
  @scala.inline
  def apply(roleArn: String, streamArn: String): EventDestinationKinesisDestination = {
    val __obj = js.Dynamic.literal(roleArn = roleArn, streamArn = streamArn)
  
    __obj.asInstanceOf[EventDestinationKinesisDestination]
  }
}

