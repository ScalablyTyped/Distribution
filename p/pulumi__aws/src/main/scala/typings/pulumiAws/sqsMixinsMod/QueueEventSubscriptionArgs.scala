package typings.pulumiAws.sqsMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueEventSubscriptionArgs extends js.Object {
  /**
    * The largest number of records that AWS Lambda will retrieve. The maximum batch size supported
    * by Amazon Simple Queue Service is up to 10 queue messages per batch. The default setting is
    * 10.
    *
    * See https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html for more details.
    */
  var batchSize: js.UndefOr[Double] = js.native
}

object QueueEventSubscriptionArgs {
  @scala.inline
  def apply(batchSize: Int | Double = null): QueueEventSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueEventSubscriptionArgs]
  }
}

