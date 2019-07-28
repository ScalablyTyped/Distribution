package typings.atPulumiAws.dynamodbDynamodbMixinsMod

import typings.atPulumiAws.atPulumiAwsStrings.LATEST
import typings.atPulumiAws.atPulumiAwsStrings.TRIM_HORIZON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableEventSubscriptionArgs extends js.Object {
  /**
    * The largest number of records that Lambda will retrieve from your event source at the time of invocation. Defaults to `100` for DynamoDB.
    */
  val batchSize: js.UndefOr[Double] = js.undefined
  /**
    * The position in the stream where AWS Lambda should start reading. Must be one of either `TRIM_HORIZON` or `LATEST`.
    */
  val startingPosition: TRIM_HORIZON | LATEST
}

object TableEventSubscriptionArgs {
  @scala.inline
  def apply(startingPosition: TRIM_HORIZON | LATEST, batchSize: Int | Double = null): TableEventSubscriptionArgs = {
    val __obj = js.Dynamic.literal(startingPosition = startingPosition.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableEventSubscriptionArgs]
  }
}

