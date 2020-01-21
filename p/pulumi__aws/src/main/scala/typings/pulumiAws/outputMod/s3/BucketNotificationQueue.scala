package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketNotificationQueue extends js.Object {
  /**
    * Specifies [event](http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html#notification-how-to-event-types-and-destinations) for which to send notifications.
    */
  var events: js.Array[String] = js.native
  /**
    * Specifies object key name prefix.
    */
  var filterPrefix: js.UndefOr[String] = js.native
  /**
    * Specifies object key name suffix.
    */
  var filterSuffix: js.UndefOr[String] = js.native
  /**
    * Specifies unique identifier for each of the notification configurations.
    */
  var id: String = js.native
  /**
    * Specifies Amazon SQS queue ARN.
    */
  var queueArn: String = js.native
}

object BucketNotificationQueue {
  @scala.inline
  def apply(
    events: js.Array[String],
    id: String,
    queueArn: String,
    filterPrefix: String = null,
    filterSuffix: String = null
  ): BucketNotificationQueue = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], queueArn = queueArn.asInstanceOf[js.Any])
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix.asInstanceOf[js.Any])
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketNotificationQueue]
  }
}

