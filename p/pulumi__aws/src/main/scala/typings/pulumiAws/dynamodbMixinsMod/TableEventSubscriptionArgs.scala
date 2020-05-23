package typings.pulumiAws.dynamodbMixinsMod

import typings.pulumiAws.pulumiAwsStrings.LATEST
import typings.pulumiAws.pulumiAwsStrings.TRIM_HORIZON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableEventSubscriptionArgs extends js.Object {
  /**
    * The largest number of records that Lambda will retrieve from your event source at the time of invocation. Defaults to `100` for DynamoDB.
    */
  val batchSize: js.UndefOr[Double] = js.native
  /**
    * The position in the stream where AWS Lambda should start reading. Must be one of either `TRIM_HORIZON` or `LATEST`.
    */
  val startingPosition: TRIM_HORIZON | LATEST = js.native
}

object TableEventSubscriptionArgs {
  @scala.inline
  def apply(startingPosition: TRIM_HORIZON | LATEST, batchSize: js.UndefOr[Double] = js.undefined): TableEventSubscriptionArgs = {
    val __obj = js.Dynamic.literal(startingPosition = startingPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableEventSubscriptionArgs]
  }
}

