package typings.atPulumiAws.typesOutputMod.ses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDestinationKinesisDestination extends js.Object {
  /**
    * The ARN of the role that has permissions to access the Kinesis Stream
    */
  var roleArn: String = js.native
  /**
    * The ARN of the Kinesis Stream
    */
  var streamArn: String = js.native
}

object EventDestinationKinesisDestination {
  @scala.inline
  def apply(roleArn: String, streamArn: String): EventDestinationKinesisDestination = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], streamArn = streamArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventDestinationKinesisDestination]
  }
}

