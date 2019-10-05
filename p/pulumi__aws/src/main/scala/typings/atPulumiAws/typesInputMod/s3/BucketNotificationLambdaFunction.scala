package typings.atPulumiAws.typesInputMod.s3

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketNotificationLambdaFunction extends js.Object {
  /**
    * Specifies [event](http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html#notification-how-to-event-types-and-destinations) for which to send notifications.
    */
  var events: Input[js.Array[Input[String]]]
  /**
    * Specifies object key name prefix.
    */
  var filterPrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies object key name suffix.
    */
  var filterSuffix: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies unique identifier for each of the notification configurations.
    */
  var id: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies Amazon Lambda function ARN.
    */
  var lambdaFunctionArn: js.UndefOr[Input[String]] = js.undefined
}

object BucketNotificationLambdaFunction {
  @scala.inline
  def apply(
    events: Input[js.Array[Input[String]]],
    filterPrefix: Input[String] = null,
    filterSuffix: Input[String] = null,
    id: Input[String] = null,
    lambdaFunctionArn: Input[String] = null
  ): BucketNotificationLambdaFunction = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix.asInstanceOf[js.Any])
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lambdaFunctionArn != null) __obj.updateDynamic("lambdaFunctionArn")(lambdaFunctionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketNotificationLambdaFunction]
  }
}

