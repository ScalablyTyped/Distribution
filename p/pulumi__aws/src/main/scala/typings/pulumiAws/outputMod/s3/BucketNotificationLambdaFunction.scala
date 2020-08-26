package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketNotificationLambdaFunction extends js.Object {
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
    * Specifies Amazon Lambda function ARN.
    */
  var lambdaFunctionArn: js.UndefOr[String] = js.native
}

object BucketNotificationLambdaFunction {
  @scala.inline
  def apply(events: js.Array[String], id: String): BucketNotificationLambdaFunction = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketNotificationLambdaFunction]
  }
  @scala.inline
  implicit class BucketNotificationLambdaFunctionOps[Self <: BucketNotificationLambdaFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEventsVarargs(value: String*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[String]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterPrefix(value: String): Self = this.set("filterPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterPrefix: Self = this.set("filterPrefix", js.undefined)
    @scala.inline
    def setFilterSuffix(value: String): Self = this.set("filterSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterSuffix: Self = this.set("filterSuffix", js.undefined)
    @scala.inline
    def setLambdaFunctionArn(value: String): Self = this.set("lambdaFunctionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaFunctionArn: Self = this.set("lambdaFunctionArn", js.undefined)
  }
  
}

