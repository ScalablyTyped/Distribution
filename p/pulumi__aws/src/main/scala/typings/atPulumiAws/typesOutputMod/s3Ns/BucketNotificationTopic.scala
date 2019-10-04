package typings.atPulumiAws.typesOutputMod.s3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketNotificationTopic extends js.Object {
  /**
    * Specifies [event](http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html#notification-how-to-event-types-and-destinations) for which to send notifications.
    */
  var events: js.Array[String]
  /**
    * Specifies object key name prefix.
    */
  var filterPrefix: js.UndefOr[String] = js.undefined
  /**
    * Specifies object key name suffix.
    */
  var filterSuffix: js.UndefOr[String] = js.undefined
  /**
    * Specifies unique identifier for each of the notification configurations.
    */
  var id: String
  /**
    * Specifies Amazon SNS topic ARN.
    */
  var topicArn: String
}

object BucketNotificationTopic {
  @scala.inline
  def apply(
    events: js.Array[String],
    id: String,
    topicArn: String,
    filterPrefix: String = null,
    filterSuffix: String = null
  ): BucketNotificationTopic = {
    val __obj = js.Dynamic.literal(events = events, id = id, topicArn = topicArn)
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix)
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix)
    __obj.asInstanceOf[BucketNotificationTopic]
  }
}

